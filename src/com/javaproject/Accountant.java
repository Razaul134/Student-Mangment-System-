package com.javaproject;

public class Accountant {
	private int rollno;
	private String password;
	private String email;
	private String contactno;

	public Accountant() {}

	public Accountant(int rollno, String password, String email, String contactno) {
		this.rollno = rollno;
		this.password = password;
		this.email = email;
		this.contactno = contactno;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
}
