//package com.javaproject;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MarkDao {
//
//    public static int save(Mark m) {
//        int status = 0;
//        try {
//            Connection con = AccountDao.getCon();
//            PreparedStatement ps = con.prepareStatement("INSERT INTO feereport_marks (rollno, subject, marks) VALUES (?, ?, ?)");
//            ps.setInt(1, m.getRollno());
//            ps.setString(2, m.getSubject());
//            ps.setInt(3, m.getMarks());
//            status = ps.executeUpdate();
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return status;
//    }
//
//    public static int update(Mark m) {
//        int status = 0;
//        try {
//            Connection con = AccountDao.getCon();
//            PreparedStatement ps = con.prepareStatement("UPDATE feereport_marks SET rollno=?, subject=?, marks=? WHERE id=?");
//            ps.setInt(1, m.getRollno());
//            ps.setString(2, m.getSubject());
//            ps.setInt(3, m.getMarks());
//            ps.setInt(4, m.getId());
//            status = ps.executeUpdate();
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return status;
//    }
//
//    public static int updateByRollNoAndSubject(Mark m) {
//        int status = 0;
//        try {
//            Connection con = AccountDao.getCon();
//            PreparedStatement ps = con.prepareStatement("UPDATE feereport_marks SET marks=? WHERE rollno=? AND subject=?");
//            ps.setInt(1, m.getMarks());
//            ps.setInt(2, m.getRollno());
//            ps.setString(3, m.getSubject());
//            status = ps.executeUpdate();
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return status;
//    }
//
//    public static int delete(int id) {
//        int status = 0;
//        try {
//            Connection con = AccountDao.getCon();
//            PreparedStatement ps = con.prepareStatement("DELETE FROM feereport_marks WHERE id=?");
//            ps.setInt(1, id);
//            status = ps.executeUpdate();
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return status;
//    }
//
//    public static List<Mark> view() {
//        List<Mark> list = new ArrayList<>();
//        try {
//            Connection con = AccountDao.getCon();
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM feereport_marks");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Mark m = new Mark();
//                m.setId(rs.getInt("id"));
//                m.setRollno(rs.getInt("rollno"));
//                m.setSubject(rs.getString("subject"));
//                m.setMarks(rs.getInt("marks"));
//                list.add(m);
//            }
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return list;
//    }
//
//    public static Mark getMarkById(int id) {
//        Mark m = new Mark();
//        try {
//            Connection con = AccountDao.getCon();
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM feereport_marks WHERE id=?");
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                m.setId(rs.getInt("id"));
//                m.setRollno(rs.getInt("rollno"));
//                m.setSubject(rs.getString("subject"));
//                m.setMarks(rs.getInt("marks"));
//            }
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return m;
//    }
//
//    public static List<Mark> getMarksByRollNoAndName(int rollno, String name) {
//        List<Mark> list = new ArrayList<>();
//        try {
//            Connection con = AccountDao.getCon();
//            PreparedStatement ps = con.prepareStatement(
//                    "SELECT feereport_marks.* FROM feereport_marks " +
//                            "JOIN feereport_student ON feereport_marks.rollno = feereport_student.rollno " +
//                            "WHERE feereport_marks.rollno = ? AND feereport_student.name = ?");
//            ps.setInt(1, rollno);
//            ps.setString(2, name);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Mark m = new Mark();
//                m.setId(rs.getInt("id"));
//                m.setRollno(rs.getInt("rollno"));
//                m.setSubject(rs.getString("subject"));
//                m.setMarks(rs.getInt("marks"));
//                list.add(m);
//            }
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return list;
//    }
//
//    public static Mark getMarkByRollNoAndSubject(int rollno, String subject) {
//        Mark m = null;
//        try {
//            Connection con = AccountDao.getCon();
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM feereport_marks WHERE rollno=? AND subject=?");
//            ps.setInt(1, rollno);
//            ps.setString(2, subject);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                m = new Mark();
//                m.setId(rs.getInt("id"));
//                m.setRollno(rs.getInt("rollno"));
//                m.setSubject(rs.getString("subject"));
//                m.setMarks(rs.getInt("marks"));
//            }
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return m;
//    }
//}





package com.javaproject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MarkDao {

    public static int save(Mark m) {
        int status = 0;
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("INSERT INTO feereport_marks (rollno, courseCode, subject, marks) VALUES (?, ?, ?, ?)");
            ps.setInt(1, m.getRollno());
            ps.setInt(2, m.getCourseCode()); // Make sure to include courseCode
            ps.setString(3, m.getSubject());
            ps.setInt(4, m.getMarks());
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int update(Mark m) {
        int status = 0;
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("UPDATE feereport_marks SET rollno=?, courseCode=?, subject=?, marks=? WHERE id=?");
            ps.setInt(1, m.getRollno());
            ps.setInt(2, m.getCourseCode());
            ps.setString(3, m.getSubject());
            ps.setInt(4, m.getMarks());
//            ps.setInt(5, m.getId());
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int updateByRollNoAndSubject(Mark m) {
        int status = 0;
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("UPDATE feereport_marks SET marks=? WHERE rollno=? AND subject=?");
            ps.setInt(1, m.getMarks());
            ps.setInt(2, m.getRollno());
            ps.setString(3, m.getSubject());
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int delete(int id) {
        int status = 0;
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("DELETE FROM feereport_marks WHERE id=?");
            ps.setInt(1, id);
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static List<Mark> view() {
        List<Mark> list = new ArrayList<>();
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM feereport_marks");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mark m = new Mark();
//                m.setId(rs.getInt("id"));
                m.setRollno(rs.getInt("rollno"));
                m.setCourseCode(rs.getInt("courseCode"));
                m.setSubject(rs.getString("subject"));
                m.setMarks(rs.getInt("marks"));
                list.add(m);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public static Mark getMarkById(int id) {
        Mark m = new Mark();
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM feereport_marks WHERE id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
//                m.setId(rs.getInt("id"));
                m.setRollno(rs.getInt("rollno"));
                m.setCourseCode(rs.getInt("courseCode"));
                m.setSubject(rs.getString("subject"));
                m.setMarks(rs.getInt("marks"));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return m;
    }

    public static List<Mark> getMarksByRollNoAndName(int rollno, String name) {
        List<Mark> list = new ArrayList<>();
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement(
                    "SELECT feereport_marks.* FROM feereport_marks " +
                            "JOIN feereport_student ON feereport_marks.rollno = feereport_student.rollno " +
                            "WHERE feereport_marks.rollno = ? AND feereport_student.name = ?");
            ps.setInt(1, rollno);
            ps.setString(2, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mark m = new Mark();
//                m.setId(rs.getInt("id"));
                m.setRollno(rs.getInt("rollno"));
                m.setCourseCode(rs.getInt("courseCode"));
                m.setSubject(rs.getString("subject"));
                m.setMarks(rs.getInt("marks"));
                list.add(m);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public static Mark getMarkByRollNoAndSubject(int rollno, String subject) {
        Mark m = null;
        try {
            Connection con = AccountDao.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM feereport_marks WHERE rollno=? AND subject=?");
            ps.setInt(1, rollno);
            ps.setString(2, subject);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                m = new Mark();
//                m.setId(rs.getInt("id"));
                m.setRollno(rs.getInt("rollno"));
                m.setCourseCode(rs.getInt("courseCode"));
                m.setSubject(rs.getString("subject"));
                m.setMarks(rs.getInt("marks"));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return m;
    }
}

