package com.th.krutisheelFamilyDetail.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String form_person_first_name;
	
	private String form_person_middle_name;
	
	private String form_person_last_name;
	
	private String form_person_full_name;
	
	private String first_name;
	
	private String middle_name;
	
	private String full_name;
	
	private String relation;
	
	private String gender;
	
	private String education;
	
    private String kshetradhar_name;
	
	private String business;	
	
	private String business_time;
	private String res_no;
	
	@ManyToOne
	private Society society ;
	
	private int form_number;
	
	private int resident_vibhag;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
    private int contect_number;
	
	private int contect_number_2;
	
	private String form_person_note;
	
	private String note;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateOfMarriage;


	
	
	
	//Karya Detail Variable
	
	private String karya_active;
	
	private int since_karya;
	
	@ManyToOne
	private Javabadari karya_javabadari;
	
	private String bhavapheri;
	
	@ManyToOne
	private KaryVibhag karya_vibhag;
	
	@ManyToOne
	private Exam last_exam;
	
	private String trikal_sandhya;

	private String pratah_prathana;
	
	private String sayam_prathana;
	
	private String pravachan;
	
	@ManyToOne
	private EkadashiVrati ekadashi ;
	
	@ManyToOne
	private EkadashiVrati vrati ;
	
	@ManyToOne
	private Prayog prayog ;
	
	private int pujari_tarikh;
	
	private int mnsgd_bhaktipheri;
	
	private int other_bhaktipheri;
	
	private int parprant_bhaktipheri;
	
	private int tirthayatra;
	
	private String karya_note;
	public int getMnsgd_bhaktipheri() {
		return mnsgd_bhaktipheri;
	}

	public void setMnsgd_bhaktipheri(int mnsgd_bhaktipheri) {
		this.mnsgd_bhaktipheri = mnsgd_bhaktipheri;
	}

	public int getOther_bhaktipheri() {
		return other_bhaktipheri;
	}

	public void setOther_bhaktipheri(int other_bhaktipheri) {
		this.other_bhaktipheri = other_bhaktipheri;
	}

	public int getParprant_bhaktipheri() {
		return parprant_bhaktipheri;
	}

	public void setParprant_bhaktipheri(int parprant_bhaktipheri) {
		this.parprant_bhaktipheri = parprant_bhaktipheri;
	}

	public int getTirthayatra() {
		return tirthayatra;
	}

	public void setTirthayatra(int tirthayatra) {
		this.tirthayatra = tirthayatra;
	}

	public String getKarya_note() {
		return karya_note;
	}

	public void setKarya_note(String karya_note) {
		this.karya_note = karya_note;
	}

	public int getPujari_tarikh() {
		return pujari_tarikh;
	}

	public void setPujari_tarikh(int pujari_tarikh) {
		this.pujari_tarikh = pujari_tarikh;
	}

	public Prayog getPrayog() {
		return prayog;
	}

	public void setPrayog(Prayog prayog) {
		this.prayog = prayog;
	}

	public EkadashiVrati getVrati() {
		return vrati;
	}

	public void setVrati(EkadashiVrati vrati) {
		this.vrati = vrati;
	}

	public EkadashiVrati getEkadashi() {
		return ekadashi;
	}

	public void setEkadashi(EkadashiVrati ekadashi) {
		this.ekadashi = ekadashi;
	}

	public EkadashiVrati getEkadashiVrati() {
		return ekadashi;
	}

	public void setEkadashiVrati(EkadashiVrati ekadashiVrati) {
		this.ekadashi = ekadashiVrati;
	}

	public Person(int id, String form_person_first_name, String form_person_middle_name, String form_person_last_name,
			String form_person_full_name, String first_name, String middle_name, String full_name, String relation,
			String gender, String education, String kshetradhar_name, String business, String business_time,
			String res_no, Society society, int form_number, int resident_vibhag, Date dateOfBirth, int contect_number,
			int contect_number_2, String form_person_note, String note, Date dateOfMarriage, String karya_active,
			int since_karya, Javabadari karya_javabadari, String bhavapheri, KaryVibhag karya_vibhag, Exam last_exam,
			String trikal_sandhya, String pratah_prathana, String sayam_prathana, String pravachan,
			EkadashiVrati ekadashiVrati, String kendra) {
		super();
		this.id = id;
		this.form_person_first_name = form_person_first_name;
		this.form_person_middle_name = form_person_middle_name;
		this.form_person_last_name = form_person_last_name;
		this.form_person_full_name = form_person_full_name;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.full_name = full_name;
		this.relation = relation;
		this.gender = gender;
		this.education = education;
		this.kshetradhar_name = kshetradhar_name;
		this.business = business;
		this.business_time = business_time;
		this.res_no = res_no;
		this.society = society;
		this.form_number = form_number;
		this.resident_vibhag = resident_vibhag;
		this.dateOfBirth = dateOfBirth;
		this.contect_number = contect_number;
		this.contect_number_2 = contect_number_2;
		this.form_person_note = form_person_note;
		this.note = note;
		this.dateOfMarriage = dateOfMarriage;
		this.karya_active = karya_active;
		this.since_karya = since_karya;
		this.karya_javabadari = karya_javabadari;
		this.bhavapheri = bhavapheri;
		this.karya_vibhag = karya_vibhag;
		this.last_exam = last_exam;
		this.trikal_sandhya = trikal_sandhya;
		this.pratah_prathana = pratah_prathana;
		this.sayam_prathana = sayam_prathana;
		this.pravachan = pravachan;
		this.ekadashi = ekadashiVrati;
		this.kendra = kendra;
	}

	public String getTrikal_sandhya() {
		return trikal_sandhya;
	}

	public void setTrikal_sandhya(String trikal_sandhya) {
		this.trikal_sandhya = trikal_sandhya;
	}

	public Person(int id, String form_person_first_name, String form_person_middle_name, String form_person_last_name,
			String form_person_full_name, String first_name, String middle_name, String full_name, String relation,
			String gender, String education, String kshetradhar_name, String business, String business_time,
			String res_no, Society society, int form_number, int resident_vibhag, Date dateOfBirth, int contect_number,
			int contect_number_2, String form_person_note, String note, Date dateOfMarriage, String karya_active,
			int since_karya, Javabadari karya_javabadari, String bhavapheri, KaryVibhag karya_vibhag, Exam last_exam,
			String trikal_sandhya, String pratah_prathana, String sayam_prathana, String pravachan, String kendra) {
		super();
		this.id = id;
		this.form_person_first_name = form_person_first_name;
		this.form_person_middle_name = form_person_middle_name;
		this.form_person_last_name = form_person_last_name;
		this.form_person_full_name = form_person_full_name;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.full_name = full_name;
		this.relation = relation;
		this.gender = gender;
		this.education = education;
		this.kshetradhar_name = kshetradhar_name;
		this.business = business;
		this.business_time = business_time;
		this.res_no = res_no;
		this.society = society;
		this.form_number = form_number;
		this.resident_vibhag = resident_vibhag;
		this.dateOfBirth = dateOfBirth;
		this.contect_number = contect_number;
		this.contect_number_2 = contect_number_2;
		this.form_person_note = form_person_note;
		this.note = note;
		this.dateOfMarriage = dateOfMarriage;
		this.karya_active = karya_active;
		this.since_karya = since_karya;
		this.karya_javabadari = karya_javabadari;
		this.bhavapheri = bhavapheri;
		this.karya_vibhag = karya_vibhag;
		this.last_exam = last_exam;
		this.trikal_sandhya = trikal_sandhya;
		this.pratah_prathana = pratah_prathana;
		this.sayam_prathana = sayam_prathana;
		this.pravachan = pravachan;
		this.kendra = kendra;
	}

	public String getPratah_prathana() {
		return pratah_prathana;
	}

	public void setPratah_prathana(String pratah_prathana) {
		this.pratah_prathana = pratah_prathana;
	}

	public String getSayam_prathana() {
		return sayam_prathana;
	}

	public void setSayam_prathana(String sayam_prathana) {
		this.sayam_prathana = sayam_prathana;
	}

	public String getPravachan() {
		return pravachan;
	}

	public void setPravachan(String pravachan) {
		this.pravachan = pravachan;
	}

	public Exam getLast_exam() {
		return last_exam;
	}

	public void setLast_exam(Exam last_exam) {
		this.last_exam = last_exam;
	}

	
	public KaryVibhag getKarya_vibhag() {
		return karya_vibhag;
	}

	public String getKarya_active() {
		return karya_active;
	}


	

	public Person(int id, String form_person_first_name, String form_person_middle_name, String form_person_last_name,
			String form_person_full_name, String first_name, String middle_name, String full_name, String relation,
			String gender, String education, String kshetradhar_name, String business, String business_time,
			String res_no, Society society, int form_number, int resident_vibhag, Date dateOfBirth, int contect_number,
			int contect_number_2, String form_person_note, String note, Date dateOfMarriage, String karya_active,
			int since_karya, Exam last_exam, String bhavapheri, KaryVibhag karya_vibhag, Javabadari karya_javabadari,
			String kendra) {
		super();
		this.id = id;
		this.form_person_first_name = form_person_first_name;
		this.form_person_middle_name = form_person_middle_name;
		this.form_person_last_name = form_person_last_name;
		this.form_person_full_name = form_person_full_name;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.full_name = full_name;
		this.relation = relation;
		this.gender = gender;
		this.education = education;
		this.kshetradhar_name = kshetradhar_name;
		this.business = business;
		this.business_time = business_time;
		this.res_no = res_no;
		this.society = society;
		this.form_number = form_number;
		this.resident_vibhag = resident_vibhag;
		this.dateOfBirth = dateOfBirth;
		this.contect_number = contect_number;
		this.contect_number_2 = contect_number_2;
		this.form_person_note = form_person_note;
		this.note = note;
		this.dateOfMarriage = dateOfMarriage;
		this.karya_active = karya_active;
		this.since_karya = since_karya;
		this.last_exam = last_exam;
		this.bhavapheri = bhavapheri;
		this.karya_vibhag = karya_vibhag;
		this.karya_javabadari = karya_javabadari;
		this.kendra = kendra;
	}




	public void setKarya_vibhag(KaryVibhag karya_vibhag) {
		this.karya_vibhag = karya_vibhag;
	}




	public void setKarya_active(String karya_active) {
		this.karya_active = karya_active;
	}


	public int getSince_karya() {
		return since_karya;
	}


	public void setSince_karya(int since_karya) {
		this.since_karya = since_karya;
	}



	public String getBhavapheri() {
		return bhavapheri;
	}


	public void setBhavapheri(String bhavapheri) {
		this.bhavapheri = bhavapheri;
	}


	


	public Javabadari getKarya_javabadari() {
		return karya_javabadari;
	}


	public void setKarya_javabadari(Javabadari karya_javabadari) {
		this.karya_javabadari = karya_javabadari;
	}


	public String getKendra() {
		return kendra;
	}


	public void setKendra(String kendra) {
		this.kendra = kendra;
	}

	private String kendra;
	
	
	
	
	
	public int getContect_number() {
		return contect_number;
	}

	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfMarriage() {
		return dateOfMarriage;
	}

	public Person(int id, String form_person_first_name, String form_person_middle_name, String form_person_last_name,
			String form_person_full_name, String first_name, String middle_name, String full_name, String relation,
			String gender, String education, String kshetradhar_name, String business, String business_time,
			String res_no, Society society, int form_number, int resident_vibhag, Date dateOfBirth, Date dateOfMarriage,
			int contect_number, int contect_number_2, String form_person_note, String note) {
		super();
		this.id = id;
		this.form_person_first_name = form_person_first_name;
		this.form_person_middle_name = form_person_middle_name;
		this.form_person_last_name = form_person_last_name;
		this.form_person_full_name = form_person_full_name;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.full_name = full_name;
		this.relation = relation;
		this.gender = gender;
		this.education = education;
		this.kshetradhar_name = kshetradhar_name;
		this.business = business;
		this.business_time = business_time;
		this.res_no = res_no;
		this.society = society;
		this.form_number = form_number;
		this.resident_vibhag = resident_vibhag;
		this.dateOfBirth = dateOfBirth;
		this.dateOfMarriage = dateOfMarriage;
		this.contect_number = contect_number;
		this.contect_number_2 = contect_number_2;
		this.form_person_note = form_person_note;
		this.note = note;
	}

	public void setDateOfMarriage(Date dateOfMarriage) {
		this.dateOfMarriage = dateOfMarriage;
	}

	public Person(int id, String form_person_first_name, String form_person_middle_name, String form_person_last_name,
			String form_person_full_name, String first_name, String middle_name, String full_name, String relation,
			String gender, String education, String kshetradhar_name, String business, String business_time,
			String res_no, Society society, int form_number, int resident_vibhag, int contect_number,
			int contect_number_2, String form_person_note, String note) {
		super();
		this.id = id;
		this.form_person_first_name = form_person_first_name;
		this.form_person_middle_name = form_person_middle_name;
		this.form_person_last_name = form_person_last_name;
		this.form_person_full_name = form_person_full_name;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.full_name = full_name;
		this.relation = relation;
		this.gender = gender;
		this.education = education;
		this.kshetradhar_name = kshetradhar_name;
		this.business = business;
		this.business_time = business_time;
		this.res_no = res_no;
		this.society = society;
		this.form_number = form_number;
		this.resident_vibhag = resident_vibhag;
		this.contect_number = contect_number;
		this.contect_number_2 = contect_number_2;
		this.form_person_note = form_person_note;
		this.note = note;
	}

	public void setContect_number(int contect_number) {
		this.contect_number = contect_number;
	}

	public int getContect_number_2() {
		return contect_number_2;
	}

	public void setContect_number_2(int contect_number_2) {
		this.contect_number_2 = contect_number_2;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String a,String b, String c) {
		this.full_name = a + " " +b+" "+c;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getKshetradhar_name() {
		return kshetradhar_name;
	}

	public void setKshetradhar_name(String kshetradhar_name) {
		this.kshetradhar_name = kshetradhar_name;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getBusiness_time() {
		return business_time;
	}

	public void setBusiness_time(String business_time) {
		this.business_time = business_time;
	}

	public void setForm_person_full_name(String form_person_full_name) {
		this.form_person_full_name = form_person_full_name;
	}
	
	public Person(int id, String form_person_first_name, String form_person_middle_name, String form_person_last_name,
			String form_person_full_name, String first_name, String middle_name, String full_name, String relation,
			String gender, String education, String kshetradhar_name, String business, String business_time,
			String res_no, Society society, int form_number, int resident_vibhag, String form_person_note) {
		super();
		this.id = id;
		this.form_person_first_name = form_person_first_name;
		this.form_person_middle_name = form_person_middle_name;
		this.form_person_last_name = form_person_last_name;
		this.form_person_full_name = form_person_full_name;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.full_name = full_name;
		this.relation = relation;
		this.gender = gender;
		this.education = education;
		this.kshetradhar_name = kshetradhar_name;
		this.business = business;
		this.business_time = business_time;
		this.res_no = res_no;
		this.society = society;
		this.form_number = form_number;
		this.resident_vibhag = resident_vibhag;
		this.form_person_note = form_person_note;
	}


	
	public String getForm_person_full_name() {
		return form_person_full_name;
	}

	public void setForm_person_full_name(String a , String b,String c) {
		this.form_person_full_name = a + " "+b +" "+c;
	}
	
	public String getForm_person_note() {
		return form_person_note;
	}

	public void setForm_person_note(String form_person_note) {
		this.form_person_note = form_person_note;
	}

	public Person() {
		super();
	}

	public int getForm_number() {
		return form_number;
	}

	public void setForm_number(int form_number) {
		this.form_number = form_number;
	}

	public int getResident_vibhag() {
		return resident_vibhag;
	}

	

	public Person(int id, String form_person_first_name, String form_person_middle_name, String form_person_last_name,
			String form_person_full_name, String res_no, Society society, int form_number, int resident_vibhag,
			String form_person_note) {
		super();
		this.id = id;
		this.form_person_first_name = form_person_first_name;
		this.form_person_middle_name = form_person_middle_name;
		this.form_person_last_name = form_person_last_name;
		this.form_person_full_name = form_person_full_name;
		this.res_no = res_no;
		this.society = society;
		this.form_number = form_number;
		this.resident_vibhag = resident_vibhag;
		this.form_person_note = form_person_note;
	}

	public void setResident_vibhag(int resident_vibhag) {
		this.resident_vibhag = resident_vibhag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getForm_person_first_name() {
		return form_person_first_name;
	}

	public void setForm_person_first_name(String form_person_first_name) {
		this.form_person_first_name = form_person_first_name;
	}

	public String getForm_person_middle_name() {
		return form_person_middle_name;
	}

	public void setForm_person_middle_name(String form_person_middle_name) {
		this.form_person_middle_name = form_person_middle_name;
	}

	public String getForm_person_last_name() {
		return form_person_last_name;
	}

	public void setForm_person_last_name(String form_person_last_name) {
		this.form_person_last_name = form_person_last_name;
	}

	public String getRes_no() {
		return res_no;
	}

	public void setRes_no(String res_no) {
		this.res_no = res_no;
	}

	public Society getSociety() {
		return society;
	}

	public void setSociety(Society society) {
		this.society = society;
	}
	
}
