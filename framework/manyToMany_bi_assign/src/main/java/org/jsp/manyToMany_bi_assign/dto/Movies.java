package org.jsp.manyToMany_bi_assign.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Movies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	private String name;
	private double budget;
	private int releaseYear;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "movies")
	private List<Actors> actors;

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

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public List<Actors> getActors() {
		return actors;
	}

	public void setActors(List<Actors> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movies [mid=" + mid + ", name=" + name + ", budget=" + budget + ", releaseYear=" + releaseYear
				+ "]";
	}
	
	
	
}
