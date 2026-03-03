package org.jsp.compositeKey2.dto;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Book {

	private String name;
	private String author;
	private String publisher;
	
	@EmbeddedId
	private BookId bookId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public BookId getBookId() {
		return bookId;
	}

	public void setBookId(BookId bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", publisher=" + publisher + ", bookId=" + bookId + "]";
	}
	
	
}
