package br.com.ligadeesportearmador.dao;

import br.com.ligadeesportearmador.util.HibernateUtil;

public class Teste {
	
	public static void main(String[] args) {
		HibernateUtil.getEntityManagerFactory();
		System.out.println("ok");
	}

}
