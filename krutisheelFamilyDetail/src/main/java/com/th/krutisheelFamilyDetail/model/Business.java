package com.th.krutisheelFamilyDetail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Business {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  id;	
	
	private String name;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Business() {
		super();
	}

	public Business(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
