package org.jsp.manyToOne_Uni_assign.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {

	@Id
	private int did;
	private String name;
	private String specialization;
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
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", name=" + name + ", specialization=" + specialization + "]";
	}
	
	
}
