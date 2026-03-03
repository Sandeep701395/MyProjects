package org.jsp.settergetter_injection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;
	private String address;
	private int age;
	private String gender;
	
	public String getName() {
		return name;
	}
	@Value("Raju")
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	@Value("HYD")
	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}
	@Value("21")
	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}
	@Value("male")
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + ", gender=" + gender + "]";
	}
	@PostConstruct
	public void load()
	{
		System.out.println("Loading............");
	}
	@PreDestroy
	public void unload()
	{
		System.out.println("Unloading..............");
	}
	
	
}
