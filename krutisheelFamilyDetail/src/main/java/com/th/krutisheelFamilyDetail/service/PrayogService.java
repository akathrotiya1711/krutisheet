package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import com.th.krutisheelFamilyDetail.model.Prayog;

public interface PrayogService {
	
	void save(Prayog p);
	
	List<Prayog> getPrayog();
	
	Prayog getPrayog(int id);
	
	void delete(int id);

}
