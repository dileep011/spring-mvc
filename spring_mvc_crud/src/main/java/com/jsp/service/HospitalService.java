package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.HospitalDao;
import com.jsp.dto.Hospital;
@Component
public class HospitalService {
	
	@Autowired
	HospitalDao hospitalDao;
	
	public Hospital saveHospital(Hospital hospital) {
		return hospitalDao.saveHospital(hospital);
	}
	public Hospital updateHospital(Hospital hospital) {
		return hospitalDao.updateHospital(hospital);
	}
	public Hospital deleteHospital(int id) {
		return hospitalDao.deleteHospital(id);
	}
	public Hospital getById(int id) {
		return hospitalDao.getById(id);
	}
	public List<Hospital> getAll(){
		return hospitalDao.getAll();
	}

}
