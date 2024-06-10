package com.javaproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ViewStudent extends JFrame {
	private JTextField searchField;
	private JButton searchButton;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;

	public ViewStudent() {
		setTitle("View Student");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		JPanel searchPanel = new JPanel();
		searchField = new JTextField(20);
		searchButton = new JButton("Search");
		searchPanel.add(searchField);
		searchPanel.add(searchButton);
		add(searchPanel, BorderLayout.NORTH);

		// Setup initial table with all data
		setupTable();

		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rollnoStr = searchField.getText();
				if (!rollnoStr.isEmpty()) {
					try {
						int rollno = Integer.parseInt(rollnoStr);
						updateTable(rollno);
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(ViewStudent.this, "Please enter a valid roll number", "Error", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(ViewStudent.this, "Please enter a roll number", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

	private void setupTable() {
		String[] columnNames = { "Roll No", "Name", "Email", "Course", "Fee", "Paid", "Due", "Address", "City", "State", "Country", "Contact No" };
		tableModel = new DefaultTableModel(columnNames, 0);
		table = new JTable(tableModel);
		scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
		loadInitialData();
	}

	private void loadInitialData() {
		List<Student> list = StudentDao.view();
		for (Student s : list) {
			Object[] data = { s.getRollno(), s.getName(), s.getEmail(), s.getCourse(), s.getFee(), s.getPaid(), s.getDue(), s.getAddress(), s.getCity(), s.getState(), s.getCountry(), s.getContactno() };
			tableModel.addRow(data);
		}
	}

	private void updateTable(int rollno) {
		List<Student> list = StudentDao.view();
		tableModel.setRowCount(0); // Clear existing data
		for (Student s : list) {
			if (s.getRollno() == rollno) {
				Object[] data = { s.getRollno(), s.getName(), s.getEmail(), s.getCourse(), s.getFee(), s.getPaid(), s.getDue(), s.getAddress(), s.getCity(), s.getState(), s.getCountry(), s.getContactno() };
				tableModel.addRow(data);
			}
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				ViewStudent frame = new ViewStudent();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}
