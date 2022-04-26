package com.springboot.dao;

import java.util.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.springboot.domain.Doctor;

@Component
public class DoctorDAO {

	static ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	  static {
		doctorList.add(new Doctor(1,"Harinii","MBBS",4.2,"Orthologist",750.00));
		doctorList.add(new Doctor(2,"Nithin","MBBS",2.0,"Gynecologist",1500.00));
    		doctorList.add(new Doctor(//fill the values as per question));
    		doctorList.add(new Doctor(//fill the values as per question));
	  }	

	public Boolean save(Doctor doctor) {
		doctorList.add(doctor);
		return true;
	}
	public List<Doctor> list() {
		return doctorList;
	}
	
}
