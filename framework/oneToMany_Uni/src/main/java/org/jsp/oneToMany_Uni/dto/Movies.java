package org.jsp.oneToMany_Uni.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movies {

	@Id
	private int mid;
	private String name;
	private double rating;
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
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movies [mid=" + mid + ", name=" + name + ", rating=" + rating + "]";
	}
	
	
}
