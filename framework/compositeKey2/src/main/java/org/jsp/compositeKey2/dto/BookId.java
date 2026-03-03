package org.jsp.compositeKey2.dto;

import jakarta.persistence.Embeddable;

@Embeddable
public class BookId {

	private double cost;
	private int edition;
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	@Override
	public String toString() {
		return "BookId [cost=" + cost + ", edition=" + edition + "]";
	}
	
	
}
