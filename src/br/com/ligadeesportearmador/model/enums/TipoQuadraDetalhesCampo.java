package br.com.ligadeesportearmador.model.enums;

import java.io.Serializable;

public enum TipoQuadraDetalhesCampo implements Serializable{
	GRAMA_NATURAL{public String toString() {return "Grama Natural";}},
	AREIA{public String toString() {return "Areia";}},
	SINTETICO{public String toString() {return "Sintético";}};
}
