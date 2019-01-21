package com.javaprojects.springboot.patientapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojects.springboot.patientapp.entity.Pharmacy;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Integer> {

}
