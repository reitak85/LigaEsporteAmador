package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COMPLEMENTO_ENDERECO")
public class ComplementoEndereco extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1879318444678409129L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "COMPLEMENTO_ENDERECO_ID", length = 10)
	private Long id;

	@Column(name = "NUEMRO", length = 30, nullable = false)
	private String numero;

	@Column(name = "COMPLEMENTO", length = 60, nullable = false)
	private String complemento;

	@ManyToOne
	@JoinColumn(name = "ENDERECO_ID", nullable = false)
	private Endereco endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
