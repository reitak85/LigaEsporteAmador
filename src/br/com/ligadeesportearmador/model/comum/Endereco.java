package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ENDERECO")
public class Endereco extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6603473920408407836L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ENDERECO_ID", length = 10)
	private Long id;

	@Column(name = "CEP", length = 10)
	private Integer cep;

	@Column(name = "NOME", length = 250)
	private String nome;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "CIDADE_ID")
	private Cidade cidade;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "BAIRRO_ID")
	private Bairro bairro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

}
