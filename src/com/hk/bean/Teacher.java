package com.hk.bean;

public class Teacher {
	private int TID;
	private String Tname;
	private String Tphone;
	private String Tintroduce;
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int tID, String tname, String tphone, String tintroduce) {
		super();
		TID = tID;
		Tname = tname;
		Tphone = tphone;
		Tintroduce = tintroduce;
	}
	public int getTID() {
		return TID;
	}
	public void setTID(int tID) {
		TID = tID;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getTphone() {
		return Tphone;
	}
	public void setTphone(String tphone) {
		Tphone = tphone;
	}
	public String getTintroduce() {
		return Tintroduce;
	}
	public void setTintroduce(String tintroduce) {
		Tintroduce = tintroduce;
	}
	@Override
	public String toString() {
		return "Teacher [TID=" + TID + ", Tname=" + Tname + ", Tphone=" + Tphone + ", Tintroduce=" + Tintroduce + "]";
	}
	
	

}
