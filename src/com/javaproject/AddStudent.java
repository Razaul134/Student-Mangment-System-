//package com.javaproject;
//
//import java.awt.EventQueue;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.GroupLayout;
//import javax.swing.GroupLayout.Alignment;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import java.awt.Font;
//import java.awt.Color;
//import javax.swing.LayoutStyle.ComponentPlacement;
//import javax.swing.JButton;
//import javax.swing.JTextField;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import javax.swing.JTextArea;
//
//public class AddStudent extends JFrame {
//	static AddStudent frame;
//	private JPanel contentPane;
//	private JTextField textFieldRollNo;
//	private JTextField textFieldName;
//	private JTextField textFieldEmail;
//	private JTextField textFieldCourse;
//	private JTextField textFieldFee;
//	private JTextField textFieldPaid;
//	private JTextField textFieldDue;
//	private JTextField textFieldCity;
//	private JTextField textFieldState;
//	private JTextField textFieldCountry;
//	private JTextField textFieldContactNo;
//	private JTextArea textAreaAddress;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame = new AddStudent();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public AddStudent() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 550);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//
//		JLabel lblAddStudent = new JLabel("Add Student");
//		lblAddStudent.setForeground(Color.DARK_GRAY);
//		lblAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 20));
//
//		JLabel lblRollNo = new JLabel("Roll No:");
//
//		JLabel lblName = new JLabel("Name:");
//
//		JLabel lblEmail = new JLabel("Email:");
//
//		JLabel lblCourse = new JLabel("Course:");
//
//		JLabel lblFee = new JLabel("Fee:");
//
//		JLabel lblPaid = new JLabel("Paid:");
//
//		JLabel lblDue = new JLabel("Due:");
//
//		JLabel lblAddress = new JLabel("Address:");
//
//		JLabel lblCity = new JLabel("City:");
//
//		JLabel lblState = new JLabel("State:");
//
//		JLabel lblCountry = new JLabel("Country:");
//
//		JLabel lblContactNo = new JLabel("Contact No:");
//
//		textFieldRollNo = new JTextField();
//		textFieldRollNo.setColumns(10);
//
//		textFieldName = new JTextField();
//		textFieldName.setColumns(10);
//
//		textFieldEmail = new JTextField();
//		textFieldEmail.setColumns(10);
//
//		textFieldCourse = new JTextField();
//		textFieldCourse.setColumns(10);
//
//		textFieldFee = new JTextField();
//		textFieldFee.setColumns(10);
//
//		textFieldPaid = new JTextField();
//		textFieldPaid.setColumns(10);
//
//		textFieldDue = new JTextField();
//		textFieldDue.setColumns(10);
//
//		textFieldCity = new JTextField();
//		textFieldCity.setColumns(10);
//
//		textFieldState = new JTextField();
//		textFieldState.setColumns(10);
//
//		textFieldCountry = new JTextField();
//		textFieldCountry.setColumns(10);
//
//		textFieldContactNo = new JTextField();
//		textFieldContactNo.setColumns(10);
//
//		textAreaAddress = new JTextArea();
//		textAreaAddress.setRows(3);
//		textAreaAddress.setColumns(20);
//
//		JButton btnAddStudent = new JButton("Add Student");
//		btnAddStudent.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					int roll = Integer.parseInt(textFieldRollNo.getText());
//					String name = textFieldName.getText();
//					String email = textFieldEmail.getText();
//					String course = textFieldCourse.getText();
//					int fee = Integer.parseInt(textFieldFee.getText());
//					int paid = Integer.parseInt(textFieldPaid.getText());
//					int due = Integer.parseInt(textFieldDue.getText());
//					String address = textAreaAddress.getText();
//					String city = textFieldCity.getText();
//					String state = textFieldState.getText();
//					String country = textFieldCountry.getText();
//					String contactNo = textFieldContactNo.getText();
//
//					Student s = new Student(roll, name, email, course, fee, paid, due, address, city, state, country, contactNo);
//					int status = StudentDao.save(s);
//
//					if (status > 0) {
//						JOptionPane.showMessageDialog(AddStudent.this, "Student added successfully!");
//						textFieldRollNo.setText("");
//						textFieldName.setText("");
//						textFieldEmail.setText("");
//						textFieldCourse.setText("");
//						textFieldFee.setText("");
//						textFieldPaid.setText("");
//						textFieldDue.setText("");
//						textFieldCity.setText("");
//						textFieldState.setText("");
//						textFieldCountry.setText("");
//						textFieldContactNo.setText("");
//						textAreaAddress.setText("");
//					} else {
//						JOptionPane.showMessageDialog(AddStudent.this, "Sorry, Unable to add student!");
//					}
//				} catch (NumberFormatException ex) {
//					JOptionPane.showMessageDialog(AddStudent.this, "Please enter valid data!");
//				}
//			}
//		});
//
//		JButton btnBack = new JButton("Back");
//		btnBack.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				AdminSection.main(new String[]{});
//				frame.dispose();
//			}
//		});
//
//		GroupLayout gl_contentPane = new GroupLayout(contentPane);
//		gl_contentPane.setHorizontalGroup(
//				gl_contentPane.createParallelGroup(Alignment.LEADING)
//						.addGroup(gl_contentPane.createSequentialGroup()
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//										.addGroup(gl_contentPane.createSequentialGroup()
//												.addGap(142)
//												.addComponent(lblAddStudent))
//										.addGroup(gl_contentPane.createSequentialGroup()
//												.addContainerGap()
//												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//														.addComponent(lblRollNo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblCourse, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblFee, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblPaid, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblDue, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblState, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblCountry, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblContactNo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
//												.addGap(33)
//												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//														.addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldCourse, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldFee, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldPaid, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldDue, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textAreaAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldCity, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldState, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldCountry, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldContactNo, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))))
//								.addContainerGap(124, Short.MAX_VALUE))
//						.addGroup(gl_contentPane.createSequentialGroup()
//								.addGap(128)
//								.addComponent(btnAddStudent, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
//								.addGap(18)
//								.addComponent(btnBack)
//								.addContainerGap(44, Short.MAX_VALUE))
//		);
//		gl_contentPane.setVerticalGroup(
//				gl_contentPane.createParallelGroup(Alignment.LEADING)
//						.addGroup(gl_contentPane.createSequentialGroup()
//								.addComponent(lblAddStudent)
//								.addGap(18)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblRollNo)
//										.addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblName)
//										.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblEmail)
//										.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblCourse)
//										.addComponent(textFieldCourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblFee)
//										.addComponent(textFieldFee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblPaid)
//										.addComponent(textFieldPaid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblDue)
//										.addComponent(textFieldDue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblAddress)
//										.addComponent(textAreaAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblCity)
//										.addComponent(textFieldCity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblState)
//										.addComponent(textFieldState, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblCountry)
//										.addComponent(textFieldCountry, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblContactNo)
//										.addComponent(textFieldContactNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(btnAddStudent)
//										.addComponent(btnBack))
//								.addContainerGap(64, Short.MAX_VALUE))
//		);
//		contentPane.setLayout(gl_contentPane);
//	}
//}
//

