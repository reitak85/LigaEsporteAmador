package br.com.ligadeesportearmador.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ligadeesportearmador.model.comum.Usuario;

@WebServlet("/cadastrarQuadraCampo")
public class CadastrarQuadaCampoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastrarQuadaCampoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getParameter("tipo");
		request.getParameter("nomeQuadra");
		request.getParameter("cidade");
		request.getParameter("bairro");
		request.getParameter("endereco");
		request.getParameter("numero");
		request.getParameter("complemento");
		request.getParameter("obs");
		//Quadra object to create TODO
		//request.getSession().setAttribute("quadraObj", quadra);
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioObj");
		System.out.println(usuario);
		response.sendRedirect(request.getContextPath()+"/web/pages/cadastrarQuadraCampo.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
