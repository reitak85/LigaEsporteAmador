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
@Table(name = "BAIRRO")
public class Bairro extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1843852742889940862L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BAIRRO_ID", length = 10)
	private Long id;

	@Column(name = "NOME", nullable = true, length = 250)
	private String nome;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "CIDADE_ID")
	private Cidade cidade;

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

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

}
