/**
 * @author Murilo Nascimento
 */

function gerarGrafico(series,grafico){
	$(function () {
	    $('#container').highcharts({
	    	chart:{
	    		spacingBottom: 120,
	    		type: grafico.tipo
	    	},
	        title: {
	            text: grafico.titulo,
	            x: -20 //center
	        },
	        subtitle: {
	            text: grafico.subTitulo,
	            x: -20
	        },
	        xAxis: {
	            categories: grafico.categories,
	            crosshair: true
	        },
	        yAxis: {
	            title: {
	                text: grafico.yTexto
	            },
	            plotLines: [{
	                value: 0,
	                width: 1,
	                color: '#808080'
	            }]
	        },
	        tooltip: {
	            valueSuffix: grafico.tooltip
	        },
	        legend: {
	            enabled: true,
	            floating: true,
	            verticalAlign: 'bottom',
	            align:'center',
	            y:80
	        },
	        series: series
	    });
	});
}