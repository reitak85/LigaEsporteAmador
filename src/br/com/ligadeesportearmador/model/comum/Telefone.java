package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;

public class Telefone extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4728185500297502818L;

	private Long id;
	private Integer codigoPais;
	private Integer ddd;
	private Integer foneCelular;
	private Integer foneResidencial;
	private Integer foneComercial;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(Integer codigoPais) {
		this.codigoPais = codigoPais;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getFoneCelular() {
		return foneCelular;
	}

	public void setFoneCelular(Integer foneCelular) {
		this.foneCelular = foneCelular;
	}

	public Integer getFoneResidencial() {
		return foneResidencial;
	}

	public void setFoneResidencial(Integer foneResidencial) {
		this.foneResidencial = foneResidencial;
	}

	public Integer getFoneComercial() {
		return foneComercial;
	}

	public void setFoneComercial(Integer foneComercial) {
		this.foneComercial = foneComercial;
	}

}
