package org.jsp.manyToMany_bi_assign.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Actors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String name;
	private int age;
	private double remunation;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(joinColumns = @JoinColumn(name = "aid"),inverseJoinColumns = @JoinColumn(name = "mid"))
	private List<Movies> movies;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getRemunation() {
		return remunation;
	}

	public void setRemunation(double remunation) {
		this.remunation = remunation;
	}

	public List<Movies> getMovies() {
		return movies;
	}

	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Actors [aid=" + aid + ", name=" + name + ", age=" + age + ", remunation=" + remunation + ", movies="
				+ movies + "]";
	}
	
	
}
