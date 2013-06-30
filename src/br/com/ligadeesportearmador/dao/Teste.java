package br.com.ligadeesportearmador.dao;

import br.com.ligadeesportearmador.model.comum.Bairro;
import br.com.ligadeesportearmador.util.HibernateUtil;

public class Teste {
	
	public static void main(String[] args) {
		HibernateUtil.getEntityManagerFactory();
		Dao<Bairro> dao = new Dao<Bairro>();
		System.out.println(dao.selectAll(Bairro.class));
		System.out.println("ok");
	}

}
