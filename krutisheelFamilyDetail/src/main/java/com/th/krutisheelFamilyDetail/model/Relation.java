package com.th.krutisheelFamilyDetail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.th.krutisheelFamilyDetail.utility.Valida;


@Entity
public class Relation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;

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

	public Relation(String name) {
		super();
		this.name = name;
	}

	public Relation() {
		super();
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", name=" + name + "]";
	}
	
	

}
