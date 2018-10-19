package com.hk.bean;

public class Student {
	private int SID;
	private String Sname;
	private String Spassword;
	private String Snickname;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sID, String sname, String spassword, String snickname) {
		super();
		SID = sID;
		Sname = sname;
		Spassword = spassword;
		Snickname = snickname;
	}
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSpassword() {
		return Spassword;
	}
	public void setSpassword(String spassword) {
		Spassword = spassword;
	}
	public String getSnickname() {
		return Snickname;
	}
	public void setSnickname(String snickname) {
		Snickname = snickname;
	}
	@Override
	public String toString() {
		return "Student [SID=" + SID + ", Sname=" + Sname + ", Spassword=" + Spassword + ", Snickname=" + Snickname
				+ "]";
	}
	
	

}
