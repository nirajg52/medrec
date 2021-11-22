package com.example.medrecroomdb.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Doctor {
    @PrimaryKey
    private int doctorId;

    private String firstName;
    private String lastName;
    private String email;
    private String doctorLicenseNumber;
    private String password;

    public int getDoctorId() {
        return doctorId;
    }
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDoctorLicenseNumber() {
        return doctorLicenseNumber;
    }
    public void setDoctorLicenseNumber(String doctorLicenseNumber) {
        this.doctorLicenseNumber = doctorLicenseNumber;
    }

    public String getPassword() {return password; }
    public void setPassword(String password) { this.password = password; }
}
