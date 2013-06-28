<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>Futebol</title>
<link
	href="${pageContext.request.contextPath}/resources/css/boilerplate.css"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.request.contextPath}/resources/css/futebol.css"
	rel="stylesheet" type="text/css">
<!--[if lt IE 9]>
<script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<script
	src="${pageContext.request.contextPath}/resources/js/respond.min.js"></script>
</head>
<body>
	<div id="topo"></div>
	<c:import url="cabecalho.jsp"></c:import>
	<div class="gridContainer clearfix">
		<div id="principal">
			<div id="div1">
				<img
					src="${pageContext.request.contextPath}/resources/img/futebol.fw.png" />
			</div>

			<div id="menu2">
				<div id="menuPagesInterno">
					<c:import url="menu/menuInterno.jsp"></c:import>
				</div>
			</div>
			<!--LINHA 1-->

			<div id="linha1">

				<!--Destaque-->

				<div class="title-noticias">DESTAQUES</div>

				<div class="destaque">
					<div class="img-destaque">

						<a class="lnkNoticia"> <img
							src="${pageContext.request.contextPath}/resources/img/Futebol/m_85.jpg"
							id="cpMeio_ImgDestaque" width="300" height="208" border="0" />
						</a>

						<!--div class="fonte">terra.com.br - Henrique pode reforçar o Cruzeiro  -  </div-->

					</div>


					<div class="tit-destaque">

						<div class="topico-destaque">EM BUSCA DE REFORÇOS!</div>

						<h2>
							<a class="lnkNoticia">Após acertar com Dedé, Cruzeiro mira
								palmeirense </a>
						</h2>

						<h3>
							<a class="lnkNoticia">Cruzeiro mostrou interesse em ter o
								zagueiro Henrique em seu elenco</a>
						</h3>

					</div>

				</div>

			</div>
			<div class="noticias2-home">

				<div class="title-noticias">NOTÍCIAS</div>

				<div class="link-noticias2">
					<a href=""> <img src="/css/img/link.png" width="26" height="25" />
					</a>
				</div>

				<div class="list-noticias2">

					<ul>

						<li>

							<div class="box-noticias2">

								<small>JOEL É DO BAHIA!</small><br /> <a href=""
									class="title-noticias2"> Joel Santana assume o comando do
									Bahia </a>

							</div>

						</li>

						<li class="separador"></li>

						<li>

							<div class="box-noticias2">

								<small>PONTA PÉ DE BOA SORTE!</small><br /> <a
									href="/noticia/descalca-presidente-dilma-da-o-1o-chute-e-inaugura-arena-fonte-nova.html"
									class="title-noticias2">Descalça, presidente Dilma dá o 1º
									chute e inaugura Arena Fonte Nova</a>
							</div>
						</li>
						<li class="separador"></li>
						<li>
							<div class="box-noticias2">
								<small>GAROTINHA BOA DE BOLA!</small><br /> <a
									href="/noticia/ganhando-r-150-por-gol-inglesa-de-apenas-10-anos-supera-messi-e-cr7.html"
									class="title-noticias2">Ganhando R$ 1,50 por gol, inglesa
									de apenas 10 anos supera Messi e CR7</a>
							</div>
						</li>
						<li class="separador"></li>
						<li>
							<div class="box-noticias2">

								<small>ESFORÇO EM NOME DA AMÉRICA!</small><br /> <a href=""
									class="title-noticias2"> Após quase dez horas de viagem,
									Grêmio chega à Venezuela </a>

							</div>

						</li>
					</ul>
				</div>
			</div>

			<!--Fim Notícias2-->

		</div>

	</div>
	<c:import url="rodape.jsp"></c:import>
</body>
</html>
