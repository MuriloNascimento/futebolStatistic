package com.mnstech.futebolStatistic.entidades;

import java.util.List;

public class Grafico {
	
	private int id;
	
	private String titulo;
	
	private String subTitulo;
	
	private String yTexto;
	
	private String tooltip;
	
	private String tipo;
	
	private List<String> categories;
	
	private List<Serie> series;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubTitulo() {
		return subTitulo;
	}

	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}

	public String getyTexto() {
		return yTexto;
	}

	public void setyTexto(String yTexto) {
		this.yTexto = yTexto;
	}

	public String getTooltip() {
		return tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}

}
