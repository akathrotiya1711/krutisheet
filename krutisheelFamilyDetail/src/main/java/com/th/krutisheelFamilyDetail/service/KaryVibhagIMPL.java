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
	private KaryaVibhagRepo kary_vibhag_repo_1;
	
	@Override
	public void save(KaryVibhag k) {
		kary_vibhag_repo_1.save(k);
	}

	@Override
	public List<KaryVibhag> findAll() {
		return kary_vibhag_repo_1.findAll();
	}

	@Override
	public KaryVibhag findById(int id) {
		// TODO Auto-generated method stub
		return kary_vibhag_repo_1.findById(id).get();
	}

	@Override
	public boolean delete(int id) {
		if(kary_vibhag_repo_1.existsById(id))
		{
			kary_vibhag_repo_1.deleteById(id);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<KaryVibhag> serch(String name) {
		// TODO Auto-generated method stub
		return kary_vibhag_repo_1.serch(name);
	}

}
