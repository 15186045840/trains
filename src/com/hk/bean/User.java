package com.hk.bean;

public class User {
	private String UID;
	private String Uname;
	private String Usex;
	private int Uage;
	private String Upassword;
	private String Udate;

	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getUsex() {
		return Usex;
	}
	public void setUsex(String usex) {
		Usex = usex;
	}

	public int getUage() {
		return Uage;
	}
	public void setUage(int uage) {
		Uage = uage;
	}
	public String getUpassword() {
		return Upassword;
	}
	public void setUpassword(String upassword) {
		Upassword = upassword;
	}
	public String getUdate() {
		return Udate;
	}
	public void setUdate(String udate) {
		Udate = udate;
	}
	@Override
	public String toString() {
		return "User [UID=" + UID + ", Uname=" + Uname + ", Usex=" + Usex + ", Uage=" + Uage + ", Upassword="
				+ Upassword + ", Udate=" + Udate + "]";
	}


}
