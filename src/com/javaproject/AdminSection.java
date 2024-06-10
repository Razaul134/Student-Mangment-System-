package com.javaproject;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminSection extends JFrame {
    static AdminSection frame;
    private JPanel contentPane;
    private JPanel panel;
    JScrollPane sp;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AdminSection();
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
    public AdminSection() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        panel = new JPanel();

        sp = new JScrollPane(panel);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JLabel lblAdminSection = new JLabel("Admin Section");
        lblAdminSection.setForeground(Color.DARK_GRAY);
        lblAdminSection.setFont(new Font("Tahoma", Font.PLAIN, 20));

        JButton btnAddAccountant = new JButton("Add Account");
        btnAddAccountant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddAccount.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnAddStudent = new JButton("Add Student");
        btnAddStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddStudent.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnViewAccountant = new JButton("View Accountant");
        btnViewAccountant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewAccountant.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnEditStudent = new JButton("Edit Student");
        btnEditStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                EditStudent.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnViewtStudent = new JButton("View Student");
        btnViewtStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ViewStudent.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnRemoveStudent = new JButton("Remove Student");
        btnRemoveStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                DeleteStudent.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnAddMark = new JButton("Add Mark");
        btnAddMark.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                AddMark.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnEditMark = new JButton("Edit Result");
        btnEditMark.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EditResult.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnAddSubject = new JButton("Course Management");
        btnAddSubject.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CourseManage.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnViewResult = new JButton("View Result");
        btnViewResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewResult.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnSendNotification = new JButton("Send Notification");
        btnSendNotification.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SendNotification.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LogInPage.main(new String[]{});
                frame.dispose();
            }
        });

        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(161)
                                                .addComponent(lblAdminSection))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(149)
                                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(btnViewAccountant, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnAddStudent, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnAddAccountant, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnEditStudent, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnViewtStudent, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnAddMark, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnEditMark, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnViewResult, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSendNotification, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnAddSubject, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnRemoveStudent, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(136, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addComponent(lblAdminSection)
                                .addGap(29)
                                .addComponent(btnAddAccountant, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnAddStudent, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnViewAccountant, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnEditStudent, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnViewtStudent, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnRemoveStudent, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnAddMark, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnEditMark, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnAddSubject, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnViewResult, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnSendNotification, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(59, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addComponent(sp, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addComponent(sp, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        contentPane.setLayout(gl_contentPane);
    }
}
