package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;

public enum TipoArbitro implements Serializable{
	PRINCIPAL{public String toString() {return "Arbitro de Linha";}},
	BANDEIRA{public String toString() {return "Bandeira de Linha";}},
	AUXILIAR{public String toString() {return "Auxiliar";}};
}
