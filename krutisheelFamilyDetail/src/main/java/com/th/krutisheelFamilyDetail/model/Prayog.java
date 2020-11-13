package com.th.krutisheelFamilyDetail.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.th.krutisheelFamilyDetail.utility.Valida;

@Entity
public class Prayog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	public Prayog() {
		super();
	}

	public Prayog(int id, String name, List<PersonXXX> family) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
	}

	private String name;
	
	@OneToMany(mappedBy="prayog")
	private List<Person> person;
	
	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	public List<PersonXXX> getFamily() {
		return family;
	}

	public void setFamily(List<PersonXXX> family) {
		this.family = family;
	}

	@OneToMany
	private List<PersonXXX> family;

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
		if(name != null  && name !="")
		{
		this.name = Valida.convertName(name);
		}
		else 
		{
		this.name = name;
		}
	}

	@Override
	public String toString() {
		return "Society [id=" + id + ", name=" + name + "]";
	}

	
}
