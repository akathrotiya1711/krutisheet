package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Education;

public interface EducationService {

	void save(Education k);
	
	List<Education> getAllName();
	
	Education getById(int id);
	
	void delete(int id);
	
}

