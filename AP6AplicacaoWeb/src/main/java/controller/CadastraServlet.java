package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import model.Filme;

@WebServlet("/CadastraServlet")
public class CadastraServlet extends HttpServlet {
	private static final long serialVersionUID=1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String nome=request.getParameter("nome");
		int anoLancamento=Integer.parseInt(request.getParameter("anoLancamento"));
		int duracao=Integer.parseInt(request.getParameter("duracao"));
		String genero=request.getParameter("genero");
		String sinopse=request.getParameter("sinopse");
		String[] plataformas=request.getParameterValues("plataformas");
		String diretor=request.getParameter("diretor");
		
		Filme filme=new Filme(nome, anoLancamento, duracao, genero, sinopse, plataformas, diretor);
		
		HttpSession session=request.getSession();
		session.setAttribute("filme", filme);
		response.sendRedirect("view/resultado.jsp");
	}

}