package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.krutisheelFamilyDetail.model.Business;
import com.th.krutisheelFamilyDetail.repository.BusinessRepo;

@Service
@Transactional
public class BusinessImpl implements BusinessService {

	@Autowired
	private BusinessRepo repo;
	
	@Override
	public void save(Business k) {
		repo.save(k);

	}

	@Override
	public List<Business> getAllName() {
		 return repo.findAll();
	}

	@Override
	public Business getById(int id) {
		// TODO Auto-generated method stub
		return  repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);

	}

}
