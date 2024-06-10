package com.javaproject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {

	public static Connection getCon() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sims", "root", "");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static boolean validate(int rollno, String password) {
		boolean status = false;
		try {
			Connection con = getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM feereport_accountant WHERE rollno=? AND password=?");
			ps.setInt(1, rollno);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static int save(Accountant a) {
		int status = 0;
		try {
			Connection con = getCon();
			PreparedStatement ps = con.prepareStatement("INSERT INTO feereport_accountant(rollno, password, email, contactno) VALUES(?, ?, ?, ?)");
			ps.setInt(1, a.getRollno());
			ps.setString(2, a.getPassword());
			ps.setString(3, a.getEmail());
			ps.setString(4, a.getContactno());
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static List<Accountant> view() {
		List<Accountant> list = new ArrayList<>();
		try {
			Connection con = getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM feereport_accountant");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Accountant a = new Accountant();
				a.setRollno(rs.getInt("rollno"));
				a.setPassword(rs.getString("password"));
				a.setEmail(rs.getString("email"));
				a.setContactno(rs.getString("contactno"));
				list.add(a);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
