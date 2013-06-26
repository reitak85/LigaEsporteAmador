package br.com.ligadeesportearmador.model.enums;

import java.io.Serializable;

public enum TipoQuadra implements Serializable{
	QUADRA{public String toString() {return "Quadra";}},
	CAMPO{public String toString() {return "Campo";}},
	SOCIETY{public String toString() {return "Society";}};
}
