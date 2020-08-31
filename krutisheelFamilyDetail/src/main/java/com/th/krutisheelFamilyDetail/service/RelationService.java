package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Relation;

public interface RelationService {
	
	void saveRelation(Relation Relation);
	
	List<Relation> findAllRelations();
	
	void deleteRelation(int id);
	
	Relation getRelation(int id);
}

