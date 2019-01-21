package com.javaprojects.springboot.patientapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojects.springboot.patientapp.entity.Physician;

public interface PhysicianRepository extends JpaRepository<Physician, Integer> {

}
