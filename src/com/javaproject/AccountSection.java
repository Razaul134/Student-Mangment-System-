//////package com.javaproject;
//////
//////import java.awt.*;
//////import javax.swing.*;
//////import javax.swing.border.EmptyBorder;
//////import java.awt.event.ActionListener;
//////import java.awt.event.ActionEvent;
//////
//////public class AccountSection extends JFrame {
//////	private JPanel contentPane;
//////	private JLabel profileIconLabel;
//////	private JLabel nameLabel;
//////	private JButton profileButton;
//////	private JButton checkResultButton;
//////	private JButton checkSelectedCourseButton;
//////	private JButton selectCourseButton;
//////	private JButton noticeButton;
//////
//////	/**
//////	 * Launch the application.
//////	 */
//////	public static void main(String[] args) {
//////		EventQueue.invokeLater(new Runnable() {
//////			public void run() {
//////				try {
//////					if (args.length > 0) {
//////						int rollno = Integer.parseInt(args[0]);
//////						AccountSection frame = new AccountSection(rollno);
//////						frame.setVisible(true);
//////					} else {
//////						System.out.println("No roll number provided");
//////					}
//////				} catch (Exception e) {
//////					e.printStackTrace();
//////				}
//////			}
//////		});
//////	}
//////
//////	/**
//////	 * Create the frame.
//////	 */
//////	public AccountSection(int rollno) {
//////		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//////		setBounds(100, 100, 800, 600);
//////		contentPane = new JPanel();
//////		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//////		setContentPane(contentPane);
//////
//////		// Fetch student details
//////		Student student = StudentDao.getStudentByRollno(rollno);
//////
//////		// Load and resize the profile icon
//////		ImageIcon originalIcon = new ImageIcon("E:\\important file\\SIMS\\src\\com\\javaproject\\download.png"); // Provide path to profile icon
//////		Image originalImage = originalIcon.getImage();
//////		Image resizedImage = originalImage.getScaledInstance(60, 80, Image.SCALE_SMOOTH); // Resize to 100x100 pixels
//////		ImageIcon resizedIcon = new ImageIcon(resizedImage);
//////
//////		profileIconLabel = new JLabel(resizedIcon);
//////		nameLabel = new JLabel(student.getName());
//////		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
//////		nameLabel.setForeground(Color.DARK_GRAY);
//////
//////		profileButton = new JButton("Profile");
//////		checkResultButton = new JButton("Check Result");
//////		checkSelectedCourseButton = new JButton("Check Selected Course");
//////		selectCourseButton = new JButton("Select Course");
//////		noticeButton = new JButton("Notice");
//////
//////		profileButton.addActionListener(new ActionListener() {
//////			public void actionPerformed(ActionEvent e) {
//////				// Add action for profile button
//////			}
//////		});
//////
//////		checkResultButton.addActionListener(new ActionListener() {
//////			public void actionPerformed(ActionEvent e) {
//////				// Add action for check result button
//////				ViewResult.main(new String[]{});
//////			}
//////
//////		});
//////
//////		selectCourseButton.addActionListener(new ActionListener() {
//////			public void actionPerformed(ActionEvent e) {
//////				// Add action for select course button
//////			}
//////		});
//////
//////		noticeButton.addActionListener(new ActionListener() {
//////			public void actionPerformed(ActionEvent e) {
//////				// Add action for notice button
//////			}
//////		});
//////
//////		GroupLayout gl_contentPane = new GroupLayout(contentPane);
//////		gl_contentPane.setHorizontalGroup(
//////				gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING.LEADING)
//////						.addGroup(gl_contentPane.createSequentialGroup()
//////								.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING.LEADING)
//////										.addGroup(gl_contentPane.createSequentialGroup()
//////												.addGap(20)
//////												.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING.LEADING)
//////														.addComponent(profileIconLabel)
//////														.addComponent(nameLabel)))
//////										.addGroup(gl_contentPane.createSequentialGroup()
//////												.addGap(50)
//////												.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING.LEADING, false)
//////														.addComponent(profileButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//////														.addComponent(checkResultButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//////														.addComponent(checkSelectedCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//////														.addComponent(selectCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//////														.addComponent(noticeButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
//////								.addContainerGap(600, Short.MAX_VALUE))
//////		);
//////		gl_contentPane.setVerticalGroup(
//////				gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING.LEADING)
//////						.addGroup(gl_contentPane.createSequentialGroup()
//////								.addGap(20)
//////								.addComponent(profileIconLabel)
//////								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED.RELATED)
//////								.addComponent(nameLabel)
//////								.addGap(30)
//////								.addComponent(profileButton)
//////								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED.UNRELATED)
//////								.addComponent(checkResultButton)
//////								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED.UNRELATED)
//////								.addComponent(checkSelectedCourseButton)
//////								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED.UNRELATED)
//////								.addComponent(selectCourseButton)
//////								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED.UNRELATED)
//////								.addComponent(noticeButton)
//////								.addContainerGap(250, Short.MAX_VALUE))
//////		);
//////		contentPane.setLayout(gl_contentPane);
//////	}
//////}
////
////
////
////package com.javaproject;
////
////import java.awt.*;
////import javax.swing.*;
////import javax.swing.border.EmptyBorder;
////import java.awt.event.ActionListener;
////import java.awt.event.ActionEvent;
////import java.util.List;
////
////public class AccountSection extends JFrame {
////	private JPanel contentPane;
////	private JLabel profileIconLabel;
////	private JLabel nameLabel;
////	private JButton profileButton;
////	private JButton checkResultButton;
////	private JButton checkSelectedCourseButton;
////	private JButton selectCourseButton;
////	private JButton noticeButton;
////
////	/**
////	 * Launch the application.
////	 */
////	public static void main(String[] args) {
////		EventQueue.invokeLater(new Runnable() {
////			public void run() {
////				try {
////					if (args.length > 0) {
////						int rollno = Integer.parseInt(args[0]);
////						AccountSection frame = new AccountSection(rollno);
////						frame.setVisible(true);
////					} else {
////						System.out.println("No roll number provided");
////					}
////				} catch (Exception e) {
////					e.printStackTrace();
////				}
////			}
////		});
////	}
////
////	/**
////	 * Create the frame.
////	 */
////	public AccountSection(int rollno) {
////		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////		setBounds(100, 100, 800, 600);
////		contentPane = new JPanel();
////		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
////		setContentPane(contentPane);
////
////		// Fetch student details
////		Student student = StudentDao.getStudentByRollno(rollno);
////
////		// Load and resize the profile icon
////		ImageIcon originalIcon = new ImageIcon("E:\\important file\\SIMS\\src\\com\\javaproject\\download.png"); // Provide path to profile icon
////		Image originalImage = originalIcon.getImage();
////		Image resizedImage = originalImage.getScaledInstance(60, 80, Image.SCALE_SMOOTH); // Resize to 60x80 pixels
////		ImageIcon resizedIcon = new ImageIcon(resizedImage);
////
////		profileIconLabel = new JLabel(resizedIcon);
////		nameLabel = new JLabel(student.getName());
////		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
////		nameLabel.setForeground(Color.DARK_GRAY);
////
////		profileButton = new JButton("Profile");
////		checkResultButton = new JButton("Check Result");
////		checkSelectedCourseButton = new JButton("Check Selected Course");
////		selectCourseButton = new JButton("Select Course");
////		noticeButton = new JButton("Notice");
////
////		profileButton.addActionListener(new ActionListener() {
////			public void actionPerformed(ActionEvent e) {
////				String studentInfo = "Name: " + student.getName() + "\n" +
////						"Course: " + student.getCourse() + "\n" +
////						"Email: " + student.getEmail() + "\n" +
////						"Contact: " + student.getContactno();
////				JOptionPane.showMessageDialog(AccountSection.this, studentInfo, "Student Profile", JOptionPane.INFORMATION_MESSAGE);
////			}
////		});
////
////		checkResultButton.addActionListener(new ActionListener() {
////			public void actionPerformed(ActionEvent e) {
////				// Add action for check result button
////				ViewResult.main(new String[]{});
////			}
////		});
////
////		selectCourseButton.addActionListener(new ActionListener() {
////			public void actionPerformed(ActionEvent e) {
////				List<Course> courseList = CourseDao.view();
////				String[] courseNames = courseList.stream().map(Course::getCourseName).toArray(String[]::new);
////				String selectedCourse = (String) JOptionPane.showInputDialog(AccountSection.this, "Select Course:", "Course Selection", JOptionPane.QUESTION_MESSAGE, null, courseNames, courseNames[0]);
////
////				if (selectedCourse != null) {
////					Course selectedCourseObj = courseList.stream().filter(c -> c.getCourseName().equals(selectedCourse)).findFirst().orElse(null);
////					if (selectedCourseObj != null) {
////						student.setCourse(selectedCourseObj.getCourseName());
////						StudentDao.update(student);
////						JOptionPane.showMessageDialog(AccountSection.this, "Course selected successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
////					}
////				}
////			}
////		});
////
////		checkSelectedCourseButton.addActionListener(new ActionListener() {
////			public void actionPerformed(ActionEvent e) {
////				String courseInfo = "Selected Course: " + student.getCourse();
////				JOptionPane.showMessageDialog(AccountSection.this, courseInfo, "Selected Course", JOptionPane.INFORMATION_MESSAGE);
////			}
////		});
////
////		noticeButton.addActionListener(new ActionListener() {
////			public void actionPerformed(ActionEvent e) {
////				// Add action for notice button
////			}
////		});
////
////		GroupLayout gl_contentPane = new GroupLayout(contentPane);
////		gl_contentPane.setHorizontalGroup(
////				gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
////						.addGroup(gl_contentPane.createSequentialGroup()
////								.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
////										.addGroup(gl_contentPane.createSequentialGroup()
////												.addGap(20)
////												.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
////														.addComponent(profileIconLabel)
////														.addComponent(nameLabel)))
////										.addGroup(gl_contentPane.createSequentialGroup()
////												.addGap(50)
////												.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING, false)
////														.addComponent(profileButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
////														.addComponent(checkResultButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
////														.addComponent(checkSelectedCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
////														.addComponent(selectCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
////														.addComponent(noticeButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
////								.addContainerGap(600, Short.MAX_VALUE))
////		);
////		gl_contentPane.setVerticalGroup(
////				gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
////						.addGroup(gl_contentPane.createSequentialGroup()
////								.addGap(20)
////								.addComponent(profileIconLabel)
////								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
////								.addComponent(nameLabel)
////								.addGap(30)
////								.addComponent(profileButton)
////								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
////								.addComponent(checkResultButton)
////								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
////								.addComponent(checkSelectedCourseButton)
////								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
////								.addComponent(selectCourseButton)
////								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
////								.addComponent(noticeButton)
////								.addContainerGap(250, Short.MAX_VALUE))
////		);
////		contentPane.setLayout(gl_contentPane);
////	}
////}
//
//
//
//package com.javaproject;
//
//import java.awt.*;
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.util.List;
//
//public class AccountSection extends JFrame {
//	private JPanel contentPane;
//	private JLabel profileIconLabel;
//	private JLabel nameLabel;
//	private JButton profileButton;
//	private JButton checkResultButton;
//	private JButton checkSelectedCourseButton;
//	private JButton selectCourseButton;
//	private JButton noticeButton;
//	private JButton logoutButton;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					if (args.length > 0) {
//						int rollno = Integer.parseInt(args[0]);
//						AccountSection frame = new AccountSection(rollno);
//						frame.setVisible(true);
//					} else {
//						System.out.println("No roll number provided");
//					}
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
//	public AccountSection(int rollno) {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 800, 600);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//
//		// Fetch student details
//		Student student = StudentDao.getStudentByRollno(rollno);
//
//		// Load and resize the profile icon
//		ImageIcon originalIcon = new ImageIcon("E:\\important file\\SIMS\\src\\com\\javaproject\\download.png"); // Provide path to profile icon
//		Image originalImage = originalIcon.getImage();
//		Image resizedImage = originalImage.getScaledInstance(60, 80, Image.SCALE_SMOOTH); // Resize to 60x80 pixels
//		ImageIcon resizedIcon = new ImageIcon(resizedImage);
//
//		profileIconLabel = new JLabel(resizedIcon);
//		nameLabel = new JLabel(student.getName());
//		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		nameLabel.setForeground(Color.DARK_GRAY);
//
//		profileButton = new JButton("Profile");
//		checkResultButton = new JButton("Check Result");
//		checkSelectedCourseButton = new JButton("Check Selected Course");
//		selectCourseButton = new JButton("Select Course");
//		noticeButton = new JButton("Notice");
//		logoutButton = new JButton("Logout");
//
//		profileButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String studentInfo = "Name: " + student.getName() + "\n" +
//						"Course: " + student.getCourse() + "\n" +
//						"Email: " + student.getEmail() + "\n" +
//						"Contact: " + student.getContactno();
//				JOptionPane.showMessageDialog(AccountSection.this, studentInfo, "Student Profile", JOptionPane.INFORMATION_MESSAGE);
//			}
//		});
//
//		checkResultButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				// Add action for check result button
//				ViewResult.main(new String[]{});
//			}
//		});
//
//		selectCourseButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				List<Course> courseList = CourseDao.view();
//				String[] courseNames = courseList.stream().map(Course::getCourseName).toArray(String[]::new);
//				String selectedCourse = (String) JOptionPane.showInputDialog(AccountSection.this, "Select Course:", "Course Selection", JOptionPane.QUESTION_MESSAGE, null, courseNames, courseNames[0]);
//
//				if (selectedCourse != null) {
//					Course selectedCourseObj = courseList.stream().filter(c -> c.getCourseName().equals(selectedCourse)).findFirst().orElse(null);
//					if (selectedCourseObj != null) {
//						student.setCourse(selectedCourseObj.getCourseName());
//						StudentDao.update(student);
//						JOptionPane.showMessageDialog(AccountSection.this, "Course selected successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
//					}
//				}
//			}
//		});
//
//		checkSelectedCourseButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String courseInfo = "Selected Course: " + student.getCourse();
//				JOptionPane.showMessageDialog(AccountSection.this, courseInfo, "Selected Course", JOptionPane.INFORMATION_MESSAGE);
//			}
//		});
//
//		noticeButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				List<String> notifications = NotificationDao.getNotificationsForStudent(rollno);
//
//				String notificationMessage = String.join("\n", notifications);
//				if (notificationMessage.isEmpty()) {
//					notificationMessage = "No notifications.";
//				}
//				JOptionPane.showMessageDialog(AccountSection.this, notificationMessage, "Notifications", JOptionPane.INFORMATION_MESSAGE);
//			}
//		});
//
//		logoutButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		});
//
//		GroupLayout gl_contentPane = new GroupLayout(contentPane);
//		gl_contentPane.setHorizontalGroup(
//				gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
//						.addGroup(gl_contentPane.createSequentialGroup()
//								.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
//										.addGroup(gl_contentPane.createSequentialGroup()
//												.addGap(20)
//												.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
//														.addComponent(profileIconLabel)
//														.addComponent(nameLabel)))
//										.addGroup(gl_contentPane.createSequentialGroup()
//												.addGap(50)
//												.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING, false)
//														.addComponent(profileButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//														.addComponent(checkResultButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//														.addComponent(checkSelectedCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//														.addComponent(selectCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//														.addComponent(noticeButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//														.addComponent(logoutButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
//								.addContainerGap(600, Short.MAX_VALUE))
//		);
//		gl_contentPane.setVerticalGroup(
//				gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
//						.addGroup(gl_contentPane.createSequentialGroup()
//								.addGap(20)
//								.addComponent(profileIconLabel)
//								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
//								.addComponent(nameLabel)
//								.addGap(30)
//								.addComponent(profileButton)
//								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
//								.addComponent(checkResultButton)
//								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
//								.addComponent(checkSelectedCourseButton)
//								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
//								.addComponent(selectCourseButton)
//								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
//								.addComponent(noticeButton)
//								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
//								.addComponent(logoutButton)
//								.addContainerGap(200, Short.MAX_VALUE))
//		);
//		contentPane.setLayout(gl_contentPane);
//	}
//}


