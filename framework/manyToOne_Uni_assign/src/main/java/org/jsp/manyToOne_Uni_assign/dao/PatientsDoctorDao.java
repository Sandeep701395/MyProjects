package org.jsp.manyToOne_Uni_assign.dao;


import java.util.List;

import org.hibernate.event.spi.MergeContext;
import org.jsp.manyToOne_Uni_assign.dto.Doctor;
import org.jsp.manyToOne_Uni_assign.dto.Patients;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class PatientsDoctorDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveDoctor(Doctor doctor)
	{
		
		transaction.begin();
		manager.persist(doctor);
		transaction.commit();
	}
	
	public void savePatients(List<Patients> listPatients)
	{
		
		for (Patients patients : listPatients) {
			transaction.begin();
			manager.persist(patients);
			transaction.commit();
		}
	}
	
	public void updateDirector(Doctor doctor)
	{
		
		transaction.begin();
		manager.merge(doctor);
		transaction.commit();
	}
	
	public void updatePatients(List<Patients> patients)
	{
		for (Patients patients2 : patients) {
			transaction.begin();
			manager.merge(patients2);
			transaction.commit();
		}
	}
	
	public void findDoctor(int did)
	{
		Doctor doctor=manager.find(Doctor.class, did);
		if(doctor != null)
		{
			System.out.println(doctor);
		}
		else
		{
			System.out.println("Doctor is Not Found...");
		}
	}
	
	public void findPatient(int pid)
	{
		Patients patients=manager.find(Patients.class, pid);
		if(patients != null)
		{
			System.out.println(patients);
		}
		else
		{
			System.out.println("Patient is Not Found...");
		}
	}
	
	public void deleteDoctor(int did)
	{
		Doctor doctor=manager.find(Doctor.class, did);
		if(doctor!= null)
		{
			transaction.begin();
			manager.remove(doctor);
			transaction.commit();
		}
		else
		{
			System.out.println("Doctor Is Not Deleted...");
		}
	}
	
	public void deletePatients(int pid)
	{
		Patients patients=manager.find(Patients.class, pid);
		if(patients != null)
		{
			transaction.begin();
			manager.remove(patients);
			transaction.commit();
		}
		else
		{
			System.out.println("Patient is Not Found And Deleted...");
		}
	}
	
	public void findAllDoctor()
	{
		Query query=manager.createQuery("select d from Doctor d");
		List<Doctor> doctors=query.getResultList();
		for (Doctor doctor : doctors) {
			System.out.println(doctor);
		}
	}
	
	public void findAllPatients()
	{
		Query query=manager.createQuery("select p from Patients p");
		List<Patients> patients=query.getResultList();
		for (Patients patients2 : patients) {
			System.out.println(patients2);
		}
	}
	
	public void addPatientLater(int did,Patients Patients)
	{
		Doctor doctor=manager.find(Doctor.class, did);
		if(doctor != null)
		{
			Patients.setDoctor(doctor);
			transaction.begin();
			manager.merge(Patients);
			transaction.commit();
		}
		else
		{
			System.out.println("Did is Not Present");
		}
	}
	
	public void removeDoctorFromPatient(int pid)
	{
		Patients patients=manager.find(Patients.class, pid);
		if(patients != null)
		{
			patients.setDoctor(null);
			transaction.begin();
			manager.merge(patients);
			transaction.commit();
		}
		else
		{
			System.out.println("Pid is Not Present ...In Patient table");
		}
	}
}
