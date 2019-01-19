package com.javaprojects.springboot.patientapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaprojects.springboot.patientapp.dao.PatientRepository;
import com.javaprojects.springboot.patientapp.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService {
	
	private PatientRepository patientRepository;
	
	//Setup Contructor Injection
	@Autowired
	public PatientServiceImpl(PatientRepository thePatientRepository) {
		
		patientRepository = thePatientRepository;
	}

	@Override
	public List<Patient> findAll() {
		
		return patientRepository.findAll();
	}

	@Override
	public Patient findById(int theId) {
		
		Optional<Patient> result = patientRepository.findById(theId);
		
		Patient thePatient = null;
		if (result.isPresent()) {
			thePatient = result.get();
		}else {
			//Could not find the patient with the id
			throw new RuntimeException("Could not find patient id " + theId);
		}
		return thePatient;
	}

	@Override
	public void save(Patient thePatient) {

		patientRepository.save(thePatient);

	}

	@Override
	public void deleteById(int theId) {

		patientRepository.deleteById(theId);

	}

}
