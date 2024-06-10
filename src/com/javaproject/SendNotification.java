package com.javaproject;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SendNotification extends JFrame {
    private JPanel contentPane;
    private JTextField textFieldRollno;
    private JTextArea textAreaMessage;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SendNotification frame = new SendNotification();
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
    public SendNotification() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblSendNotification = new JLabel("Send Notification");
        lblSendNotification.setFont(new Font("Tahoma", Font.PLAIN, 20));

        JLabel lblRollno = new JLabel("Roll No:");

        textFieldRollno = new JTextField();
        textFieldRollno.setColumns(10);

        JLabel lblMessage = new JLabel("Message:");

        textAreaMessage = new JTextArea();
        textAreaMessage.setLineWrap(true);
        textAreaMessage.setWrapStyleWord(true);

        JButton btnSend = new JButton("Send");
        btnSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollnoStr = textFieldRollno.getText();
                String message = textAreaMessage.getText();

                try {
                    int rollno = Integer.parseInt(rollnoStr);

                    Notification n = new Notification();
                    n.setRollno(rollno);
                    n.setMessage(message);

                    int status = NotificationDao.save(n);

                    if (status > 0) {
                        JOptionPane.showMessageDialog(SendNotification.this, "Notification sent successfully!");
                        textFieldRollno.setText("");
                        textAreaMessage.setText("");
                    } else {
                        JOptionPane.showMessageDialog(SendNotification.this, "Sorry, unable to send notification!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(SendNotification.this, "Please enter a valid roll number!");
                }
            }
        });

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminSection.main(new String[]{});

            }
        });

        JScrollPane scrollPane = new JScrollPane(textAreaMessage);

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(20)
                                                .addComponent(lblSendNotification))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(20)
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblRollno)
                                                        .addComponent(lblMessage))
                                                .addGap(18)
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(textFieldRollno)
                                                        .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(50)
                                                .addComponent(btnSend, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18)
                                                .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(20)
                                .addComponent(lblSendNotification)
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblRollno)
                                        .addComponent(textFieldRollno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMessage)
                                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSend)
                                        .addComponent(btnBack))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
