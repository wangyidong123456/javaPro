package com.jiayuan.entiy;

import java.util.Date;

public class BRRecord {
	int id;
	String uid;
	String uname;
	String bid;
	String bname;
	Date borrowdate;
	Date backdate_should;
	Date backdate_reality;
	public BRRecord(){
		
	}
	public BRRecord(int id, String uid, String uname, String bid, String bname, Date borrowdate, Date backdate_should,
			Date backdate_reality) {
		super();
		this.id = id;
		this.uid = uid;
		this.uname = uname;
		this.bid = bid;
		this.bname = bname;
		this.borrowdate = borrowdate;
		this.backdate_should = backdate_should;
		this.backdate_reality = backdate_reality;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Date getBorrowdate() {
		return borrowdate;
	}

	public void setBorrowdate(Date borrowdate) {
		this.borrowdate = borrowdate;
	}

	public Date getBackdate_should() {
		return backdate_should;
	}

	public void setBackdate_should(Date backdate_should) {
		this.backdate_should = backdate_should;
	}

	public Date getBackdate_reality() {
		return backdate_reality;
	}

	public void setBackdate_reality(Date backdate_reality) {
		this.backdate_reality = backdate_reality;
	}
	@Override
	public String toString(){
		return "id:"+id+"bid:"+bid+",uid:"+uid+",uname:"+uname+",bid="+bid+",bname="+bname+",borrowdate="+borrowdate+",backdate_should="+backdate_should+",backdate_reality="+backdate_reality;
		
	}
}
