package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;

public enum TipoTime implements Serializable{
	MANDANTE{public String toString() {return "Mandante";}},
	VISITANTE{public String toString() {return "Visitante";}},
	MANDANTE_VISITANTE{public String toString() {return "Mandante e Visitante";}};
}