//
//
//package com.javaproject;
//
//import java.awt.EventQueue;
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//import javax.swing.GroupLayout;
//import javax.swing.GroupLayout.Alignment;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import java.awt.Font;
//import java.awt.Color;
//import javax.swing.LayoutStyle.ComponentPlacement;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import javax.swing.JTextArea;
//
//public class AddStudent extends JFrame {
//	static AddStudent frame;
//	private JPanel contentPane;
//	private JTextField textFieldRollNo;
//	private JTextField textFieldName;
//	private JTextField textFieldEmail;
//	private JTextField textFieldCourse;
//	private JTextField textFieldFee;
//	private JTextField textFieldPaid;
//	private JTextField textFieldDue;
//	private JTextField textFieldCity;
//	private JTextField textFieldState;
//	private JTextField textFieldCountry;
//	private JTextField textFieldContactNo;
//	private JTextArea textAreaAddress;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame = new AddStudent();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public AddStudent() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 550);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//
//		JLabel lblAddStudent = new JLabel("Add Student");
//		lblAddStudent.setForeground(Color.DARK_GRAY);
//		lblAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 20));
//
//		JLabel lblRollNo = new JLabel("Roll No:");
//
//		JLabel lblName = new JLabel("Name:");
//
//		JLabel lblEmail = new JLabel("Email:");
//
//		JLabel lblCourse = new JLabel("Course:");
//
//		JLabel lblFee = new JLabel("Fee:");
//
//		JLabel lblPaid = new JLabel("Paid:");
//
//		JLabel lblDue = new JLabel("Due:");
//
//		JLabel lblAddress = new JLabel("Address:");
//
//		JLabel lblCity = new JLabel("City:");
//
//		JLabel lblState = new JLabel("State:");
//
//		JLabel lblCountry = new JLabel("Country:");
//
//		JLabel lblContactNo = new JLabel("Contact No:");
//
//		textFieldRollNo = new JTextField();
//		textFieldRollNo.setColumns(20);
//
//		textFieldName = new JTextField();
//		textFieldName.setColumns(10);
//
//		textFieldEmail = new JTextField();
//		textFieldEmail.setColumns(10);
//
//		textFieldCourse = new JTextField();
//		textFieldCourse.setColumns(10);
//
//		textFieldFee = new JTextField();
//		textFieldFee.setColumns(10);
//
//		textFieldPaid = new JTextField();
//		textFieldPaid.setColumns(10);
//
//		textFieldDue = new JTextField();
//		textFieldDue.setColumns(10);
//
//		textFieldCity = new JTextField();
//		textFieldCity.setColumns(10);
//
//		textFieldState = new JTextField();
//		textFieldState.setColumns(10);
//
//		textFieldCountry = new JTextField();
//		textFieldCountry.setColumns(10);
//
//		textFieldContactNo = new JTextField();
//		textFieldContactNo.setColumns(11);
//
//		textAreaAddress = new JTextArea();
//		textAreaAddress.setRows(3);
//		textAreaAddress.setColumns(20);
//
//		JButton btnAddStudent = new JButton("Add Student");
//		btnAddStudent.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if (validateInput()) {
//					try {
//						int roll = Integer.parseInt(textFieldRollNo.getText());
//						String name = textFieldName.getText();
//						String email = textFieldEmail.getText();
//						String course = textFieldCourse.getText();
//						int fee = Integer.parseInt(textFieldFee.getText());
//						int paid = Integer.parseInt(textFieldPaid.getText());
//						int due = Integer.parseInt(textFieldDue.getText());
//						String address = textAreaAddress.getText();
//						String city = textFieldCity.getText();
//						String state = textFieldState.getText();
//						String country = textFieldCountry.getText();
//						String contactNo = textFieldContactNo.getText();
//
//						Student s = new Student(roll, name, email, course, fee, paid, due, address, city, state, country, contactNo);
//						int status = StudentDao.save(s);
//
//						if (status > 0) {
//							JOptionPane.showMessageDialog(AddStudent.this, "Student added successfully!");
//							clearFields();
//						} else {
//							JOptionPane.showMessageDialog(AddStudent.this, "Sorry, Unable to add student!");
//						}
//					} catch (NumberFormatException ex) {
//						JOptionPane.showMessageDialog(AddStudent.this, "Please enter valid data!");
//					}
//				} else {
//					JOptionPane.showMessageDialog(AddStudent.this, "Please fill all the fields!");
//				}
//			}
//		});
//
//		JButton btnBack = new JButton("Back");
//		btnBack.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				AdminSection.main(new String[]{});
//				frame.dispose();
//			}
//		});
//
//		GroupLayout gl_contentPane = new GroupLayout(contentPane);
//		gl_contentPane.setHorizontalGroup(
//				gl_contentPane.createParallelGroup(Alignment.LEADING)
//						.addGroup(gl_contentPane.createSequentialGroup()
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//										.addGroup(gl_contentPane.createSequentialGroup()
//												.addGap(142)
//												.addComponent(lblAddStudent))
//										.addGroup(gl_contentPane.createSequentialGroup()
//												.addContainerGap()
//												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//														.addComponent(lblRollNo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblCourse, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblFee, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblPaid, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblDue, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblState, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblCountry, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
//														.addComponent(lblContactNo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
//												.addGap(33)
//												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//														.addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldCourse, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldFee, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldPaid, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldDue, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textAreaAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldCity, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldState, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldCountry, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
//														.addComponent(textFieldContactNo, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))))
//								.addContainerGap(124, Short.MAX_VALUE))
//						.addGroup(gl_contentPane.createSequentialGroup()
//								.addGap(128)
//								.addComponent(btnAddStudent, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
//								.addGap(18)
//								.addComponent(btnBack)
//								.addContainerGap(44, Short.MAX_VALUE))
//		);
//		gl_contentPane.setVerticalGroup(
//				gl_contentPane.createParallelGroup(Alignment.LEADING)
//						.addGroup(gl_contentPane.createSequentialGroup()
//								.addComponent(lblAddStudent)
//								.addGap(18)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblRollNo)
//										.addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblName)
//										.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblEmail)
//										.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblCourse)
//										.addComponent(textFieldCourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblFee)
//										.addComponent(textFieldFee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblPaid)
//										.addComponent(textFieldPaid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblDue)
//										.addComponent(textFieldDue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblAddress)
//										.addComponent(textAreaAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblCity)
//										.addComponent(textFieldCity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblState)
//										.addComponent(textFieldState, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblCountry)
//										.addComponent(textFieldCountry, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblContactNo)
//										.addComponent(textFieldContactNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.RELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(btnAddStudent)
//										.addComponent(btnBack))
//								.addContainerGap(64, Short.MAX_VALUE))
//		);
//		contentPane.setLayout(gl_contentPane);
//	}
//
//	private boolean validateInput() {
//		return !(textFieldRollNo.getText().isEmpty() || textFieldName.getText().isEmpty() || textFieldEmail.getText().isEmpty() ||
//				textFieldCourse.getText().isEmpty() || textFieldFee.getText().isEmpty() || textFieldPaid.getText().isEmpty() ||
//				textFieldDue.getText().isEmpty() || textAreaAddress.getText().isEmpty() || textFieldCity.getText().isEmpty() ||
//				textFieldState.getText().isEmpty() || textFieldCountry.getText().isEmpty() || textFieldContactNo.getText().isEmpty());
//	}
//
//	private void clearFields() {
//		textFieldRollNo.setText("");
//		textFieldName.setText("");
//		textFieldEmail.setText("");
//		textFieldCourse.setText("");
//		textFieldFee.setText("");
//		textFieldPaid.setText("");
//		textFieldDue.setText("");
//		textAreaAddress.setText("");
//		textFieldCity.setText("");
//		textFieldState.setText("");
//		textFieldCountry.setText("");
//		textFieldContactNo.setText("");
//	}
//}



