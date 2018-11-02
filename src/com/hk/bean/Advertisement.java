package com.hk.bean;

public class Advertisement {
	private int AID;
	private String Atype;
	private String Atitle;
	private String Acontent;
	private String Alink;
	public int getAID() {
		return AID;
	}
	public void setAID(int aID) {
		AID = aID;
	}
	public String getAtype() {
		return Atype;
	}
	public void setAtype(String atype) {
		Atype = atype;
	}
	public String getAtitle() {
		return Atitle;
	}
	public void setAtitle(String atitle) {
		Atitle = atitle;
	}
	public String getAcontent() {
		return Acontent;
	}
	public void setAcontent(String acontent) {
		Acontent = acontent;
	}
	public String getAlink() {
		return Alink;
	}
	public void setAlink(String alink) {
		Alink = alink;
	}
	@Override
	public String toString() {
		return "Advertisement [AID=" + AID + ", Atype=" + Atype + ", Atitle=" + Atitle + ", Acontent=" + Acontent
				+ ", Alink=" + Alink + "]";
	}
	

}
