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
	<script src="skin/js/main.js"></script>
	<style type="text/css">
		body{background-color: #f1f1f1;}
		.padding-box{padding: 10px;}
		.w3-sidenav a:hover, .w3-sidenav a:focus{background: #7CB342 !important;}
	</style>
	
	<script type="text/javascript">
		var series = jQuery.parseJSON('${requestScope.series}');
		var grafico = jQuery.parseJSON('${requestScope.grafico}');
		gerarGrafico(series,grafico);
	</script>
</head>
<body class="grey-l2">
	<header>
		<div class="w3-header light-green-d1">
		  <a href="#id01" class="w3-opennav w3-xlarge"><i class="fa fa-bars"></i></a> 
		</div>
	</header>
	<nav id="id01" class="w3-sidenav green-d2 w3-depth-4">
	  <a href="#" class="w3-closenav w3-border-bottom w3-large">Close ×</a>
	  <a href="#" class="w3-border-bottom">Link 1</a>		
	  <a href="#" class="w3-border-bottom">Link 2</a>		
	  <a href="#" class="w3-border-bottom">Link 3</a>		
	</nav>
	<div id="container" class="padding-box" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
</body>
</html>