package com.th.krutisheelFamilyDetail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.th.krutisheelFamilyDetail.model.Kendra;

public interface KendraRepo extends JpaRepository<Kendra, Integer> {

	@Query(nativeQuery = true,value ="select * from kendra e where e.name LIKE %:name%")
	List<Kendra> serch(String name);
	
}
