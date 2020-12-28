package com.th.krutisheelFamilyDetail.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.th.krutisheelFamilyDetail.model.Person;
import com.th.krutisheelFamilyDetail.service.EkadashiVratiService;
import com.th.krutisheelFamilyDetail.service.ExamService;
import com.th.krutisheelFamilyDetail.service.JavabadariService;
import com.th.krutisheelFamilyDetail.service.KaryVibhagService;
import com.th.krutisheelFamilyDetail.service.PersonService;
import com.th.krutisheelFamilyDetail.service.PrayogService;
import com.th.krutisheelFamilyDetail.service.RelationService;
import com.th.krutisheelFamilyDetail.service.SocietyService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@Autowired
	private SocietyService society;
	
	@Autowired
	private RelationService relation;

	@Autowired
	private ExamService exam;
	
	@Autowired
	private KaryVibhagService karyVibhagService;
	
	@Autowired
	private JavabadariService javabadariService;
	
	@Autowired
	private  EkadashiVratiService ekadashiVratservice;
	
	@Autowired
	private PrayogService prayogservice;
	
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
		mav.addObject("person", new Person());
		mav.addObject("personList", service.findAll());
		return mav;
	}
	
	@PostMapping("/")
	public ModelAndView savePerson(@ModelAttribute Person p) {
		p.setForm_person_full_name(p.getForm_person_first_name(), p.getForm_person_middle_name(), p.getForm_person_last_name());
		p.setFull_name(p.getFirst_name(), p.getMiddle_name(), p.getForm_person_last_name());
		service.savePerson(p);
		ModelAndView mav = new ModelAndView("person");
		mav.addObject("person", new Person());
		mav.addObject("societyList", society.getSocietyList());
		mav.addObject("relationList", relation.findAllRelations());
		mav.addObject("examList", exam.findAllExam());
		mav.addObject("karyaVibhagList",karyVibhagService.findAll());
		mav.addObject("evlist", ekadashiVratservice.get());
		mav.addObject("javabadariList", javabadariService.findAll());
		mav.addObject("prayogList", prayogservice.getPrayog());
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
		mav.addObject("prayogList", prayogservice.getPrayog());
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
