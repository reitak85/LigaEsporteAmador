package br.com.ligadeesportearmador.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ligadeesportearmador.model.comum.Usuario;

@WebServlet("/cadastrarTime")
public class CadastrarTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastrarTimeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getParameter("esporte");
		request.getParameter("categoria");
		request.getParameter("estado");
		request.getParameter("cidade");
		request.getParameter("bairro");
		request.getParameter("nomeTime");
		request.getParameter("corUniforme");
		request.getParameter("emblema");
		request.getParameter("timeCateg");
		//Time object to create TODO
		//request.getSession().setAttribute("timeObj", time);
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioObj");
		
		System.out.println(usuario);
		response.sendRedirect(request.getContextPath()+"/web/pages/cadastrarQuadraCampo.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
