package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.krutisheelFamilyDetail.model.Family;
import com.th.krutisheelFamilyDetail.repository.FamilyRepo;

@Service
@Transactional
public class FamilySerIImpl implements FamilySerI {

	private final FamilyRepo fr;
	
	public FamilySerIImpl(FamilyRepo fr) {
		super();
		this.fr = fr;
	}

	@Override
	public void saveFamily(Family f) {
		fr.save(f);

	}

	@Override
	public List<Family> findFamilyList() {
		// TODO Auto-generated method stub
		return (List<Family>) fr.findAllWithDate();
	}

	@Override
	public Family findFamilyById(int id) {
		// TODO Auto-generated method stub
		return (Family) fr.findById(id).get();
	}

	@Override
	public void deleteFamily(int id) {
		fr.deleteById(id);
	}

}
