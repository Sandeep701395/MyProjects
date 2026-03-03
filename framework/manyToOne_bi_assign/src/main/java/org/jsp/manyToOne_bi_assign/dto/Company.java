package org.jsp.manyToOne_bi_assign.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Company {

	@Id
	private int cid;
	private String name;
	private String address;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "company")
	private List<Employees> employees;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Employees> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
}
