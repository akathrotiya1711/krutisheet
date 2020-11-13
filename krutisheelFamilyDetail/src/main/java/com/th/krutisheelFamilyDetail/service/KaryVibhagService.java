package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.KaryVibhag;

public interface KaryVibhagService {
	
	void save(KaryVibhag k);
	
	List<KaryVibhag> findAll();
	
	List<KaryVibhag> serch(String name);
	
	KaryVibhag findById(int id);
	
	boolean delete(int id);

}
