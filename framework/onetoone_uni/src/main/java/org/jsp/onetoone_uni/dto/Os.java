package org.jsp.onetoone_uni.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Os 
{
	@Id
	private int osId;
	private String name;
	private int bit;
	
	
	public int getOsId() {
		return osId;
	}
	public void setOsId(int osId) {
		this.osId = osId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBit() {
		return bit;
	}
	public void setBit(int bit) {
		this.bit = bit;
	}
	@Override
	public String toString() {
		return "Os [osId=" + osId + ", name=" + name + ", bit=" + bit + "]";
	}
	
	

}
