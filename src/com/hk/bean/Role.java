package com.hk.bean;

public class Role {
	private int RLEID;
	private String RLEname;
	
	public int getRLEID() {
		return RLEID;
	}
	public void setRLEID(int rLEID) {
		RLEID = rLEID;
	}
	public String getRLEname() {
		return RLEname;
	}
	public void setRLEname(String rLEname) {
		RLEname = rLEname;
	}
	@Override
	public String toString() {
		return "Role [RLEID=" + RLEID + ", RLEname=" + RLEname + "]";
	}

}
