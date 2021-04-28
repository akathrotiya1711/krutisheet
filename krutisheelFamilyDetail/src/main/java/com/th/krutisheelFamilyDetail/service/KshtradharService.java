package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Kshetradhar;

public interface KshtradharService {

	void save(Kshetradhar k);
	
	List<Kshetradhar> getAllName();
	
	Kshetradhar getById(int id);
	
	void delete(int id);
	
}

