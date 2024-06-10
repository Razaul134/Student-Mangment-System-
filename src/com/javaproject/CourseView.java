package com.javaproject;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class CourseView extends JFrame {
    static CourseView frame;
    private JPanel contentPane;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new CourseView();
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
    public CourseView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 650, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JScrollPane scrollPane = new JScrollPane();

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(e -> {
            CourseManage.main(new String[]{});
            frame.dispose();
        });

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(260)
                                .addComponent(btnBack)
                                .addContainerGap(315, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addContainerGap())
        );

        table = new JTable();
        scrollPane.setViewportView(table);
        contentPane.setLayout(gl_contentPane);

        // Load data into table
        loadData();
    }

    private void loadData() {
        List<Course> list = CourseDao.view();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Roll No", "Course Name", "Course Code", "Duration", "Fee"});

        for (Course c : list) {
            model.addRow(new Object[]{c.getRollno(), c.getCourseName(), c.getCourseCode(), c.getCourseDuration(), c.getCourseFee()});
        }

        table.setModel(model);
    }
}
