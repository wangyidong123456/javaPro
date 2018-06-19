package com.igeek.jdbc.studentsystem;

public class Classes {
	private int cid;
	private String cname;
	private String cdesc;

	public Classes() {
		super();
	}

	public Classes(int cid, String cname, String cdesc) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cdesc = cdesc;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}

	@Override
	public String toString() {
		return "Classes [cid=" + cid + ", cname=" + cname + ", cdesc=" + cdesc + "]";
	}
	
}
