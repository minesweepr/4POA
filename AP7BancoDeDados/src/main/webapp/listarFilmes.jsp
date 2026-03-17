<%@ page import="crud.FilmeCRUD" %>
<%@ page import="model.Filme" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Filmes</title>
<link rel="stylesheet" href="./styles.css">
</head>

<body>
<nav>

    <h1><a href="index.jsp">AP7 POAFilmes</a></h1>

    <span id="feitores">
        por Isabela De Oliveira Athayde e Gabriela Da Costa Castro
    </span>

</nav>



<section class="filme-container">
	<h1>Filmes Cadastrados</h1>
	
	<section id="lista-filmes ">
	
		<%
		FilmeCRUD crud = new FilmeCRUD();
		List<Filme> lista = crud.listar();
		
		if(lista.isEmpty()){
		%>
		    <p>Nenhum filme cadastrado</p>
		<%
		}else{
		    for(Filme f : lista){
		%>
		
		<a class="filme-item" href="listarUm.jsp?id=<%=f.getId()%>">
		    <%=f.getNome()%>
		</a>
		
		<%
		    }
		}
		%>
		
	</section>
	
	<a class="btn" href="cadastrarFilmes.jsp">Cadastrar novo</a>
	</section>

</body>
</html>