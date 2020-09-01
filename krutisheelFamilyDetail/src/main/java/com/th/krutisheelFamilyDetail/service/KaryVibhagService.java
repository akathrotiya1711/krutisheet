package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.KaryVibhag;

public interface KaryVibhagService {
	
	void save(KaryVibhag k);
	
	List<KaryVibhag> findAll();
	
	KaryVibhag findById(int id);
	
	void delete(int id);

}
