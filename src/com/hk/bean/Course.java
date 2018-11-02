package com.hk.bean;

public class Course {
	private int CID;
	private String Cname;
	private String Ctype;
	private String Clink;
	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getCtype() {
		return Ctype;
	}
	public void setCtype(String ctype) {
		Ctype = ctype;
	}
	public String getClink() {
		return Clink;
	}
	public void setClink(String clink) {
		Clink = clink;
	}
	@Override
	public String toString() {
		return "Course [CID=" + CID + ", Cname=" + Cname + ", Ctype=" + Ctype + ", Clink=" + Clink + "]";
	}

	

}
