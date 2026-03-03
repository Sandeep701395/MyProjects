package org.jsp.oneToMany_bi.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Books {

	@Id
	private int bid;
	private String name;
	private double cost;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Author author;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Books [bid=" + bid + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
}
