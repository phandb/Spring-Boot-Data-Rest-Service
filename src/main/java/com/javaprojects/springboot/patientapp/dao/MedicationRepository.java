package com.javaprojects.springboot.patientapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojects.springboot.patientapp.entity.Medication;

public interface MedicationRepository extends JpaRepository<Medication, Integer> {

}
