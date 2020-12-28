package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.krutisheelFamilyDetail.model.Relation;
import com.th.krutisheelFamilyDetail.model.Vibhag;
import com.th.krutisheelFamilyDetail.repository.RelationRepo;
import com.th.krutisheelFamilyDetail.repository.VibhagRepo;

@Service
@Transactional
public class VibhagServiceImpl implements  VibhagService {

	private final VibhagRepo vibhagRepo;
	
	public VibhagServiceImpl(VibhagRepo vibhag) {
		super();
		this.vibhagRepo = vibhag;
	}

	@Override
	public void saveVibhag(Vibhag vibhag) {
		vibhagRepo.save(vibhag);
		
	}

	@Override
	public List<Vibhag> findAllVibhags() {
		return  vibhagRepo.findAllByNameOrderd();
	}

	@Override
	public void deleteVibhag(int id) {
		vibhagRepo.deleteById(id);
		
	}

	@Override
	public Vibhag getVibhag(int id) {
		return vibhagRepo.findById(id).get();
	}

}
