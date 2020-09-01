package com.th.krutisheelFamilyDetail.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Society {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	public Society() {
		super();
	}

	public Society(int id, String name, List<FamilyHead> family) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
	}

	private String name;
	

	public List<FamilyHead> getFamily() {
		return family;
	}

	public void setFamily(List<FamilyHead> family) {
		this.family = family;
	}

	@OneToMany(mappedBy="society")
	private List<FamilyHead> family;

	
	public int getId() {
		return id;
	}

	public Society(String name) {
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
