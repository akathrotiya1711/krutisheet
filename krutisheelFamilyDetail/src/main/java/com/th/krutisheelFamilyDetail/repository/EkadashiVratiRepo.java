package com.th.krutisheelFamilyDetail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.th.krutisheelFamilyDetail.model.EkadashiVrati;

public interface EkadashiVratiRepo extends CrudRepository<EkadashiVrati, Integer> {
	
	@Query(nativeQuery = true,value ="select * from ekadashi_vrati e where e.name LIKE %:name%")
	List<EkadashiVrati> serch(String name);

}
