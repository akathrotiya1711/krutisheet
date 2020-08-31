package com.th.krutisheelFamilyDetail.dao;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Society;

public interface SocietyDAO {
	
	List<Society> getSocietyList();
	
	Society getSociety(int id);
	
	void saveSociety(Society society);
	
	void deleteSociety(int id);

}
