package com.javaproject;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteStudent extends JFrame {
    static DeleteStudent frame;
    private JPanel contentPane;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new DeleteStudent();
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
    public DeleteStudent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblEnterId = new JLabel("Enter Id:");

        textField = new JTextField();
        textField.setColumns(10);

        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sid = textField.getText();
                if (sid == null || sid.trim().equals("")) {
                    JOptionPane.showMessageDialog(DeleteStudent.this, "Id can't be blank");
                } else {
                    int rollno = Integer.parseInt(sid);
                    boolean success = deleteStudentAndReferences(rollno);
                    if (success) {
                        JOptionPane.showMessageDialog(DeleteStudent.this, "Record deleted successfully!");
                    } else {
                        JOptionPane.showMessageDialog(DeleteStudent.this, "Unable to delete given id!");
                    }
                }
            }
        });
        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminSection.main(new String[]{});
                frame.dispose();
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(39)
                                .addComponent(lblEnterId)
                                .addGap(57)
                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(107, Short.MAX_VALUE))
                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(175, Short.MAX_VALUE)
                                .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addGap(140))
                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(322, Short.MAX_VALUE)
                                .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(19)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEnterId))
                                .addGap(33)
                                .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addGap(43)
                                .addComponent(btnNewButton)
                                .addContainerGap(78, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }

    private boolean deleteStudentAndReferences(int rollno) {
        Connection con = null;
        PreparedStatement psDeleteAccountant = null;
        PreparedStatement psDeleteMarks = null;
        PreparedStatement psDeleteCourses = null;
        PreparedStatement psDeleteStudent = null;
        boolean success = false;

        try {
            con = AccountDao.getCon();
            con.setAutoCommit(false); // Start transaction

            // Delete from feereport_accountant first
            String deleteAccountantSQL = "DELETE FROM feereport_accountant WHERE rollno=?";
            psDeleteAccountant = con.prepareStatement(deleteAccountantSQL);
            psDeleteAccountant.setInt(1, rollno);
            psDeleteAccountant.executeUpdate();

            // Delete from feereport_marks
            String deleteMarksSQL = "DELETE FROM feereport_marks WHERE rollno=?";
            psDeleteMarks = con.prepareStatement(deleteMarksSQL);
            psDeleteMarks.setInt(1, rollno);
            psDeleteMarks.executeUpdate();

            // Delete from feereport_courses
            String deleteCoursesSQL = "DELETE FROM feereport_courses WHERE rollno=?";
            psDeleteCourses = con.prepareStatement(deleteCoursesSQL);
            psDeleteCourses.setInt(1, rollno);
            psDeleteCourses.executeUpdate();

            // Then delete from feereport_student
            String deleteStudentSQL = "DELETE FROM feereport_student WHERE rollno=?";
            psDeleteStudent = con.prepareStatement(deleteStudentSQL);
            psDeleteStudent.setInt(1, rollno);
            psDeleteStudent.executeUpdate();

            con.commit(); // Commit transaction
            success = true;

        } catch (SQLException e) {
            e.printStackTrace();
            if (con != null) {
                try {
                    con.rollback(); // Rollback transaction on error
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            try {
                if (psDeleteAccountant != null) {
                    psDeleteAccountant.close();
                }
                if (psDeleteMarks != null) {
                    psDeleteMarks.close();
                }
                if (psDeleteCourses != null) {
                    psDeleteCourses.close();
                }
                if (psDeleteStudent != null) {
                    psDeleteStudent.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return success;
    }
}
