package com.th.krutisheelFamilyDetail.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.th.krutisheelFamilyDetail.model.Exam;
import com.th.krutisheelFamilyDetail.model.Family;
import com.th.krutisheelFamilyDetail.model.Society;
import com.th.krutisheelFamilyDetail.service.ExamService;
import com.th.krutisheelFamilyDetail.service.FamilySerI;
import com.th.krutisheelFamilyDetail.service.SocietyServiceImpl;

@RestController
public class MainController {
	
	@Autowired
	private SocietyServiceImpl service;
	
	@Autowired
	private FamilySerI family;
	
	@Autowired
	private ExamService examService;
	
	 
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("welcome");
		return mav;
	}
	@RequestMapping("/")
	public ModelAndView home1() {
		ModelAndView mav = new ModelAndView("welcome");
		return mav;
	}
	@RequestMapping("/exam")
	public ModelAndView exam() {
		Exam exam  = new Exam();
		ModelAndView mav = new ModelAndView("exam");
	     mav.addObject("exam",exam);
	     List<Exam> list = examService.findAllExam();
	     mav.addObject("examList",list);
		return mav;
	}
	
	@RequestMapping("/society")
	public String welcome() {
		return "society";
	}
	
	@GetMapping("/getSocietyList")
	public List<Society> getSocietyList(){
		return service.getSocietyList();
	}
	
	@GetMapping("/getSociety/{id}")
	public Society getSocietyNameById(@PathVariable int id) {
		return service.getSociety(id);
	}
	@InitBinder
	public void initbinder(WebDataBinder binder){
		
	}
	
	@PostMapping("/exams")
	public ModelAndView saveExam(@ModelAttribute Exam e) {
	   
		 examService.saveExam(e);
	     List<Exam> list = examService.findAllExam();
	     ModelAndView mav = new ModelAndView("exam");
	     mav.addObject("examList",list);
	     mav.addObject("exam", new Exam());
	     mav.addObject("message", "Successfully ");
		 return mav;
	}
	
	
	
	
	@GetMapping("/examds/{id}")
	public ModelAndView deleteExam(@PathVariable(name= "id") int id) {
		 examService.deleteExaam(id);
	     List<Exam> list = examService.findAllExam();
	     ModelAndView mav = new ModelAndView("exam");
	     mav.addObject("examList",list);
	     mav.addObject("exam", new Exam());
	     mav.addObject("message", "Successfully Delete");
		 return mav;
	}
	
	@GetMapping("/exams/{id}")
	public ModelAndView editExam(@PathVariable(name= "id") int id) {
	     Exam exam = examService.getExam(id);
	     ModelAndView mav = new ModelAndView("exam");
	     mav.addObject("exam",exam);
	     List<Exam> list = examService.findAllExam();
	     mav.addObject("examList",list);
	     return mav;
	}
	
	@RequestMapping("/family")
	public ModelAndView addFamily()
	{
		ModelAndView mv = new ModelAndView("family");
		List<Exam>  examList = examService.findAllExam();
		List<Family> familyList = family.findFamilyList();
		mv.addObject("family", new Family());
		mv.addObject("examList",examList);
		mv.addObject("familyList",familyList);
		return mv;
	}
	
	@PostMapping("/save-family")
	public ModelAndView saveFamily(@ModelAttribute Family f) {
	    family.saveFamily(f);
	    ModelAndView mv = new ModelAndView("family");
	    mv.addObject("family",new Family());
	    return mv;
	}

}
