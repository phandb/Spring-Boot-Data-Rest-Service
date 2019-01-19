package com.javaprojects.springboot.patientapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojects.springboot.patientapp.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
	
	//That's it... no need to write any code

}
