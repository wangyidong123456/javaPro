package com.jiayuan.entiy;

public class Books {
	String bid;
	String name;
	int cid;
	String author;
	String state;

	public Books() {

	}

	public Books(String bid, String name, int cid, String author, String state) {
		super();
		this.bid = bid;
		this.name = name;
		this.cid = cid;
		this.author = author;
		this.state = state;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	@Override
	
	public String toString(){
		return "bid="+bid+",name="+name+",cid="+cid+",author="+author+",state="+state;
	}
	

		
	
}
