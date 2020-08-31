package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Family;

public interface FamilySerI {
	
	void saveFamily(Family f);
	
	List<Family> findFamilyList();
	
	Family findFamilyById(int id);
	
	void deleteFamily(int id);

}
