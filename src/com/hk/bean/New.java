package com.hk.bean;

public class New {
	private int NID;
	private String Ntitle;
	private String Ndate;
	private String Ncontent;
	
	
	public New() {
		super();
		// TODO Auto-generated constructor stub
	}
	public New(int nID, String ntitle, String ndate, String ncontent) {
		super();
		NID = nID;
		Ntitle = ntitle;
		Ndate = ndate;
		Ncontent = ncontent;
	}
	public int getNID() {
		return NID;
	}
	public void setNID(int nID) {
		NID = nID;
	}
	public String getNtitle() {
		return Ntitle;
	}
	public void setNtitle(String ntitle) {
		Ntitle = ntitle;
	}
	public String getNdate() {
		return Ndate;
	}
	public void setNdate(String ndate) {
		Ndate = ndate;
	}
	public String getNcontent() {
		return Ncontent;
	}
	public void setNcontent(String ncontent) {
		Ncontent = ncontent;
	}
	@Override
	public String toString() {
		return "New [NID=" + NID + ", Ntitle=" + Ntitle + ", Ndate=" + Ndate + ", Ncontent=" + Ncontent + "]";
	}
	

}
