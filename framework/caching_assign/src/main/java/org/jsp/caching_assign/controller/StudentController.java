package org.jsp.caching_assign.controller;

import org.jsp.caching_assign.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentController {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setName("King");
		student.setAge(18);
		student.setGender("Male");
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
//		EntityTransaction transaction=manager.getTransaction();
		
//		transaction.begin();
//		manager.persist(student);
//		transaction.commit();
		
		Student student2=manager.find(Student.class, 1);
		Student student3=manager.find(Student.class, 2);
		System.out.println(student2);
		System.out.println(student3);
		
		Student student4=manager.find(Student.class, 1);
		Student student5=manager.find(Student.class, 2);
		System.out.println(student4);
		System.out.println(student5);
		
		Student student6=manager.find(Student.class, 1);
		Student student7=manager.find(Student.class, 2);
		System.out.println(student6);
		System.out.println(student7);
		
		
		
	}
}
