package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Person;

public interface PersonService {
	
	
	void savePerson(Person p);
	
	List<Person> findAll();
	
	void deletePersonById(int id);
	
	Person getPersonById(int id);

}
