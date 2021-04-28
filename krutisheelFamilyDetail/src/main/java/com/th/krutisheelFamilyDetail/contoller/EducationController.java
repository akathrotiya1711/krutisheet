package com.th.krutisheelFamilyDetail.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.th.krutisheelFamilyDetail.model.Education;
import com.th.krutisheelFamilyDetail.service.EducationService;

@RestController
@RequestMapping("/education")
public class EducationController {
	
	@Autowired
	private EducationService service;
	
	@GetMapping("/")
	public ModelAndView education(){
		ModelAndView mv = new ModelAndView("education");
		List<Education>list = service.getAllName();
		mv.addObject("educationList", list);
		mv.addObject("education", new Education());
		return mv;
	}
	
	@PostMapping("/")
	public ModelAndView saveVibhag(@ModelAttribute Education e) {
		 service.save(e);;
	     List<Education> list = service.getAllName();
	     ModelAndView mav = new ModelAndView("education");
	     mav.addObject("educationList",list);
	     mav.addObject("education", new Education());
	     mav.addObject("message", "Successfully ");
		 return mav;
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteeducation(@PathVariable(name= "id") int id) {
		 service.delete(id);; 
	     List<Education> list = service.getAllName();
	     ModelAndView mav = new ModelAndView("education");
	     mav.addObject("educationList",list);
	     mav.addObject("education", new Education());
	     mav.addObject("message", "Successfully Delete");
		 return mav;
	}
	
	@GetMapping("/{id}")
	public ModelAndView geteducation(@PathVariable(name= "id") int id) {
		 Education education = service.getById(id); 
	     List<Education> list = service.getAllName();
	     ModelAndView mav = new ModelAndView("education");
	     mav.addObject("educationList",list);
	     mav.addObject("education", education);
		 return mav;
	}
		
}
