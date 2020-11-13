package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.th.krutisheelFamilyDetail.model.KaryVibhag;
import com.th.krutisheelFamilyDetail.model.Kendra;
import com.th.krutisheelFamilyDetail.repository.KendraRepo;

@Service
@Transactional
public class KendraImpl implements KendraService {

	@Autowired
	private KendraRepo repo;
	
	@Override
	public List<Kendra> serch(String name) {
		// TODO Auto-generated method stub
		return repo.serch(name);
	}

	@Override
	public void save(Kendra k) {
		repo.save(k);
		
	}

	@Override
	public List<Kendra> getAllKendrName() {
		// TODO Auto-generated method stub
	 return repo.findAll();
	}

	@Override
	public Kendra getById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
			repo.deleteById(id);
	}

}
