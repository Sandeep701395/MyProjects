package org.jsp.onetoone_bi_assign.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class University {
	@Id
	private int uid;
	private String name;
	private String city;
	private int code;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "university")
	private Library library;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "University [uid=" + uid + ", name=" + name + ", city=" + city + ", code=" + code + "]";
	}
	
	

}
