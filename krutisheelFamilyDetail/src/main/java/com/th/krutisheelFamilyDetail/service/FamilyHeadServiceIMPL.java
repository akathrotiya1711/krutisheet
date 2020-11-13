package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.th.krutisheelFamilyDetail.model.FamilyHead;
import com.th.krutisheelFamilyDetail.repository.FamilyHeadRepo;

@Service
@Transactional
public class FamilyHeadServiceIMPL  implements FamilyHeadService{

	@Autowired
	private FamilyHeadRepo repo_familyHead;
	
	@Override
	public void save(FamilyHead f) {
		repo_familyHead.save(f);
	}

	@Override
	public List<FamilyHead> findAll() {
		// TODO Auto-generated method stub
		return repo_familyHead.findAll();
	}

	@Override
	public FamilyHead findById(int id) {
		// TODO Auto-generated method stub
		return repo_familyHead.findById(id).get();
	}

	@Override
	public boolean delet(int id) {

		if(repo_familyHead.existsById(id)) {
			repo_familyHead.deleteById(id);
			return true;
		}
		
		return false;
	}

}
