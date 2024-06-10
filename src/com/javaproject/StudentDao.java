package com.javaproject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	public static int save(Student s) {
		int status = 0;
		try {
			Connection con = AccountDao.getCon();
			PreparedStatement ps = con.prepareStatement("INSERT INTO feereport_student(rollno, name, email, course, fee, paid, due, address, city, state, country, contactno) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, s.getRollno());
			ps.setString(2, s.getName());
			ps.setString(3, s.getEmail());
			ps.setString(4, s.getCourse());
			ps.setInt(5, s.getFee());
			ps.setInt(6, s.getPaid());
			ps.setInt(7, s.getDue());
			ps.setString(8, s.getAddress());
			ps.setString(9, s.getCity());
			ps.setString(10, s.getState());
			ps.setString(11, s.getCountry());
			ps.setString(12, s.getContactno());
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static int update(Student s) {
		int status = 0;
		try {
			Connection con = AccountDao.getCon();
			PreparedStatement ps = con.prepareStatement("UPDATE feereport_student SET name=?, email=?, course=?, fee=?, paid=?, due=?, address=?, city=?, state=?, country=?, contactno=? WHERE rollno=?");
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getCourse());
			ps.setInt(4, s.getFee());
			ps.setInt(5, s.getPaid());
			ps.setInt(6, s.getDue());
			ps.setString(7, s.getAddress());
			ps.setString(8, s.getCity());
			ps.setString(9, s.getState());
			ps.setString(10, s.getCountry());
			ps.setString(11, s.getContactno());
			ps.setInt(12, s.getRollno());
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static int delete(int rollno) {
		int status = 0;
		try {
			Connection con = AccountDao.getCon();
			PreparedStatement ps = con.prepareStatement("DELETE FROM feereport_student WHERE rollno=?");
			ps.setInt(1, rollno);
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static List<Student> view() {
		List<Student> list = new ArrayList<Student>();
		try {
			Connection con = AccountDao.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM feereport_student");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student s = new Student();
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setState(rs.getString("state"));
				s.setCountry(rs.getString("country"));
				s.setContactno(rs.getString("contactno"));
				list.add(s);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public static Student getStudentByRollno(int rollno) {
		Student s = new Student();
		try {
			Connection con = AccountDao.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM feereport_student WHERE rollno=?");
			ps.setInt(1, rollno);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setState(rs.getString("state"));
				s.setCountry(rs.getString("country"));
				s.setContactno(rs.getString("contactno"));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return s;
	}

	public static List<Student> due() {
		List<Student> list = new ArrayList<Student>();
		try {
			Connection con = AccountDao.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM feereport_student WHERE due>0");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student s = new Student();
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setState(rs.getString("state"));
				s.setCountry(rs.getString("country"));
				s.setContactno(rs.getString("contactno"));
				list.add(s);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
