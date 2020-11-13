package com.th.krutisheelFamilyDetail.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.th.krutisheelFamilyDetail.utility.Valida;

@Entity
public class EkadashiVrati {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@ManyToOne
	private PersonXXX family;
	
	public EkadashiVrati(int id, String name, PersonXXX family) {
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
	
	public EkadashiVrati(int id, String name, PersonXXX family, List<Person> person) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
		this.person = person;
	}

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	@OneToMany(mappedBy="ekadashi")
	private List<Person> person;

	@OneToMany(mappedBy="vrati")
	private List<Person> person1;
	
	public List<Person> getPerson1() {
		return person1;
	}

	public void setPerson1(List<Person> person1) {
		this.person1 = person1;
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

	public PersonXXX getFamily() {
		return family;
	}

	public void setFamily(PersonXXX family) {
		this.family = family;
	}
	

}
