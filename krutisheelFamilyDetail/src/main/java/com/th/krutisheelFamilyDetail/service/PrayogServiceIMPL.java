package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.th.krutisheelFamilyDetail.model.Prayog;
import com.th.krutisheelFamilyDetail.repository.PrayogRepo;

@Service
@Transactional
public class PrayogServiceIMPL implements PrayogService {

	@Autowired
	private PrayogRepo repo;
	
	@Override
	public void save(Prayog p) {
		repo.save(p);
	}

	@Override
	public List<Prayog> getPrayog() {
		// TODO Auto-generated method stub
		return (List<Prayog>) repo.findAll();
	}

	@Override
	public Prayog getPrayog(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
	repo.deleteById(id);
	}

	@Override
	public List<Prayog> serch(String name) {
		// TODO Auto-generated method stub
		return (List<Prayog>) repo.serch(name);
	}

}
