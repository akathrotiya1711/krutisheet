package com.th.krutisheelFamilyDetail.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.krutisheelFamilyDetail.model.Javabadari;
import com.th.krutisheelFamilyDetail.repository.JavabadariRepo;

@Service
@Transactional
public class JavabadariServiceImpl  implements JavabadariService{

	private final JavabadariRepo javabadari_repo;

	
	public JavabadariServiceImpl(JavabadariRepo js) {
		super();
		this.javabadari_repo = js;
	}

	
	@Override
	public void saveJavabadari(Javabadari j) {
		javabadari_repo.save(j);
	}

	@Override
	public List<Javabadari> findAll() {
		
		return (List<Javabadari>) javabadari_repo.findAll();
	}

	@Override
	public void deleteJavabadari(int id) {
		javabadari_repo.deleteById(id);
		
	}

	@Override
	public Javabadari getJavabadari(int id) {
		// TODO Auto-generated method stub
		return javabadari_repo.findById(id).get();
	}


	@Override
	public List<Javabadari> serch(String name) {
		// TODO Auto-generated method stub
		return javabadari_repo.serch(name);
	}
}
