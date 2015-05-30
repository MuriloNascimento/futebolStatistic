package com.mnstech.futebolStatistic.entidades;

import java.util.ArrayList;
import java.util.List;

import com.m104.futebol.model.webservice.Time;

public class Serie {
	
	private String name;
	private List<Integer> data;
	
	public Serie(Time time) {
		this.name = time.getNome();
		List<Integer> titulos = new ArrayList<Integer>(); 
		titulos.add(time.getTitulos());
		titulos.add(time.getTitulos()+1);
		this.data = titulos;
	}
	
	public Serie() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Integer> getData() {
		return data;
	}
	
	public void setData(List<Integer> data) {
		this.data = data;
	}

}
