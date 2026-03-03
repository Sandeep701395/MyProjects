package org.jsp.settergetter_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Library {

	private int lid;
	private String name;
	private String location;
	public int getLid() {
		return lid;
	}
	@Value("90")
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	@Value("central")
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	@Value("kurnool")
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Library [lid=" + lid + ", name=" + name + ", location=" + location + "]";
	}
	
	
	
}
