package com.hekinfosis.learn.dayone;

public class Customer {
	String cusid;
	int sNo;
	String cusFirstName;
	String cusLastName;
	int cusTimeEnter;
	int cusTimeExit;
	
		
//	public Customer (int custid) {
//		this.cusid = cusid;
//	}
	
	public String getCusid() {
		return cusid;
	}
	public void setCusid(String cusid) {
		this.cusid = cusid;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getCusFirstName() {
		return cusFirstName;
	}

	public void setCusFirstName(String cusFirstName) {
		this.cusFirstName = cusFirstName;
	}

	public String getCusLastName() {
		return cusLastName;
	}

	public void setCusLastName(String cusLastName) {
		this.cusLastName = cusLastName;
	}

	public int getCusTimeEnter() {
		return cusTimeEnter;
	}

	public void setCusTimeEnter(int cusTimeEnter) {
		this.cusTimeEnter = cusTimeEnter;
	}

	public int getCusTimeExit() {
		return cusTimeExit;
	}

	public void setCusTimeExit(int cusTimeExit) {
		this.cusTimeExit = cusTimeExit;
	}
	
	

}
