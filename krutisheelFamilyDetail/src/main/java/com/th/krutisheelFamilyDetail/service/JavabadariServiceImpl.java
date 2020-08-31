package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.krutisheelFamilyDetail.model.Javabadari;
import com.th.krutisheelFamilyDetail.repository.JavabadariRepo;

@Service
@Transactional
public class JavabadariServiceImpl  implements JavabadariService{

	private final JavabadariRepo js;

	
	public JavabadariServiceImpl(JavabadariRepo js) {
		super();
		this.js = js;
	}

	
	@Override
	public void saveJavabadari(Javabadari j) {
		js.save(j);
	}

	@Override
	public List<Javabadari> findAll() {
		
		return (List<Javabadari>) js.findAll();
	}

	@Override
	public void deleteJavabadari(int id) {
		js.deleteById(id);
		
	}

	@Override
	public Javabadari getJavabadari(int id) {
		// TODO Auto-generated method stub
		return js.findById(id).get();
	}


	@Override
	public List<Javabadari> serch() {
		// TODO Auto-generated method stub
		return js.serch();
	}
}
