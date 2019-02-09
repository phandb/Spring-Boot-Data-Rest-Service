package com.javaprojects.springboot.patientapp.dao;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojects.springboot.patientapp.entity.Medication;

public interface MedicationRepository extends JpaRepository<Medication, Integer> {
	
	Page<Medication> findByPatientId(int patientId, Pageable pageable);
	
	Optional<Medication> findByIdAndPatientId(int medicationId, int patientId);

}
