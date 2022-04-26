package com.springboot.dao;

import java.util.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.springboot.domain.Doctor;

@Component
public class DoctorDAO {

	static ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	  static {
		doctorList.add(new Doctor(1,"Elizabeth","MBBS",4.2,"Cardiologist",750.00));
		doctorList.add(new Doctor(2,"Michael","MBBS",2.0,"Dermatologist",1500.00));
    		doctorList.add(new Doctor(3,"charlotte","MBBS",3.1,"Pediatrics",200.00));
		doctorList.add(new Doctor(4,"Lucas","BDS",1.9,"Dentist",250.00));
	  }	

	public Boolean save(Doctor doctor) {
		doctorList.add(doctor);
		return true;
	}
	public List<Doctor> list() {
		return doctorList;
	}
	
}
