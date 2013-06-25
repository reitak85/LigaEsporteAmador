package br.com.ligadeesportearmador.model.comum;

import java.util.List;

public class Sms {

	private List<Telefone> telefones;
	private String msg;

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
