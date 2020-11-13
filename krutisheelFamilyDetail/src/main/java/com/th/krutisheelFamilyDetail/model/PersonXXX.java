package com.th.krutisheelFamilyDetail.model;





import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class PersonXXX {

	public PersonXXX(int id, String name, Exam e, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.exam = e;
		this.dateOfBirth = dateOfBirth;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String name;
	
	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public PersonXXX(int id, String name, Date d, Exam exam, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.d = d;
		this.exam = exam;
		this.dateOfBirth = dateOfBirth;
	}

	private Date d;
	
	@ManyToOne
	private Exam exam;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	

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
		this.name = name;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam e) {
		this.exam = e;
	}

	public Date getDateOfBirth() {
		
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public PersonXXX() {
		super();
	}
	
	
}
