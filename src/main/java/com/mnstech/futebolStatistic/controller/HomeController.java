package com.mnstech.futebolStatistic.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus.Series;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.m104.futebol.model.webservice.Time;
import com.m104.futebol.model.webservice.TimesWS;
import com.m104.futebol.model.webservice.TimesWSService;
import com.mnstech.futebolStatistic.entidades.Grafico;
import com.mnstech.futebolStatistic.entidades.Serie;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model){
		TimesWSService timesWSService = new TimesWSService();
		TimesWS timesWS = timesWSService.getTimesWSPort();
		
		List<Time> times = timesWS.buscarTodos();
		
		
		Gson gson = new Gson();
		
		Serie serie = new Serie();
		serie.setName("Brasil");
		List<BigDecimal> data = new ArrayList<BigDecimal>();
		data.add(new BigDecimal(12.2));
		data.add(new BigDecimal(13.5));
		serie.setData(data);
		
		List<String> categorias = new ArrayList<String>();
		categorias.add("janeiro");
		categorias.add("fevereiro");
		
		Grafico grafico = new Grafico();
		grafico.setTipo("line");
		grafico.setTitulo("teste");
		grafico.setSubTitulo("teste sub");
		grafico.setTooltip("R$");
		grafico.setyTexto("Vendas em (R$)");
		grafico.setCategories(categorias);
		
		List<Serie> series = new ArrayList<Serie>();
		series.add(serie);
		grafico.setSeries(series);
		
		System.out.println(grafico.getSeries().get(0).getName());
		
		String graficoG = gson.toJson(grafico);
		model.addAttribute("graficoG",graficoG);
		return "index";
	}
	
}
