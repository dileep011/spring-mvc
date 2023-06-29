package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.jsp.dto.Hospital;

@Component
public class HospitalDao {
	@Autowired
	EntityManagerFactory entityManagerFactory;

	public Hospital saveHospital(Hospital hospital) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		if(hospital!=null) {
			entityTransaction.begin();
			entityManager.persist(hospital);
			entityTransaction.commit();
		} 
		return hospital;

	}
	public Hospital updateHospital(Hospital hospital) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Hospital hospital2=entityManager.merge(hospital);
		entityTransaction.commit();
		return hospital2;
	}
	public Hospital deleteHospital(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital2=entityManager.find(Hospital.class, id);
		if(hospital2!=null) {
			entityTransaction.begin();
			entityManager.remove(hospital2);
			entityTransaction.commit();	 
		}
		return hospital2;
	}
	public Hospital getById(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Hospital hospital2=entityManager.find(Hospital.class, id);
		return hospital2;
	}
	public List<Hospital> getAll(){
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select a from Hospital a");
		return query.getResultList();
	}

}
