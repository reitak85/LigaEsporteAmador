package br.com.ligadeesportearmador.model.enums;

import java.io.Serializable;

public enum TipoEndereco implements Serializable{
	RESIDENCIAL{public String toString() {return "Residencial";}},
	COMERCIAL{public String toString() {return "Comercial";}};
}
