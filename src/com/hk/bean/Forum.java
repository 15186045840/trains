package com.hk.bean;

public class Forum {
	private int FID;
	private int SID;
	private String Fdate;
	private String Fcontent;
	
	
	public Forum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Forum(int fID, int sID, String fdate, String fcontent) {
		super();
		FID = fID;
		SID = sID;
		Fdate = fdate;
		Fcontent = fcontent;
	}
	public int getFID() {
		return FID;
	}
	public void setFID(int fID) {
		FID = fID;
	}
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public String getFdate() {
		return Fdate;
	}
	public void setFdate(String fdate) {
		Fdate = fdate;
	}
	public String getFcontent() {
		return Fcontent;
	}
	public void setFcontent(String fcontent) {
		Fcontent = fcontent;
	}
	@Override
	public String toString() {
		return "Forum [FID=" + FID + ", SID=" + SID + ", Fdate=" + Fdate + ", Fcontent=" + Fcontent + "]";
	}
	
	

}
