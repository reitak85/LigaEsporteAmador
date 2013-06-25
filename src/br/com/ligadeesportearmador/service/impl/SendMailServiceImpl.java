package br.com.ligadeesportearmador.service.impl;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import br.com.ligadeesportearmador.exception.MailException;
import br.com.ligadeesportearmador.model.comum.Mail;
import br.com.ligadeesportearmador.service.SendMailService;
import br.com.ligadeesportearmador.util.PropertiesLoader;
import br.com.ligadeesportearmador.util.SimpleAuth;

public class SendMailServiceImpl implements SendMailService{

	@Override
	public void sendMail(Mail mail) throws MailException{

		Properties props = new Properties();  
		final PropertiesLoader propsLoader = new PropertiesLoader("CofingMail.properties");
		props.put("mail.transport.protocol", propsLoader.getContent("mail.transport.protocol"));  
		props.put("mail.smtp.starttls.enable",propsLoader.getContent("mail.smtp.starttls.enable"));  
		props.put("mail.smtp.ssl.enable", propsLoader.getContent("mail.smtp.ssl.enable"));
		props.put("mail.smtp.host", propsLoader.getContent("mail.smtp.host"));   
		props.put("mail.smtp.auth", propsLoader.getContent("mail.smtp.auth"));  
		props.put("mail.smtp.user", propsLoader.getContent("mail.user"));  
		props.put("mail.debug", propsLoader.getContent("mail.debug"));  
		props.put("mail.smtp.port", propsLoader.getContent("mail.smtp.port"));   

		SimpleAuth auth = null;  
		auth = new SimpleAuth (propsLoader.getContent("mail.user"),propsLoader.getContent("mail.pwd"));  

		Session mailSession = Session.getDefaultInstance(props, auth);  
		mailSession.setDebug(true);  

		Transport transport;
		
		try {
			transport = mailSession.getTransport();

			MimeMessage message = new MimeMessage(mailSession);  
			message.setSubject("Confimarção de Pagamento - Liga de Esporte Amador");  
			message.setRecipient(Message.RecipientType.TO, new InternetAddress("luizsouzatwo@gmail.com"));  
			message.setFrom(new InternetAddress("contato@ligaesporteamador.com.br")); 

			MimeMultipart multipart = new MimeMultipart("related");  

			BodyPart messageBodyPart = new MimeBodyPart();  
			StringBuffer html = new StringBuffer();
			html.append("<html><body><div>");	
			html.append("	<img src=\"cid:image\">");
			html.append("</div>");
			html.append("<div style=\"font-size:13px; font-family:verdana; margin-left: 21px; \">");
			html.append("	Contato Liga de Esporte Amador<br/>");
			html.append("	+55 11 95358-5795<br/>");
			html.append("	contato@ligaesporteamador.com.br<br/>");
			html.append("	<a href=\"www.ligaesporteamador.com.br\">www.ligaesporteamador.com.br</a><br/>");
			html.append("	Rua Conselheiro Moreira de Barros - N&#250;mero 700, Conj. 21<br/>");
			html.append("	Sanatana - S&#227;o Paulo - SP<br/>");
			html.append("</div></body></html>");
			messageBodyPart.setContent(html.toString(), "text/html");  

			multipart.addBodyPart(messageBodyPart);  

			messageBodyPart = new MimeBodyPart();  
			DataSource fds = new FileDataSource("C:\\img\\logoEmail.png");  
			messageBodyPart.setDataHandler(new DataHandler(fds));  
			messageBodyPart.setHeader("Content-ID","<image>");  

			multipart.addBodyPart(messageBodyPart);  

			message.setContent(multipart);  

			transport.connect();  
			transport.sendMessage(message,	message.getRecipients(Message.RecipientType.TO));  
			transport.close();  
			
		} catch (NoSuchProviderException e) {
			throw new MailException(e.getMessage());
		} catch (MessagingException e) {
			throw new MailException(e.getMessage());
		}  
	}  

}