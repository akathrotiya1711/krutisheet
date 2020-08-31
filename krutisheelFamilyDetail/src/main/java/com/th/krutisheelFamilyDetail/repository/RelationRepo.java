package com.th.krutisheelFamilyDetail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.th.krutisheelFamilyDetail.model.Relation;

public interface RelationRepo extends CrudRepository<Relation,Integer> {
	
	@Query(value = "SELECT * FROM Relation ORDER BY name", nativeQuery = true)
	  List<Relation> findAllByNameOrderd();

}
