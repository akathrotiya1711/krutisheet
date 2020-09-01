package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.krutisheelFamilyDetail.model.Person;
import com.th.krutisheelFamilyDetail.repository.FamilyRepo;

@Service
@Transactional
public class FamilySerIImpl implements FamilySerI {

	private final FamilyRepo fr;
	
	public FamilySerIImpl(FamilyRepo fr) {
		super();
		this.fr = fr;
	}

	@Override
	public void saveFamily(Person f) {
		fr.save(f);

	}

	@Override
	public List<Person> findFamilyList() {
		// TODO Auto-generated method stub
		return (List<Person>) fr.findAllWithDate();
	}

	@Override
	public Person findFamilyById(int id) {
		// TODO Auto-generated method stub
		return (Person) fr.findById(id).get();
	}

	@Override
	public void deleteFamily(int id) {
		fr.deleteById(id);
	}

}
