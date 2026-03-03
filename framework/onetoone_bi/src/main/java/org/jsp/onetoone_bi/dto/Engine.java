package org.jsp.onetoone_bi.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Engine {

	@Id
	private int eid;
	private String cc;
	private String type;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "engine")
	private Bike bike;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", cc=" + cc + ", type=" + type + "]";
	}
	
	
	
}
