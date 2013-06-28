package br.com.ligadeesportearmador.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ligadeesportearmador.model.comum.Usuario;

@WebServlet("/cadastrarUsuario")
public class CadastrarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastrarUsuarioServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getParameter("nome");
		request.getParameter("sobrenome");
		request.getParameter("datanasc");
		request.getParameter("cpf");
		request.getParameter("sexo");
		request.getParameter("email");
		request.getParameter("celular");
		request.getParameter("telRes");
		request.getParameter("telCom");
		request.getParameter("senha");
		request.getParameter("confirSenha");
		request.getParameter("sms");
		request.getParameter("termo");
		Usuario usuario = new Usuario();
		request.getSession().setAttribute("usuarioObj", usuario);
		response.sendRedirect(request.getContextPath()+"/web/pages/cadastrarTime.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
