package br.com.ligadeesportearmador.model.enums;

import java.io.Serializable;

public enum TipoStatus implements Serializable{
	ATIVO{public String toString() {return "Ativo";}},
	INATIVO{public String toString() {return "Inativo";}},
	AGUARDANDO_CONFIRMACAO{public String toString() {return "Aguardando Confirmação";}},
	CONFIRMADO{public String toString() {return "Contato Confirmado";}},
	ENCERRADO{public String toString() {return "Contato Encerrado";}},
	CANCELADO{public String toString() {return "Contato Cancelado";}},
	REMARCADO{public String toString() {return "Contato Remarcado";}};
}
