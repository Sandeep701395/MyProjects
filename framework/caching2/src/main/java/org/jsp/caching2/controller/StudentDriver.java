package org.jsp.caching2.controller;

import org.jsp.caching2.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setName("sandy");
		student.setAge(22);
		student.setAddress("atp");
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("caching2");
		EntityManager manager=factory.createEntityManager();
//		EntityTransaction transaction=manager.getTransaction();
		
//		transaction.begin();
//		manager.persist(student);
//		transaction.commit();
		
		Student student2=manager.find(Student.class, 1);
		System.out.println(student2);
		System.out.println(student2);
		
		EntityManager manager2=factory.createEntityManager();
		Student student3=manager2.find(Student.class, 1);
		System.out.println(student3);
		System.out.println(student3);
		
		EntityManager manager3=factory.createEntityManager();
		Student student4=manager3.find(Student.class, 2);
		System.out.println(student4);
		System.out.println(student4);
		
		EntityManager manager4=factory.createEntityManager();
		Student student5=manager4.find(Student.class, 2);
		System.out.println(student5);
		System.out.println(student5);
		
	}
}
