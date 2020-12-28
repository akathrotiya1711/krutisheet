package com.th.krutisheelFamilyDetail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.th.krutisheelFamilyDetail.model.Relation;
import com.th.krutisheelFamilyDetail.model.Vibhag;

public interface VibhagRepo extends CrudRepository<Vibhag,Integer> {
	
	@Query(value = "SELECT * FROM Vibhag ORDER BY name", nativeQuery = true)
	  List<Vibhag> findAllByNameOrderd();
	
		/*
		 * @Query(nativeQuery = true,value
		 * ="select * from Vibha p where p.name LIKE %:name%") List<Relation>
		 * serch(String name);
		 */

}
