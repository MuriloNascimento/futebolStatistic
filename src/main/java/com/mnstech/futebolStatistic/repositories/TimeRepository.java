package com.mnstech.futebolStatistic.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.m104.futebol.model.webservice.Time;


@Repository
public class TimeRepository {
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void adicionar(Time time){
		this.em.merge(time);
	}
	
	@SuppressWarnings("unchecked")
	public List<Time> buscarTodos(){
		Query consulta = em.createQuery("select t from Time t");
		return consulta.getResultList();
	}

	public Time buscarPorId(int parseInt) {
		return em.find(Time.class, parseInt);
	}
	
}
