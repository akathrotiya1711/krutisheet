package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.krutisheelFamilyDetail.dao.SocietyDAO;
import com.th.krutisheelFamilyDetail.model.Society;

@Service
public class SocietyServiceImpl implements SocietyService {

	@Autowired
	private SocietyDAO societyDAO;
	
	@Transactional
	@Override
	public List<Society> getSocietyList() {
		// TODO Auto-generated method stub
	
		return societyDAO.getSocietyList();
	}

	@Transactional
	@Override
	public Society getSociety(int id) {
		// TODO Auto-generated method stub
		return societyDAO.getSociety(id);
	}

	@Transactional
	@Override
	public void saveSociety(Society society) {
		// TODO Auto-generated method stub

	}

	@Transactional
	@Override
	public void deleteSociety(int id) {
		// TODO Auto-generated method stub

	}

}
