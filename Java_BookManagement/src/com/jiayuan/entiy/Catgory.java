package com.jiayuan.entiy;

public class Catgory {
	int id;
	String booksort;

	public Catgory() {

	}

	public Catgory(int id, String booksort) {
		super();
		this.id = id;
		this.booksort = booksort;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBooksort() {
		return booksort;
	}

	public void setBooksort(String booksort) {
		this.booksort = booksort;
	}
	@Override
    public String toString(){
    	return "id="+id+",booksort="+booksort;
    }
}
