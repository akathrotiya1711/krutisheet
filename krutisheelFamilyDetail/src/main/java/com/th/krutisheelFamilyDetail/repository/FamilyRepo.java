package com.th.krutisheelFamilyDetail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.th.krutisheelFamilyDetail.model.Person;
import com.th.krutisheelFamilyDetail.model.Relation;

public interface FamilyRepo extends CrudRepository<Person,Integer> {
	
	@Query(value = "SELECT * FROM Family", nativeQuery = true)
	  List<Person> findAllWithDate();
	
}
