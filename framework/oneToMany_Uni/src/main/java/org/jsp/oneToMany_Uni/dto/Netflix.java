package org.jsp.oneToMany_Uni.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Netflix {

	@Id
	private int nid;
	private String name;
	private String email;
	private int password;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Movies> movies;

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public List<Movies> getMovies() {
		return movies;
	}

	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Netflix [nid=" + nid + ", name=" + name + ", email=" + email + ", password=" + password + ", movies="
				+ movies + "]";
	}
	
	
}
