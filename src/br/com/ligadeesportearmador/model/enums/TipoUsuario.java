package br.com.ligadeesportearmador.model.enums;

import java.io.Serializable;

public enum TipoUsuario implements Serializable{
	TIME{public String toString() {return "Time";}},
	JOGADOR{public String toString() {return "Jogador";}},
	QUADRA{public String toString() {return "QUadra";}},
	CONTATO_COMERCIAL{public String toString() {return "Contato Comercial";}},
	SISTEMA{public String toString() {return "Sistema";}};
}
