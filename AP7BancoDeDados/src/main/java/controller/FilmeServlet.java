package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import model.Filme;
import crud.FilmeCRUD;

@WebServlet("/FilmeServlet")
public class FilmeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        int ano = Integer.parseInt(request.getParameter("anoLancamento"));
        int duracao = Integer.parseInt(request.getParameter("duracao"));
        String genero = request.getParameter("genero");
        String sinopse = request.getParameter("sinopse");

        String[] plataformasArray = request.getParameterValues("plataformas");
        String plataformas = "";
        if (plataformasArray != null) {
            plataformas = String.join(", ", plataformasArray);
        }

        String diretor = request.getParameter("diretor");

        Filme f = new Filme(nome, ano, duracao, genero, sinopse, plataformas, diretor);

        FilmeCRUD crud = new FilmeCRUD();
        crud.inserir(f);

        response.sendRedirect("index.html");
    }
}