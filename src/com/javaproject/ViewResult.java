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
//import javax.swing.JTextField;
//import javax.swing.JButton;
//import javax.swing.JTextArea;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.awt.Font;
//import java.awt.Color;
//import java.util.List;
//
//public class ViewResult extends JFrame {
//    static ViewResult frame;
//    private JPanel contentPane;
//    private JTextField textFieldRollNo;
//    private JTextField textFieldName;
//    private JTextArea textAreaResult;
//
//    /**
//     * Launch the application.
//     */
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    frame = new ViewResult();
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
//    public ViewResult() {
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setBounds(100, 100, 450, 400);
//        contentPane = new JPanel();
//        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//        setContentPane(contentPane);
//
//        JLabel lblViewResult = new JLabel("View Result");
//        lblViewResult.setForeground(Color.DARK_GRAY);
//        lblViewResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
//
//        JLabel lblRollNo = new JLabel("Roll No:");
//
//        JLabel lblName = new JLabel("Name:");
//
//        textFieldRollNo = new JTextField();
//        textFieldRollNo.setColumns(10);
//
//        textFieldName = new JTextField();
//        textFieldName.setColumns(10);
//
//        textAreaResult = new JTextArea();
//        textAreaResult.setRows(10);
//        textAreaResult.setColumns(30);
//        textAreaResult.setEditable(false);
//
//        JButton btnViewResult = new JButton("View Result");
//        btnViewResult.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String rollnoStr = textFieldRollNo.getText();
//                String name = textFieldName.getText();
//
//                try {
//                    int rollno = Integer.parseInt(rollnoStr);
//                    List<Mark> marks = MarkDao.getMarksByRollNoAndName(rollno, name);
//
//                    if (marks.isEmpty()) {
//                        JOptionPane.showMessageDialog(ViewResult.this, "No results found!");
//                    } else {
//                        textAreaResult.setText("");
//                        for (Mark mark : marks) {
//                            textAreaResult.append("Subject: " + mark.getSubject() + ", Marks: " + mark.getMarks() + "\n");
//                        }
//                    }
//                } catch (NumberFormatException ex) {
//                    JOptionPane.showMessageDialog(ViewResult.this, "Please enter a valid roll number!");
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
//
//        GroupLayout gl_contentPane = new GroupLayout(contentPane);
//        gl_contentPane.setHorizontalGroup(
//                gl_contentPane.createParallelGroup(Alignment.LEADING)
//                        .addGroup(gl_contentPane.createSequentialGroup()
//                                .addContainerGap()
//                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//                                        .addComponent(lblRollNo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
//                                .addGap(44)
//                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//                                        .addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
//                                .addContainerGap(101, Short.MAX_VALUE))
//                        .addGroup(gl_contentPane.createSequentialGroup()
//                                .addGap(155)
//                                .addComponent(btnViewResult, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
////                                .addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
//                                .addComponent(btnBack)
//                                .addGap(18))
//                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
//                                .addContainerGap(163, Short.MAX_VALUE)
//                                .addComponent(lblViewResult)
//                                .addGap(122))
//                        .addGroup(gl_contentPane.createSequentialGroup()
//                                .addContainerGap()
//                                .addComponent(textAreaResult, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                .addContainerGap())
//        );
//        gl_contentPane.setVerticalGroup(
//                gl_contentPane.createParallelGroup(Alignment.LEADING)
//                        .addGroup(gl_contentPane.createSequentialGroup()
//                                .addContainerGap()
//                                .addComponent(lblViewResult)
//                                .addGap(11)
//                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//                                        .addComponent(lblRollNo)
//                                        .addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                                .addGap(18)
//                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//                                        .addComponent(lblName)
//                                        .addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                                .addGap(18)
//                                .addComponent(textAreaResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                                .addGap(18)
//                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//                                        .addComponent(btnViewResult, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
//                                        .addComponent(btnBack, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
//                                .addContainerGap())
//        );
//        contentPane.setLayout(gl_contentPane);
//    }
//}
//
package com.javaproject;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.util.List;

public class ViewResult extends JFrame {
    static ViewResult frame;
    private JPanel contentPane;
    private JTextField textFieldRollNo;
    private JTextField textFieldName;
    private JTextArea textAreaResult;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new ViewResult();
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
    public ViewResult() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblViewResult = new JLabel("View Result");
        lblViewResult.setForeground(Color.DARK_GRAY);
        lblViewResult.setFont(new Font("Tahoma", Font.PLAIN, 20));

        JLabel lblRollNo = new JLabel("Roll No:");

        JLabel lblName = new JLabel("Name:");

        textFieldRollNo = new JTextField();
        textFieldRollNo.setColumns(10);

        textFieldName = new JTextField();
        textFieldName.setColumns(10);

        textAreaResult = new JTextArea();
        textAreaResult.setRows(10);
        textAreaResult.setColumns(30);
        textAreaResult.setEditable(false);

        JButton btnViewResult = new JButton("View Result");
        btnViewResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollnoStr = textFieldRollNo.getText();
                String name = textFieldName.getText();

                try {
                    int rollno = Integer.parseInt(rollnoStr);
                    List<Mark> marks = MarkDao.getMarksByRollNoAndName(rollno, name);

                    if (marks.isEmpty()) {
                        JOptionPane.showMessageDialog(ViewResult.this, "No results found!");
                    } else {
                        textAreaResult.setText("");
                        for (Mark mark : marks) {
                            textAreaResult.append("Subject: " + mark.getSubject() + ", Marks: " + mark.getMarks() + "\n");
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ViewResult.this, "Please enter a valid roll number!");
                }
            }
        });

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AccountSection.main(new String[]{});
                frame.dispose();
            }
        });

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblRollNo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addGap(44)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(101, Short.MAX_VALUE))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(155)
                                .addComponent(btnViewResult, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnBack)
                                .addContainerGap(44, Short.MAX_VALUE))
                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(163, Short.MAX_VALUE)
                                .addComponent(lblViewResult)
                                .addGap(122))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textAreaResult, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblViewResult)
                                .addGap(11)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblRollNo)
                                        .addComponent(textFieldRollNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblName)
                                        .addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addComponent(textAreaResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnViewResult, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                        .addComponent(btnBack, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                .addContainerGap())
        );
        contentPane.setLayout(gl_contentPane);
    }
}
