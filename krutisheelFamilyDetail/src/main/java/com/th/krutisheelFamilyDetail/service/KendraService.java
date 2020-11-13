package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Kendra;

public interface KendraService {

	void save(Kendra k);
	
	List<Kendra> getAllKendrName();
	
	Kendra getById(int id);
	
	void delete(int id);
	
	List<Kendra> serch(String name);
	
}

