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

import com.th.krutisheelFamilyDetail.model.KaryVibhag;
import com.th.krutisheelFamilyDetail.service.KaryVibhagService;

@RestController
@RequestMapping("/karyVibhag")
public class KaryVibhagController {
	
	@Autowired
	private KaryVibhagService service;
	
	@GetMapping("/")
	public ModelAndView karyVibhag(){
		ModelAndView mv = new ModelAndView("karyVibhag");
		List<KaryVibhag>list = service.findAll();
		mv.addObject("karyVibhagList", list);
		mv.addObject("karyVibhag", new KaryVibhag());
		return mv;
	}
	
	@PostMapping("/")
	public ModelAndView saveKaryVibhag(@ModelAttribute KaryVibhag e) {
		 service.save(e);;
	     List<KaryVibhag> list = service.findAll();
	     ModelAndView mav = new ModelAndView("karyVibhag");
	     mav.addObject("karyVibhagList",list);
	     mav.addObject("karyVibhag", new KaryVibhag());
	     mav.addObject("message", "Successfully ");
		 return mav;
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteKaryVibhag(@PathVariable(name= "id") int id) {
		 service.delete(id); 
	     List<KaryVibhag> list = service.findAll();
	     ModelAndView mav = new ModelAndView("karyVibhag");
	     mav.addObject("karyVibhagList",list);
	     mav.addObject("karyVibhag", new KaryVibhag());
	     mav.addObject("message", "Successfully Delete");
		 return mav;
	}
	
	@GetMapping("/{id}")
	public ModelAndView findAll(@PathVariable(name= "id") int id) {
		 KaryVibhag karyVibhag = service.findById(id); 
	     List<KaryVibhag> list = service.findAll();
	     ModelAndView mav = new ModelAndView("karyVibhag");
	     mav.addObject("karyVibhagList",list);
	     mav.addObject("karyVibhag", karyVibhag);
		 return mav;
	}
	
}
