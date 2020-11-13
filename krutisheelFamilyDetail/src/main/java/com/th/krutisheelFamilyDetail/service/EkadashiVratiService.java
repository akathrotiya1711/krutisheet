package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.EkadashiVrati;

public interface EkadashiVratiService {

	void saveEkadashiVratiRepo(EkadashiVrati e);
	
	List<EkadashiVrati> get();
	
	EkadashiVrati get(int id);
	
	void delete(int id);
	
	List<EkadashiVrati> serch(String name);
	
}
