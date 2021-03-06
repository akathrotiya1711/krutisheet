package com.th.krutisheelFamilyDetail.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.th.krutisheelFamilyDetail.utility.Valida;

@Entity
public class Javabadari {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  id;	
	
	private String name;

	@ManyToMany
	private List<PersonXXX> family;

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
		if(name != null  && name !="")
		{
		this.name = Valida.convertName(name);
		}
		else 
		{
		this.name = name;
		}
	}

	public List<PersonXXX> getFamily() {
		return family;
	}

	public void setFamily(List<PersonXXX> family) {
		this.family = family;
	}

	public Javabadari() {
		super();
	}

	public Javabadari(int id, String name, List<PersonXXX> family) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
	}
	
	
}
