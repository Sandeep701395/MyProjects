package org.jsp.manyToMany_Bi.dao;

import java.util.Iterator;
import java.util.List;

import org.jsp.manyToMany_Bi.dto.Employee;
import org.jsp.manyToMany_Bi.dto.Projects;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class EmployeeProjectDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveEmployee(List<Employee> employees)
	{
		for (Employee employee : employees) {
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
		}
	}
	
	public void saveProject(List<Projects> projects)
	{
		for (Projects projects2 : projects) {
			transaction.begin();
			manager.persist(projects2);
			transaction.commit();
		}
	}
	
	public void updateEmployee(int eid,Employee employee)
	{
		Employee employee2=manager.find(Employee.class, eid);
		if(employee2 != null)
		{
			employee2.setName(employee.getName());
			employee2.setAge(employee.getAge());
			employee2.setSalary(employee.getSalary());
			
			transaction.begin();
			manager.merge(employee2);
			transaction.commit();
		}
	}
	
	public void updateProject(int pid,Projects projects)
	{
		Projects projects2=manager.find(Projects.class, pid);
		if(projects2 != null)
		{
			projects2.setName(projects.getName());
			projects2.setTechnology(projects.getTechnology());
			projects2.setBudget(projects.getBudget());
			
			transaction.begin();
			manager.merge(projects2);
			transaction.commit();
		}
	}
	
	public void findEmployee(int eid)
	{
		Employee employee=manager.find(Employee.class, eid);
		if(employee != null)
		{
			System.out.println(employee);
		}
		else
		{
			System.out.println("Employee Id Is Not Found...");
		}
	}
	
	public void findProject(int pid)
	{
		Projects projects=manager.find(Projects.class, pid);
		if(projects != null)
		{
			System.out.println(projects);
		}
		else
		{
			System.out.println("Project Id is not Found...");
		}
	}
	
	public void deleteEmployee(int eid)
	{
		Employee employee=manager.find(Employee.class, eid);
		if(employee != null)
		{
			transaction.begin();
			employee.getProjects().clear();
			manager.remove(employee);
			transaction.commit();
		}
		else
			{
				System.out.println("Employee Id Is Not Deleted...");
			}
		
	}
	
	public void deleteProject(int pid)
	{
	    Projects project = manager.find(Projects.class, pid);
	    if (project != null)
	    {
	        transaction.begin();

	        for (Employee emp : project.getEmployees()) {
	            emp.getProjects().remove(project);
	        }

	        manager.remove(project);
	        transaction.commit();
	    }
	}

	public void findAllEmployees()
	{
		Query query=manager.createQuery("select e from Employee e");
		List<Employee> employees=query.getResultList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	public void findAllProjects()
	{
		Query query=manager.createQuery("select p from Projects p");
		List<Projects> projects=query.getResultList();
		for (Projects projects2 : projects) {
			System.out.println(projects2);
		}
	}
}
