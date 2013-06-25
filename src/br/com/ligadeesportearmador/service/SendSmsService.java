package br.com.ligadeesportearmador.service;

import br.com.ligadeesportearmador.model.comum.Sms;

public interface SendSmsService {
	
	public void sendSms(Sms sms) throws Exception;

}
