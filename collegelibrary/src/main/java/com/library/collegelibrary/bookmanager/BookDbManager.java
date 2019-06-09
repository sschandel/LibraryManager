package com.library.collegelibrary.bookmanager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookDbManager {
	private BookDbManager() {};
	public static void init() throws Exception {
		String url = "jdbc:mysql://localhost:3306/college_library";
		String user_name = "root";
		String user_pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user_name, user_pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from college_library.book");
		int j = 0;
		System.out.println("BookLists : ");
		while(rs.next()) {
			System.out.print(j+" "+rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+" \t ");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getInt(4)+"\t");
			System.out.print(rs.getInt(5)+"\t");
			System.out.print(rs.getFloat(6)+"\t");
			System.out.print(rs.getString(7)+"\t");
			System.out.println();
			j++;
		}
		con.close();
	}
	public static void entry() throws Exception {
		String url = "jdbc:mysql://localhost:3306/college_library";
		String user_name = "root";
		String user_pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName("");
		Connection con = DriverManager.getConnection(url, user_name, user_pass);
		Statement st = con.createStatement();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter new book details : ");
		System.out.println("Enter Book name : ");
		String bookName = br.readLine();
		System.out.println("Enter Book publisher : ");
		String publisher = br.readLine();
		System.out.println("Enter Book writer : ");
		String writer = br.readLine();
		System.out.println("Enter Book ID : ");
		int bookID = Integer.parseInt(br.readLine());
		System.out.println("Enter Book No of pages : ");
		int pageNo = Integer.parseInt(br.readLine());
		System.out.println("Enter Book price : ");
		double price = Double.parseDouble(br.readLine());
		System.out.println("Enter Book subject : ");
		String bSubject = br.readLine();
		String query = "insert into college_library.book values('"+bookName+"','"+publisher+"','"+writer+"',"+bookID+","+pageNo+","+price+",'"+bSubject+"')";
		System.out.println(query);
		int rs = st.executeUpdate(query);
		System.out.println();
		init();
		con.close();
	}
	
	public static void remove() throws Exception {
		String url = "jdbc:mysql://localhost:3306/college_library";
		String user_name = "root";
		String user_pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user_name, user_pass);
		Statement st = con.createStatement();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter book name to delete:");
		String bName = br.readLine();
		String query = "delete from college_library.book where bookName='"+bName+"'";
		System.out.println(query);
		int rs = st.executeUpdate(query);
		System.out.println();
		init();
		con.close();
	}
	public static void searchByID(int bookId) throws Exception {
		String url = "jdbc:mysql://localhost:3306/college_library";
		String user_name = "root";
		String user_pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user_name, user_pass);
		Statement st = con.createStatement();
		String query = "select * from college_library.book where bookID="+bookId+"";
		System.out.println(query);
		ResultSet rs = st.executeQuery(query);
		if(rs.next()) {
			System.out.println("Book FOUND");
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+" \t ");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getInt(4)+"\t");
				System.out.print(rs.getInt(5)+"\t");
				System.out.print(rs.getFloat(6)+"\t");
				System.out.print(rs.getString(7)+"\t");
				System.out.println();
		}else {
			System.out.println("BOOK NOT FOUND");
		}
		con.close();
	}
	public static void searchByName(String bookName) throws Exception {
		String url = "jdbc:mysql://localhost:3306/college_library";
		String user_name = "root";
		String user_pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user_name, user_pass);
		Statement st = con.createStatement();
		String query = "select * from college_library.book where bookName like '%"+bookName+"%'";
		System.out.println(query);
		ResultSet rs = st.executeQuery(query);
		if(rs.next()) {
			System.out.println("Book FOUND");
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+" \t ");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getInt(4)+"\t");
				System.out.print(rs.getInt(5)+"\t");
				System.out.print(rs.getFloat(6)+"\t");
				System.out.print(rs.getString(7)+"\t");
				System.out.println();
		}else {
			System.out.println("BOOK NOT FOUND");
		}
		con.close();
	}
	public static void update() throws Exception {
		String url = "jdbc:mysql://localhost:3306/college_library";
		String user_name = "root";
		String user_pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName("");
		Connection con = DriverManager.getConnection(url, user_name, user_pass);
		Statement st = con.createStatement();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter update details : ");
		System.out.println("Enter Book name : ");
		String bookName = br.readLine();
		System.out.println("Enter Book publisher : ");
		String publisher = br.readLine();
		System.out.println("Enter Book writer : ");
		String writer = br.readLine();
		System.out.println("Enter Book ID : ");
		int bookID = Integer.parseInt(br.readLine());
		System.out.println("Enter Book No of pages : ");
		int pageNo = Integer.parseInt(br.readLine());
		System.out.println("Enter Book price : ");
		double price = Double.parseDouble(br.readLine());
		System.out.println("Enter Book subject : ");
		String bSubject = br.readLine();
		String query = "update college_library.book set " +"bookName='"+bookName+"',publisher='"+publisher+"',writer='"+writer+"',bookID="+bookID+",pageNo="+pageNo+",price="+price+",bSubject='"+bSubject+"'"+ " where bookID="+bookID+"";
		System.out.println(query);
		int rs = st.executeUpdate(query);
		System.out.println();
		init();
		con.close();
	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BookDbManager.init();
		/*BookDbManager.entry();
		BookDbManager.remove();
		System.out.println("Search book by ID: ");
		System.out.println("Enter book ID: ");
		int p = Integer.parseInt(br.readLine());
		BookDbManager.searchByID(p);
		System.out.println("Search book by name: ");
		System.out.println("Enter book name: ");
		String q =br.readLine();
		BookDbManager.searchByName(q);
		BookDbManager.update();*/
	}
}