package com.javaproject;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class AddStudent extends JFrame {
	static AddStudent frame;
	private JPanel contentPane;
	private JTextField textFieldRollNo;
	private JTextField textFieldName;
	private JTextField textFieldEmail;
	private JTextField textFieldCourse;
	private JTextField textFieldFee;
	private JTextField textFieldPaid;
	private JTextField textFieldDue;
	private JTextField textFieldCity;
	private JTextField textFieldState;
	private JTextField textFieldCountry;
	private JTextField textFieldContactNo;
	private JTextArea textAreaAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AddStudent();
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
	public AddStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblAddStudent = new JLabel("Add Student");
		lblAddStudent.setForeground(Color.DARK_GRAY);
		lblAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblRollNo = new JLabel("Roll No:");

		JLabel lblName = new JLabel("Name:");

		JLabel lblEmail = new JLabel("Email:");

		JLabel lblCourse = new JLabel("Course:");

		JLabel lblFee = new JLabel("Fee:");

		JLabel lblPaid = new JLabel("Paid:");

		JLabel lblDue = new JLabel("Due:");

		JLabel lblAddress = new JLabel("Address:");

		JLabel lblCity = new JLabel("City:");

		JLabel lblState = new JLabel("State:");

		JLabel lblCountry = new JLabel("Country:");

		JLabel lblContactNo = new JLabel("Contact No:");

		textFieldRollNo = new JTextField();
		textFieldRollNo.setColumns(20);

		textFieldName = new JTextField();
		textFieldName.setColumns(10);

		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);

		textFieldCourse = new JTextField();
		textFieldCourse.setColumns(10);

		textFieldFee = new JTextField();
		textFieldFee.setColumns(10);

		textFieldPaid = new JTextField();
		textFieldPaid.setColumns(10);

		textFieldDue = new JTextField();
		textFieldDue.setColumns(10);

		textFieldCity = new JTextField();
		textFieldCity.setColumns(10);

		textFieldState = new JTextField();
		textFieldState.setColumns(10);

		textFieldCountry = new JTextField();
		textFieldCountry.setColumns(10);

		textFieldContactNo = new JTextField();
		textFieldContactNo.setColumns(11);

		textAreaAddress = new JTextArea();
		textAreaAddress.setRows(3);
		textAreaAddress.setColumns(20);

		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (validateInput()) {
					try {
						int roll = Integer.parseInt(textFieldRollNo.getText());
						String name = textFieldName.getText();
						String email = textFieldEmail.getText();
						String course = textFieldCourse.getText();
						int fee = Integer.parseInt(textFieldFee.getText());
						int paid = Integer.parseInt(textFieldPaid.getText());
						int due = Integer.parseInt(textFieldDue.getText());
						String address = textAreaAddress.getText();
						String city = textFieldCity.getText();
						String state = textFieldState.getText();
						String country = textFieldCountry.getText();
						String contactNo = textFieldContactNo.getText();

						Student s = new Student(roll, name, email, course, fee, paid, due, address, city, state, country, contactNo);
						int status = StudentDao.save(s);

						if (status > 0) {
							JOptionPane.showMessageDialog(AddStudent.this, "Student added successfully!");
							clearFields();
						} else {
							JOptionPane.showMessageDialog(AddStudent.this, "Sorry, Unable to add student!");
						}
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(AddStudent.this, "Please enter valid data!");
					}
				} else {
					JOptionPane.showMessageDialog(AddStudent.this, "Please fill all the fields with valid data!");
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
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(142)
												.addComponent(lblAddStudent))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addContainerGap()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lblRollNo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblCourse, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblFee, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblPaid, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblDue, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblState, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblCountry, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblContactNo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
												.addGap(33)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFieldCourse, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFieldFee, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFieldPaid, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFieldDue, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
														.addComponent(textAreaAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFieldCity, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFieldState, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFieldCountry, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFieldContactNo, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(124, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(128)
								.addComponent(btnAddStudent, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnBack)
								.addContainerGap(44, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblAddStudent)
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblRollNo)
										.addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblName)
										.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEmail)
										.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblCourse)
										.addComponent(textFieldCourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblFee)
										.addComponent(textFieldFee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPaid)
										.addComponent(textFieldPaid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDue)
										.addComponent(textFieldDue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblAddress)
										.addComponent(textAreaAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblCity)
										.addComponent(textFieldCity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblState)
										.addComponent(textFieldState, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblCountry)
										.addComponent(textFieldCountry, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblContactNo)
										.addComponent(textFieldContactNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnAddStudent)
										.addComponent(btnBack))
								.addContainerGap(64, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	private boolean validateInput() {
		return !(textFieldRollNo.getText().isEmpty() || textFieldName.getText().isEmpty() || textFieldEmail.getText().isEmpty() ||
				textFieldCourse.getText().isEmpty() || textFieldFee.getText().isEmpty() || textFieldPaid.getText().isEmpty() ||
				textFieldDue.getText().isEmpty() || textAreaAddress.getText().isEmpty() || textFieldCity.getText().isEmpty() ||
				textFieldState.getText().isEmpty() || textFieldCountry.getText().isEmpty() || textFieldContactNo.getText().isEmpty()) &&
				isValidEmail(textFieldEmail.getText()) && isValidContactNumber(textFieldContactNo.getText());
	}

	private boolean isValidEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		return email.matches(emailRegex);
	}

	private boolean isValidContactNumber(String contactNumber) {
		String contactNumberRegex = "\\d{11}";
		return contactNumber.matches(contactNumberRegex);
	}

	private void clearFields() {
		textFieldRollNo.setText("");
		textFieldName.setText("");
		textFieldEmail.setText("");
		textFieldCourse.setText("");
		textFieldFee.setText("");
		textFieldPaid.setText("");
		textFieldDue.setText("");
		textAreaAddress.setText("");
		textFieldCity.setText("");
		textFieldState.setText("");
		textFieldCountry.setText("");
		textFieldContactNo.setText("");
	}
}
