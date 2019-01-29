package com.javaprojects.springboot.patientapp.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

import com.javaprojects.springboot.patientapp.entity.Medication;
import com.javaprojects.springboot.patientapp.entity.Patient;
import com.javaprojects.springboot.patientapp.entity.Pharmacy;
import com.javaprojects.springboot.patientapp.entity.Physician;

@Component
public class CustomizedRestMvcConfiguration extends RepositoryRestConfigurerAdapter {
	
	  @Override
	  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	  
	    config.exposeIdsFor(Patient.class);
	    config.exposeIdsFor(Medication.class);
	    config.exposeIdsFor(Pharmacy.class);
	    config.exposeIdsFor(Physician.class);
	    
	  }

}
