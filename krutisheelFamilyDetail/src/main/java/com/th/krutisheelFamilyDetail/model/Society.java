package com.th.krutisheelFamilyDetail.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.th.krutisheelFamilyDetail.utility.Valida;

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

	@OneToMany(mappedBy="society")
	private List<Person> person;
	
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

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	public Society(int id, String name, List<FamilyHead> family, List<Person> person) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
		this.person = person;
	}

	
}
