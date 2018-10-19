package com.hk.bean;

public class Course {
	private int CID;
	private String Cname;
	private String Ctime;
	private int Cdate;
	

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Course(int cID, String cname, String ctime, int cdate) {
		super();
		CID = cID;
		Cname = cname;
		Ctime = ctime;
		Cdate = cdate;
	}


	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getCtime() {
		return Ctime;
	}
	public void setCtime(String ctime) {
		Ctime = ctime;
	}
	public int getCdate() {
		return Cdate;
	}
	public void setCdate(int cdate) {
		Cdate = cdate;
	}
	@Override
	public String toString() {
		return "Course [CID=" + CID + ", Cname=" + Cname + ", Ctime=" + Ctime + ", Cdate=" + Cdate + "]";
	}
	
	

}
