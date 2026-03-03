package org.jsp.annotations.controller;

import org.jsp.annotations.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentController {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setName("raj");
		student.setAge(22);
		student.setEmail("raj@gmail.com");
		student.setAddress(null);
		student.setContact(8888888888l);
		student.setPwd("raj@123");
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		transaction.begin();
		entityManager.persist(student);
		transaction.commit();
	}
}
