package br.com.ligadeesportearmador.model.enums;

import java.io.Serializable;
import java.util.Date;


public class Base implements Serializable{
	private int id;
	private String titulo;
	private String descricao;
	private Date dtRecord;
	private TipoStatus tipoStatus;
	
}
