package com.igeek.ad2_2.XML;

public class Book {
	private String bid;
	private String title;
	private String price;

	public Book() {

	}

	public Book(String bid, String title, String price) {
		super();
		this.bid = bid;
		this.title = title;
		this.price = price;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", price=" + price + "]";
	}

	
}
