package com.th.krutisheelFamilyDetail.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import com.th.krutisheelFamilyDetail.utility.Valida;


@Entity
public class Exam {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private int exam_number;
	
	@OneToMany
	private List<Family> family;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Exam(String name) {
		super();
		this.name = name;
	}

	public Exam() {
		super();
	}

	public Exam(int id, String name, Integer exam_number, List<Family> family) {
		super();
		this.id = id;
		this.name = name;
		this.exam_number = exam_number;
		this.family = family;
	}

	public int getExam_number() {
		return exam_number;
	}

	public void setExam_number(int exam_number) {
		this.exam_number = exam_number;
	}

	public List<Family> getFamily() {
		return family;
	}

	public void setFamily(List<Family> family) {
		this.family = family;
	}

	
	
	

}
