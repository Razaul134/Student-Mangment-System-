package com.javaproject;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class RemoveCourse extends JFrame {
    static RemoveCourse frame;
    private JPanel contentPane;
    private JTextField textFieldRollno;
    private JTextField textFieldCourseCode;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new RemoveCourse();
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
    public RemoveCourse() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 250);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblRemoveCourse = new JLabel("Remove Course");
        lblRemoveCourse.setForeground(Color.DARK_GRAY);
        lblRemoveCourse.setFont(new Font("Tahoma", Font.PLAIN, 20));

        JLabel lblRollno = new JLabel("Roll No:");
        JLabel lblCourseCode = new JLabel("Course Code:");

        textFieldRollno = new JTextField();
        textFieldRollno.setColumns(10);

        textFieldCourseCode = new JTextField();
        textFieldCourseCode.setColumns(10);

        JButton btnRemoveCourse = new JButton("Remove Course");
        btnRemoveCourse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollnoStr = textFieldRollno.getText();
                String courseCode = textFieldCourseCode.getText();

                try {
                    int rollno = Integer.parseInt(rollnoStr);

                    int status = CourseDao.delete(rollno, courseCode);

                    if (status > 0) {
                        JOptionPane.showMessageDialog(RemoveCourse.this, "Course removed successfully!");
                        textFieldRollno.setText("");
                        textFieldCourseCode.setText("");
                    } else {
                        JOptionPane.showMessageDialog(RemoveCourse.this, "Sorry, unable to remove course!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(RemoveCourse.this, "Please enter valid roll number and course code!");
                }
                frame.dispose();
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
                                        .addComponent(lblCourseCode))
                                .addGap(33)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(textFieldRollno, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldCourseCode, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(101, Short.MAX_VALUE))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(50)
                                .addComponent(btnRemoveCourse, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addGap(18))
                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(163, Short.MAX_VALUE)
                                .addComponent(lblRemoveCourse)
                                .addGap(122))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblRemoveCourse)
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
                                        .addComponent(btnRemoveCourse)
                                        .addComponent(btnBack))
                                .addContainerGap(64, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
