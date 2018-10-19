package com.hk.bean;

public class Root {
	private String RTname;
	private String RTpassword;
	private int RTvalue;
	
	
	public Root() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Root(String rTname, String rTpassword, int rTvalue) {
		super();
		RTname = rTname;
		RTpassword = rTpassword;
		RTvalue = rTvalue;
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
	public int getRTvalue() {
		return RTvalue;
	}
	public void setRTvalue(int rTvalue) {
		RTvalue = rTvalue;
	}
	@Override
	public String toString() {
		return "Root [RTname=" + RTname + ", RTpassword=" + RTpassword + ", RTvalue=" + RTvalue + "]";
	}
	

}
