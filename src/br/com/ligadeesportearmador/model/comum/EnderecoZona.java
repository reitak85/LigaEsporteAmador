package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;

public enum EnderecoZona implements Serializable{
	LESTE{public String toString() {return "Leste";}},
	OESTE{public String toString() {return "Oeste";}},
	NORTE{public String toString() {return "Norte";}},
	SUL{public String toString() {return "Sul";}},
	CENTRO{public String toString() {return "Centro";}};
}
