package org.jsp.manyToMany_uni_assign.dao;

import java.util.List;

import org.jsp.manyToMany_uni_assign.dto.Course;
import org.jsp.manyToMany_uni_assign.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class StudentCourseDao {

	
	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveStudent(List<Student> students)
	{
		for (Student student : students) {
			transaction.begin();
			manager.persist(student);
			transaction.commit();
		}
		
	}
	
	public void saveCourse(List<Course> courses)
	{
		for (Course course : courses) {
			transaction.begin();
			manager.persist(course);
			transaction.commit();
		}
	}
	
	public void updateStudent(int sid,Student student)
	{
		Student student1=manager.find(Student.class, sid);
		if(student1 != null)
		{
			student1.setName(student.getName());
			student1.setAge(student.getAge());
			student1.setAddress(student.getAddress());
			
			transaction.begin();
			manager.merge(student1);
			transaction.commit();
		}
		else
		{
			System.out.println("Student is not found...");
		}
	}
	
	public void updateCourse(int cid, Course course)
	{
		Course course2=manager.find(Course.class, cid);
		if(course2 != null)
		{
			course2.setName(course.getName());
			course2.setFee(course.getFee());
			
			transaction.begin();
			manager.merge(course2);
			transaction.commit();
		}
		else
		{
			System.out.println("Course Id not Found...");
		}
	}
	
	public void findStudent(int sid)
	{
		Student student=manager.find(Student.class, sid);
		if(student != null)
		{
			System.out.println(student);
		}
		else
		{
			System.out.println("Student is not found....");
		}
	}
	
	public void findCourse(int cid)
	{
		Course course=manager.find(Course.class, cid);
		if(course != null)
		{
			System.out.println(course);
		}
		else
		{
			System.out.println("COurse Id is NOt Found...");
		}
	}
	
	public void deleteStudent(int sid)
	{
		Student student=manager.find(Student.class, sid);
		if(student != null)
		{
			student.setCourses(null);
			transaction.begin();
			manager.remove(student);
			transaction.commit();
		}
		else
		{
			System.out.println("Student is not deleted...");
		}
	}
	
	public void deleteCourse(int cid)
	{
		Course course=manager.find(Course.class, cid);
		if(course != null)
		{
			
			transaction.begin();
			manager.remove(course);
			transaction.commit();
		}
		else
		{
			System.out.println("Course is not deleted...");
		}
	}
	
	public void findAllStudents()
	{
		Query query=manager.createQuery("select s from Student s");
		List<Student> students=query.getResultList();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	public void findAllCourses()
	{
		Query query=manager.createQuery("select c from Course c");
		List<Course> courses=query.getResultList();
		for (Course course : courses) {
			System.out.println(course);
		}
	}
}
