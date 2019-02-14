package com.javaprojects.springboot.patientapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="medications")
public class Medication implements Serializable {
	//annotate the class as an entity and map to database table

		//define the fields
		//annotate the fields with db column names
		/***
		 * Set up relationship with patients table using FK patient_id
		 */
		//create constructors
		//generate getter/setter methods
		//generate toString() method
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="medication_name")
	private String medicationName;
	
	@Column(name="medication_strength")
	private String medicationStrength;
	
	@Column(name="medication_dosage")
	private String medicationDosage;
	
	/************************Setup Relationship******************************/
	//Setup many to one relationship with patient table
	//one patient can have many medications
	
	@ManyToOne (fetch = FetchType.LAZY, optional = false)
	//@OnDelete(action = OnDeleteAction.CASCADE)
	//Map @JoinColumn at the Owner side which medication
	@JoinColumn(name="patient_id")
	//This prevent recursive relationship in JSON which lead to an infinite loop of nested objects in response
	//@JsonBackReference
	private Patient patient;
	
	public Patient getPatient() {
		return this.patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	//it’s good practice to override equals and hashCode 
	//for the child entity in a bidirectional association. 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Medication )) return false;
        Medication medication = (Medication) obj;
        return id != 0 && id == (medication.id);
    }
    
    
    @Override
    public int hashCode() {
        return 31;
    }
    


	
	
	/*********************************************************************************/
	
	//Constructors
	public Medication() {
		
	}
	
	/**
	 * @param medicationName
	 * @param medicationStrength
	 * @param medicationDosage
	 */
	public Medication(String medicationName, String medicationStrength, String medicationDosage ) {
		this.medicationName = medicationName;
		this.medicationStrength = medicationStrength;
		this.medicationDosage = medicationDosage;
	}
	

	public int getId() {
		return this.id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMedicationName() {
		return medicationName;
	}


	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}


	public String getMedicationStrength() {
		return medicationStrength;
	}


	public void setMedicationStrength(String medicationStrength) {
		this.medicationStrength = medicationStrength;
	}


	public String getMedicationDosage() {
		return medicationDosage;
	}


	public void setMedicationDosage(String medicationDosage) {
		this.medicationDosage = medicationDosage;
	}
	

}
