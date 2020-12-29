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
import com.th.krutisheelFamilyDetail.model.AgeGroup;
import com.th.krutisheelFamilyDetail.service.AgeGroupService;
import com.th.krutisheelFamilyDetail.service.VibhagService;

@RestController
@RequestMapping("/ageGroup")
public class AgeGroupController {
	
	@Autowired
	private AgeGroupService service;
	
	@GetMapping("/")
	public ModelAndView ageGroup(){
		ModelAndView mv = new ModelAndView("ageGroup");
		List<AgeGroup>list = service.getAllName();
		mv.addObject("ageGroupList", list);
		mv.addObject("ageGroup", new AgeGroup());
		return mv;
	}
	
	@PostMapping("/")
	public ModelAndView saveVibhag(@ModelAttribute AgeGroup e) {
		 service.save(e);;
	     List<AgeGroup> list = service.getAllName();
	     ModelAndView mav = new ModelAndView("ageGroup");
	     mav.addObject("ageGroupList",list);
	     mav.addObject("ageGroup", new AgeGroup());
	     mav.addObject("message", "Successfully ");
		 return mav;
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteageGroup(@PathVariable(name= "id") int id) {
		 service.delete(id);; 
	     List<AgeGroup> list = service.getAllName();
	     ModelAndView mav = new ModelAndView("ageGroup");
	     mav.addObject("ageGroupList",list);
	     mav.addObject("ageGroup", new AgeGroup());
	     mav.addObject("message", "Successfully Delete");
		 return mav;
	}
	
	@GetMapping("/{id}")
	public ModelAndView getageGroup(@PathVariable(name= "id") int id) {
		 AgeGroup ageGroup = service.getById(id); 
	     List<AgeGroup> list = service.getAllName();
	     ModelAndView mav = new ModelAndView("ageGroup");
	     mav.addObject("ageGroupList",list);
	     mav.addObject("ageGroup", ageGroup);
		 return mav;
	}
		
}
