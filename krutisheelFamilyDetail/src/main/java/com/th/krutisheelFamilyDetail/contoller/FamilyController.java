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

import com.th.krutisheelFamilyDetail.model.FamilyHead;
import com.th.krutisheelFamilyDetail.service.FamilyHeadService;
import com.th.krutisheelFamilyDetail.service.SocietyService;

@RestController
@RequestMapping("/family")
public class FamilyController {
	
	@Autowired
	private FamilyHeadService service;
	
	@Autowired
	private SocietyService society;
	
	@GetMapping("/")
	public ModelAndView family(){
		ModelAndView mv = new ModelAndView("family");
		List<FamilyHead>list = service.findAll();
		mv.addObject("familyList", list);
		mv.addObject("family", new FamilyHead());
		mv.addObject("societyList",society.getSocietyList());
		return mv;
	}
	
	@PostMapping("/")
	public ModelAndView saveFamilyHead(@ModelAttribute FamilyHead e) {
		 service.save(e);;
	     List<FamilyHead> list = service.findAll();
	     ModelAndView mav = new ModelAndView("family");
	     mav.addObject("familyList",list);
	     mav.addObject("family", new FamilyHead());
	     mav.addObject("societyList",society.getSocietyList());
	     mav.addObject("message", "Successfully ");
		 return mav;
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteFamilyHead(@PathVariable(name= "id") int id) {
		 service.delet(id); 
	     List<FamilyHead> list = service.findAll();
	     ModelAndView mav = new ModelAndView("family");
	     mav.addObject("familyList",list);
	     mav.addObject("family", new FamilyHead());
	     mav.addObject("societyList",society.getSocietyList());
	     mav.addObject("message", "Successfully Delete");
		 return mav;
	}
	
	@GetMapping("/{id}")
	public ModelAndView findAll(@PathVariable(name= "id") int id) {
		 FamilyHead family = service.findById(id); 
	     List<FamilyHead> list = service.findAll();
	     ModelAndView mav = new ModelAndView("family");
	     mav.addObject("societyList",society.getSocietyList());
	     mav.addObject("familyList",list);
	     mav.addObject("family", family);
		 return mav;
	}
	
}
