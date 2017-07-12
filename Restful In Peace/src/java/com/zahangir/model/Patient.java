package com.zahangir.model;
// Generated Jul 12, 2017 5:29:19 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * Patient generated by hbm2java
 */
@Entity
public class Patient  implements java.io.Serializable {


     private Integer patientId;
     private String patientName;
     private int patientAge;
     private String patientGender;
     private String patientAddress;
     private String patientContactNo;
     private String patientEmail;
     
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "patient")
     private Set<Admission> admissions = new HashSet(0);

    public Patient() {
    }

	
    public Patient(String patientName, int patientAge, String patientGender, String patientAddress, String patientContactNo, String patientEmail) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientGender = patientGender;
        this.patientAddress = patientAddress;
        this.patientContactNo = patientContactNo;
        this.patientEmail = patientEmail;
    }
    public Patient(String patientName, int patientAge, String patientGender, String patientAddress, String patientContactNo, String patientEmail, Set admissions) {
       this.patientName = patientName;
       this.patientAge = patientAge;
       this.patientGender = patientGender;
       this.patientAddress = patientAddress;
       this.patientContactNo = patientContactNo;
       this.patientEmail = patientEmail;
       this.admissions = admissions;
    }
   
    public Integer getPatientId() {
        return this.patientId;
    }
    
    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }
    public String getPatientName() {
        return this.patientName;
    }
    
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public int getPatientAge() {
        return this.patientAge;
    }
    
    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }
    public String getPatientGender() {
        return this.patientGender;
    }
    
    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }
    public String getPatientAddress() {
        return this.patientAddress;
    }
    
    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }
    public String getPatientContactNo() {
        return this.patientContactNo;
    }
    
    public void setPatientContactNo(String patientContactNo) {
        this.patientContactNo = patientContactNo;
    }
    public String getPatientEmail() {
        return this.patientEmail;
    }
    
    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public Set<Admission> getAdmissions() {
        return admissions;
    }

    public void setAdmissions(Set<Admission> admissions) {
        this.admissions = admissions;
    }
    
}


