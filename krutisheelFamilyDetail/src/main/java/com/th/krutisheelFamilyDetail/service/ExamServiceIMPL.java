package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.krutisheelFamilyDetail.model.Exam;
import com.th.krutisheelFamilyDetail.repository.ExamRepo;

@Service
@Transactional
public class ExamServiceIMPL implements ExamService {

	private final ExamRepo examRepo;
	
	public ExamServiceIMPL(ExamRepo examRepo) {
		super();
		this.examRepo = examRepo;
	}

	@Override
	public void saveExam(Exam exam) {
		examRepo.save(exam);
	}

	@Override
	public List<Exam> findAllExam() {
		
		return  examRepo.findAllByNameOrderd();
	}

	@Override
	public void deleteExaam(int id) {
		examRepo.deleteById(id);
		
	}

	@Override
	public Exam getExam(int id) {
		// TODO Auto-generated method stub
		return examRepo.findById(id).get();
	}

}
