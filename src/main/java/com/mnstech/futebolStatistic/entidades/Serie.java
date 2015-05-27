package com.mnstech.futebolStatistic.entidades;

import java.math.BigDecimal;
import java.util.List;

public class Serie {
	
	private int id;
	
	private String name;
	
	private List<BigDecimal> data;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BigDecimal> getData() {
		return data;
	}

	public void setData(List<BigDecimal> data) {
		this.data = data;
	}

}
