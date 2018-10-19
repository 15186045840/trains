package com.hk.bean;

public class Dynamic {
	private int DID;
	private String Dtitle;
	private String Ddate;
	private String Dcontent;
	
	
	public Dynamic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dynamic(int dID, String dtitle, String ddate, String dcontent) {
		super();
		DID = dID;
		Dtitle = dtitle;
		Ddate = ddate;
		Dcontent = dcontent;
	}
	public int getDID() {
		return DID;
	}
	public void setDID(int dID) {
		DID = dID;
	}
	public String getDtitle() {
		return Dtitle;
	}
	public void setDtitle(String dtitle) {
		Dtitle = dtitle;
	}
	public String getDdate() {
		return Ddate;
	}
	public void setDdate(String ddate) {
		Ddate = ddate;
	}
	public String getDcontent() {
		return Dcontent;
	}
	public void setDcontent(String dcontent) {
		Dcontent = dcontent;
	}
	@Override
	public String toString() {
		return "Dynamic [DID=" + DID + ", Dtitle=" + Dtitle + ", Ddate=" + Ddate + ", Dcontent=" + Dcontent + "]";
	}
	
	
	

}
