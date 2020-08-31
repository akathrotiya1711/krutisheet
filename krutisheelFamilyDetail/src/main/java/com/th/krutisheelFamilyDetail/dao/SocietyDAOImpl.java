package com.th.krutisheelFamilyDetail.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.th.krutisheelFamilyDetail.model.Society;

@Repository
public class SocietyDAOImpl implements SocietyDAO {

	@Autowired
	private EntityManager entityManger;
	
	@Override
	public List<Society> getSocietyList() {
		Session session= entityManger.unwrap(Session.class);
		Query<Society> query = session.createQuery("from Society",Society.class);
		List<Society> list = query.getResultList();
		return list;
	}

	@Override
	public Society getSociety(int id) {
		Session session = entityManger.unwrap(Session.class);
		Society society = session.get(Society.class, id);
		return society;
	}

	@Override
	public void saveSociety(Society society) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSociety(int id) {
		// TODO Auto-generated method stub

	}

}
