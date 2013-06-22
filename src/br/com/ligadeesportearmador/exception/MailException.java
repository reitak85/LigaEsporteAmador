package br.com.ligadeesportearmador.exception;

public class MailException extends Exception {

	private static final long serialVersionUID = -6308948540626228232L;

	private String msg;

	public MailException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}

}
