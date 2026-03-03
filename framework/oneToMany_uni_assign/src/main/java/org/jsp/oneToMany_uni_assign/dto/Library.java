package org.jsp.oneToMany_uni_assign.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Library {

	@Id
	private int lid;
	private String name;
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Book> book;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Library [lid=" + lid + ", name=" + name + ", location=" + location + ", book=" + book + "]";
	}

	
}
