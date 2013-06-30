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
<link href="${pageContext.request.contextPath}/resources/css/table_jui.css" rel="stylesheet" type="text/css">
<!--[if lt IE 9]>
<script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<script src="${pageContext.request.contextPath}/resources/js/respond.min.js"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ui-lightness/jquery-ui-1.9.2.custom.css" />
  <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css" />
  <script>
	  $(function() {
	    $( "#dialog" ).dialog({
	      autoOpen: false,
	      height: 300,
	      width: 500,
	      show: {
	        effect: "blind",
	        duration: 1000
	      },
	      hide: {
	        effect: "explode",
	        duration: 1000
	      }
	    });
	 
	    $("#opener").click(function() {
	      $("#dialog").dialog("open");
	    });
	  });
  </script>

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
             	<img alt="cadastro de usuario" src="${pageContext.request.contextPath}/resources/img/cad_cinza_01.fw.png"/>
             	<font>Cadastrar Usuário</font>
             	
             	<img alt="cadastro de usuario" src="${pageContext.request.contextPath}/resources/img/cad_laranja_02.fw.png"/>
             	<font>Cadastrar Time</font>
             	
             	<img alt="cadastro de usuario" src="${pageContext.request.contextPath}/resources/img/cad_cinza_03.fw.png"/>
             	<font>Cadastrar Quadra/Campo</font>
             </div>
             <div style="margin-top:20px; font-family: Myriad Pro;">
            	<form action="${pageContext.request.contextPath}/cadastrarTime" method="get">
            		<table>
            			<tr>
	            			<td style="text-align: right;">
	            				<label>Esporte </label>
	            			</td>
	            			<td>
	            				<select name="esporte" style="font-family: Myriad Pro; width: 150px;">
	            					<option label="Selecione..." value="0">
	            					<option label="Futebol" value="1">
	            					<option label="Basquete" value="2">
	            					<option label="Tênis" value="3">
	            					<option label="Vôlei" value="4">
	            					<option label="Handebol" value="5">
	            					<option label="Rugby" value="6">
	            				</select>
	            			</td>
	            		</tr>
            			<tr>
	            			<td style="text-align: right;">
	            				<label>Categoria </label>
	            			</td>
	            			<td>
	            				<select name="categoria" style="font-family: Myriad Pro; width: 150px;">
	            					<option label="Selecione..." value="0">
	            					<option label="Futebol de Campo" value="1">
	            					<option label="Futebol Society" value="2">
	            					<option label="Futsal" value="3">
	            					<option label="Sub 20" value="4">
	            					<option label="Sub 17" value="5">
	            					<option label="Sb 17 / Feminino" value="6">
	            				</select>
	            			</td>
	            		</tr>
            			<tr>
            				<td style="text-align: right;">
            					<label>Estado</label>
            				</td>
            				<td>
            					<select name="estado" style="font-family: Myriad Pro; width: 150px;">
	            					<option label="Selecione..." value="0">
	            					<option label="São Paulo" value="1">
	            					<option label="Minas Gerais" value="2">
	            					<option label="Mato Grosso" value="3">
	            				</select>
            				</td>
            			</tr>
            			<tr>
            				<td style="text-align: right;">
            					<label>Cidade</label>
            				</td>
            				<td>
            					<select name="cidade" style="font-family: Myriad Pro; width: 150px;">
	            					<option label="Selecione..." value="0">
	            					<option label="São Paulo" value="1">
	            					<option label="Caraguatatuba" value="2">
	            					<option label="São Sebastião" value="3">
	            				</select>
            				</td>
            			</tr>
            			<tr>
            				<td style="text-align: right;">
            					<label>Bairro</label>
            				</td>
            				<td>
            					<select name="bairro" style="font-family: Myriad Pro; width: 150px;">
	            					<option label="Selecione..." value="0">
	            					<option label="São Paulo" value="1">
	            					<option label="Caraguatatuba" value="2">
	            					<option label="São Sebastião" value="3">
	            				</select>
            				</td>
            			</tr>
            			
            			<tr>
            				<td style="text-align: right;">
            					<label>Nome do Time</label>
            				</td>
            				<td>
            					<input type="text" name="nomeTime" id="nomeTime" size="40" maxlength="60"/>
            				</td>
            			</tr>
            			
            			<tr>
            				<td style="text-align: right;">
            					<label>Cor do Uniforme</label>
            				</td>
            				<td>
            					<input type="text" name="corUniforme" id="nomeTime" size="40" maxlength="60"/>
            				</td>
            			</tr>
            			<tr>
            				<td style="text-align: right;">
            					<label>Emblema do Time</label>
            				</td>
            				<td>
            					<input type="file" name="emblema" id="emblema"/>
            				</td>
            			</tr>
            			
            			<tr>
            				<td style="text-align: right;">
            					<label>Seu Time é ?</label>
            				</td>
            				<td>
            					<input type="radio" id="timeCateg" name="timeCateg"/> <font>Mandante</font>
            					<br/>
            					<input type="radio" id="timeCateg" name="timeCateg"/> <font>Mandante/Visitante</font>
            					<br/>
            					<input type="radio" id="timeCateg" name="timeCateg"/> <font>Visitante</font>
            				</td>
            			</tr>
            		</table>
            		
            		
            		<div style="margin-top: 40px;">
            			<font>Cadastrar Time</font>
						<hr width="50%" align="RIGHT" NOSHADE style="margin-top: -3px;"/>
					</div>
					
					<table  id="table_jogadores" class="display">
						
						<thead>
							<tr>
								<th>Nome</th>
								<th>Email</th>
								<th>Tel. Celular</th>
								<th>Tel. Residencial</th>
								<th>Alterar</th>
								<th>Exluir</th>
							</tr>
						</thead>
						
						<tbody id="tbody_jogadores">
							<tr>
								<td>Luiz henrique de sousa santos</td>
								<td>luizsouzatwo@gmail.com</td>
								<td>11 - 95358-5795</td>
								<td>12 - 3882-2743</td>
								<td> X </td>
								<td> X </td>
							</tr>
							<tr>
								<td>Luiz henrique de sousa santos</td>
								<td>luizsouzatwo@gmail.com</td>
								<td>11 - 95358-5795</td>
								<td>12 - 3882-2743</td>
								<td> X </td>
								<td> X </td>
							</tr>
						</tbody>
						
						<tfoot>
							<tr>
								<th>Nome</th>
								<th>Email</th>
								<th>Tel. Celular</th>
								<th>Tel. Residencial</th>
								<th>Alterar</th>
								<th>Exluir</th>
							</tr>							
						</tfoot>
					</table>
					
					<div  style="margin-left: 355px; margin-top: 20px; margin-bottom: 30px;">
						<input type="button" id="opener" value="Add Horario" class="botao1"/>
            		</div>
					
										
            		<div  style="margin-left:auto; margin-bottom:auto; margin-top: 20px; margin-bottom: 30px;">
	            		<input type="submit" id="botao" value="Próximo"/>
            		</div>
            	</form>
            	
            	<div id="dialog" title="Cadastrar Jogadores" style="font-size: 16px; font-family: Myriad Pro;">
  					<form>
  						<table>
							<tr>
								<td style="text-align: right;">
									Nome
								</td>
								<td>
									<input type="text" size="30" maxlength="40" />
								</td>
							</tr>
							<tr>
								<td style="text-align: right;">
									E-mail
								</td>
								<td>
									<input type="email" size="30" maxlength="40" />
								</td>
							</tr>
							<tr>
								<td style="text-align: right;">
									Tel Celular
								</td>
								<td>
									<input type="text" size="15" maxlength="15" />
								</td>
							</tr>
							<tr>
								<td style="text-align: right;">
									Tel Residencial
								</td>
								<td>
									<input type="text" size="15" maxlength="15" />
								</td>
							</tr>					   						
  						</table>
  						
  						<div  style="margin-top: 20px; margin-left: 200px;">
	            			<input type="button" value="Adicionar" class="botaoPopup"/>
            			</div>
  					</form>
				</div>
            </div>
		</div>
    </div>
    <c:import url="rodape.jsp"></c:import>
</body>
</html>
