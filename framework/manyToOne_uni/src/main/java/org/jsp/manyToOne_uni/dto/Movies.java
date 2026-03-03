package org.jsp.manyToOne_uni.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Movies {

	@Id
	private int mid;
	private String name;
	private double budget;
	private double rating;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Director director;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movies [mid=" + mid + ", name=" + name + ", budget=" + budget + ", rating=" + rating + ", director="
				+ director + "]";
	}
	
	
}
