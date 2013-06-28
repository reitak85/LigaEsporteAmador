package br.com.ligadeesportearmador.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.ligadeesportearmador.util.HibernateUtil;

public class Dao<T> {
	
	private EntityManager entityManager;
	
	public Dao() {
		entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void closeEntityManager() {
		if(entityManager.isOpen())
			entityManager.close();
	}

	public void insert(T obj){
		entityManager.getTransaction().begin();
		entityManager.persist(obj);
		entityManager.getTransaction().commit();
	}
	
	public void update(T obj){
		entityManager.getTransaction().begin();
		entityManager.persist(obj);
		entityManager.getTransaction().commit();
	}
	
	public void delete(T obj){
		entityManager.getTransaction().begin();
		entityManager.remove(obj);
		entityManager.getTransaction().commit();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public T selectByID(Object id, Class clazz){
		T obj = null; 
		if(id instanceof Integer)
			obj = (T) getEntityManager().find(clazz, id);
		return obj;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<T> selectAll(Class clazz){
		List<T> all = getEntityManager().createQuery("from "+clazz.getSimpleName()).getResultList();
		return all;
	}

}
