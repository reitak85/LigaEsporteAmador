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
<title>Tênnis</title>
<link href="${pageContext.request.contextPath}/resources/css/boilerplate.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/resources/css/tennis.css" rel="stylesheet" type="text/css">
<!--[if lt IE 9]>
<script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<script src="respond.min.js"></script>
</head>
<body>
	<div id="topo"></div>
    <div style="margin-left:200px;">
    	<img src="${pageContext.request.contextPath}/resources/img/liga.fw.png"/>
    </div>
    <div>
        <img src="${pageContext.request.contextPath}/resources/img/img_topo.fw.png" width="100%" height="60"/>
    </div>
    <div id="menuPages">
    	<ul>
        	
        </ul>
    </div>
    <div class="gridContainer clearfix">
     	<div id="principal">
        	 <div id="div1" >
                <img src="${pageContext.request.contextPath}/resources/img/tennis.fw.png"/>
             </div>
             <div id="menuPagesInterno">
             	<ul>
        	
        		</ul>
             </div>
        </div>
    </div>
    <div id="rodape">
    	<div id="menuPagesInferior" style="margin-left: 250px;">
    		<c:import url="menuInfeiror.jsp"></c:import>
    	</div>
    	<div>
    		<img src="${pageContext.request.contextPath}/resources/img/bt-twitter-footer.png"/>
    	</div>
    </div>
</body>
</html>
