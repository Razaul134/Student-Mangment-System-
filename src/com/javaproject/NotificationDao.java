package com.javaproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NotificationDao {

    public static int save(Notification n) {
        int status = 0;
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("INSERT INTO feereport_notifications (rollno, message) VALUES (?, ?)");
            ps.setInt(1, n.getRollno());
            ps.setString(2, n.getMessage());
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static List<String> getNotificationsForStudent(int rollno) {
        List<String> list = new ArrayList<>();
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT message FROM feereport_notifications WHERE rollno = ?");
            ps.setInt(1, rollno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("message"));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}
