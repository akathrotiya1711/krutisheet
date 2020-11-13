package com.th.krutisheelFamilyDetail.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.th.krutisheelFamilyDetail.utility.Valida;

@Entity
public class KaryVibhag {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	@OneToMany
	private List<PersonXXX> person1;
	
	public KaryVibhag() {
		super();
	}

	public KaryVibhag(int id, String name, List<PersonXXX> person1) {
		super();
		this.id = id;
		this.name = name;
		this.person1 = person1;
	}

	public List<PersonXXX> getPerson1() {
		return person1;
	}

	public void setPerson1(List<PersonXXX> person1) {
		this.person1 = person1;
	}


	public List<PersonXXX> getFamily() {
		return person1;
	}

	public void setFamily(List<PersonXXX> family) {
		this.person1 = family;
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
		if(name != null  && name !="")
		{
		this.name = Valida.convertName(name);
		}
		else 
		{
		this.name = name;
		}
	}
	
}
