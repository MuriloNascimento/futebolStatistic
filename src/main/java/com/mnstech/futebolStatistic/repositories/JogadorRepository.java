package com.mnstech.futebolStatistic.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.m104.futebol.model.webservice.Jogador;

@Repository
public class JogadorRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void adicionar(Jogador jogador){
		this.em.merge(jogador);
	}
	
}
