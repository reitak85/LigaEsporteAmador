<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="rodape">
 	<br/>
 	<div id="menuPagesInferior" style="margin-left: 250px;">
 		<c:import url="menu/menuInterno.jsp"></c:import>
 	</div>
 	<div style="margin-left: 255px; margin-top: 90px;">
 		<img src="${pageContext.request.contextPath}/resources/img/logo-liga-footer.png"/>   		
 	</div>
 	<div style="margin-left: 340px;  margin-top: -25px; color: #FFF; font-family: Myriad Pro; font-size: 14px;">
 		<font style="margin-top: 5px;">© 2012. Todos os direitos reservados.</font>   		
 	</div>
 	<div style="margin-left: 600px; margin-top: -30px;">
 		<a href="https://www.facebook.com/Ligaesporteamador?ref=ts&fref=ts">
 			<img src="${pageContext.request.contextPath}/resources/img/bt-facebook-footer.png"/>
 		</a>   		
 	</div>
 	<div style="margin-left: 650px; margin-top: -35px;">
 		<a href="#">
 			<img src="${pageContext.request.contextPath}/resources/img/bt-twitter-footer.png"/>
 		</a>
 	</div>
</div>