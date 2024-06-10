//package com.javaproject;
//
//import java.awt.*;
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class CourseManage extends JFrame {
//    private JPanel contentPane;
//    private JButton addCourseButton;
//    private JButton editCourseButton;
//    private JButton viewCourseButton;
//    private JButton removeCourseButton;
//
//    /**
//     * Launch the application.
//     */
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    CourseManage frame = new CourseManage();
//                    frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
//
//    /**
//     * Create the frame.
//     */
//    public CourseManage() {
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setBounds(100, 100, 450, 300);
//        contentPane = new JPanel();
//        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//        setContentPane(contentPane);
//
//        JLabel lblCourseManagement = new JLabel("Course Management");
//        lblCourseManagement.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        lblCourseManagement.setForeground(Color.DARK_GRAY);
//
//        addCourseButton = new JButton("Add Course");
//        editCourseButton = new JButton("Edit Course");
//        viewCourseButton = new JButton("View Courses");
//        removeCourseButton = new JButton("Remove Course");
//
//        addCourseButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                // Action for Add Course button
//                AddCourse.main(new String[]{});
//            }
//        });
//
//        editCourseButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                // Action for Edit Course button
//                EditCourse.main(new String[]{});
//            }
//        });
//
//        viewCourseButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                // Action for View Course button
//                CourseView.main(new String[]{});
//            }
//        });
//
//        removeCourseButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                // Action for Remove Course button
//                RemoveCourse.main(new String[]{});
//            }
//        });
//
//        GroupLayout gl_contentPane = new GroupLayout(contentPane);
//        gl_contentPane.setHorizontalGroup(
//                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING.LEADING)
//                        .addGroup(gl_contentPane.createSequentialGroup()
//                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING.LEADING)
//                                        .addGroup(gl_contentPane.createSequentialGroup()
//                                                .addGap(150)
//                                                .addComponent(lblCourseManagement))
//                                        .addGroup(gl_contentPane.createSequentialGroup()
//                                                .addGap(160)
//                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING.LEADING, false)
//                                                        .addComponent(addCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                                        .addComponent(editCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                                        .addComponent(viewCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                                        .addComponent(removeCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
//                                .addContainerGap(160, Short.MAX_VALUE))
//        );
//        gl_contentPane.setVerticalGroup(
//                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING.LEADING)
//                        .addGroup(gl_contentPane.createSequentialGroup()
//                                .addGap(30)
//                                .addComponent(lblCourseManagement)
//                                .addGap(30)
//                                .addComponent(addCourseButton)
//                                .addGap(20)
//                                .addComponent(editCourseButton)
//                                .addGap(20)
//                                .addComponent(viewCourseButton)
//                                .addGap(20)
//                                .addComponent(removeCourseButton)
//                                .addContainerGap(40, Short.MAX_VALUE))
//        );
//        contentPane.setLayout(gl_contentPane);
//    }
//}


package com.javaproject;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CourseManage extends JFrame {
    private JPanel contentPane;
    private JButton addCourseButton;
    private JButton editCourseButton;
    private JButton viewCourseButton;
    private JButton removeCourseButton;
    private JButton backButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CourseManage frame = new CourseManage();
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
    public CourseManage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JLabel lblCourseManagement = new JLabel("Course Management");
        lblCourseManagement.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblCourseManagement.setForeground(Color.DARK_GRAY);

        addCourseButton = new JButton("Add Course");
        editCourseButton = new JButton("Edit Course");
        viewCourseButton = new JButton("View Courses");
        removeCourseButton = new JButton("Remove Course");

        addCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action for Add Course button
                AddCourse.main(new String[]{});
            }
        });

        editCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action for Edit Course button
                EditCourse.main(new String[]{});
            }
        });

        viewCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action for View Course button
                CourseView.main(new String[]{});
            }
        });

        removeCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action for Remove Course button
                RemoveCourse.main(new String[]{});
            }
        });

        // Back button with an icon
        backButton = new JButton("Back");
        backButton.setIcon(new ImageIcon("path_to_icon/icon.png")); // Replace with the path to your icon
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminSection.main(new String[]{});
                dispose();
            }
        });

        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(150)
                                                .addComponent(lblCourseManagement))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(160)
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(addCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(editCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(viewCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(removeCourseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(backButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(160, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(30)
                                .addComponent(lblCourseManagement)
                                .addGap(30)
                                .addComponent(addCourseButton)
                                .addGap(20)
                                .addComponent(editCourseButton)
                                .addGap(20)
                                .addComponent(viewCourseButton)
                                .addGap(20)
                                .addComponent(removeCourseButton)
                                .addGap(20)
                                .addComponent(backButton)
                                .addContainerGap(40, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        contentPane.setLayout(gl_contentPane);
    }
}
