package com.th.krutisheelFamilyDetail.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.th.krutisheelFamilyDetail.model.Kshetradhar;
import com.th.krutisheelFamilyDetail.model.Person;
import com.th.krutisheelFamilyDetail.service.AgeGroupService;
import com.th.krutisheelFamilyDetail.service.BusinessService;
import com.th.krutisheelFamilyDetail.service.EducationService;
import com.th.krutisheelFamilyDetail.service.EkadashiVratiService;
import com.th.krutisheelFamilyDetail.service.ExamService;
import com.th.krutisheelFamilyDetail.service.JavabadariService;
import com.th.krutisheelFamilyDetail.service.KaryVibhagService;
import com.th.krutisheelFamilyDetail.service.KendraService;
import com.th.krutisheelFamilyDetail.service.KshtradharService;
import com.th.krutisheelFamilyDetail.service.PersonService;
import com.th.krutisheelFamilyDetail.service.PrayogService;
import com.th.krutisheelFamilyDetail.service.RelationService;
import com.th.krutisheelFamilyDetail.service.SocietyService;
import com.th.krutisheelFamilyDetail.service.VibhagService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@Autowired
	private VibhagService vibhagservice;
	
	@Autowired
	private SocietyService society;
	
	@Autowired
	private RelationService relation;

	@Autowired
	private ExamService exam;
	
	@Autowired
	private KendraService kendraservice;
	
	@Autowired
	private KaryVibhagService karyVibhagService;
	
	@Autowired
	private JavabadariService javabadariService;
	
	@Autowired
	private  EkadashiVratiService ekadashiVratservice;
	
	@Autowired
	private PrayogService prayogservice;
	
	@Autowired
	private AgeGroupService ageservice;
	
	@Autowired
	private EducationService educationservice;
	
	@Autowired
	private BusinessService businessservice;
	
	@Autowired
	private KshtradharService kshetradharservice;
	
	@GetMapping("/")
	public ModelAndView newPerson() {
		ModelAndView mav = new ModelAndView("person");
		mav.addObject("societyList", society.getSocietyList());
		mav.addObject("relationList", relation.findAllRelations());
		mav.addObject("examList", exam.findAllExam());
		mav.addObject("karyaVibhagList",karyVibhagService.findAll());
		mav.addObject("evlist", ekadashiVratservice.get());
		mav.addObject("javabadariList", javabadariService.findAll());
		mav.addObject("prayogList", prayogservice.getPrayog());
		mav.addObject("ageGroupList", ageservice.getAllName());
		mav.addObject("educationList", educationservice.getAllName());
		mav.addObject("businessList", businessservice.getAllName());
		mav.addObject("vibhagList", vibhagservice.findAllVibhags());
		mav.addObject("kshetradharList", kshetradharservice.getAllName());
		mav.addObject("kendraList", kendraservice.getAllKendrName());
		mav.addObject("person", new Person());
		mav.addObject("personList", service.findAll());
		return mav;
	}
	
	@PostMapping("/")
	public ModelAndView savePerson(@ModelAttribute Person p) {
		String hofFullName = p.getHof_firstName() + " " + p.getHof_middleName() + " " + p.getHof_lastName();
		p.setHof_fullName(hofFullName);
		String fullName  = p.getFirst_name() + " "+ p.getMiddle_name()  +" " + p.getHof_lastName();
		p.setFull_name(fullName);
		
		if(fullName != "" && p.getIsKrutisheel() != null && p.getIsKrutisheel().equalsIgnoreCase("yes")) {
			Kshetradhar krutisheel = new Kshetradhar(fullName);
			kshetradharservice.save(krutisheel);
		}
		service.savePerson(p);
		ModelAndView mav = new ModelAndView("person");
		mav.addObject("person", new Person());
		mav.addObject("societyList", society.getSocietyList());
		mav.addObject("relationList", relation.findAllRelations());
		mav.addObject("examList", exam.findAllExam());
		mav.addObject("karyaVibhagList",karyVibhagService.findAll());
		mav.addObject("evlist", ekadashiVratservice.get());
		mav.addObject("ageGroupList", ageservice.getAllName());
		mav.addObject("educationList", educationservice.getAllName());
		mav.addObject("businessList", businessservice.getAllName());
		mav.addObject("javabadariList", javabadariService.findAll());
		mav.addObject("prayogList", prayogservice.getPrayog());
		mav.addObject("kshetradharList", kshetradharservice.getAllName());
		mav.addObject("personList", service.findAll());
		mav.addObject("message", "Added Successfully");
		return mav;
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deletePerson(@PathVariable(name= "id") int id) {
		service.deletePersonById(id);
		ModelAndView mav = new ModelAndView("person");
		mav.addObject("societyList", society.getSocietyList());
		mav.addObject("relationList", relation.findAllRelations());
		mav.addObject("examList", exam.findAllExam());
		mav.addObject("karyaVibhagList",karyVibhagService.findAll());
		mav.addObject("evlist", ekadashiVratservice.get());
		mav.addObject("javabadariList", javabadariService.findAll());
		mav.addObject("prayogList", prayogservice.getPrayog());
		mav.addObject("ageGroupList", ageservice.getAllName());
		mav.addObject("educationList", educationservice.getAllName());
		mav.addObject("businessList", businessservice.getAllName());
		mav.addObject("kshetradharList", kshetradharservice.getAllName());
		mav.addObject("person", new Person());
		mav.addObject("personList", service.findAll());
	    mav.addObject("message", "Successfully Delete");
		return mav;
	}
	
	@GetMapping("/{id}")
	public ModelAndView findByIdPerson(@PathVariable(name= "id") int id) {
		Person person = service.getPersonById(id);
		ModelAndView mav = new ModelAndView("person");
		mav.addObject("societyList", society.getSocietyList());
		mav.addObject("relationList", relation.findAllRelations());
		mav.addObject("examList", exam.findAllExam());
		mav.addObject("karyaVibhagList",karyVibhagService.findAll());
		mav.addObject("evlist", ekadashiVratservice.get());
		mav.addObject("javabadariList", javabadariService.findAll());
		mav.addObject("educationList", educationservice.getAllName());
		mav.addObject("businessList", businessservice.getAllName());
		mav.addObject("prayogList", prayogservice.getPrayog());
		mav.addObject("ageGroupList", ageservice.getAllName());
		mav.addObject("person", person);
		mav.addObject("personList", service.findAll());
		return mav;
	}
	
	
	@GetMapping("/viewPerson/")
	public ModelAndView viewPerson() {
		ModelAndView mav = new ModelAndView("viewPerson");
		mav.addObject("personList", service.findAll());
		return mav;
	}
}
