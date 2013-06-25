package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;
import java.util.List;

public class Role extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2324876683296481655L;
	
	private String roledesc;
	private String rolename;
	private List<Usuario> usuarios;

	public String getRoledesc() {
		return roledesc;
	}

	public void setRoledesc(String roledesc) {
		this.roledesc = roledesc;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
