package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.krutisheelFamilyDetail.model.Kshetradhar;
import com.th.krutisheelFamilyDetail.repository.KshetradharlRepo;

@Service
@Transactional
public class KshetradharImpl implements KshtradharService {

	@Autowired
	private KshetradharlRepo repo;
	
	@Override
	public void save(Kshetradhar k) {
		repo.save(k);

	}

	@Override
	public List<Kshetradhar> getAllName() {
		 return repo.findAll();
	}

	@Override
	public Kshetradhar getById(int id) {
		// TODO Auto-generated method stub
		return  repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);

	}

}
