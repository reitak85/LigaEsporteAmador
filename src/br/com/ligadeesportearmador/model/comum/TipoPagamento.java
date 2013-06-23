package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;

public enum TipoPagamento implements Serializable{
	BOLETO{public String toString() {return "Boleto";}},
	CARTAO_CREDITO{public String toString() {return "Cart�o de Cr�dito";}},
	CARTAO_DEBITO{public String toString() {return "Cart�o de D�bito";}},
	DEPOSITO_IDENTIFICADO{public String toString() {return "Dep�sito Identificado";}};
}
