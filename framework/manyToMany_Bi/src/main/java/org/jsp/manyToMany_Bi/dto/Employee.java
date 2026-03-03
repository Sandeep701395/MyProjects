package org.jsp.manyToMany_Bi.dto;

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
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String name;
	private int age;
	private double salary;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(joinColumns = @JoinColumn(name="sid"),inverseJoinColumns = @JoinColumn(name = "pid"))
	private List<Projects> projects;

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

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + ", salary=" + salary + ", projects="
				+ projects + "]";
	}
	
	
	
	
	
}
