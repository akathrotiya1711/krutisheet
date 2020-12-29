package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.AgeGroup;

public interface AgeGroupService {

	void save(AgeGroup k);
	
	List<AgeGroup> getAllName();
	
	AgeGroup getById(int id);
	
	void delete(int id);
	
}

