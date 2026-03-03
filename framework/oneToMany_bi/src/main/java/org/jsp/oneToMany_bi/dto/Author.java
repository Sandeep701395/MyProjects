package org.jsp.oneToMany_bi.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {

	@Id
	private int aid;
	private String name;
	private String address;
	private long contact;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "author")
	private List<Books> books;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", name=" + name + ", address=" + address + ", contact=" + contact + ", books="
				+ books + "]";
	}
	
	
}
