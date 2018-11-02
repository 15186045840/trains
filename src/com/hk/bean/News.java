package com.hk.bean;

public class News {
	private int NID;
	private String Ntype;
	private String Ntitle;
	private String Ncontent;
	private String Ndate;
	private String Nlink;
	public int getNID() {
		return NID;
	}
	public void setNID(int nID) {
		NID = nID;
	}
	public String getNtype() {
		return Ntype;
	}
	public void setNtype(String ntype) {
		Ntype = ntype;
	}
	public String getNtitle() {
		return Ntitle;
	}
	public void setNtitle(String ntitle) {
		Ntitle = ntitle;
	}
	public String getNcontent() {
		return Ncontent;
	}
	public void setNcontent(String ncontent) {
		Ncontent = ncontent;
	}
	public String getNdate() {
		return Ndate;
	}
	public void setNdate(String ndate) {
		Ndate = ndate;
	}
	public String getNlink() {
		return Nlink;
	}
	public void setNlink(String nlink) {
		Nlink = nlink;
	}
	@Override
	public String toString() {
		return "News [NID=" + NID + ", Ntype=" + Ntype + ", Ntitle=" + Ntitle + ", Ncontent=" + Ncontent + ", Ndate="
				+ Ndate + ", Nlink=" + Nlink + "]";
	}
	

}
