package com.basic;

import java.time.LocalDate;

public class Book 
{
	private String title, author;
	private double price; 
	private int quantity;
	private LocalDate publishDate;
	Category category;
	
	
	public Book(String title, String author, double price, int quantity, LocalDate publishDate, Category category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		this.publishDate = publishDate;
		this.category = category;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", quantity=" + quantity
				+ ", publishDate=" + publishDate + ", category=" + category + "]";
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public LocalDate getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
}
