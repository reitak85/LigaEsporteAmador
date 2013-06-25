package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 651247359228055358L;
	
	private Calendar dataDeCriacao;
	private Calendar dataDeAtualizacao;
	private String usuarioCriador;
	private String usuarioAtualizador;

	public Calendar getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(Calendar dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	public Calendar getDataDeAtualizacao() {
		return dataDeAtualizacao;
	}

	public void setDataDeAtualizacao(Calendar dataDeAtualizacao) {
		this.dataDeAtualizacao = dataDeAtualizacao;
	}

	public String getUsuarioCriador() {
		return usuarioCriador;
	}

	public void setUsuarioCriador(String usuarioCriador) {
		this.usuarioCriador = usuarioCriador;
	}

	public String getUsuarioAtualizador() {
		return usuarioAtualizador;
	}

	public void setUsuarioAtualizador(String usuarioAtualizador) {
		this.usuarioAtualizador = usuarioAtualizador;
	}

}
