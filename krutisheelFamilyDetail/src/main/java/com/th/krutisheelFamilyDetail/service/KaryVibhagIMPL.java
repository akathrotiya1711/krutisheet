package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.th.krutisheelFamilyDetail.model.KaryVibhag;
import com.th.krutisheelFamilyDetail.repository.KaryaVibhagRepo;

@Service
@Transactional
public class KaryVibhagIMPL implements KaryVibhagService {

	@Autowired
	private KaryaVibhagRepo repo;
	
	@Override
	public void save(KaryVibhag k) {
		repo.save(k);
	}

	@Override
	public List<KaryVibhag> findAll() {
		return repo.findAll();
	}

	@Override
	public KaryVibhag findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

}
