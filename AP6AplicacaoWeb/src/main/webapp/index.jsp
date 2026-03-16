<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POAFilmes</title>
<link rel="stylesheet" href="./styles.css">
</head>
<body>

<nav> 
    <h1> AP6 - POA Filmes </h1> 
    <span id="feitores"> por Isabela De Oliveira Athayde e Gabriela Da Costa Castro</span> 
</nav>   

<form action="CadastraServlet" method="post">
    <h1>Cadastro de Filmes</h1>
    
    <h2>Nome do Filme:</h2>
    <input type="text" name="nome" id="nome">

    <h2>Ano de Lançamento:</h2>
    <input type="text" name="anoLancamento" id="anoLancamento">

    <h2>Duração (minutos):</h2>
    <input type="text" name="duracao" id="duracao">

    <h2>Gênero:</h2>
    <select name="genero" id="genero">
        <option value="acao">Ação</option>
        <option value="comedia">Comédia</option>
        <option value="terror">Terror</option>
        <option value="drama">Drama</option>
        <option value="ficcao">Ficção Científica</option>
    </select>

    <h2>Sinopse do Filme:</h2>
    <textarea id="sinopse" name="sinopse" rows="5" placeholder="Digite a sinopse do filme..."></textarea>

   <h2>Plataforma onde está disponível:</h2>
    <section>
        <input type="checkbox" id="netflix" name="plataformas" value="netflix">
        <label for="netflix">Netflix</label>
        <br>
        <input type="checkbox" id="disney" name="plataformas" value="disney">
        <label for="disney">Disney</label>
        <br>
        <input type="checkbox" id="amazon" name="plataformas" value="amazon">
        <label for="amazon">Prime Video</label>
        <br>
    </section>

    <h2>Diretor:</h2>
    <input type="text" name="diretor" id="diretor">

    <input type="submit" value="Cadastrar Filme">

</form>

</body>
</html>
