package com.th.krutisheelFamilyDetail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.th.krutisheelFamilyDetail.model.Society;

public interface SocietyRepo extends JpaRepository<Society,Integer> {

	@Query(nativeQuery = true,value ="select * from Society p where p.name LIKE %:name%")
	List<Society> serch(String name);
}
