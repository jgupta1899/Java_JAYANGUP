package com.basic;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.basic.Book;

import com.basic.*;

public class Tester {

	public static void main(String[] args) throws com.basic.BookHandlingException 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> books = CollectionUtils.allBooks();
		boolean str = true;
		
		while(str)
		{
			System.out.println("0.Display all books \n1.Issue the book \n2.Return book "
					+ "\n3.Apply discount on old books \n4.Exit");
			
				switch (sc.nextInt()) 
				{
					case 0: 
					    Iterator<Book> it = books.iterator();
					    while (it.hasNext()) {
						    System.out.println(it.next().toString());
					    }
					    break;
					    
					case 1:
						System.out.println("Enter Title");
						String title = sc.nextLine();
						System.out.println("Enter quantity");
						int qty = sc.nextInt();
						System.out.println(title +"   "+ qty);

						Book b1 = searchBook(title, books);
						if(b1 != null)
						{
							if(b1.getQuantity() >= qty )
							{
								b1.setQuantity(b1.getQuantity() - qty);
								System.out.println("Successfully Recevied");
							}else
							{
								throw new BookHandlingException("Insufficient items available for title: " + title);

							}
						}else
						{
							throw new BookHandlingException("No book found with this title: " + title);

						}
						
						break;
						
					case 2:
						
						System.out.println("Enter Title");
						String title1 = sc.nextLine();
						System.out.println("Enter quantity");
						int qty1 = sc.nextInt();
						
						System.out.println(title1 +"   "+ qty1);
						Book b2 = searchBook(title1, books);
						
						if (b2 != null) {
							//update book quantity
							b2.setQuantity(b2.getQuantity() + qty1);
							System.out.println("Book returned successfully.");
						} else {
							// no book found. add book.
							System.out.println("No book found with this title. Add book.");
						}
						
						break;
						
					case 3:
						
						System.out.println("Enter date");
						LocalDate discountDate = parse(sc.next()); 
						System.out.println("Enter discount amount");
						double discountAmount = sc.nextDouble();
						books = SearchBookByFilter(discountDate, books, discountAmount);
						
						if (books != null) {
							Iterator<Book> discountItr = books.iterator();
						    while (discountItr.hasNext()) {
							    System.out.println(discountItr.next().toString());
						    }
						} else {
							throw new BookHandlingException("No books found!");
						}
						break;
						
						
					case 4:
						
						str = false;
						
						break;
						
						default :
							System.out.println("Wrong Choice");
							
							break;
							
				}
		}

	}

	
	public static Book searchBook(String name, ArrayList<Book> books) {
	    Iterator<Book> iterator = books.iterator();
	    while (iterator.hasNext()) {
	    	Book book = iterator.next();
	        if (book.getTitle().equals(name)) {
	            return book;
	        }
	    }
	    return null;
}
	
	public static  ArrayList<Book> SearchBookByFilter(LocalDate date, ArrayList<Book> books, double discountAmount) {
		 ArrayList<Book> newList = new  ArrayList<>();
		    Iterator<Book> iterator = books.iterator();
		    while (iterator.hasNext()) {
		    	Book book = iterator.next();
		        if (book.getPublishDate().isBefore(date)) {
		        	book.setPrice(book.getPrice() - discountAmount );
		        	newList.add(book);
		        }
		    }
		    return null;
	}

}
