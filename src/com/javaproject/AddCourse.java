package com.javaproject;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class AddCourse extends JFrame {
    static AddCourse frame;
    private JPanel contentPane;
    private JTextField textFieldRollno;
    private JTextField textFieldCourseName;
    private JTextField textFieldCourseCode;
    private JTextField textFieldCourseDuration;
    private JTextField textFieldCourseFee;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AddCourse();
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
    public AddCourse() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblAddCourse = new JLabel("Add Course");
        lblAddCourse.setForeground(Color.DARK_GRAY);
        lblAddCourse.setFont(new Font("Tahoma", Font.PLAIN, 20));

        JLabel lblRollno = new JLabel("Roll No:");
        JLabel lblCourseName = new JLabel("Course Name:");
        JLabel lblCourseCode = new JLabel("Course Code:");
        JLabel lblCourseDuration = new JLabel("Course Duration (weeks):");
        JLabel lblCourseFee = new JLabel("Course Fee:");

        textFieldRollno = new JTextField();
        textFieldRollno.setColumns(10);
//        textFieldRollno.setEditable(false);

        textFieldCourseName = new JTextField();
        textFieldCourseName.setColumns(10);

        textFieldCourseCode = new JTextField();
        textFieldCourseCode.setColumns(10);

        textFieldCourseDuration = new JTextField();
        textFieldCourseDuration.setColumns(10);

        textFieldCourseFee = new JTextField();
        textFieldCourseFee.setColumns(10);

        JButton btnAddCourse = new JButton("Add Course");
        btnAddCourse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollnoStr = textFieldRollno.getText();
                String courseName = textFieldCourseName.getText();
                String courseCode = textFieldCourseCode.getText();
                String courseDurationStr = textFieldCourseDuration.getText();
                String courseFeeStr = textFieldCourseFee.getText();

                try {
                    int rollno = Integer.parseInt(rollnoStr);
                    int courseDuration = Integer.parseInt(courseDurationStr);
                    int courseFee = Integer.parseInt(courseFeeStr);

                    Course c = new Course();
                    c.setRollno(rollno);
                    c.setCourseName(courseName);
                    c.setCourseCode(courseCode);
                    c.setCourseDuration(courseDuration);
                    c.setCourseFee(courseFee);

                    int status = CourseDao.save(c);
                    frame.dispose();

                    if (status > 0) {
                        JOptionPane.showMessageDialog(AddCourse.this, "Course added successfully!");
                        textFieldRollno.setText("");
                        textFieldCourseName.setText("");
                        textFieldCourseCode.setText("");
                        textFieldCourseDuration.setText("");
                        textFieldCourseFee.setText("");
                    } else {
                        JOptionPane.showMessageDialog(AddCourse.this, "Sorry, unable to add course!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(AddCourse.this, "Please enter valid data!");
                }
            }
        });

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CourseManage.main(new String[]{});
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
                                        .addComponent(lblCourseName)
                                        .addComponent(lblCourseCode)
                                        .addComponent(lblCourseDuration)
                                        .addComponent(lblCourseFee))
                                .addGap(33)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(textFieldRollno, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldCourseName, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldCourseCode, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldCourseDuration, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldCourseFee, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(101, Short.MAX_VALUE))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(50)
                                .addComponent(btnAddCourse, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addGap(18))
                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(163, Short.MAX_VALUE)
                                .addComponent(lblAddCourse)
                                .addGap(122))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblAddCourse)
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblRollno)
                                        .addComponent(textFieldRollno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblCourseName)
                                        .addComponent(textFieldCourseName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblCourseCode)
                                        .addComponent(textFieldCourseCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblCourseDuration)
                                        .addComponent(textFieldCourseDuration, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblCourseFee)
                                        .addComponent(textFieldCourseFee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnAddCourse)
                                        .addComponent(btnBack))
                                .addContainerGap(64, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
