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
//import javax.swing.JTextField;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class AddMark extends JFrame {
//    static AddMark frame;
//    private JPanel contentPane;
//    private JTextField textFieldRollNo;
//    private JTextField textFieldSubjectName;
//    private JTextField textFieldSubjectCode;
//    private JTextField textFieldMark;
//
//    /**
//     * Launch the application.
//     */
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    frame = new AddMark();
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
//    public AddMark() {
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setBounds(100, 100, 450, 300);
//        contentPane = new JPanel();
//        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//        setContentPane(contentPane);
//
//        JLabel lblAddMark = new JLabel("Add Mark");
//        lblAddMark.setForeground(Color.DARK_GRAY);
//        lblAddMark.setFont(new Font("Tahoma", Font.PLAIN, 20));
//
//        JLabel lblRollNo = new JLabel("Roll No:");
//
//        JLabel lblSubjectName = new JLabel("Subject Name:");
//
//        JLabel lblSubjectCode = new JLabel("Subject Code:");
//
//        JLabel lblMark = new JLabel("Mark:");
//
//        textFieldRollNo = new JTextField();
//        textFieldRollNo.setColumns(10);
//
//        textFieldSubjectName = new JTextField();
//        textFieldSubjectName.setColumns(10);
//
//        textFieldSubjectCode = new JTextField();
//        textFieldSubjectCode.setColumns(10);
//
//        textFieldMark = new JTextField();
//        textFieldMark.setColumns(10);
//
//        JButton btnAddResult = new JButton("Add Result");
//        btnAddResult.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String rollnoStr = textFieldRollNo.getText();
//                String subjectName = textFieldSubjectName.getText();
//                String subjectCode = textFieldSubjectCode.getText();
//                String markStr = textFieldMark.getText();
//
//                int rollno = Integer.parseInt(rollnoStr);
//                int mark = Integer.parseInt(markStr);
//
//                Mark m = new Mark();
//                m.setRollno(rollno);
//                m.setSubject(subjectName);
//
//                m.setMarks(mark);
//
//                int status = MarkDao.save(m);
//
//                if (status > 0) {
//                    JOptionPane.showMessageDialog(AddMark.this, "Mark added successfully!");
//                    textFieldRollNo.setText("");
//                    textFieldSubjectName.setText("");
//                    textFieldSubjectCode.setText("");
//                    textFieldMark.setText("");
//                } else {
//                    JOptionPane.showMessageDialog(AddMark.this, "Sorry, Unable to add mark!");
//                }
//            }
//        });
//
//        JButton btnBack = new JButton("Back");
//        btnBack.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                AdminSection.main(new String[]{});
//                frame.dispose();
//            }
//        });
//        GroupLayout gl_contentPane = new GroupLayout(contentPane);
//        gl_contentPane.setHorizontalGroup(
//                gl_contentPane.createParallelGroup(Alignment.LEADING)
//                        .addGroup(gl_contentPane.createSequentialGroup()
//                                .addContainerGap()
//                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//                                        .addComponent(lblSubjectName, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(lblSubjectCode, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(lblRollNo, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(lblMark, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
//                                .addGap(44)
//                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//                                        .addComponent(textFieldSubjectCode, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(textFieldSubjectName, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(textFieldMark, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
//                                .addContainerGap(101, Short.MAX_VALUE))
//                        .addGroup(gl_contentPane.createSequentialGroup()
//                                .addGap(155)
//                                .addComponent(btnAddResult, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
//                                .addComponent(btnBack)
//                                .addGap(18))
//                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
//                                .addContainerGap(163, Short.MAX_VALUE)
//                                .addComponent(lblAddMark)
//                                .addGap(122))
//        );
//        gl_contentPane.setVerticalGroup(
//                gl_contentPane.createParallelGroup(Alignment.LEADING)
//                        .addGroup(gl_contentPane.createSequentialGroup()
//                                .addContainerGap()
//                                .addComponent(lblAddMark)
//                                .addGap(11)
//                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//                                        .addComponent(lblRollNo)
//                                        .addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                                .addGap(18)
//                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//                                        .addComponent(lblSubjectName)
//                                        .addComponent(textFieldSubjectName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                                .addGap(18)
//                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//                                        .addComponent(lblSubjectCode)
//                                        .addComponent(textFieldSubjectCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                                .addGap(18)
//                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//                                        .addComponent(lblMark)
//                                        .addComponent(textFieldMark, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                                .addGap(18)
//                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//                                        .addComponent(btnAddResult, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
//                                        .addComponent(btnBack,GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
//                                .addContainerGap())
//        );
//        contentPane.setLayout(gl_contentPane);
//    }
//}





