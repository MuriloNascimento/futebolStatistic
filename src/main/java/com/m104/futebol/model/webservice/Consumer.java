package com.m104.futebol.model.webservice;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

public class Consumer {

	private String WS_URL = "http://localhost:8085/futebol/TimesWS?wsdl";
	
	public List<Time> getTimes() {
		
		TimesWSService timesWSService = new TimesWSService();
		TimesWS timesWS = timesWSService.getTimesWSPort();
		Map<String, Object> req_ctx = ((BindingProvider)timesWS).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);
 
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("Username", Collections.singletonList("futebol"));
        headers.put("Password", Collections.singletonList("1234"));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
        return timesWS.buscarTodos();
	
	}
	
}
