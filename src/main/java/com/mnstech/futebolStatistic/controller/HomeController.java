package com.mnstech.futebolStatistic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.m104.futebol.model.webservice.ConsumerFactory;
import com.m104.futebol.model.webservice.Time;
import com.mnstech.futebolStatistic.entidades.Grafico;
import com.mnstech.futebolStatistic.entidades.Serie;
import com.mnstech.futebolStatistic.repositories.TimeRepository;


@Controller
@RequestMapping("/")
public class HomeController {
	
	@Inject
	private TimeRepository timeRepository;
	
	@RequestMapping("/home")
	public String home(Model model){
		
		Gson gson = new Gson();
		List<Time> times = timeRepository.buscarTodos();
		
		List<String> categorias = new ArrayList<String>();
		categorias.add("janeiro");
		categorias.add("fevereiro");
		
		Grafico grafico = new Grafico();
		grafico.setTipo("column");
		grafico.setTitulo("Titulos");
		grafico.setSubTitulo("numero de titulos por mês");
		grafico.setTooltip("titulos");
		grafico.setyTexto("titulos");
		grafico.setCategories(categorias);
		
		List<Serie> series = new ArrayList<Serie>();
		for (Time time : times) {
			series.add(new Serie(time));
		}

		String dados = gson.toJson(series);
		String dadosG = gson.toJson(grafico);
		model.addAttribute("series",dados);
		model.addAttribute("grafico",dadosG);
		
		return "index";
	}
	
	@RequestMapping("/atualizaBanco")
	public String atualizaBanco(){
		List<Time> times = new ConsumerFactory().getTimes();
		for (Time time : times) {
			timeRepository.adicionar(time);
		}
		return "cadastro-serie";
	}
	
}
