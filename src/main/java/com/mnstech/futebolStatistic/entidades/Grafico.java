package com.mnstech.futebolStatistic.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.m104.futebol.model.webservice.Time;


@Entity
public class Grafico {
	
	@Id @GeneratedValue
	private int id;
	
	private String titulo;
	
	private String subTitulo;
	
	private String yTexto;
	
	private String tooltip;
	
	private String tipo;
	
	@Transient
	private List<String> categories;
	
	@OneToMany(mappedBy="grafico")
	private List<Time> time;

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

	public List<Time> getTime() {
		return time;
	}

	public void setTime(List<Time> time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Grafico))
			return false;
		Grafico other = (Grafico) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
