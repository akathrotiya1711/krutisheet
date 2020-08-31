package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Exam;

public interface ExamService {
	
	void saveExam(Exam exam);
	
	List<Exam> findAllExam();
	
	void deleteExaam(int id);
	
	Exam getExam(int id);
}
