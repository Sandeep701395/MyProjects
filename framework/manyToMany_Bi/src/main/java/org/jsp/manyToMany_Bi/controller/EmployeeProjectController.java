package org.jsp.manyToMany_Bi.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.manyToMany_Bi.dao.EmployeeProjectDao;
import org.jsp.manyToMany_Bi.dto.Employee;
import org.jsp.manyToMany_Bi.dto.Projects;

public class EmployeeProjectController {

	public static void main(String[] args) {
		
		List<Employee> listemployees=new ArrayList<Employee>();
		
		Employee employee1=new Employee();
		employee1.setName("sai");
		employee1.setAge(38);
		employee1.setSalary(21000);
		
		Employee employee2=new Employee();
		employee2.setName("sandu");
		employee2.setAge(59);
		employee2.setSalary(52000);
		
		Employee employee3=new Employee();
		employee3.setName("bhaii");
		employee3.setAge(37);
		employee3.setSalary(42800);
		
		List<Projects> listprojects=new ArrayList<Projects>();
		
		Projects project1=new Projects();
		project1.setName("E-commerce");
		project1.setTechnology("html");
		project1.setBudget(32);
		
		
		Projects project2=new Projects();
		project2.setName("online");
		project2.setTechnology("c");
		project2.setBudget(53);
		
		
		
		
		listemployees.add(employee1);
		listemployees.add(employee2);
		listemployees.add(employee3);
		
		listprojects.add(project1);
		listprojects.add(project2);
		
//		employee1.setProjects(listprojects);
//		employee2.setProjects(listprojects);
//		employee3.setProjects(listprojects);
		
		project1.setEmployees(listemployees);
		project2.setEmployees(listemployees);
		
		EmployeeProjectDao dao=new EmployeeProjectDao();
		
//		Case 1:Employees Has Projects and Projects Has Employees
//		dao.saveEmployee(listemployees);
//		Case 2:Projects Has Employees And Employees Has Projects
//		dao.saveProject(listprojects);
//		Case 3:Employees Has Projects But Projects does not Have Employees
//		dao.saveEmployee(listemployees);
//		Case 4:Projects Has Employees But Employees does not Have Projects
//		dao.saveProject(listprojects);
		
		
//		dao.updateEmployee(13, employee3);
//		dao.updateProject(1, project2);
		
//		dao.findEmployee(5);
//		dao.findProject(6);
		
//		dao.deleteEmployee(10);
//		dao.deleteProject(7);
		
		dao.findAllEmployees();
//		dao.findAllProjects();
		
	}
}
