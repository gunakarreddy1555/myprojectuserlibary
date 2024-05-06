package com.userandlibrary.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Books {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bookname;
	private String author;
	private String price;
	private String publisheddate;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPublisheddate() {
		return publisheddate;
	}
	public void setPublisheddate(String publisheddate) {
		this.publisheddate = publisheddate;
	}

	public Books(int id, String bookname, String author, String price, String publisheddate) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.publisheddate = publisheddate;
		
	}
	public Books() {}
	@Override
	public String toString() {
		return "Books [id=" + id + ", bookname=" + bookname + ", author=" + author + ", price=" + price
				+ ", publisheddate=" + publisheddate + "]";
	}
	
	
}
