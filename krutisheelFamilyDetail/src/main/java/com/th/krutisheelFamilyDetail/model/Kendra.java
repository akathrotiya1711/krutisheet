package com.th.krutisheelFamilyDetail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.th.krutisheelFamilyDetail.utility.Valida;

@Entity
public class Kendra {
	
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
		if(name.trim() != null  && name.trim() !="")
		{
		this.name = Valida.convertName(name);
		}
		else 
		{
		this.name = name;
		}
	}


	public Kendra() {
		super();
	}

	public Kendra(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
