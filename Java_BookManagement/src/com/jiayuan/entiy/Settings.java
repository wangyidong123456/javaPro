package com.jiayuan.entiy;

public class Settings {
	int id;
	int maxnumber;
	int maxday;

	public Settings() {

	}

	public Settings(int id, int maxnumber, int maxday) {
		super();
		this.id = id;
		this.maxnumber = maxnumber;
		this.maxday = maxday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxnumber() {
		return maxnumber;
	}

	public void setMaxnumber(int maxnumber) {
		this.maxnumber = maxnumber;
	}

	public int getMaxday() {
		return maxday;
	}

	public void setMaxday(int maxday) {
		this.maxday = maxday;
	}
	
	
}
