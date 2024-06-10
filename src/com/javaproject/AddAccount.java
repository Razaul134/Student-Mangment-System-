package com.javaproject;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class AddAccount extends JFrame {
	static AddAccount frame;
	private JPanel contentPane;
	private JTextField textFieldRollno;
	private JPasswordField passwordField;
	private JTextField textFieldEmail;
	private JTextField textFieldContactNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AddAccount();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblAddAccountant = new JLabel("Add Accountant");
		lblAddAccountant.setForeground(Color.DARK_GRAY);
		lblAddAccountant.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblRollno = new JLabel("Roll No:");
		JLabel lblPassword = new JLabel("Password:");
		JLabel lblEmail = new JLabel("Email:");
		JLabel lblContactNo = new JLabel("Contact No:");

		textFieldRollno = new JTextField();
		textFieldRollno.setColumns(10);

		passwordField = new JPasswordField();

		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);

		textFieldContactNo = new JTextField();
		textFieldContactNo.setColumns(10);

		JButton btnAddAccountant = new JButton("Add Accountant");
		btnAddAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rollno = Integer.parseInt(textFieldRollno.getText());
				String password = new String(passwordField.getPassword());
				String email = textFieldEmail.getText();
				String contactno = textFieldContactNo.getText();

				Accountant a = new Accountant(rollno, password, email, contactno);
				int status = AccountDao.save(a);

				if (status > 0) {
					JOptionPane.showMessageDialog(AddAccount.this, "Accountant added successfully!");
					textFieldRollno.setText("");
					textFieldEmail.setText("");
					textFieldContactNo.setText("");
					passwordField.setText("");
				} else {
					JOptionPane.showMessageDialog(AddAccount.this, "Sorry, unable to add accountant!");
				}
			}
		});

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSection.main(new String[]{});
				frame.dispose();
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblRollno)
										.addComponent(lblPassword)
										.addComponent(lblEmail)
										.addComponent(lblContactNo))
								.addGap(44)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textFieldContactNo, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldRollno, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(101, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(155)
								.addComponent(btnAddAccountant, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
								.addComponent(btnBack)
								.addGap(18))
						.addGroup(GroupLayout.Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addContainerGap(163, Short.MAX_VALUE)
								.addComponent(lblAddAccountant)
								.addGap(122))
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblAddAccountant)
								.addGap(11)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblRollno)
										.addComponent(textFieldRollno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPassword)
										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEmail)
										.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblContactNo)
										.addComponent(textFieldContactNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnAddAccountant, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
										.addComponent(btnBack))
								.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
