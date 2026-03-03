package org.jsp.settergetter_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	private int cid;
	private String name;
	private String address;
	private int code;
	
	private Library library;

	public int getCid() {
		return cid;
	}
	@Value("1")
	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}
	@Value("RU")
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	@Value("Kurnool")
	public void setAddress(String address) {
		this.address = address;
	}

	public int getCode() {
		return code;
	}
	@Value("3366")
	public void setCode(int code) {
		this.code = code;
	}

	public Library getLibrary() {
		return library;
	}
	@Autowired
	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", name=" + name + ", address=" + address + ", code=" + code + ", library="
				+ library + "]";
	}
	
	
}
