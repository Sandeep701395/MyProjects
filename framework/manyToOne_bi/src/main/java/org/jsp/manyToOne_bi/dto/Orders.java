package org.jsp.manyToOne_bi.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {

	@Id
	private int oid;
	private String status;
	private double amount;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Customer customer;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", status=" + status + ", amount=" + amount + ", customer=" + customer + "]";
	}
	
	
}
