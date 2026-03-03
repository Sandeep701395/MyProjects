
package org.jsp.manyToMany_uni.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int cid;
	private String name;
	private int age;
	private String address;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Product> products;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", age=" + age + ", address=" + address + ", products="
				+ products + "]";
	}
	
	
	
	
	
}
