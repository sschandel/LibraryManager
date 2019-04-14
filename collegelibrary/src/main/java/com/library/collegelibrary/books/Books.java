package com.library.collegelibrary.books;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Books {
	
	static String bookName;
	static String bPublisher;
	static String bWriter;
	static int noOfPage;
	static int bCount;
	static double bPrice;
	static int bEdition;
	static String bSubject;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedList<String> name = new LinkedList<String>();
		LinkedList<String> publisher = new LinkedList<String>();
		LinkedList<String> writer = new LinkedList<String>();
		LinkedList<Integer> pageCount = new LinkedList<Integer>();
		LinkedList<Integer> bookCount = new LinkedList<Integer>();
		LinkedList<Double> bookPrice = new LinkedList<Double>();
		LinkedList<Integer> bookEdition = new LinkedList<Integer>();
		LinkedList<String> subject = new LinkedList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		while(choice != 2) {
			
			System.out.println("1.Book Entry");
			System.out.println("2.Exit");
			System.out.println("Your choice: ");
			choice = Integer.parseInt(br.readLine());
			switch(choice) {
				case 1:
					System.out.println("Enter Book Name: ");
					bookName = br.readLine();
					name.add(bookName);
					System.out.println("Enter Publisher Name: ");
					bPublisher = br.readLine();
					publisher.add(bPublisher);
					System.out.println("Enter Writer Name: ");
					bWriter = br.readLine();
					writer.add(bWriter);
					System.out.println("Enter Page count: ");
					noOfPage = Integer.parseInt(br.readLine());
					pageCount.add(noOfPage);
					System.out.println("Enter Book Count: ");
					bCount = Integer.parseInt(br.readLine());
					bookCount.add(bCount);
					System.out.println("Enter Book Price: ");
					bPrice = Double.parseDouble(br.readLine());
					bookPrice.add(bPrice);
					System.out.println("Enter Book Edition: ");
					bEdition = Integer.parseInt(br.readLine());
					bookEdition.add(bEdition);
					System.out.println("Enter Book Subject: ");
					bSubject = br.readLine();
					subject.add(bSubject);
					break;
				case 2: 
					break;
				default : return;
			}
		}
		System.out.println("List : ");
		for(int i=0;i<name.size();i++) {
			System.out.println("book name = "+name);
			System.out.println("publisher name = "+publisher);
			System.out.println("writer name = "+writer);
			System.out.println("page count = "+pageCount);
			System.out.println("book count = "+bookCount);
			System.out.println("book price = "+bookPrice);
			System.out.println("book edition = "+bookEdition);
			System.out.println("subject = "+subject);
		}
	}
}
