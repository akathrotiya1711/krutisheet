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

	private final EkadashiVratiRepo ekadashi_vrati_repo;
	
	 
	public EkadashiVratiRepoIMPL(EkadashiVratiRepo r) {
		this.ekadashi_vrati_repo = r;
	}


	@Override
	public void saveEkadashiVratiRepo(EkadashiVrati eka) {
		ekadashi_vrati_repo.save(eka);
		
	}


	@Override
	public List<EkadashiVrati> get() {
		// TODO Auto-generated method stub
		return (List<EkadashiVrati>) ekadashi_vrati_repo.findAll();
	}


	@Override
	public EkadashiVrati get(int id) {
		// TODO Auto-generated method stub
		return ekadashi_vrati_repo.findById(id).get();
	}


	@Override
	public void delete(int id) {
		ekadashi_vrati_repo.deleteById(id);
		
	}


	@Override
	public List<EkadashiVrati> serch(String name) {
		// TODO Auto-generated method stub
		return (List<EkadashiVrati>) ekadashi_vrati_repo.serch(name);
	}


	
	
}
