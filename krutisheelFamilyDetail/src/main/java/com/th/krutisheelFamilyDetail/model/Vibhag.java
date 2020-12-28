package com.th.krutisheelFamilyDetail.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.th.krutisheelFamilyDetail.utility.Valida;


@Entity
public class Vibhag {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy="vibhag")
	private List<Society> society;

	public Vibhag(int id, String name, List<Society> society) {
		super();
		this.id = id;
		this.name = name;
		this.society = society;
	}

	public List<Society> getSociety() {
		return society;
	}

	public void setSociety(List<Society> society) {
		this.society = society;
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
		if(name != null  && name !="")
		{
		this.name = Valida.convertName(name);
		}
		else 
		{
		this.name = name;
		}
	}

	public Vibhag(String name) {
		super();
		this.name = name;
	}

	public Vibhag() {
		super();
	}

	@Override
	public String toString() {
		return "Vibhag [id=" + id + ", name=" + name + "]";
	}
	
	

}
