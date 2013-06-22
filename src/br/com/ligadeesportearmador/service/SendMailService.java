package br.com.ligadeesportearmador.service;

import br.com.ligadeesportearmador.exception.MailException;
import br.com.ligadeesportearmador.model.Mail;

public interface SendMailService {
	
	public void sendMail(Mail mail) throws MailException;

}
