
package org.jsp.second_level_caching.controller;

import org.jsp.second_level_caching.dto.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentController {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setName("Ram");
		student.setAge(18);
		student.setGender("Male");
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
//		EntityTransaction transaction=manager.getTransaction();
		
//		transaction.begin();
//		manager.persist(student);
//		transaction.commit();
		
		Student student2=manager.find(Student.class, 1);
		System.out.println(student2);
		System.out.println(student2);
		
		EntityManager manager1=factory.createEntityManager();
		Student student3=manager1.find(Student.class, 1);
		System.out.println(student3);
		System.out.println(student3);
		
		EntityManager manager2=factory.createEntityManager();
		Student student4=manager2.find(Student.class, 2);
		System.out.println(student4);
		System.out.println(student4);
		
		EntityManager manager3=factory.createEntityManager();
		Student student5=manager3.find(Student.class, 2);
		System.out.println(student5);
		System.out.println(student5);
		
		
	}
}
