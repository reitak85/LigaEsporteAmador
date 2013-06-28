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
<title>Cadastre-se</title>
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
                <img src="${pageContext.request.contextPath}/resources/img/cadastro_usuario.fw.png"/>
             </div>
             <div id="menu2">
	             <div id="menuPagesInterno">
	             	<c:import url="menu/menuInterno.jsp"></c:import>
	             </div>
             </div>
             <div style="margin-top:40px; font-family: Myriad Pro;">
             	<img alt="cadastro de usuario" src="${pageContext.request.contextPath}/resources/img/cad_laranja_01.fw.png"/>
             	<font>Cadastrar Usuário</font>
             	
             	<img alt="cadastro de usuario" src="${pageContext.request.contextPath}/resources/img/cad_cinza_02.fw.png"/>
             	<font>Cadastrar Time</font>
             	
             	<img alt="cadastro de usuario" src="${pageContext.request.contextPath}/resources/img/cad_cinza_03.fw.png"/>
             	<font>Cadastrar Quadra/Campo</font>
             </div>
             <div style="margin-top:20px; font-family: Myriad Pro;">
            	<form>
            		<table>
            			<tr>
            				<td style="text-align: right;">
            					<label>Nome: </label>
            				</td>
            				<td>
            					<input type="text" name="nome" id="nome" size="40" maxlength="40"/>
            				</td>
            			</tr>
            			<tr>
            				<td style="text-align: right;">
            					<label>SobreNome: </label>
            				</td>
            				<td>
            					<input type="text" name="sobrenome" id="sobrenome" size="40" maxlength="40"/>
            				</td>
            			</tr>
            			<tr>
            				<td style="text-align: right;">
            					<label>Data Nasc.: </label>
            				</td>
            				<td>
            					<input type="date" name="datanasc" id="datanasc" size="40" maxlength="40"/>
            				</td>
            			</tr>
            			<tr>
            				<td style="text-align: right;">
            					<label>Cpf: </label>
            				</td>
            				<td>
            					<input type="text" name="datanasc" id="datanasc" size="20" maxlength="14"/>
            				</td>
            			</tr>
            			
            			<tr>
            				<td style="text-align: right;">
            					<label>Sexo: </label>
            				</td>
            				<td>
            					<input type="radio" name="sexo" id="sexo" value="M"/> Masculino
            					<input type="radio" name="sexo" id="sexo" value="F"/> Feminino
            				</td>
            			</tr>
            			<tr>
            				<td style="text-align: right;">
            					<label>E-mail: </label>
            				</td>
            				<td>
            					<input type="email" size="40" maxlength="100"/>
            				</td>
            			</tr>
            			
            			<tr>
            				<td style="text-align: right;">
            					<label>Celular: </label>
            				</td>
            				<td>
            					<input type="text" size="20" maxlength="20"/>
            				</td>
            			</tr>
            			
            			<tr>
            				<td style="text-align: right;">
            					<label>Telefone Residencial: </label>
            				</td>
            				<td>
            					<input type="text" size="20" maxlength="20"/>
            				</td>
            			</tr>
            			
            			<tr>
            				<td style="text-align: right;">
            					<label>Telefone Comercial: </label>
            				</td>
            				<td>
            					<input type="text" size="20" maxlength="20"/>
            				</td>
            			</tr>
            			
            			<tr>
            				<td style="text-align: right;">
            					<label>Senha: </label>
            				</td>
            				<td>
            					<input type="password" size="15" maxlength="10"/>
            				</td>
            			</tr>
            			
            			<tr>
            				<td style="text-align: right;">
            					<label>Confirmar Senha: </label>
            				</td>
            				<td>
            					<input type="password" size="15" maxlength="10"/>
            				</td>
            			</tr>
            			<tr>
            				<td></td>
            				<td>
            				  <input type="checkbox" name="sms" id="sms"/> 
            				  <font>Concordo com o recebimento de SMS da<br/></font>
            				  <font style="margin-left: 17px;">Liga Esporte Amador.</font> 
            				</td>
            			</tr>
            		</table>
            		
            		<div>
            			
            			<textarea readonly="readonly" rows="10" cols="90" style="margin-left:145px; background-color:#FAFAFA; font-size: 14px; font-family: Myriad Pro;">
            			TERMOS DE LICENÇA DE USO DO APLICATIVO LIGA ESPORTE AMADOR VIA INTERNET

						1. TERMOS DE LICENÇA
						Estes termos de licença são um acordo entre a Liga Esporte Amador Ltda. 
						e você. Por favor, leia-os.
					   
						</textarea>
						<br/>
						<br/>
						<input type="checkbox" name="termo" id="termo" style="margin-left:145px;"/> 
            		    <font>*Declaro que li e aceito o termo de uso<br/></font>
            		</div>
            		
            		<div  style="margin-left: 110px; margin-top: 20px; margin-bottom: 30px;">
	            		<input type="button" id="botao" value="Próximo"/>
            		</div>
            	</form>
            </div>
		</div>
    </div>
    <c:import url="rodape.jsp"></c:import>
</body>
</html>
