<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejemplo JSP</title>
</head>
<body>
<h1>Ejemplo JSP</h1>
<%! String crearOL(int v){
	String ol = "<OL>";
	int i = v;
	while (i>0){
		ol+= "<LI>Cuenta atras" + i + "/ 5 </LI>";
		i--;
	}
	return ol + "</OL>";
}
%>
<HR/>
<%
Date d = new Date();
out.println(d.toString());
if(d.getSeconds() % 2 == 0){%>
	<p style ="background.color: red">Prueba otra vez, hasta un segundo impar.</p>
<%}else{%>
	<p style="background-color: blue"></p>
	<%--Para llamar a la funcion de java utilizamos < % = con el igual --%>
	<%= crearOL(d.getSeconds()) %>
<HR/>
<%}%>
</body>
</html>