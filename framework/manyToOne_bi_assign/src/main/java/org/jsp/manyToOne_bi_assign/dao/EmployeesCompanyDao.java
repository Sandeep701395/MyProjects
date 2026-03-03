package org.jsp.manyToOne_bi_assign.dao;

import java.util.List;

import org.jsp.manyToOne_bi_assign.dto.Company;
import org.jsp.manyToOne_bi_assign.dto.Employees;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class EmployeesCompanyDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
	private EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void saveCompany(Company company)
	{
		List<Employees> employees=company.getEmployees();
		for (Employees employees2 : employees) {
			employees2.setCompany(company);
		}
		transaction.begin();
		manager.persist(company);
		transaction.commit();
	}
	
	public void saveEmployess(List<Employees> employees)
	{
		for (Employees employees2 : employees) {
			transaction.begin();
			manager.persist(employees2);
			transaction.commit();
		}
	}
	
	public void updateCompany(Company company)
	{
		transaction.begin();
		manager.merge(company);
		transaction.commit();
	}
	
	public void updateEmployess(List<Employees> employees)
	{
		for (Employees employees2 : employees) {
			transaction.begin();
			manager.merge(employees2);
			transaction.commit();
		}
	}
	
	public void findCompany(int cid)
	{
		Company company=manager.find(Company.class, cid);
		if(company != null)
		{
			System.out.println(company);
		}
		else
		{
			System.out.println("Company is Not Found...");
		}
	}
	
	public void findEmployee(int eid)
	{
		Employees employees=manager.find(Employees.class,eid);
		if(employees != null)
		{
			System.out.println(employees);
		}
		else
		{
			System.out.println("Employee is Not Found...");
		}
	}
	
	public void deleteCompany(int cid)
	{
		Company company=manager.find(Company.class, cid);
		if(company != null)
		{
			transaction.begin();
			manager.remove(company);
			transaction.commit();
		}
	}
	
	public void deleteEmployees(int eid)
	{
		Employees employees=manager.find(Employees.class, eid);
		if(employees != null)
		{
			transaction.begin();
			manager.remove(employees);
			transaction.commit();
		}
	}
	
	public void findAllCompany()
	{
		Query query=manager.createQuery("select c from Company c");
		List<Company> companies=query.getResultList();
		for (Company company : companies) {
			System.out.println(company);
		}
	}
	
	public void findAllEmployees()
	{
		Query query=manager.createQuery("select e from Employees e");
		List<Employees> employees=query.getResultList();
		for (Employees employees2 : employees) {
			System.out.println(employees2);
		}
	}
	
	public void addEmployeeLater(int cid,List<Employees> listemployees)
	{
		Company company=manager.find(Company.class, cid);
		if(company != null)
		{
			List<Employees> dbEmployees=company.getEmployees();
			for (Employees employees : listemployees) {
				employees.setCompany(company);
			}
			if(dbEmployees != null)
			{
				dbEmployees.addAll(listemployees);
				transaction.begin();
				manager.merge(company);
				transaction.commit();
			}
			else
			{
				company.setEmployees(listemployees);
				transaction.begin();
				manager.merge(company);
				transaction.commit();
			}
		}
		else
		{
			System.out.println("Company Id is Not Found...");
		}
	}
	
	public void removeEmployeeLater(int cid,int eid)
	{
		Company company=manager.find(Company.class, cid);
		Employees employees=manager.find(Employees.class,eid);
		
		if(company != null && employees != null)
		{
			List<Employees> dbemployees=company.getEmployees();
			if(dbemployees.contains(employees))
			{
				dbemployees.remove(employees);
				employees.setCompany(null);
				transaction.begin();
				manager.merge(company);
				transaction.commit();
			}
			else
			{
				System.out.println("Employees are not belongs to company");
			}
			
		}
		else
		{
			System.out.println("CId Eid is not found..");
		}
	}
}
