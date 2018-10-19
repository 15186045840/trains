package com.hk.bean;

public class Resources {
	private int RID;
	private String Rname;
	private String Rurl;
	
	
	public Resources() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Resources(int rID, String rname, String rurl) {
		super();
		RID = rID;
		Rname = rname;
		Rurl = rurl;
	}
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
	public String getRurl() {
		return Rurl;
	}
	public void setRurl(String rurl) {
		Rurl = rurl;
	}
	@Override
	public String toString() {
		return "Resources [RID=" + RID + ", Rname=" + Rname + ", Rurl=" + Rurl + "]";
	}
	
	

}
