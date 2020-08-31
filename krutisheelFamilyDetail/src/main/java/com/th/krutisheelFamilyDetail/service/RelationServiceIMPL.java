package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.krutisheelFamilyDetail.model.Relation;
import com.th.krutisheelFamilyDetail.repository.RelationRepo;

@Service
@Transactional
public class RelationServiceIMPL implements  RelationService {

	private final RelationRepo relationRepo;
	
	public RelationServiceIMPL(RelationRepo relation) {
		super();
		this.relationRepo = relation;
	}

	@Override
	public void saveRelation(Relation exam) {
		relationRepo.save(exam);
	}

	@Override
	public List<Relation> findAllRelations() {
		
		return  relationRepo.findAllByNameOrderd();
	}

	@Override
	public void deleteRelation(int id) {
		relationRepo.deleteById(id);
		
	}

	@Override
	public Relation getRelation(int id) {
		// TODO Auto-generated method stub
		return relationRepo.findById(id).get();
	}

}
