package com.mnstech.futebolStatistic.entidades.parse;

import java.util.List;

import com.mnstech.futebolStatistic.entidades.Grafico;

public class GraficoParse {
	
	private int id;
	
	private String titulo;
	
	private String subTitulo;
	
	private String yTexto;
	
	private String tooltip;
	
	private String tipo;
	
	private List<String> categories;
	
	public GraficoParse(Grafico grafico,List<String>categories) {
		this.id = grafico.getId();
		this.titulo = grafico.getTitulo();
		this.subTitulo = grafico.getSubTitulo();
		this.yTexto = grafico.getyTexto();
		this.tooltip = grafico.getTooltip();
		this.tipo = grafico.getTipo();
		this.categories = categories;
	}
	
	public GraficoParse() {
		// TODO Auto-generated constructor stub
	}

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
	
	

}
