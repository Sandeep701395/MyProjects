package org.jsp.oneToMany_bi_assign.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private int did;
	private String name;
	private String code;
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
	private List<Students> students;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", name=" + name + ", code=" + code + ", location=" + location + ", students="
				+ students + "]";
	}

	
	
}
