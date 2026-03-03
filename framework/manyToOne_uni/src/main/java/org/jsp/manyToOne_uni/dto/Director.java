package org.jsp.manyToOne_uni.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Director {

	@Id
	private int did;
	private String name;
	private int age;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
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
	@Override
	public String toString() {
		return "Director [did=" + did + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
