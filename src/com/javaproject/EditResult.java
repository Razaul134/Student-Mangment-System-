package com.javaproject;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class EditResult extends JFrame {
    static EditResult frame;
    private JPanel contentPane;
    private JTextField textFieldRollNo;
    private JTextField textFieldSubjectName;
    private JTextField textFieldMarks;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new EditResult();
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
    public EditResult() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblEditResult = new JLabel("Edit Result");
        lblEditResult.setForeground(Color.DARK_GRAY);
        lblEditResult.setFont(new Font("Tahoma", Font.PLAIN, 20));

        JLabel lblRollNo = new JLabel("Roll No:");

        JLabel lblSubjectName = new JLabel("Subject Name:");

        JLabel lblMarks = new JLabel("Marks:");

        textFieldRollNo = new JTextField();
        textFieldRollNo.setColumns(10);

        textFieldSubjectName = new JTextField();
        textFieldSubjectName.setColumns(10);

        textFieldMarks = new JTextField();
        textFieldMarks.setColumns(10);

        JButton btnFetchResult = new JButton("Fetch Result");
        btnFetchResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollnoStr = textFieldRollNo.getText();
                String subjectName = textFieldSubjectName.getText();

                try {
                    int rollno = Integer.parseInt(rollnoStr);
                    Mark mark = MarkDao.getMarkByRollNoAndSubject(rollno, subjectName);

                    if (mark != null) {
                        textFieldMarks.setText(String.valueOf(mark.getMarks()));
                    } else {
                        JOptionPane.showMessageDialog(EditResult.this, "Result not found!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(EditResult.this, "Please enter a valid roll number!");
                }
            }
        });

        JButton btnUpdateResult = new JButton("Update Result");
        btnUpdateResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollnoStr = textFieldRollNo.getText();
                String subjectName = textFieldSubjectName.getText();
                String marksStr = textFieldMarks.getText();

                try {
                    int rollno = Integer.parseInt(rollnoStr);
                    int marks = Integer.parseInt(marksStr);

                    Mark mark = new Mark();
                    mark.setRollno(rollno);
                    mark.setSubject(subjectName);
                    mark.setMarks(marks);

                    int status = MarkDao.updateByRollNoAndSubject(mark);

                    if (status > 0) {
                        JOptionPane.showMessageDialog(EditResult.this, "Result updated successfully!");
                    } else {
                        JOptionPane.showMessageDialog(EditResult.this, "Sorry, unable to update result!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(EditResult.this, "Please enter valid data!");
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
                                        .addComponent(lblSubjectName, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblRollNo, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMarks, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
                                .addGap(44)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(textFieldSubjectName, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldMarks, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(101, Short.MAX_VALUE))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(50)
                                .addComponent(btnFetchResult, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(btnUpdateResult, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                .addGap(18))
                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(163, Short.MAX_VALUE)
                                .addComponent(lblEditResult)
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
                                .addComponent(lblEditResult)
                                .addGap(11)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblRollNo)
                                        .addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblSubjectName)
                                        .addComponent(textFieldSubjectName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblMarks)
                                        .addComponent(textFieldMarks, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnFetchResult, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                        .addComponent(btnUpdateResult, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                .addGap(18)
                                .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        contentPane.setLayout(gl_contentPane);
    }
}
