package com.javaproject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {

    public static int save(Course c) {
        int status = 0;
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("INSERT INTO feereport_courses (rollno, courseName, courseCode, courseDuration, courseFee) VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1, c.getRollno());
            ps.setString(2, c.getCourseName());
            ps.setString(3, c.getCourseCode());
            ps.setInt(4, c.getCourseDuration());
            ps.setInt(5, c.getCourseFee());
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int update(Course c) {
        int status = 0;
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("UPDATE feereport_courses SET courseName=?, courseCode=?, courseDuration=?, courseFee=? WHERE rollno=? AND courseCode=?");
            ps.setString(1, c.getCourseName());
            ps.setString(2, c.getCourseCode());
            ps.setInt(3, c.getCourseDuration());
            ps.setInt(4, c.getCourseFee());
            ps.setInt(5, c.getRollno());
            ps.setString(6, c.getCourseCode());
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int delete(int rollno, String courseCode) {
        int status = 0;
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("DELETE FROM feereport_courses WHERE rollno=? AND courseCode=?");
            ps.setInt(1, rollno);
            ps.setString(2, courseCode);
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static List<Course> view() {
        List<Course> list = new ArrayList<>();
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM feereport_courses");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Course c = new Course();
                c.setRollno(rs.getInt("rollno"));
                c.setCourseName(rs.getString("courseName"));
                c.setCourseCode(rs.getString("courseCode"));
                c.setCourseDuration(rs.getInt("courseDuration"));
                c.setCourseFee(rs.getInt("courseFee"));
                list.add(c);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public static Course getCourseById(int rollno, String courseCode) {
        Course c = new Course();
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM feereport_courses WHERE rollno=? AND courseCode=?");
            ps.setInt(1, rollno);
            ps.setString(2, courseCode);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                c.setRollno(rs.getInt("rollno"));
                c.setCourseName(rs.getString("courseName"));
                c.setCourseCode(rs.getString("courseCode"));
                c.setCourseDuration(rs.getInt("courseDuration"));
                c.setCourseFee(rs.getInt("courseFee"));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return c;
    }
}
