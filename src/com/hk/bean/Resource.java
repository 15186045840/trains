package com.hk.bean;

public class Resource {
	private int RID;
	private String Rname;
	private String Rtype;
	private String Rlink;
	public int getRID() {
		return RID;
	}
	public void setRID(int rID) {
		RID = rID;
	}
	public String getRname() {
		return Rname;
	}
	public void setRname(String rname) {
		Rname = rname;
	}
	public String getRtype() {
		return Rtype;
	}
	public void setRtype(String rtype) {
		Rtype = rtype;
	}
	public String getRlink() {
		return Rlink;
	}
	public void setRlink(String rlink) {
		Rlink = rlink;
	}
	@Override
	public String toString() {
		return "Resource [RID=" + RID + ", Rname=" + Rname + ", Rtype=" + Rtype + ", Rlink=" + Rlink + "]";
	}

	
}
