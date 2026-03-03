package org.jsp.caching.controller;



import org.jsp.caching.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeController {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setName("Visai");
		employee.setSalary(25000);
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("caching");
		EntityManager manager=factory.createEntityManager();
//		EntityTransaction transaction=manager.getTransaction();
		
//		transaction.begin();
//		manager.persist(employee);
//		transaction.commit();
//		
		Employee employee1=manager.find(Employee.class, 1);
		Employee employee2=manager.find(Employee.class, 2);
		System.out.println(employee1);
		System.out.println(employee2);
		
		Employee employee3=manager.find(Employee.class, 1);
		Employee employee4=manager.find(Employee.class, 2);
		System.out.println(employee3);
		System.out.println(employee4);
		
		Employee employee5=manager.find(Employee.class, 1);
		Employee employee6=manager.find(Employee.class, 2);
		System.out.println(employee5);
		System.out.println(employee6);
		
		
	}
}
