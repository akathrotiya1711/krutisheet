package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Society;

public interface SocietyService {
	
List<Society> getSocietyList();
	
	Society getSociety(int id);
	
	void saveSociety(Society society);
	
	void deleteSociety(int id);
	
	List<Society> serch(String name);


}
