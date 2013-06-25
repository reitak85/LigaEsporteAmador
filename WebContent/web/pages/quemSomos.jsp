<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<!--[if lt IE 7]> <html class="ie6 oldie"> <![endif]-->
<!--[if IE 7]>    <html class="ie7 oldie"> <![endif]-->
<!--[if IE 8]>    <html class="ie8 oldie"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Quem Somos</title>
<link href="${pageContext.request.contextPath}/resources/css/boilerplate.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/resources/css/quemsomos.css" rel="stylesheet" type="text/css">
<!--[if lt IE 9]>
<script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<script src="${pageContext.request.contextPath}/resources/js/respond.min.js"></script>
</head>
<body>
	<div id="topo"></div>
    <c:import url="cabecalho.jsp"></c:import>
    <div class="gridContainer clearfix">
     	<div id="principal">
        	 <div id="div1" >
                <img src="${pageContext.request.contextPath}/resources/img/quemsomos.fw.png"/>
             </div>
             <div id="menu2">
	             <div id="menuPagesInterno">
	             	<c:import url="menu/menuInterno.jsp"></c:import>
	             </div>
             </div>
             
             <div style="margin-top: 50px; font-family: Myriad Pro; width: 800px; margin-bottom: 30px;">
             
             	<font style="font-size: 22px;  font-weight: bold;">
             		Liga de Esporte Amador
             	</font>
             	
             	<br/>
             	<br/>
             	
             	<font style="font-size: 16px;">
             		O site “Liga Esporte Amador” foi desenvolvido para unir grupos apaixonados por esporte, mas que encontravam dificuldades em marcar confrontos e organizar uma simples partida de futebol, 
             		vôlei, basquete e outras modalidades.
                    Com essa ferramenta disponível 24 horas e todos os dias do ano, sua equipe nunca mais vai ficar sem adversários para aquele jogo empolgante. 
                    Temos a missão de ser o seu agente facilitador, com uma relação completa de times por nome, cidade, região e modalidade esportiva.
                    Com um sistema de busca fácil e intuitivo seu cotidiano nunca mais será o mesmo, 
                    afinal nossa agenda de jogos apresenta opções que vão fazer você sair de casa para ter a certeza de que vai encontrar com pessoas amigas e dispostas a competir da forma mais saudável que existe.
                    O “Liga Esporte Amador” acredita também que o esporte é capaz de transformar vidas, por meio da inclusão social e do bem estar que ele nos oferece, por isso não perca tempo e encontre seu adversário. 
             	</font>
             </div>
        </div>
    </div>
    <c:import url="rodape.jsp"></c:import>
</body>
</html>
