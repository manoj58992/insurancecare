package com.insurancecare.repositories;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.insurancecare.entities.InsuranceCareEntities;

public class InsuranceCareRepository {

	private SessionFactory sessionFactory;

	public void save(InsuranceCareEntities insurance) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(insurance);
		session.getTransaction().commit();
		session.close();

	}

	public InsuranceCareEntities getById(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		InsuranceCareEntities i = (InsuranceCareEntities) session.get(InsuranceCareEntities.class, id);
		session.getTransaction().commit();
		session.close();
		return i;
	}

	public List<InsuranceCareEntities> getByType(String type) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query query = session.createQuery("select i from InsuranceCareEntities i where i.type =:type");
		query.setParameter("type", type);

		List<InsuranceCareEntities> insurance = query.list();

		session.getTransaction().commit();
		session.close();
		return insurance;

	}

	public void update(InsuranceCareEntities insurance) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.merge(insurance);
		session.getTransaction().commit();
		session.close();

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
