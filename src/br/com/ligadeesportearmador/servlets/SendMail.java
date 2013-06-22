package br.com.ligadeesportearmador.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import br.com.ligadeesportearmador.exception.MailException;
import br.com.ligadeesportearmador.model.Mail;
import br.com.ligadeesportearmador.service.SendMailService;
import br.com.ligadeesportearmador.service.impl.SendMailServiceImpl;

import com.google.gson.Gson;

/**
 * Servlet implementation class SendEmail
 */
@WebServlet(name="/SendEmail", urlPatterns="/UrlPages/Sendmail")
public class SendMail extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(SendMail.class);
    private SendMailService mailService;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendMail() {
        super();
        mailService = new SendMailServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			
			String json = request.getParameter("json");
			Gson gson = new Gson();
			Mail mail = gson.fromJson(json, Mail.class);
			
			mailService.sendMail(mail);
			
		}catch(MailException e){
			e.printStackTrace();
			logger.error(e);
		}
		
	}

}
