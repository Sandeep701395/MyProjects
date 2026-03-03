package org.jsp.compositeKey.dto;

import jakarta.persistence.Embeddable;

@Embeddable
public class AmazoneId {

	private String email;
	private long mobileNo;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "AmazoneId [email=" + email + ", mobileNo=" + mobileNo + "]";
	}
	
	
	
	
}
