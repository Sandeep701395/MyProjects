package org.jsp.compositeKey.dto;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Amazone {
	
	private String name;
	private String address;
	private String password;
	
	@EmbeddedId
	private AmazoneId amazoneId;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AmazoneId getAmazoneId() {
		return amazoneId;
	}

	public void setAmazoneId(AmazoneId amazoneId) {
		this.amazoneId = amazoneId;
	}

	@Override
	public String toString() {
		return "Amazone [name=" + name + ", address=" + address + ", password=" + password + ", amazoneId=" + amazoneId
				+ "]";
	}
	
	

}
