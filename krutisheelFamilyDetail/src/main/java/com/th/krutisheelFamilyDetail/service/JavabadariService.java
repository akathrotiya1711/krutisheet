package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Javabadari;

public interface JavabadariService {
	
	void saveJavabadari(Javabadari j);
	
	List<Javabadari> findAll();
	
	List<Javabadari> serch();
	
	void deleteJavabadari(int id);
	
	Javabadari getJavabadari(int id);

}
