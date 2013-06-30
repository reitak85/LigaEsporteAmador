<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div style="margin-left: 200px;">
	<img src="${pageContext.request.contextPath}/resources/img/liga.fw.png" />
</div>
<div id="menuTopo">

	<br/>
	
	<div style="font-size: 14px; font-family: Myriad Pro; margin-left: 50%;">
		<form action="${pageContext.request.contextPath}/login" method="get">
			<div style="font-size: 14px; font-family: Myriad Pro; margin-left: 50%;">
				<%
				Object user = request.getSession().getAttribute("loggedUserObj") ;
				if(user == null){
				%>
					<label>Login :</label> <input type="text" size="20" maxlength="100" />
					<label>Senha :</label> <input type="password" size="20" maxlength="10" />
				<%
				}else{
				%>
					<label>Olá Reinaldo</label> <input type="text" size="20" maxlength="100" />
				<%
				}
				%>
			</div>
			<div style="margin-left: 80%; margin-top: -30px;">
				<% 
				if(user == null){
					%>
					<input type="submit" class=btOk>
					<%
				}
				%>
			</div>
		</form>
	</div>
</div>
<div id="menu1">
	<div id="menuEsportes">
		<c:import url="menu/menuEsportes.jsp"></c:import>
	</div>
</div>