package com.javaproject;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class EditCourse extends JFrame {
    static EditCourse frame;
    private JPanel contentPane;
    private JTextField textFieldRollno;
    private JTextField textFieldCourseCode;
    private JTextField textFieldCourseName;
    private JTextField textFieldCourseDuration;
    private JTextField textFieldCourseFee;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new EditCourse();
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
    public EditCourse() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblEditCourse = new JLabel("Edit Course");
        lblEditCourse.setForeground(Color.DARK_GRAY);
        lblEditCourse.setFont(new Font("Tahoma", Font.PLAIN, 20));

        JLabel lblRollno = new JLabel("Roll No:");
        JLabel lblCourseCode = new JLabel("Course Code:");
        JLabel lblCourseName = new JLabel("Course Name:");
        JLabel lblCourseDuration = new JLabel("Course Duration (weeks):");
        JLabel lblCourseFee = new JLabel("Course Fee:");

        textFieldRollno = new JTextField();
        textFieldRollno.setColumns(10);

        textFieldCourseCode = new JTextField();
        textFieldCourseCode.setColumns(10);

        textFieldCourseName = new JTextField();
        textFieldCourseName.setColumns(10);

        textFieldCourseDuration = new JTextField();
        textFieldCourseDuration.setColumns(10);

        textFieldCourseFee = new JTextField();
        textFieldCourseFee.setColumns(10);

        JButton btnFetchCourse = new JButton("Fetch Course");
        btnFetchCourse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollnoStr = textFieldRollno.getText();
                String courseCode = textFieldCourseCode.getText();

                try {
                    int rollno = Integer.parseInt(rollnoStr);
                    Course c = CourseDao.getCourseById(rollno, courseCode);

                    if (c != null) {
                        textFieldCourseName.setText(c.getCourseName());
                        textFieldCourseDuration.setText(String.valueOf(c.getCourseDuration()));
                        textFieldCourseFee.setText(String.valueOf(c.getCourseFee()));
                    } else {
                        JOptionPane.showMessageDialog(EditCourse.this, "Course not found!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(EditCourse.this, "Please enter valid roll number and course code!");
                }

            }

        });

        JButton btnUpdateCourse = new JButton("Update Course");
        btnUpdateCourse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollnoStr = textFieldRollno.getText();
                String courseCode = textFieldCourseCode.getText();
                String courseName = textFieldCourseName.getText();
                String courseDurationStr = textFieldCourseDuration.getText();
                String courseFeeStr = textFieldCourseFee.getText();

                try {
                    int rollno = Integer.parseInt(rollnoStr);
                    int courseDuration = Integer.parseInt(courseDurationStr);
                    int courseFee = Integer.parseInt(courseFeeStr);

                    Course c = new Course();
                    c.setRollno(rollno);
                    c.setCourseCode(courseCode);
                    c.setCourseName(courseName);
                    c.setCourseDuration(courseDuration);
                    c.setCourseFee(courseFee);

                    int status = CourseDao.update(c);

                    if (status > 0) {
                        JOptionPane.showMessageDialog(EditCourse.this, "Course updated successfully!");
                    } else {
                        JOptionPane.showMessageDialog(EditCourse.this, "Sorry, unable to update course!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(EditCourse.this, "Please enter valid data!");
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
                                        .addComponent(lblCourseCode)
                                        .addComponent(lblCourseName)
                                        .addComponent(lblCourseDuration)
                                        .addComponent(lblCourseFee))
                                .addGap(33)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(textFieldRollno, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldCourseCode, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldCourseName, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldCourseDuration, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldCourseFee, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(101, Short.MAX_VALUE))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(50)
                                .addComponent(btnFetchCourse, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(btnUpdateCourse, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                .addGap(18))
                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(163, Short.MAX_VALUE)
                                .addComponent(lblEditCourse)
                                .addGap(122))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack)
                                .addContainerGap(357, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblEditCourse)
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblRollno)
                                        .addComponent(textFieldRollno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblCourseCode)
                                        .addComponent(textFieldCourseCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblCourseName)
                                        .addComponent(textFieldCourseName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblCourseDuration)
                                        .addComponent(textFieldCourseDuration, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblCourseFee)
                                        .addComponent(textFieldCourseFee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnFetchCourse)
                                        .addComponent(btnUpdateCourse))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBack)
                                .addContainerGap(64, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
