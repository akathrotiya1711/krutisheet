package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.th.krutisheelFamilyDetail.model.Person;
import com.th.krutisheelFamilyDetail.repository.PersonRepo;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

	private final PersonRepo person_reo1;
	
	public PersonServiceImpl(PersonRepo repo) {
		super();
		this.person_reo1 = repo;
	}

	@Override
	public void savePerson(Person p) {
		person_reo1.save(p);
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return person_reo1.findAll();
	}

	@Override
	public void deletePersonById(int id) {
		person_reo1.deleteById(id);
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return person_reo1.findById(id).get();
	}

}
