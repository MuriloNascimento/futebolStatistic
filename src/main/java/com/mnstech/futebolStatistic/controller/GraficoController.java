package com.mnstech.futebolStatistic.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m104.futebol.model.webservice.Time;
import com.mnstech.futebolStatistic.entidades.Grafico;
import com.mnstech.futebolStatistic.repositories.GraficoRepository;
import com.mnstech.futebolStatistic.repositories.TimeRepository;

@Controller
@RequestMapping("/grafico")
public class GraficoController {
	
	@Inject
	private TimeRepository timeRepository;
	
	@Inject
	private GraficoRepository graficoRepository;
	
	@RequestMapping("/cadastro")
	public String cadastro(){
		List<Time> times = timeRepository.buscarTodos();
		
		Grafico grafico = new Grafico();
		grafico.setTipo("column");
		grafico.setTitulo("Titulos");
		grafico.setSubTitulo("numero de titulos por mês");
		grafico.setTooltip("titulos");
		grafico.setyTexto("titulos");
		grafico.setTimes(times);
		
		graficoRepository.adicionar(grafico);
		
		return "cadastro-serie";
		
	}

}
