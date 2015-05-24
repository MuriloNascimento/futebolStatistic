package com.mnstech.futebolStatistic.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m104.futebol.model.webservice.Time;
import com.m104.futebol.model.webservice.TimesWS;
import com.m104.futebol.model.webservice.TimesWSService;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model){
		TimesWSService timesWSService = new TimesWSService();
		TimesWS timesWS = timesWSService.getTimesWSPort();
		
		List<Time> times = timesWS.buscarTodos();
		
		model.addAttribute("times",times);
		return "index";
	}
	
}
