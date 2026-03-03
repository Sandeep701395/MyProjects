package org.jsp.manyToMany_Bi.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Projects {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String name;
	private double budget;
	private String technology;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "projects")
	private List<Employee> employees;

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

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Projects [pid=" + pid + ", name=" + name + ", budget=" + budget + ", technology=" + technology
				+  "]";
	}

	
}
