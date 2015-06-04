package com.mnstech.futebolStatistic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.m104.futebol.model.webservice.Consumer;
import com.m104.futebol.model.webservice.Jogador;
import com.m104.futebol.model.webservice.Time;
import com.mnstech.futebolStatistic.entidades.Grafico;
import com.mnstech.futebolStatistic.entidades.Serie;
import com.mnstech.futebolStatistic.entidades.parse.GraficoParse;
import com.mnstech.futebolStatistic.repositories.GraficoRepository;
import com.mnstech.futebolStatistic.repositories.JogadorRepository;
import com.mnstech.futebolStatistic.repositories.TimeRepository;


@Controller
@RequestMapping("/")
public class HomeController {
	
	@Inject
	private TimeRepository timeRepository;
	
	@Inject
	private JogadorRepository jogadorRepository;
	
	@Inject
	private GraficoRepository graficoRepository;
	
	@RequestMapping("/home")
	public String home(Model model){
		
		Gson gson = new Gson();
		
		Grafico grafico = graficoRepository.buscarPorId(2);
		
		List<Serie> series = new ArrayList<Serie>();
		List<Time> times = grafico.getTimes();
		for (Time time : times) {
			series.add(new Serie(time));
		}
		List<String> categorias = new ArrayList<String>();
		categorias.add("JAN");
		categorias.add("FEV");
		
		GraficoParse graficoParse = new GraficoParse(grafico,categorias);

		String dados = gson.toJson(series);
		String dadosG = gson.toJson(graficoParse);
		model.addAttribute("series",dados);
		model.addAttribute("grafico",dadosG);
		
		return "index";
	}
	
	@RequestMapping("/atualizaBanco")
	public String atualizaBanco(){
		List<Time> times = new Consumer().getTimes();
		List<Jogador> jogadores = new ArrayList<Jogador>();
		for (Time time : times) {
			timeRepository.adicionar(time);
			jogadores.addAll(time.getJogadores());
		}
		
		for (Jogador jogador : jogadores) {
			jogadorRepository.adicionar(jogador);
		}
		return "cadastro-serie";
	}
	
}
