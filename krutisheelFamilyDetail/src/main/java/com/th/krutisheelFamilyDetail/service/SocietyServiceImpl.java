package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.krutisheelFamilyDetail.model.Society;
import com.th.krutisheelFamilyDetail.repository.SocietyRepo;

@Service
public class SocietyServiceImpl implements SocietyService {

	@Autowired
	private SocietyRepo repo;
	
	@Transactional
	@Override
	public List<Society> getSocietyList() {
		// TODO Auto-generated method stub
	
		return repo.findAll();
	}

	@Transactional
	@Override
	public Society getSociety(int id) {
		// TODO Auto-generated method stub
		return repo.getOne(id);
	}

	@Transactional
	@Override
	public void saveSociety(Society society) {
		repo.save(society);

	}

	@Transactional
	@Override
	public void deleteSociety(int id) {
		repo.deleteById(id);
	}

}
