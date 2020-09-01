package com.th.krutisheelFamilyDetail.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.th.krutisheelFamilyDetail.model.Exam;
import com.th.krutisheelFamilyDetail.model.Person;
import com.th.krutisheelFamilyDetail.model.Society;
import com.th.krutisheelFamilyDetail.service.ExamService;
import com.th.krutisheelFamilyDetail.service.FamilyHeadServiceIMPL;
import com.th.krutisheelFamilyDetail.service.SocietyService;

@RestController
public class MainController {
	
	@Autowired
	private SocietyService society;
	
	@Autowired
	private FamilyHeadServiceIMPL family;
	
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
	public ModelAndView welcome() {
		ModelAndView mv = new ModelAndView("society");
		mv.addObject("society", new Society());
		mv.addObject("societyList", society.getSocietyList());
		return mv;
	
	}
	
	@PostMapping("/society")
	public ModelAndView getSocietyList(@ModelAttribute Society s){
		society.saveSociety(s);
		ModelAndView mv = new ModelAndView("society");
		mv.addObject("society", new Society());
		mv.addObject("societyList", society.getSocietyList());
		mv.addObject("message", "Successfully");
		return mv;
	}
	
	@GetMapping("/society/{id}")
	public ModelAndView getSocietyNameById(@PathVariable int id) {
		ModelAndView mv = new ModelAndView("society");
		mv.addObject("society", society.getSociety(id));
		mv.addObject("societyList", society.getSocietyList());
		return mv;
	}
	
	@GetMapping("/society/delete/{id}")
	public ModelAndView deleteSocietyNameById(@PathVariable int id) {
		society.deleteSociety(id);
		ModelAndView mv = new ModelAndView("society");
		mv.addObject("society", new Society());
		mv.addObject("societyList", society.getSocietyList());
		mv.addObject("message", "Successfully Delete");
		return mv;
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
	
	
}
