package com.library.collegelibrary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
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
		
	
	
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