package com.javaproject;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMark extends JFrame {
    static AddMark frame;
    private JPanel contentPane;
    private JTextField textFieldRollNo;
    private JTextField textFieldSubjectName;
//    private JTextField textFieldSubjectCode;
    private JTextField textFieldCourseCode;
    private JTextField textFieldMark;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AddMark();
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
    public AddMark() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblAddMark = new JLabel("Add Mark");
        lblAddMark.setForeground(Color.DARK_GRAY);
        lblAddMark.setFont(new Font("Tahoma", Font.PLAIN, 20));

        JLabel lblRollNo = new JLabel("Roll No:");

        JLabel lblSubjectName = new JLabel("Subject Name:");

//        JLabel lblSubjectCode = new JLabel("Subject Code:");

        JLabel lblCourseCode = new JLabel("Course Code:");

        JLabel lblMark = new JLabel("Mark:");

        textFieldRollNo = new JTextField();
        textFieldRollNo.setColumns(10);

        textFieldSubjectName = new JTextField();
        textFieldSubjectName.setColumns(10);

//        textFieldSubjectCode = new JTextField();
//        textFieldSubjectCode.setColumns(10);

        textFieldCourseCode = new JTextField();
        textFieldCourseCode.setColumns(10);

        textFieldMark = new JTextField();
        textFieldMark.setColumns(10);

        JButton btnAddResult = new JButton("Add Result");
        btnAddResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollnoStr = textFieldRollNo.getText();
                String subjectName = textFieldSubjectName.getText();
//                String subjectCode = textFieldSubjectCode.getText();
                String courseCodeStr = textFieldCourseCode.getText();
                String markStr = textFieldMark.getText();

                try {
                    int rollno = Integer.parseInt(rollnoStr);
                    int courseCode = Integer.parseInt(courseCodeStr);
                    int mark = Integer.parseInt(markStr);

                    Mark m = new Mark();
                    m.setRollno(rollno);
                    m.setCourseCode(courseCode); // Set courseCode
                    m.setSubject(subjectName);
                    m.setMarks(mark);

                    int status = MarkDao.save(m);

                    if (status > 0) {
                        JOptionPane.showMessageDialog(AddMark.this, "Mark added successfully!");
                        textFieldRollNo.setText("");
                        textFieldSubjectName.setText("");
//                        textFieldSubjectCode.setText("");
                        textFieldCourseCode.setText(""); // Clear courseCode field
                        textFieldMark.setText("");
                    } else {
                        JOptionPane.showMessageDialog(AddMark.this, "Sorry, Unable to add mark!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(AddMark.this, "Please enter valid data!");
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
//                                        .addComponent(lblSubjectCode, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblRollNo, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCourseCode, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMark, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
                                .addGap(44)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//                                        .addComponent(textFieldSubjectCode, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldSubjectName, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldCourseCode, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldMark, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(101, Short.MAX_VALUE))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(155)
                                .addComponent(btnAddResult, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addGap(18))
                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(163, Short.MAX_VALUE)
                                .addComponent(lblAddMark)
                                .addGap(122))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblAddMark)
                                .addGap(11)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblRollNo)
                                        .addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblSubjectName)
                                        .addComponent(textFieldSubjectName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                                .addGap(18)
//                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//                                        .addComponent(lblSubjectCode)
//                                        .addComponent(textFieldSubjectCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblCourseCode)
                                        .addComponent(textFieldCourseCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblMark)
                                        .addComponent(textFieldMark, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnAddResult, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                        .addComponent(btnBack, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                .addContainerGap())
        );
        contentPane.setLayout(gl_contentPane);
    }
}
