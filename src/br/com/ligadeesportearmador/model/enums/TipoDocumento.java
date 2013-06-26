package br.com.ligadeesportearmador.model.enums;

import java.io.Serializable;

public enum TipoDocumento implements Serializable{
	CARTEIRA_DE_TRABALHO{public String toString() {return "Carteira de Trabalho";}},
	RG{public String toString() {return "RG";}},
	CPF{public String toString() {return "CPF";}},
	CNPJ{public String toString() {return "CNPJ";}},
	TITULO_ELEITORAL{public String toString() {return "Títular Eleitoral";}},
	DOCUMENTO_DE_ESTRANGEIRO{public String toString() {return "Documento de Estrangeiro";}},
	REGISTRO_PROFISSIONAL{public String toString() {return "Registro Profissional";}};
}
