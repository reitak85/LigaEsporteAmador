package br.com.ligadeesportearmador.model.enums;

import java.io.Serializable;

public enum TipoPosicao implements Serializable{
	ALA{public String toString() {return "Ala";}},
	ATACANTANTE{public String toString() {return "Atacante";}},
	GOLEIRO{public String toString() {return "Goleiro";}},
	LATERAL_DIREITO{public String toString() {return "Lateral Direito";}},
	LATERAL_ESQUERDO{public String toString() {return "Lateral Esquerdo";}},
	ARMADOR{public String toString() {return "Armador";}},
	LEVANTADOR{public String toString() {return "Levantador";}},
	LIBERO{public String toString() {return "Líbero";}},
	MEIO{public String toString() {return "Meio";}},
	MEIA{public String toString() {return "Meia";}},
	MEIA_ATACANTE{public String toString() {return "Meia Atacante";}},
	MEIA_DIREITA{public String toString() {return "Meia Direita";}},
	MEIA_ESQUERDA{public String toString() {return "Meia Esquerda";}},
	PONTA{public String toString() {return "Ponta";}},
	PIVO{public String toString() {return "Pivô";}},
	TECNICO{public String toString() {return "Técnico";}},
	VOLANTE{public String toString() {return "Volante";}},
	ZAGUEIRO{public String toString() {return "Zagueiro";}};
}
