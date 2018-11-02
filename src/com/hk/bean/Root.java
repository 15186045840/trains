package com.hk.bean;

public class Root {
	private int RTID;
	private String RTname;
	private String RTpassword;
	private String RTdate;
	public int getRTID() {
		return RTID;
	}
	public void setRTID(int rTID) {
		RTID = rTID;
	}
	public String getRTname() {
		return RTname;
	}
	public void setRTname(String rTname) {
		RTname = rTname;
	}
	public String getRTpassword() {
		return RTpassword;
	}
	public void setRTpassword(String rTpassword) {
		RTpassword = rTpassword;
	}
	public String getRTdate() {
		return RTdate;
	}
	public void setRTdate(String rTdate) {
		RTdate = rTdate;
	}
	@Override
	public String toString() {
		return "Root [RTID=" + RTID + ", RTname=" + RTname + ", RTpassword=" + RTpassword + ", RTdate=" + RTdate + "]";
	}

}
