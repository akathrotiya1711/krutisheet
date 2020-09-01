package com.th.krutisheelFamilyDetail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FamilyHead {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String fname;
	
	private String mname;
	
	private String lname;

	@ManyToOne
	private Society society;
	
	public Society getSociety() {
		return society;
	}



	public void setSociety(Society society) {
		this.society = society;
	}



	public FamilyHead(int id, String fname, String mname, String lname, Society society) {
		super();
		this.id = id;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.society = society;
	}



	public FamilyHead() {
		super();
	}



	public FamilyHead(int id, String fname, String mname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getMname() {
		return mname;
	}



	public void setMname(String mname) {
		this.mname = mname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



}
