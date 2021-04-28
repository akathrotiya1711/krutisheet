package com.th.krutisheelFamilyDetail.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.th.krutisheelFamilyDetail.utility.Valida;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String hof_firstName;
	
	private String hof_middleName;
	
	private String hof_lastName;
	
	private String hof_fullName;
	
	private String first_name;
	
	private String middle_name;
	
	private String full_name;
	
	@ManyToOne
	private Relation relation;
	
	private String gender;
	

	
    
	

	private String business_time;
	private String res_no;
	
	@ManyToOne
	private Society society ;
	
	private int form_number;
	
	private int resident_vibhag;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
    private String contect_number;
    
    @ManyToOne
    private AgeGroup age_group;
    
    @ManyToOne
    private Kshetradhar Kshetradhar;
	
	public Kshetradhar getKshetradhar() {
		return Kshetradhar;
	}

	public void setKshetradhar(Kshetradhar kshetradhar) {
		Kshetradhar = kshetradhar;
	}

	private String contect_number_2;
	
	private String family_note;
	
	private String isStudyContinue;
	
	private String profession;
	
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getIsStudyContinue() {
		return isStudyContinue;
	}

	public void setIsStudyContinue(String isStudyContinue) {
		this.isStudyContinue = isStudyContinue;
	}

	public String getFamily_note() {
		return family_note;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public void setFamily_note(String family_note) {
		this.family_note = family_note;
	}

	private String person_note;
	

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateOfMarriage;

	private String isKrutisheel;
	
	
	
	
	//Karya Detail Variable
	
	public String getIsKrutisheel() {
		return isKrutisheel;
	}

	public void setIsKrutisheel(String isKrutisheel) {
		this.isKrutisheel = isKrutisheel;
	}

	public String getPerson_note() {
		return person_note;
	}

	public void setPerson_note(String person_note) {
		this.person_note = person_note;
	}

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
	private Education education ;
	
	@ManyToOne
	private Business business ;
	
	@ManyToOne
	private Kendra kendraname ;
	
	private String isPujari;
	
	
	public String getIsPujari() {
		return isPujari;
	}

	public void setIsPujari(String isPujari) {
		this.isPujari = isPujari;
	}

	public Kendra getKendraname() {
		return kendraname;
	}

	public void setKendraname(Kendra kendraname) {
		this.kendraname = kendraname;
	}

	public Vibhag getRes_vibhag() {
		return res_vibhag;
	}

	public void setRes_vibhag(Vibhag res_vibhag) {
		this.res_vibhag = res_vibhag;
	}

	@ManyToOne
	private EkadashiVrati vrati ;
	
	@ManyToOne
	private Prayog prayog ;
	
	@ManyToOne
	private Vibhag res_vibhag ;
	
	private int pujari_tarikh;
	
	private int mnsgd_bhaktipheri;
	
	private int other_bhaktipheri;
	
	private int parprant_bhaktipheri;
	
	private int tirthayatra;
	
	private String karya_note;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHof_firstName() {
		return hof_firstName;
	}

	public void setHof_firstName(String hof_firstName) {
		if(hof_firstName != "" && hof_firstName != null)
		this.hof_firstName = Valida.convertName(hof_firstName);
	}

	public String getHof_middleName() {
		return hof_middleName;
	}

	public void setHof_middleName(String hof_middleName) {
		if(hof_middleName != "" && hof_middleName != null)
		this.hof_middleName =  Valida.convertName(hof_middleName);
	}

	public String getHof_lastName() {
		return hof_lastName;
	}

	public void setHof_lastName(String hof_lastName) {
		if(hof_lastName != "" && hof_lastName != null)
		this.hof_lastName = Valida.convertName(hof_lastName);
	}

	public String getHof_fullName() {
		return hof_fullName;
	}

	public void setHof_fullName(String hof_fullName) {
		this.hof_fullName = hof_fullName;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		if(first_name != "" && first_name != null)
			this.first_name = Valida.convertName(first_name);
	
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		if(middle_name != "" && middle_name != null)
			this.middle_name = Valida.convertName(middle_name);
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}



	public Relation getRelation() {
		return relation;
	}

	public void setRelation(Relation relation) {
		this.relation = relation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBusiness_time() {
		return business_time;
	}

	public void setBusiness_time(String business_time) {
		this.business_time = business_time;
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

	public int getForm_number() {
		return form_number;
	}

	public void setForm_number(int form_number) {
		this.form_number = form_number;
	}

	public int getResident_vibhag() {
		return resident_vibhag;
	}

	public void setResident_vibhag(int resident_vibhag) {
		this.resident_vibhag = resident_vibhag;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getContect_number() {
		return contect_number;
	}

	public void setContect_number(String contect_number) {
		this.contect_number = contect_number;
	}

	public AgeGroup getAge_group() {
		return age_group;
	}

	public void setAge_group(AgeGroup age_group) {
		this.age_group = age_group;
	}

	public String getContect_number_2() {
		return contect_number_2;
	}

	public void setContect_number_2(String contect_number_2) {
		this.contect_number_2 = contect_number_2;
	}

	public String getForm_person_note() {
		return family_note;
	}

	public void setForm_person_note(String form_person_note) {
		this.family_note = form_person_note;
	}

	public String getNote() {
		return person_note;
	}

	public void setNote(String note) {
		this.person_note = note;
	}

	public Date getDateOfMarriage() {
		return dateOfMarriage;
	}

	public void setDateOfMarriage(Date dateOfMarriage) {
		this.dateOfMarriage = dateOfMarriage;
	}

	public String getKarya_active() {
		return karya_active;
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

	public Javabadari getKarya_javabadari() {
		return karya_javabadari;
	}

	public void setKarya_javabadari(Javabadari karya_javabadari) {
		this.karya_javabadari = karya_javabadari;
	}

	public String getBhavapheri() {
		return bhavapheri;
	}

	public void setBhavapheri(String bhavapheri) {
		this.bhavapheri = bhavapheri;
	}

	public KaryVibhag getKarya_vibhag() {
		return karya_vibhag;
	}

	public void setKarya_vibhag(KaryVibhag karya_vibhag) {
		this.karya_vibhag = karya_vibhag;
	}

	public Exam getLast_exam() {
		return last_exam;
	}

	public void setLast_exam(Exam last_exam) {
		this.last_exam = last_exam;
	}

	public String getTrikal_sandhya() {
		return trikal_sandhya;
	}

	public void setTrikal_sandhya(String trikal_sandhya) {
		this.trikal_sandhya = trikal_sandhya;
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

	public EkadashiVrati getEkadashi() {
		return ekadashi;
	}

	public void setEkadashi(EkadashiVrati ekadashi) {
		this.ekadashi = ekadashi;
	}

	public EkadashiVrati getVrati() {
		return vrati;
	}

	public void setVrati(EkadashiVrati vrati) {
		this.vrati = vrati;
	}

	public Prayog getPrayog() {
		return prayog;
	}

	public void setPrayog(Prayog prayog) {
		this.prayog = prayog;
	}

	public int getPujari_tarikh() {
		return pujari_tarikh;
	}

	public void setPujari_tarikh(int pujari_tarikh) {
		this.pujari_tarikh = pujari_tarikh;
	}

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

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", hof_firstName=" + hof_firstName + ", hof_middleName=" + hof_middleName
				+ ", hof_lastName=" + hof_lastName + ", hof_fullName=" + hof_fullName + ", first_name=" + first_name
				+ ", middle_name=" + middle_name + ", full_name=" + full_name + ", relation=" + relation + ", gender="
				+ gender  +  ", business="
				+ business + ", business_time=" + business_time + ", res_no=" + res_no + ", society=" + society
				+ ", form_number=" + form_number + ", resident_vibhag=" + resident_vibhag + ", dateOfBirth="
				+ dateOfBirth + ", contect_number=" + contect_number + ", age_group=" + age_group
				+ ", contect_number_2=" + contect_number_2 + ", form_person_note=" + family_note + ", note=" + person_note
				+ ", dateOfMarriage=" + dateOfMarriage + ", karya_active=" + karya_active + ", since_karya="
				+ since_karya + ", karya_javabadari=" + karya_javabadari + ", bhavapheri=" + bhavapheri
				+ ", karya_vibhag=" + karya_vibhag + ", last_exam=" + last_exam + ", trikal_sandhya=" + trikal_sandhya
				+ ", pratah_prathana=" + pratah_prathana + ", sayam_prathana=" + sayam_prathana + ", pravachan="
				+ pravachan + ", ekadashi=" + ekadashi + ", vrati=" + vrati + ", prayog=" + prayog + ", pujari_tarikh="
				+ pujari_tarikh + ", mnsgd_bhaktipheri=" + mnsgd_bhaktipheri + ", other_bhaktipheri="
				+ other_bhaktipheri + ", parprant_bhaktipheri=" + parprant_bhaktipheri + ", tirthayatra=" + tirthayatra
				+ ", karya_note=" + karya_note   + "]";
	}
	
}
