package org.jsp.oneToMany_bi_assign.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.oneToMany_bi_assign.dao.DepartmentStudentsDao;
import org.jsp.oneToMany_bi_assign.dto.Department;
import org.jsp.oneToMany_bi_assign.dto.Students;

public class DepartmentStudentsController {

	public static void main(String[] args) {
		
		Department department=new Department();
		department.setDid(14);
		department.setName("Manager");
		department.setCode("Mba");
		department.setLocation("Kurnool");
		
		
		List<Students> listStudents=new ArrayList<Students>();
		
		Students student1=new Students();
		student1.setSid(150);
		student1.setName("kaasi");
		student1.setAge(19);
		student1.setAddress("Tirupati");
		
		Students student2=new Students();
		student2.setSid(151);
		student2.setName("jani");
		student2.setAge(18);
		student2.setAddress("Hyd");
		
		Students student3=new Students();
		student3.setSid(152);
		student3.setName("king");
		student3.setAge(22);
		student3.setAddress("Nellore");
		
		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		
		
		department.setStudents(listStudents);
		
		for (Students students : listStudents) {
			students.setDepartment(department);
		}
//		
		
		DepartmentStudentsDao dao=new DepartmentStudentsDao();
		
//		Case 1:Department Has Students and Students Has Department
//		dao.saveDepartment(department);
//		Case 2:Students Has Department and Department Has Students
//		dao.saveStudents(listStudents);
//		Case 3:Department Has Students but Students does not have Department
//		dao.saveDepartment(department);
//		case 4: Students Has Department but Department does not Students
//		dao.saveStudents(listStudents);
		
		
//		dao.updateDepartment(department);
//		dao.updateStudents(listStudents);
		
		
//		dao.deleteDepartment(12);
//		dao.deleteStudents(108);
		
		dao.addToJoinStudents(10, listStudents);
		
	}
}
