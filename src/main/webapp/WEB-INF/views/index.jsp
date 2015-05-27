<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="skin/css/w3full.css">
	<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css">
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
	<script src="http://code.highcharts.com/highcharts.js"></script>
	<script src="http://code.highcharts.com/modules/exporting.js"></script>
	<style type="text/css">
		body{background-color: #f1f1f1;}
		#container{margin: 10px;}
	</style>
	<script type="text/javascript">
	
	
	
	var grafico = jQuery.parseJSON('${requestScope.graficoG}');
	$(function () {
	    $('#container').highcharts({
	    	chart:{
	    		type: grafico.tipo
	    	},
	        title: {
	            text: grafico.titulo,
	            x: -20 //center
	        },
	        subtitle: {
	            text: 'Source: WorldClimate.com',
	            x: -20
	        },
	        xAxis: {
	            categories: grafico.categories,
	            crosshair: true
	        },
	        yAxis: {
	            title: {
	                text: 'Titulos'
	            },
	            plotLines: [{
	                value: 0,
	                width: 1,
	                color: '#808080'
	            }]
	        },
	        tooltip: {
	            valueSuffix: ' titulos'
	        },
	        legend: {
	            layout: 'vertical',
	            align: 'right',
	            verticalAlign: 'top',
	            floating: false,
	            borderWidth: 1,
	            backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF'
	        },
	        series: grafico.series
	    });
	});
	</script>
</head>
<body>
	<header>
		<div class="w3-header blue">
		  <a href="#id01" class="w3-opennav w3-xlarge"><i class="fa fa-bars"></i></a> 
		</div>
	</header>
	<nav id="id01" class="w3-sidenav red w3-depth-4">
		  <a href="#" class="w3-closenav w3-large">Close ×</a>
		  <a href="#">Link 1</a>		
		  <a href="#">Link 2</a>		
		  <a href="#">Link 3</a>		
		</nav>
	<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
</body>
</html>