package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;

public enum TipoPlano implements Serializable{
	MENSAL{public String toString() {return "Mensal";}},
	TRIMESTRAL{public String toString() {return "Trimestral";}},
	ANUAL{public String toString() {return "Anual";}};
}
