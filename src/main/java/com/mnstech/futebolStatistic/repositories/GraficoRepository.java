package com.mnstech.futebolStatistic.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mnstech.futebolStatistic.entidades.Grafico;

@Repository
public class GraficoRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void adicionar(Grafico grafico){
		this.em.merge(grafico);
	}
	
	public Grafico buscarPorId(int id){
		return em.find(Grafico.class, id);
	}

}
