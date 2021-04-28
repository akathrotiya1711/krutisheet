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

import com.th.krutisheelFamilyDetail.model.Business;
import com.th.krutisheelFamilyDetail.service.BusinessService;

@RestController
@RequestMapping("/business")
public class BusinessController {
	
	@Autowired
	private BusinessService service;
	
	@GetMapping("/")
	public ModelAndView business(){
		ModelAndView mv = new ModelAndView("business");
		List<Business>list = service.getAllName();
		mv.addObject("businessList", list);
		mv.addObject("business", new Business());
		return mv;
	}
	
	@PostMapping("/")
	public ModelAndView saveVibhag(@ModelAttribute Business e) {
		 service.save(e);;
	     List<Business> list = service.getAllName();
	     ModelAndView mav = new ModelAndView("business");
	     mav.addObject("businessList",list);
	     mav.addObject("business", new Business());
	     mav.addObject("message", "Successfully ");
		 return mav;
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deletebusiness(@PathVariable(name= "id") int id) {
		 service.delete(id);; 
	     List<Business> list = service.getAllName();
	     ModelAndView mav = new ModelAndView("business");
	     mav.addObject("businessList",list);
	     mav.addObject("business", new Business());
	     mav.addObject("message", "Successfully Delete");
		 return mav;
	}
	
	@GetMapping("/{id}")
	public ModelAndView getbusiness(@PathVariable(name= "id") int id) {
		 Business business = service.getById(id); 
	     List<Business> list = service.getAllName();
	     ModelAndView mav = new ModelAndView("business");
	     mav.addObject("businessList",list);
	     mav.addObject("business", business);
		 return mav;
	}
		
}
