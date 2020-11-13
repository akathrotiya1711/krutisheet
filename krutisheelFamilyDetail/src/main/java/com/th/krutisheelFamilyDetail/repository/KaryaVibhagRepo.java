package com.th.krutisheelFamilyDetail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.th.krutisheelFamilyDetail.model.EkadashiVrati;
import com.th.krutisheelFamilyDetail.model.KaryVibhag;

public interface KaryaVibhagRepo extends JpaRepository<KaryVibhag, Integer> {

	@Query(nativeQuery = true,value ="select * from kary_vibhag k where k.name LIKE %:name%")
	List<KaryVibhag> serch(String name);
	
}
