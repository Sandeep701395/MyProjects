package org.jsp.onetoone_bi_assign.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Library {

	@Id
	private int lid;
	private String name;
	private String type;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private University university;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Library [lid=" + lid + ", name=" + name + ", type=" + type + ", university=" + university + "]";
	}
	
	
}
