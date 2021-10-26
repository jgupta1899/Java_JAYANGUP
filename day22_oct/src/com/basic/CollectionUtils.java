package com.basic;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;
import com.basic.*;

public class CollectionUtils 
{
	public static  ArrayList<Book> allBooks()
	{
		 ArrayList<Book>  book=new ArrayList<>();
			//put 
			book.add(new Book("Hello","asdfas",203.34,10,parse("2010-07-15"),Category.Classics));
			book.add(new Book("Hello","asdfas",203.34,10,parse("2010-06-21"),Category.Classics));
			book.add(new Book("Hello","asdfas",203.34,10,parse("2010-04-11"),Category.Action));
			book.add(new Book("Hello","asdfas",203.34,10,parse("2010-03-30"),Category.Comic));
			book.add(new Book("Hello","asdfas",203.34,10,parse("2010-03-10"),Category.FANTASY));
			book.add(new Book("Hello","asdfas",203.34,10,parse("2010-12-01"),Category.Classics));

			
	       return book;
	}

}
