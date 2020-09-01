package com.th.krutisheelFamilyDetail.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Prayog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	public Prayog() {
		super();
	}

	public Prayog(int id, String name, List<Person> family) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
	}

	private String name;
	
	public List<Person> getFamily() {
		return family;
	}

	public void setFamily(List<Person> family) {
		this.family = family;
	}

	@OneToMany
	private List<Person> family;

	public int getId() {
		return id;
	}

	public Prayog(String name) {
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

	@Override
	public String toString() {
		return "Society [id=" + id + ", name=" + name + "]";
	}

	
}
