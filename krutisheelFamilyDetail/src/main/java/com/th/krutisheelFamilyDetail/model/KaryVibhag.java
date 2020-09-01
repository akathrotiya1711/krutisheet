package com.th.krutisheelFamilyDetail.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class KaryVibhag {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	@OneToMany
	private List<Person> person;

	
	public KaryVibhag() {
		super();
	}

	public KaryVibhag(int id, String name, List<Person> family) {
		super();
		this.id = id;
		this.name = name;
		this.person = family;
	}

	public List<Person> getFamily() {
		return person;
	}

	public void setFamily(List<Person> family) {
		this.person = family;
	}

	public int getId() {
		return id;
	}

	public KaryVibhag(String name) {
		super();
		this.name = name;
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
	
}
