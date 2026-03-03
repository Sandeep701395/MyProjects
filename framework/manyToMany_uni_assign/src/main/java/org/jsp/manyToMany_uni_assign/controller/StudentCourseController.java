package org.jsp.manyToMany_uni_assign.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.manyToMany_uni_assign.dao.StudentCourseDao;
import org.jsp.manyToMany_uni_assign.dto.Course;
import org.jsp.manyToMany_uni_assign.dto.Student;

public class StudentCourseController {

	public static void main(String[] args) {
		
		List<Student> liststudents=new ArrayList<Student>();
		
		Student student1=new Student();
		student1.setName("Navven");
		student1.setAge(25);
		student1.setAddress("Atp");
		
		Student student2=new Student();
		student2.setName("nandi");
		student2.setAge(23);
		student2.setAddress("kadapa");
		
		Student student3=new Student();
		student3.setName("vishnu");
		student3.setAge(24);
		student3.setAddress("ongole");
		
		List<Course> listcourses=new ArrayList<Course>();
		
		Course course1=new Course();
		course1.setName("Python");
		course1.setFee(8000);
		
		Course course2=new Course();
		course2.setName("css");
		course2.setFee(3000);
		
		listcourses.add(course1);
		listcourses.add(course2);
		
		student1.setCourses(listcourses);
		student2.setCourses(listcourses);
		student3.setCourses(listcourses);
		
		liststudents.add(student1);
		liststudents.add(student2);
		liststudents.add(student3);
		
		StudentCourseDao dao=new StudentCourseDao();
//		dao.saveStudent(liststudents);
//		dao.saveCourse(listcourses);
		
//		dao.updateStudent(1,student1);
//		dao.updateCourse(6, course1);
		
//		dao.findStudent(2);
//		dao.findCourse(2);
		
//		dao.deleteStudent(3);
//		dao.deleteCourse(2);
		
//		dao.findAllStudents();
//		dao.findAllCourses();
	}
}
