<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.Filme" %>
<% Filme filme=(Filme)session.getAttribute("filme"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POAFilmes</title>
<link rel="stylesheet" href="../styles.css">
</head>
<body>

<nav> 
    <h1> AP6 - POA Filmes </h1> 
    <span id="feitores"> por Isabela De Oliveira Athayde e Gabriela Da Costa Castro</span> 
</nav> 

<section class="filme-container">

    <h2>Título: <%=filme.getNome() %></h2>

    <h4>Ano de Lançamento: <u><%=filme.getAnoLancamento() %></u></h4>

    <h4>Dirigido por: <u><%=filme.getDiretor() %></u></h4>

    <h4>Tempo de duração: <%=filme.getDuracao() %> mins</h4>

    <h4>Gênero: <%=filme.getGenero() %></h4>

    <h4>Sinopse: <%=filme.getSinpose() %></h4>

    <hr>

    <h4>Onde Assistir: <%=String.join(", ", filme.getPlataformas()) %>.</h4>

</section>

</body>
</html>