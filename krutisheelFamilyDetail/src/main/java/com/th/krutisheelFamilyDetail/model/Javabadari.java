package com.th.krutisheelFamilyDetail.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Javabadari {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  id;	
	
	private String name;

	@ManyToMany
	private List<Family> family;

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

	public List<Family> getFamily() {
		return family;
	}

	public void setFamily(List<Family> family) {
		this.family = family;
	}

	public Javabadari() {
		super();
	}

	public Javabadari(int id, String name, List<Family> family) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
	}
	
	
}
