package org.jsp.manyToOne_bi_assign.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.manyToOne_bi_assign.dao.EmployeesCompanyDao;
import org.jsp.manyToOne_bi_assign.dto.Company;
import org.jsp.manyToOne_bi_assign.dto.Employees;

public class EmployeesCompanyController {

	public static void main(String[] args) {
		
		Company company=new Company();
		company.setCid(1);
		company.setName("Delta");
		company.setAddress("Ap");
		
		List<Employees> listEmployees = new ArrayList<Employees>();
		
		Employees employee1=new Employees();
		employee1.setEid(109);
		employee1.setName("Khan");
		employee1.setAge(16);
		employee1.setSalary(78000);
		
		Employees employee2=new Employees();
		employee2.setEid(110);
		employee2.setName("vishnu");
		employee2.setAge(44);
		employee2.setSalary(43000);
		
		listEmployees.add(employee1);
		listEmployees.add(employee2);
		
		company.setEmployees(listEmployees);
		
		for (Employees employees : listEmployees) {
			employees.setCompany(company);
		}
		
		
		EmployeesCompanyDao dao=new EmployeesCompanyDao();
//		1.Insert
		
//		Case 1:Company Has Employees And Employees Has Company
//		dao.saveCompany(company);
//		Case 2:Employees Has Company And Company Has Employees
//		dao.saveEmployess(listEmployees);
//		Case 3:Company Has Employees But Employees does Not have Company
//		dao.saveCompany(company);
//		Case 4:Employees Has Company But Company does not Have Employees
//		dao.saveEmployess(listEmployees);
		
//		2.Update
//		dao.updateCompany(company);
//		dao.updateEmployess(listEmployees);
		
//		3.Find
//		dao.findCompany(3);
//		dao.findEmployee(102);
		
//		4.Delete
//		dao.deleteCompany(2);
//		dao.deleteEmployees(0);
		
//		5.FindAll
//		dao.findAllCompany();
//		dao.findAllEmployees();
		
//		dao.addEmployeeLater(3, listEmployees);
//		dao.removeEmployeeLater(3, 110);
	}
}
