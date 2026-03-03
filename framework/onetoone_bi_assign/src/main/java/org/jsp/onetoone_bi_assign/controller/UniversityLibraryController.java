package org.jsp.onetoone_bi_assign.controller;

import org.jsp.onetoone_bi_assign.dao.UniversityLibraryDao;
import org.jsp.onetoone_bi_assign.dto.Library;
import org.jsp.onetoone_bi_assign.dto.University;

public class UniversityLibraryController {
	
	public static void main(String[] args) {
		
		University university=new University();
		university.setUid(15);
		university.setName("MU");
		university.setCity("Tirupathi");
		university.setCode(515765);
		
		Library library=new Library();
		library.setLid(103);
		library.setName("Central");
		library.setType("University");
		
//		University Has Library
		university.setLibrary(library);
		
//		Library Has University
		library.setUniversity(university);
		
		
		
		UniversityLibraryDao dao= new UniversityLibraryDao();
//		dao.saveUniversity(university);
//		dao.saveLibrary(library);
		
//		Update
//		dao.updateLibrary(library);
//		dao.updateUniversity(university);
		
//		Find
//		dao.findLibrary(103);
//		dao.findUniversity(12);
//		dao.findLibrary(104);
		
//		DELETE
//		dao.deleteLibrary(104);
//		dao.deleteUniversity(15);
		
//		FindAll
		dao.findAllUniversity();
//		dao.findAllLibrary();
	}

}
