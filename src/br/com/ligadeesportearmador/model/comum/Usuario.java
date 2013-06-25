package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;
import java.util.List;

public class Usuario extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 638836844689134322L;
	
	private Long id;
	private String login;
	private String primeiroNome;
	private String ulitmoNome;
	private String email;
	private String senha;
	private ComplementoEndereco complementoEndereco;
	private List<Role> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUlitmoNome() {
		return ulitmoNome;
	}

	public void setUlitmoNome(String ulitmoNome) {
		this.ulitmoNome = ulitmoNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ComplementoEndereco getComplementoEndereco() {
		return complementoEndereco;
	}

	public void setComplementoEndereco(ComplementoEndereco complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
