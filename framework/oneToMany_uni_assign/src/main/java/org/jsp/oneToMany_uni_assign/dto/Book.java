package org.jsp.oneToMany_uni_assign.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	private int bid;
	private String title;
	private String author;
	private double cost;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", author=" + author + ", cost=" + cost + "]";
	}
	
	
	
}
