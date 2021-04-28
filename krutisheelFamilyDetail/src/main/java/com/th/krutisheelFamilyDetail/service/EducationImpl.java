package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.krutisheelFamilyDetail.model.Education;
import com.th.krutisheelFamilyDetail.repository.EducationRepo;

@Service
@Transactional
public class EducationImpl implements EducationService {

	@Autowired
	private EducationRepo repo;
	
	@Override
	public void save(Education k) {
		repo.save(k);

	}

	@Override
	public List<Education> getAllName() {
		 return repo.findAll();
	}

	@Override
	public Education getById(int id) {
		// TODO Auto-generated method stub
		return  repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);

	}

}
