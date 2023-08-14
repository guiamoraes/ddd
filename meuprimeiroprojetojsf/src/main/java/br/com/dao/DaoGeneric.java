package br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import br.com.jpautil.JPAUtil;

public class DaoGeneric<T> {
	
	public DaoGeneric() {
		
	}
	
	public void salvar(T entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(entidade);
		entityTransaction.commit();
		entityManager.close();
		
	}

}
