package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;

public enum TipoQuadraDetalhesQuadra implements Serializable{
	COBERTA{public String toString() {return "Coberta";}},
	DESCOBERTA{public String toString() {return "Descoberta";}};
}