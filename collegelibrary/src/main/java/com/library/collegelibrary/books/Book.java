package com.library.collegelibrary.books;

public class Book {
	
	private String bookName;
	private String bPublisher;
	private String bWriter;
	private int bId;
	private int noOfPage;
	private double bPrice;
	private String bookSubject;
	
	public String getBookName() {
		return this.bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookPublisher() {
		return this.bPublisher;
	}
	public void setBookPublisher(String bPublisher) {
		this.bPublisher = bPublisher;
	}
	public String getBookWriter() {
		return this.bWriter;
	}
	public void setBookWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public int getBookID() {
		return this.bId;
	}
	public void setBookID(int bId) {
		this.bId = bId;
	}
	public int getNoOfPage() {
		return this.noOfPage;
	}
	public void setNoOfPage(int noOfPage) {
		this.noOfPage = noOfPage;
	}
	public double getBookPrice() {
		return this.bPrice;
	}
	public void setBookPrice(double bPrice) {
		this.bPrice = bPrice;
	}
	public String getBookSubject() {
		return this.bookSubject;
	}
	public void setBookSubject(String bookSubject) {
		this.bookSubject = bookSubject;
	}
	@Override
	public String toString() {
		return "Book\n[Book Name=" + bookName + "\nBook Publisher=" + bPublisher + "\nBook Writer=" + bWriter + "\nBook Id=" + bId
				+ "\nNo. Of Page=" + noOfPage + "\nBook Price=" + bPrice + "\nBook Subject=" + bookSubject + "]\n";
	}
	
}
