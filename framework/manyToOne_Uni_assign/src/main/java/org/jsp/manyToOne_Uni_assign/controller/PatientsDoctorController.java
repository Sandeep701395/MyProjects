package org.jsp.manyToOne_Uni_assign.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.manyToOne_Uni_assign.dao.PatientsDoctorDao;
import org.jsp.manyToOne_Uni_assign.dto.Doctor;
import org.jsp.manyToOne_Uni_assign.dto.Patients;

public class PatientsDoctorController {

	public static void main(String[] args) {
		
		List<Patients> listPatients=new ArrayList<Patients>();
		Patients patient1=new Patients();
		patient1.setPid(104);
		patient1.setName("virat");
		patient1.setAge(36);
		
		Patients patient2=new Patients();
		patient2.setPid(105);
		patient2.setName("rohit");
		patient2.setAge(39);
		
		Doctor doctor=new Doctor();
		doctor.setDid(3);
		doctor.setName("Dr.Seenu");
		doctor.setSpecialization("Ortho");
		
		patient1.setDoctor(doctor);
		patient2.setDoctor(doctor);
		
		listPatients.add(patient1);
		listPatients.add(patient2);
		
		PatientsDoctorDao dao=new PatientsDoctorDao();
//		dao.saveDoctor(doctor);
//		dao.savePatients(listPatients);
		
//		dao.updateDirector(doctor);
//		dao.updatePatients(listPatients);
		
//		dao.findDoctor(1);
//		dao.findPatient(103);
		
//		dao.deleteDoctor(3);
//		dao.deletePatients(103);
		
//		dao.findAllDoctor();
//		dao.findAllPatients();
		
//		dao.addPatientLater(2, patient1);
//		dao.removeDoctorFromPatient(104);
		
	}
}
