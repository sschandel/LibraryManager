package com.library.collegelibrary.books;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

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
	public String setBookName(String bookName) {
		return this.bookName = bookName;
	}
	public String getBookPublisher() {
		return this.bPublisher;
	}
	public String setBookPublisher(String bPublisher) {
		return this.bPublisher = bPublisher;
	}
	public String getBookWriter() {
		return this.bWriter;
	}
	public String setBookWriter(String bWriter) {
		return this.bWriter = bWriter;
	}
	public int getBookID() {
		return this.bId;
	}
	public int setBookID(int bId) {
		return this.bId = bId;
	}
	public int getNoOfPage() {
		return this.noOfPage;
	}
	public int setNoOfPage(int noOfPage) {
		return this.noOfPage = noOfPage;
	}
	public double getBookPrice() {
		return this.bPrice;
	}
	public double setBookPrice(double bPrice) {
		return this.bPrice = bPrice;
	}
	public String getBookSubject() {
		return this.bookSubject;
	}
	public String setBookSubject(String bookSubject) {
		return this.bookSubject = bookSubject;
	}
	
	public static void main(String[] args) throws IOException {
		
		LinkedList<String> name = new LinkedList<String>();
		LinkedList<String> publisher = new LinkedList<String>();
		LinkedList<String> writer = new LinkedList<String>();
		LinkedList<Integer> Id = new LinkedList<Integer>();
		LinkedList<Integer> pageCount = new LinkedList<Integer>();
		LinkedList<Double> bookPrice = new LinkedList<Double>();
		LinkedList<String> subject = new LinkedList<String>();
		
		Book b1 = new Book();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Book Name: ");
		name.add(b1.setBookName(br.readLine()));
		System.out.println("Enter Publisher Name: ");
		publisher.add(b1.setBookPublisher(br.readLine()));
		System.out.println("Enter Writer Name: ");
		writer.add(b1.setBookWriter(br.readLine()));
		System.out.println("Enter Book ID: ");
		Id.add(b1.setBookID(Integer.parseInt(br.readLine())));
		System.out.println("Enter Page count: ");
		pageCount.add(b1.setNoOfPage(Integer.parseInt(br.readLine())));
		System.out.println("Enter Book Price: ");
		bookPrice.add(b1.setBookPrice(Double.parseDouble(br.readLine())));
		System.out.println("Enter Book Subject: ");
		subject.add(b1.setBookSubject(br.readLine()));

		System.out.println();
		System.out.println("Book Details : ");
		
			System.out.println("book name = "+name);
			System.out.println("publisher name = "+publisher);
			System.out.println("writer name = "+writer);
			System.out.println("Book ID = "+Id);
			System.out.println("page count = "+pageCount);
			System.out.println("book price = "+bookPrice);
			System.out.println("subject = "+subject);
		
	}
}
