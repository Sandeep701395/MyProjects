package org.jsp.manyToOne_bi_assign.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employees {

	@Id
	private int eid;
	private String name;
	private int age;
	private double salary;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Company company;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", name=" + name + ", age=" + age + ", salary=" + salary + ", company="
				+ company + "]";
	}
	
	
}
