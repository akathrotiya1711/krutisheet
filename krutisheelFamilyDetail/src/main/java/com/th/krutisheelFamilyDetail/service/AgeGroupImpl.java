package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.krutisheelFamilyDetail.model.AgeGroup;
import com.th.krutisheelFamilyDetail.repository.AgeGroupRepo;

@Service
@Transactional
public class AgeGroupImpl implements AgeGroupService {

	@Autowired
	private AgeGroupRepo repo;
	
	@Override
	public void save(AgeGroup k) {
		repo.save(k);

	}

	@Override
	public List<AgeGroup> getAllName() {
		 return repo.findAll();
	}

	@Override
	public AgeGroup getById(int id) {
		// TODO Auto-generated method stub
		return  repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);

	}

}