package com.javaproject;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

public class AccountSection extends JFrame {
	private JPanel contentPane;
	private JLabel profileIconLabel;
	private JLabel nameLabel;
	private JButton profileButton;
	private JButton checkResultButton;
	private JButton checkSelectedCourseButton;
	private JButton selectCourseButton;
	private JButton noticeButton;
	private JButton logoutButton;
	private JLabel notificationCountLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					if (args.length > 0) {
						int rollno = Integer.parseInt(args[0]);
						AccountSection frame = new AccountSection(rollno);
						frame.setVisible(true);
					} else {
						System.out.println("No roll number provided");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AccountSection(int rollno) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Fetch student details
		Student student = StudentDao.getStudentByRollno(rollno);

		// Load and resize the profile icon
		ImageIcon originalIcon = new ImageIcon("E:\\important file\\SIMS\\src\\com\\javaproject\\download.png"); // Provide path to profile icon
		Image originalImage = originalIcon.getImage();
		Image resizedImage = originalImage.getScaledInstance(60, 80, Image.SCALE_SMOOTH); // Resize to 60x80 pixels
		ImageIcon resizedIcon = new ImageIcon(resizedImage);

		profileIconLabel = new JLabel(resizedIcon);
		nameLabel = new JLabel(student.getName());
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nameLabel.setForeground(Color.DARK_GRAY);

		profileButton = new JButton("Profile");
		checkResultButton = new JButton("Check Result");
		checkSelectedCourseButton = new JButton("Check Selected Course");
		selectCourseButton = new JButton("Select Course");
		noticeButton = new JButton("Notice");
		logoutButton = new JButton("Logout");

		notificationCountLabel = new JLabel("");
		notificationCountLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		notificationCountLabel.setForeground(Color.WHITE);
		notificationCountLabel.setOpaque(true);
		notificationCountLabel.setBackground(Color.RED);
		notificationCountLabel.setHorizontalAlignment(SwingConstants.CENTER);

		profileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String studentInfo = "Name: " + student.getName() + "\n" +
						"Course: " + student.getCourse() + "\n" +
						"Email: " + student.getEmail() + "\n" +
						"Contact: " + student.getContactno();
				JOptionPane.showMessageDialog(AccountSection.this, studentInfo, "Student Profile", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		checkResultButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add action for check result button
				ViewResult.main(new String[]{});
			}
		});

		selectCourseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Course> courseList = CourseDao.view();
				String[] courseNames = courseList.stream().map(Course::getCourseName).toArray(String[]::new);
				String selectedCourse = (String) JOptionPane.showInputDialog(AccountSection.this, "Select Course:", "Course Selection", JOptionPane.QUESTION_MESSAGE, null, courseNames, courseNames[0]);

				if (selectedCourse != null) {
					Course selectedCourseObj = courseList.stream().filter(c -> c.getCourseName().equals(selectedCourse)).findFirst().orElse(null);
					if (selectedCourseObj != null) {
						student.setCourse(selectedCourseObj.getCourseName());
						StudentDao.update(student);
						JOptionPane.showMessageDialog(AccountSection.this, "Course selected successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});

		checkSelectedCourseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String courseInfo = "Selected Course: " + student.getCourse();
				JOptionPane.showMessageDialog(AccountSection.this, courseInfo, "Selected Course", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		noticeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> notifications = NotificationDao.getNotificationsForStudent(rollno);

				String notificationMessage = String.join("\n", notifications);
				if (notificationMessage.isEmpty()) {
					notificationMessage = "No notifications.";
				}
				JOptionPane.showMessageDialog(AccountSection.this, notificationMessage, "Notifications", JOptionPane.INFORMATION_MESSAGE);

				// Reset the notification button color and count
				noticeButton.setBackground(UIManager.getColor("Button.background"));
				notificationCountLabel.setText("");
			}
		});

		// Check notifications and update the button and label accordingly
		List<String> notifications = NotificationDao.getNotificationsForStudent(rollno);
		if (!notifications.isEmpty()) {
			noticeButton.setBackground(Color.RED);
			notificationCountLabel.setText(String.valueOf(notifications.size()));
		}

		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(20)
												.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addComponent(profileIconLabel)
														.addComponent(nameLabel)))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(50)
												.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING, false)
														.addComponent(profileButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(checkResultButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(checkSelectedCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(selectCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addComponent(noticeButton, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(notificationCountLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
														.addComponent(logoutButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
								.addContainerGap(600, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(20)
								.addComponent(profileIconLabel)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(nameLabel)
								.addGap(30)
								.addComponent(profileButton)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(checkResultButton)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(checkSelectedCourseButton)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(selectCourseButton)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(noticeButton)
										.addComponent(notificationCountLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(logoutButton)
								.addContainerGap(200, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
