package br.com.ligadeesportearmador.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import br.com.ligadeesportearmador.exception.SmsException;
import br.com.ligadeesportearmador.model.comum.Sms;
import br.com.ligadeesportearmador.model.comum.Telefone;
import br.com.ligadeesportearmador.service.SendSmsService;
import br.com.ligadeesportearmador.util.PropertiesLoader;

public class SendSmsServiceImpl implements SendSmsService{

	@Override
	public void sendSms(Sms sms) throws Exception {

		try{
			final PropertiesLoader propsLoader = new PropertiesLoader("ConfigSms.properties");

			for (Telefone telefone : sms.getTelefones()) {

				StringBuffer urlParameters = new StringBuffer();

				urlParameters.append("user="+propsLoader.getContent("user"));
				urlParameters.append("&password="+propsLoader.getContent("password"));

				if(telefone.getCodigoPais() == 55){
					urlParameters.append("&destinatario="+telefone.getDdd()+telefone.getFoneCelular());
				}else{
				}

				urlParameters.append("&msg="+URLEncoder.encode(sms.getMsg(),"UTF-8"));

				URL url = new URL("http://www.facilitamovel.com/api/simpleSend.ft?");

				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setDoOutput(true);
				connection.setDoInput(true);
				connection.setInstanceFollowRedirects(false);
				connection.setRequestMethod("POST");
				connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
				connection.setRequestProperty("charset", "utf-8");
				connection.setRequestProperty("Content-Length","" + Integer.toString(urlParameters.toString().getBytes().length));
				connection.setUseCaches(false);

				OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
				wr.write(urlParameters.toString());
				wr.flush();

				BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				StringBuffer strRet = new StringBuffer();
				String line;

				while ((line = rd.readLine()) != null) {
					strRet.append(line);
				}

				wr.close();
				rd.close();
			}
			
		}catch(Exception e){
			throw new SmsException(e.getMessage());
		}

	}

}
