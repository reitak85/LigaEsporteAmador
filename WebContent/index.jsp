<%@page import="br.com.ligadeesportearmador.util.HibernateUtil"%>
<%
HibernateUtil.getEntityManagerFactory();
response.sendRedirect("web/pages/futebol.html");
%>