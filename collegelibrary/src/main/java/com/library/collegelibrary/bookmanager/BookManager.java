package com.library.collegelibrary.bookmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import com.library.collegelibrary.books.Book;

public class BookManager {
	
	//private static BookManager obj = null;
	private BookManager() {};
	/*public static BookManager objectCreationMethod(){
		
		if(obj==null){
		    obj= new BookManager();
		}
	        return obj;
	   }
	*/
	private static LinkedList<Book> bookList = new LinkedList<Book>();
	
	public static void init() {
		
		Book b1 = new Book();
		
		b1.setBookName("Information Theory And Coding");
		b1.setBookPublisher("ABC Publication");
		b1.setBookWriter("Ranjan Bose");
		b1.setBookID(1324);
		b1.setNoOfPage(250);
		b1.setBookPrice(300);
		b1.setBookSubject("Information Technology");
		
		bookList.addLast(b1);

		Book b2 = new Book();
		
		b2.setBookName("Switching Theory And Automata");
		b2.setBookPublisher("XYZ Publication");
		b2.setBookWriter("Chandrashekher");
		b2.setBookID(4536);
		b2.setNoOfPage(350);
		b2.setBookPrice(500);
		b2.setBookSubject("Information Technology");
		
		bookList.addLast(b2);

		Book b3 = new Book();
		
		b3.setBookName("Design And Algorithms");
		b3.setBookPublisher("ABC Publication");
		b3.setBookWriter("A.K.Dutta");
		b3.setBookID(4527);
		b3.setNoOfPage(550);
		b3.setBookPrice(600);
		b3.setBookSubject("Information Technology");
		
		bookList.addLast(b3);

		Book b4 = new Book();
		
		b4.setBookName("Core Java");
		b4.setBookPublisher("XYZ Publication");
		b4.setBookWriter("R.Nageshwara Rao");
		b4.setBookID(7869);
		b4.setNoOfPage(800);
		b4.setBookPrice(1000);
		b4.setBookSubject("Computer Science");
		
		bookList.addLast(b4);

		Book b5 = new Book();
		
		b5.setBookName("Abstract Algebra");
		b5.setBookPublisher("ABC Publication");
		b5.setBookWriter("Das Mapa");
		b5.setBookID(9128);
		b5.setNoOfPage(350);
		b5.setBookPrice(400);
		b5.setBookSubject("Maths");
		
		bookList.addLast(b5);
	}
	
	public static void entry() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Book bNew = new Book();
		
		System.out.println("Enter new book details : ");
		System.out.println("Enter Book name : ");
		bNew.setBookName(br.readLine());
		System.out.println("Enter Book publisher : ");
		bNew.setBookPublisher(br.readLine());
		System.out.println("Enter Book writer : ");
		bNew.setBookWriter(br.readLine());
		System.out.println("Enter Book ID : ");
		bNew.setBookID(Integer.parseInt(br.readLine()));
		System.out.println("Enter Book No of pages : ");
		bNew.setNoOfPage(Integer.parseInt(br.readLine()));
		System.out.println("Enter Book price : ");
		bNew.setBookPrice(Double.parseDouble(br.readLine()));
		System.out.println("Enter Book subject : ");
		bNew.setBookSubject(br.readLine());
		bookList.addLast(bNew);
	}
	public static void remove(int index) {
		bookList.remove(index);
	}
	public static int searchByID(int bookId) {		
		for(Book bookSearch : BookManager.bookList) {
			if(bookSearch.getBookID() == bookId) {
				return bookList.indexOf(bookSearch);				
			}
		}	
		return 0;
	}
	public static int searchByName(String bookName) {
		for(Book bookSearch1 : BookManager.bookList) {
			if(bookSearch1.getBookName().equals(bookName)) {
				return bookList.indexOf(bookSearch1);
			}
		}
		return 0;
	}

public static void main(String[] args) throws IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			BookManager.init();
			int j = 0;
			System.out.println("BookLists : ");
			
			for(Book b : BookManager.bookList) {
				System.out.println(j+". "+b);
				j++;
			}
			System.out.println("Enter new Book");
			BookManager.entry();
			System.out.println("BookLists : ");
			j=0;
			for(Book b : BookManager.bookList) {
				System.out.println(j+". "+b);
				j++;
			}
			System.out.println("Remove Book");
			System.out.println("enter book index: ");
			int index = Integer.parseInt(br.readLine());
			BookManager.remove(index);
			System.out.println("BookLists : ");
			j=0;
			for(Book b :BookManager.bookList) {
				System.out.println(j+". "+b);
				j++;
			}
			System.out.println("Search book by ID: ");
			System.out.println("Enter book ID: ");
			int p = Integer.parseInt(br.readLine());
			int a = BookManager.searchByID(p);
			if(a != 0) {
				System.out.println("INDEX = "+a);
			}else {
				System.out.println("NOT FOUND");
			}
			
			System.out.println("Search book by name: ");
			System.out.println("Enter book name: ");
			String q =br.readLine();
			int b = BookManager.searchByName(q);
			if(b != 0) {
				System.out.println("INDEX = "+b);
			}else {
				System.out.println("NOT FOUND");
			}
			
	}
}
