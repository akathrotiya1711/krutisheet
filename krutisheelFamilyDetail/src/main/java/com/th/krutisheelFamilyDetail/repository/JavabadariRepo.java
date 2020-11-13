package com.th.krutisheelFamilyDetail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.th.krutisheelFamilyDetail.model.Javabadari;

public interface JavabadariRepo extends JpaRepository<Javabadari, Integer> {

	@Query(nativeQuery = true,value ="select * from Javabadari j where j.name LIKE %:name%")
	List<Javabadari> serch(String name);
	
}
