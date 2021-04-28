package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Business;

public interface BusinessService {

	void save(Business k);
	
	List<Business> getAllName();
	
	Business getById(int id);
	
	void delete(int id);
	
}

