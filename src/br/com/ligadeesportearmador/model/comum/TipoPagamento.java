package br.com.ligadeesportearmador.model.comum;

import java.io.Serializable;

public enum TipoPagamento implements Serializable{
	BOLETO{public String toString() {return "Boleto";}},
	CARTAO_CREDITO{public String toString() {return "Cartão de Crédito";}},
	CARTAO_DEBITO{public String toString() {return "Cartão de Débito";}},
	DEPOSITO_IDENTIFICADO{public String toString() {return "Depósito Identificado";}};
}
