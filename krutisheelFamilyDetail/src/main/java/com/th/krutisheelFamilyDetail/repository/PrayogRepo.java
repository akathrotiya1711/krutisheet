package com.th.krutisheelFamilyDetail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.th.krutisheelFamilyDetail.model.KaryVibhag;
import com.th.krutisheelFamilyDetail.model.Prayog;

public interface PrayogRepo extends JpaRepository<Prayog, Integer> {
	
	@Query(nativeQuery = true,value ="select * from prayog p where p.name LIKE %:name%")
	List<Prayog> serch(String name);
}
