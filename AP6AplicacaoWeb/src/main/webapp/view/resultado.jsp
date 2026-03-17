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
    <h1><a href="../index.jsp"> AP6 - POA Filmes</a> </h1> 
    <span id="feitores"> por Isabela De Oliveira Athayde e Gabriela Da Costa Castro</span> 
</nav> 

<section class="filme-container">

    <section class="item">
		<h2>Título: </h2><p><%=filme.getNome() %></p>
	</section>
    
    <hr>

    <section class="item">
		<h4>Ano de Lançamento:</h4> <p><%=filme.getAnoLancamento() %></p>
	</section>

    <section class="item">
		<h4>Gênero: </h4> <p><%=filme.getGenero() %></p>
	</section>

    <section class="item">
		<h4>Sinopse:</h4> <p><%=filme.getSinopse() %></p>
	</section>
    
    <section class="item">
		<h4>Tempo de duração: </h4> <p><%=filme.getDuracao() %> mins</p>
	</section>
    
    <section class="item">
		<h4>Dirigido por:</h4> <p> <%=filme.getDiretor() %></p>
	</section>

    <hr>

    <section class="item">
		<h4>Onde Assistir: </h4> <p><%=String.join(", ", filme.getPlataformas()) %>.</p>
	</section>

</section>

</body>
</html>