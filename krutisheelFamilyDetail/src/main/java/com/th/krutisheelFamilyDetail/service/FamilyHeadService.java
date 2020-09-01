package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.FamilyHead;

public interface FamilyHeadService {
	
	void save(FamilyHead f);
	
	List<FamilyHead> findAll();
	
	FamilyHead findById(int id);
	
	boolean delet(int id);
	
	
}
