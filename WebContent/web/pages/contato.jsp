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
<title>Contato</title>
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
                <img src="${pageContext.request.contextPath}/resources/img/contato.fw.png"/>
             </div>
             <div id="menu2">
	             <div id="menuPagesInterno">
	             	<c:import url="menu/menuInterno.jsp"></c:import>
	             </div>
             </div>
            <div style="margin-top:50px; margin-bottom: 30px; font-family: Myriad Pro;">
            
            	<font style="font-size: 22px;  font-weight: bold;">
             		Formulário de Contato
             	</font>
            
            	<form>
	            	<table style="margin-top: 20px;">
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Nome </label>
	            			</td>
	            			<td>
	            				<input type="text" size="40" maxlength="100"/>
	            			</td>
	            		</tr>
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Email </label>
	            			</td>
	            			<td>
	            				<input type="text" size="40" maxlength="100"/>
	            			</td>
	            		</tr>
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Assunto </label>
	            			</td>
	            			<td>
	            				<input type="text" size="40" maxlength="100"/>
	            			</td>
	            		</tr>
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Setor </label>
	            			</td>
	            			<td>
	            				<select style="font-family: Myriad Pro; width: 150px;">
	            					<option label="Selecione..." value="0">
	            					<option label="Financeiro" value="1">
	            					<option label="Comercial" value="2">
	            					<option label="Marketing" value="3">
	            					<option label="Suporte" value="4">
	            					<option label="Design" value="4">
	            					<option label="TI" value="4">
	            				</select>
	            			</td>
	            		</tr>
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Comentários </label>
	            			</td>
	            			<td>
	            				<textarea rows="5" cols="60"></textarea>
	            			</td>
	            		</tr>
	            		<tr>
		            		<td>
		            		</td>
	            			<td>
	            				<input type="button" value="Enviar" id="botao"/>
	            			</td>
	            		</tr>
	            	</table>
            	</form>
            </div>
            
			<div style="border: 1px solid #c3c3c3; width:425px; height:350px; margin-left: 530px; margin-top:-340px;  margin-bottom:60px; font-family:Myriad Pro; font-size: 14px;">
				
				<font style="font-weight:bold; margin-left: 13px;">
            		R. Barros Cassal, 125 - Itaquera
            	</font>
            	<br/>‎
            	<font style="font-weight:bold; margin-left: 11px;">
					São Paulo, 08210-180. ‎
            	</font>
				<div style="margin-left: 11px; margin-top: 10px;">
					<iframe style="border: 1px solid #c3c3c3;" width="400" height="250" frameborder="0" scrolling="no" marginheight="0" marginwidth="0"
						src="https://maps.google.com.br/maps?f=q&amp;source=s_q&amp;hl=pt&amp;geocode=&amp;q=Rua+Barros+Cassal,+125,+S%C3%A3o+Paulo&amp;aq=0&amp;oq=Rua+Barros+Cassal,+125&amp;sll=-23.516932,-46.543275&amp;sspn=0.208402,0.363579&amp;ie=UTF8&amp;hq=&amp;hnear=R.+Barros+Cassal,+125+-+Itaquera,+S%C3%A3o+Paulo,+08210-180&amp;t=m&amp;z=14&amp;iwloc=A&amp;ll=-23.53976,-46.455346&amp;output=embed">
					</iframe>
					<br/> 
					<small>
					
						<a href="https://maps.google.com.br/maps?f=q&amp;source=embed&amp;hl=pt&amp;geocode=&amp;q=Rua+Barros+Cassal,+125,+S%C3%A3o+Paulo&amp;aq=0&amp;oq=Rua+Barros+Cassal,+125&amp;sll=-23.516932,-46.543275&amp;sspn=0.208402,0.363579&amp;ie=UTF8&amp;hq=&amp;hnear=R.+Barros+Cassal,+125+-+Itaquera,+S%C3%A3o+Paulo,+08210-180&amp;t=m&amp;z=14&amp;iwloc=A&amp;ll=-23.53976,-46.455346"
						style="color: #0000FF; text-align: left">Ver mapa maior</a>
					
					</small>
				</div>
			</div>
		</div>
    </div>
    <c:import url="rodape.jsp"></c:import>
</body>
</html>
