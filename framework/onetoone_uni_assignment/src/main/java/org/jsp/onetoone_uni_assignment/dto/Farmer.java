package org.jsp.onetoone_uni_assignment.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Farmer {

	@Id
	private int fid;
	private String name;
	private String village;
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Land land;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Land getLand() {
		return land;
	}

	public void setLand(Land land) {
		this.land = land;
	}

	@Override
	public String toString() {
		return "Farmer [fid=" + fid + ", name=" + name + ", village=" + village + ", age=" + age + ", land=" + land
				+ "]";
	}
	
	
	
}
