package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Person;

public interface FamilySerI {
	
	void saveFamily(Person f);
	
	List<Person> findFamilyList();
	
	Person findFamilyById(int id);
	
	void deleteFamily(int id);

}
