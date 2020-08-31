package com.th.krutisheelFamilyDetail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.th.krutisheelFamilyDetail.model.Exam;

public interface ExamRepo extends CrudRepository<Exam, Integer> {
	
	@Query(value = "SELECT * FROM Exam ORDER BY exam_number", nativeQuery = true)
	  List<Exam> findAllByNameOrderd();

}
