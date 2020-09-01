package com.th.krutisheelFamilyDetail.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.th.krutisheelFamilyDetail.model.EkadashiVrati;
import com.th.krutisheelFamilyDetail.repository.EkadashiVratiRepo;

@Service
@Transactional
public class EkadashiVratiRepoIMPL implements EkadashiVratiService {

	private final EkadashiVratiRepo r;
	
	 
	public EkadashiVratiRepoIMPL(EkadashiVratiRepo r) {
		this.r = r;
	}


	@Override
	public void saveEkadashiVratiRepo(EkadashiVrati eka) {
		r.save(eka);
		
	}


	@Override
	public List<EkadashiVrati> get() {
		// TODO Auto-generated method stub
		return (List<EkadashiVrati>) r.findAll();
	}


	@Override
	public EkadashiVrati get(int id) {
		// TODO Auto-generated method stub
		return r.findById(id).get();
	}


	@Override
	public void delete(int id) {
		r.deleteById(id);
		
	}


	
	
}
