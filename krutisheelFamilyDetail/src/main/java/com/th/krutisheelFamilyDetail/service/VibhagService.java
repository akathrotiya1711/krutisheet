package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Relation;
import com.th.krutisheelFamilyDetail.model.Vibhag;

public interface VibhagService {
	
	void saveVibhag(Vibhag vibhag);
	
	List<Vibhag> findAllVibhags();
	
	void deleteVibhag(int id);
	
	Vibhag getVibhag(int id);

}

