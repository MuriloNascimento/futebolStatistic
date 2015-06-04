package com.mnstech.futebolStatistic.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.m104.futebol.model.webservice.Time;


@Entity
public class Grafico implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	private int id;
	
	private String titulo;
	
	private String subTitulo;
	
	private String yTexto;
	
	private String tooltip;
	
	private String tipo;
	
	@ManyToMany	
    @JoinTable(name="grafico_has_times", joinColumns={@JoinColumn(name="grafico_id")}, inverseJoinColumns={@JoinColumn(name="time_id")})
	private List<Time> times;

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

	public List<Time> getTimes() {
		return times;
	}

	public void setTimes(List<Time> times) {
		this.times = times;
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
