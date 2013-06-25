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
<title>Como Funciona</title>
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
                <img src="${pageContext.request.contextPath}/resources/img/comofunciona.fw.png"/>
             </div>
             <div id="menu2">
	             <div id="menuPagesInterno">
	             	<c:import url="menu/menuInterno.jsp"></c:import>
	             </div>
             </div>
             
             <div style="margin-top: 50px; font-family: Myriad Pro; width: 800px; margin-bottom: 30px;">
             
             	<font style="font-size: 22px;  font-weight: bold;">
             		Sub Como Funciona
             	</font>
             	
             	<br/>
             	<br/>
             	
             	<font style="font-size: 16px;">
             		Acesse o cadastro
					<br/>
					<br/>
					Quem pode se cadastrar?
					<br/>
					<br/>
					Para fazer parte do quadro de equipes é muito fácil. Antes de tudo vale lembrar
					que a modalidade cadastrada não pode ser alterada, ou seja, se você tem um time
					de futebol só poderá jogar com equipes de futebol, mas nada impede que você
					crie equipe de outras modalidades.
					<br/>
					<br/>
					Como cadastrar minha equipe?
					<br/>
					<br/>
					1- Basta ir em “Cadastro de Time” e preencher todos os campos em branco,
					lembre-se sempre de salvar para avançar a fase seguinte.
					<br/>
					<br/>
					2 – O responsável pela equipe precisa preencher um cadastro básico com dados
					do time e do elenco. Caso queira cadastrar o e-mail dos jogadores, eles irão
					receber informações das próximas partidas.
					<br/>
					<br/>
					Minha equipe é mandante ou visitante?
					<br/>
					<br/>
					Mandante: Após preencher as etapas 1 e 2, o mandante passa para a etapa 3,
					nela é necessário além do preenchimento dos dados em branco, o envio de no
					mínimo 4 fotos para visualização do local onde os jogos serão realizados.
					<br/>
					<br/>
					Para ser mandante sua equipe deve ter a disposição um campo ou quadra que
					possam ser realizados jogos da modalidade escolhida.
					<br/>
					<br/>
					Visitante: Após o cadastro do usuário ser realizado, o visitante passa para a
					etapa 2. Nesse momento, basta escolher a opção visitante e assim cadastrar sua
					equipe. Aqui também poderá ser cadastrado todo o elenco para o recebimento de
					informações de cada partida.
					<br/>
					<br/>
					Mandante e visitante: A equipe que escolher essa opção, disponível na etapa
					2, não pode esquecer de enviar no mínimo 4 fotos que identifique o campo ou
					quadra que pretende realizar seus jogos. Aqui também poderá ser cadastrado
					todo o elenco para o recebimento de informações de cada partida.
					<br/>
					<br/>
					Como posso agendar meus jogos?
					<br/>
					<br/>
					1 - Na opção “Agende Seu Jogo” sua equipe terá a possibilidade de encontrar
					adversários por um sistema de busca simples e eficaz, que tem como objetivo
					filtrar o perfil do seu próximo “rival”. Basta escolher as opções: nome do time,
					cidade ou região (norte, sul leste e oeste)
					<br/>
					<br/>
					Como posso localizar uma quadra ou campo para agendar meus jogos?
					<br/>
					<br/>
					1 – Em “localizar quadra/campo”, sua equipe vai ter a possibilidade de analisar
					os campos e quadras cadastradas para assim jogar no local desejado.
					<br/>
					<br/>
					Aqui também vai estar disponível a relação dos times que jogam nas quadras
					pesquisadas com os respectivos dias e horários abertos de cada partida.
					<br/>
					<br/>
					Como confirmar, remarcar ou cancelar meus jogos?
					<br/>
					<br/>
					1 - Qualquer alteração no cadastro, confirmação, remarcação e cancelamento de
					partidas deve ser feito no campo “Minha Conta”, na opção “Meus Jogos” .
					<br/>
					<br/>
					2 – Confirmação de partida: Após o recebimento do e-mail de uma equipe
					interessada em um confronto com o seu time, você obrigatoriamente precisa
					confirmar o interesse 48 horas antes da partida.
					<br/>
					<br/>
					3 – Cancelamento: O mandante e o visitante podem cancelar uma partida, mas
					ficam impossibilitados de marcar um jogo na mesma data, mesmo que em locais
					diferentes. O adversário fica com a agenda livre para remarcar outro confronto.
					<br/>
					<br/>
					4 – Remarcação: Caso não concorde com a data do jogo, o mandante ou o
					visitante podem optar pela remarcação, desta forma a agenda ficará disponível
					para o dia que melhor se encaixe em sua necessidade.
					<br/>
					<br/>
					5 - Exclusão: Esse item serve apenas para limpar o histórico das partidas que já
					foram disputadas, remarcadas e canceladas
					<br/>
					<br/>
					Como chegar ao local escolhido para a realização da minha partida?
					<br/>
					<br/>
					O e-mail de confirmação de seu jogo virá com o mapa do GOOGLE com todas as
					informações que precisa para chegar com segurança ao local combinado. 
             	</font>
             </div>
        </div>
    </div>
    <c:import url="rodape.jsp"></c:import>
</body>
</html>
