package com.th.krutisheelFamilyDetail.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.th.krutisheelFamilyDetail.model.Exam;
import com.th.krutisheelFamilyDetail.model.Vibhag;
import com.th.krutisheelFamilyDetail.service.VibhagService;

@RestController
@RequestMapping("/vibhag")
public class VibhagController {
	
	@Autowired
	private VibhagService service;
	
	@GetMapping("/")
	public ModelAndView vibhag(){
		ModelAndView mv = new ModelAndView("vibhag");
		List<Vibhag>list = service.findAllVibhags();
		mv.addObject("vibhagList", list);
		mv.addObject("vibhag", new Vibhag());
		return mv;
	}
	
	@PostMapping("/")
	public ModelAndView saveVibhag(@ModelAttribute Vibhag e) {
		 service.saveVibhag(e);
	     List<Vibhag> list = service.findAllVibhags();
	     ModelAndView mav = new ModelAndView("vibhag");
	     mav.addObject("vibhagList",list);
	     mav.addObject("vibhag", new Vibhag());
	     mav.addObject("message", "Successfully ");
		 return mav;
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deletevibhag(@PathVariable(name= "id") int id) {
		 service.deleteVibhag(id); 
	     List<Vibhag> list = service.findAllVibhags();
	     ModelAndView mav = new ModelAndView("vibhag");
	     mav.addObject("vibhagList",list);
	     mav.addObject("vibhag", new Vibhag());
	     mav.addObject("message", "Successfully Delete");
		 return mav;
	}
	
	@GetMapping("/{id}")
	public ModelAndView getvibhag(@PathVariable(name= "id") int id) {
		 Vibhag vibhag = service.getVibhag(id); 
	     List<Vibhag> list = service.findAllVibhags();
	     ModelAndView mav = new ModelAndView("vibhag");
	     mav.addObject("vibhagList",list);
	     mav.addObject("vibhag", vibhag);
		 return mav;
	}
		
}
