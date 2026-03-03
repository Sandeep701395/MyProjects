package org.jsp.oneToMany_bi_assign.dao;

import java.util.List;

import org.jsp.oneToMany_bi_assign.dto.Department;
import org.jsp.oneToMany_bi_assign.dto.Students;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DepartmentStudentsDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveDepartment(Department department)
	{
		List<Students> students=department.getStudents();
		for (Students students2 : students) {
			students2.setDepartment(department);
		}
		transaction.begin();
		manager.persist(department);
		transaction.commit();
	}
	
	public void saveStudents(List<Students> students)
	{
		for (Students students2 : students) {
			transaction.begin();
			manager.persist(students2);
			transaction.commit();
		}
	}
	
	public void updateDepartment(Department department)
	{
		transaction.begin();
		manager.merge(department);
		transaction.commit();
	}
	
	public void updateStudents(List<Students> students)
	{
		for (Students students2 : students) {
			transaction.begin();
			manager.merge(students2);
			transaction.commit();
		}
	}
	
	public void findDepartment(int did)
	{
		Department department=manager.find(Department.class, did);
		if(department != null)
		{
			System.out.println(department);
		}
		else
		{
			System.out.println("Department is not Found...!");
		}
	}
	
	public void findStudents(int sid)
	{
		Students students=manager.find(Students.class, sid);
		if(students != null)
		{
			System.out.println(students);
		}
		else
		{
			System.out.println("Student is Not Found...!");
		}
	}
	
	public void deleteDepartment(int did)
	{
		
		Department department=manager.find(Department.class, did);
		if(department != null)
		{
			transaction.begin();
			manager.remove(department);
			transaction.commit();
		}
		else
		{
			System.out.println("Department is not Deleted");
		}
	}
	
	public void deleteStudents(int sid)
	{
		
		Students students=manager.find(Students.class, sid);
		if(students != null)
		{
			transaction.begin();
			manager.remove(students);
			transaction.commit();
		}
		else
		{
			System.out.println("Student is not Deleted");
		}
	}
	
	public void addToJoinStudents(int did,List<Students> students)
	{
		Department department=manager.find(Department.class, did);
		if(department != null)
		{
			List<Students> dbStudents=department.getStudents();
			if(dbStudents != null)
			{
				dbStudents.addAll(students);
				transaction.begin();
				manager.merge(department);
				transaction.commit();
			}
			else
			{
				department.setStudents(students);
				transaction.begin();
				manager.merge(department);
				transaction.commit();
			}
		}
		else
		{
			System.out.println("Department id is not found....");
		}
	}
}
