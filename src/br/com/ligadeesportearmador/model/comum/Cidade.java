package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CIDADE")
public class Cidade extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1903016473128661054L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CIDADE_ID", length = 10)
	private Long id;

	@Column(name = "NOME", length = 250)
	private String nome;

	@Column(name = "uf", length = 2)
	private String uf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
