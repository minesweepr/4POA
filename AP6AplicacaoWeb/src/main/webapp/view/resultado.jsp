<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.Filme" %>
<% Filme filme=(Filme)session.getAttribute("filme"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2><%=filme.getNome() %></h2>
<h4><u><%=filme.getAnoLancamento() %></u> Dirigido por <u><%=filme.getDiretor() %></u>. <%=filme.getDuracao() %>mins.</h4>
<p>Do gênero <i><%=filme.getGenero() %></i>: <%=filme.getSinpose() %></p>
<hr>
<h4>Onde Assistir: <%=String.join(", ", filme.getPlataformas()) %>.</h4>
</body>
</html>