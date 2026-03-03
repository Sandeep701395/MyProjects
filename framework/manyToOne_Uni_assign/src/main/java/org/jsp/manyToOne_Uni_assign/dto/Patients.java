package org.jsp.manyToOne_Uni_assign.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Patients {

	@Id
	private int pid;
	private String name;
	private int age;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Doctor doctor;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Patients [pid=" + pid + ", name=" + name + ", age=" + age + ", doctor=" + doctor + "]";
	}
	
	
	
}
