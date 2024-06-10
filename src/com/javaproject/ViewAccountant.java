package com.javaproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ViewAccountant extends JFrame {
	private JTextField searchField;
	private JButton searchButton;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;

	public ViewAccountant() {
		setTitle("View Accountant");
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
						JOptionPane.showMessageDialog(ViewAccountant.this, "Please enter a valid roll number", "Error", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(ViewAccountant.this, "Please enter a roll number", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

	private void setupTable() {
		String[] columnNames = { "Roll No", "Password", "Email", "Contact No" };
		tableModel = new DefaultTableModel(columnNames, 0);
		table = new JTable(tableModel);
		scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
		loadInitialData();
	}

	private void loadInitialData() {
		List<Accountant> list = AccountDao.view();
		for (Accountant a : list) {
			Object[] data = { a.getRollno(), a.getPassword(), a.getEmail(), a.getContactno() };
			tableModel.addRow(data);
		}
	}

	private void updateTable(int rollno) {
		List<Accountant> list = AccountDao.view();
		tableModel.setRowCount(0); // Clear existing data
		for (Accountant a : list) {
			if (a.getRollno() == rollno) {
				Object[] data = { a.getRollno(), a.getPassword(), a.getEmail(), a.getContactno() };
				tableModel.addRow(data);
			}
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				ViewAccountant frame = new ViewAccountant();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}
