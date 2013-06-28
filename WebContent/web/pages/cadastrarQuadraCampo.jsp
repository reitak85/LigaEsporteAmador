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
	    $("#dialog").dialog({
	      autoOpen: false,
	      height: 300,
	      width: 400,
	      show: {
	        effect: "blind",
	        duration: 1000
	      },
	      hide: {
	        effect: "explode",
	        duration: 1000
	      }
	    });
	 
	    $( "#opener" ).click(function() {
	      $( "#dialog" ).dialog( "open" );
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
             	
             	<img alt="cadastro de usuario" src="${pageContext.request.contextPath}/resources/img/cad_cinza_02.fw.png"/>
             	<font>Cadastrar Time</font>
             	
             	<img alt="cadastro de usuario" src="${pageContext.request.contextPath}/resources/img/cad_laranja_03.fw.png"/>
             	<font>Cadastrar Quadra/Campo</font>
             </div>
             <div style="margin-top:20px; font-family: Myriad Pro;">
            	<form>
            		<table>
            			<tr>
	            			<td style="text-align: right;">
	            				<label>Tipo </label>
	            			</td>
	            			<td>
	            				<select style="font-family: Myriad Pro; width: 150px;">
	            					<option label="Selecione..." value="0">
	            					<option label="Quadra" value="1">
	            					<option label="Campo" value="2">
	            					<option label="Society" value="3">
	            				</select>
	            			</td>
	            		</tr>
	            		
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Nome Quadra/Campo </label>
	            			</td>
	            			<td>
	            				<input type="text" size="40" maxlength="40"/>
	            			</td>
	            		</tr>
	            		
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Cep </label>
	            			</td>
	            			<td>
	            				<input type="text" size="12" maxlength="9"/>
	            			</td>
	            		</tr>
	            		
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Cidade </label>
	            			</td>
	            			<td>
	            				<input type="text" size="30" maxlength="50"/>
	            			</td>
	            		</tr>
	            		
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Bairro </label>
	            			</td>
	            			<td>
	            				<input type="text" size="40" maxlength="50"/>
	            			</td>
	            		</tr>
	            		
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Endereço </label>
	            			</td>
	            			<td>
	            				<input type="text" size="53" maxlength="50"/>
	            			</td>
	            		</tr>
	            		
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Numero </label>
	            			</td>
	            			<td >
	            				<input type="text" size="9" maxlength="100"/>
	            				
	            				<label style="margin-left: 3px;">Complemento </label>
	            				<input type="text" size="20" maxlength="40"/>
	            			</td>
	            		</tr>
	            		
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Imagens  da Quadra/Campo  1</label>
	            			</td>
	            			<td>
	            				<input type="file" name="multiUpload" id="multiUpload" multiple="multiple" />
	            			</td>
	            		</tr>
	            		
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Imagens  da Quadra/Campo 2</label>
	            			</td>
	            			<td>
	            				<input type="file" name="multiUpload" id="multiUpload" multiple="multiple" />
	            			</td>
	            		</tr>
	            		
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Imagens  da Quadra/Campo 3</label>
	            			</td>
	            			<td>
	            				<input type="file" name="multiUpload" id="multiUpload" multiple="multiple" />
	            			</td>
	            		</tr>
	            		
	            		<tr>
	            			<td style="text-align: right;">
	            				<label>Observações </label>
	            			</td>
	            			<td>
	            				<textarea rows="5" cols="60"></textarea>
	            			</td>
	            		</tr>
	            		
            		</table>
            		
            		<div style="margin-top: 40px;">
            			<font>Cadastrar Dia e Horario de Jogos</font>
						<hr width="50%" align="RIGHT" NOSHADE style="margin-top: -3px;"/>
					</div>
            		
            		<table  id="table_jogadores" class="display">
						
						<thead>
							<tr>
								<th>Dia da Semana</th>
								<th>Horario de Inicio</th>
								<th>Horario de Fim</th>
								<th>Alterar</th>
								<th>Exluir</th>
							</tr>
						</thead>
						
						<tbody id="tbody_jogadores">
							<tr>
								<td>Segunda-Feira</td>
								<td>13:00 hrs</td>
								<td>18:00 hrs</td>
								<td> X </td>
								<td> X </td>
							</tr>
							<tr>
								<td>Terça-Feira</td>
								<td>13:00 hrs</td>
								<td>18:00 hrs</td>
								<td> X </td>
								<td> X </td>
							</tr>
						</tbody>
						
						<tfoot>
							<tr>
								<th>Dia da Semana</th>
								<th>Horario de Inicio</th>
								<th>Horario de Fim</th>
								<th>Alterar</th>
								<th>Exluir</th>
							</tr>							
						</tfoot>
					</table>
					
					<div  style="margin-left: 355px; margin-top: 20px; margin-bottom: 30px;">
	            		<input type="button" id="opener" value="Add Horario" class="botao1"/>
            		</div>
					
            	</form>
            	
            	
            	<div id="dialog" title="Cadastrar Horario de Jogos" style="font-size: 16px; font-family: Myriad Pro;">
  					<form>
  						<table>
							<tr>
								<td style="text-align: right;">
									Dia da Semana
								</td>
								<td>
									<select>
										<option label="Selecione...">
										<option value="Segunda-Feira" label="Segunda-Feira">
										<option value="Terça-Feira"   label="Terça-Feira">
										<option value="Quarta-Feira"  label="Quarta-Feira">
										<option value="Quinta-Feira"  label="Quinta-Feira">
										<option value="Sexta-Feira"   label="Sexta-Feira">
										<option value="Sabado"        label="Sabado">
										<option value="Domingo"       label="Domingo">
									</select>
								</td>
							</tr>
							<tr>
								<td style="text-align: right;">
									Horario de Inicio
								</td>
								<td>
									<input type="time" size="10" name="horaInicial"/>
								</td>
							</tr>
							<tr>
								<td style="text-align: right;">
									Horario de Final
								</td>
								<td>
									<input type="time" size="10" name="horafinal"/>
								</td>
							</tr>   						   						
  						</table>
  						
  						<div  style="margin-top: 20px; margin-left: 120px;">
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
