package org.jsp.onetoone_uni_assignment.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Land {

	@Id
	private int lid;
	private int surveyNo;
	private double area;
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getSurveyNo() {
		return surveyNo;
	}
	public void setSurveyNo(int surveyNo) {
		this.surveyNo = surveyNo;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Land [lid=" + lid + ", surveyNo=" + surveyNo + ", area=" + area + "]";
	}
	
	
}
