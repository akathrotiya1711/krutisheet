package com.th.krutisheelFamilyDetail.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EkadashiVrati {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@ManyToOne
	private Person family;
	
	public EkadashiVrati(int id, String name, Person family) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
	}

	public EkadashiVrati() {
		super();
	}

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

	public Person getFamily() {
		return family;
	}

	public void setFamily(Person family) {
		this.family = family;
	}
	

}
