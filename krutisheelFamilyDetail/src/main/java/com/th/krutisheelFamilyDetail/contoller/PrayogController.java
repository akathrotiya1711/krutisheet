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

import com.th.krutisheelFamilyDetail.model.Prayog;
import com.th.krutisheelFamilyDetail.service.PrayogService;

@RestController
@RequestMapping("/prayog")
public class PrayogController {
	
	@Autowired
	private PrayogService service;
	
	@GetMapping("/")
	public ModelAndView prayog(){
		ModelAndView mv = new ModelAndView("prayog");
		List<Prayog>list = service.getPrayog();
		mv.addObject("prayogList", list);
		mv.addObject("prayog", new Prayog());
		return mv;
	}
	
	@PostMapping("/")
	public ModelAndView savePrayog(@ModelAttribute Prayog e) {
		 service.save(e);;
	     List<Prayog> list = service.getPrayog();
	     ModelAndView mav = new ModelAndView("prayog");
	     mav.addObject("prayogList",list);
	     mav.addObject("prayog", new Prayog());
	     mav.addObject("message", "Successfully ");
		 return mav;
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deletePrayog(@PathVariable(name= "id") int id) {
		 service.delete(id); 
	     List<Prayog> list = service.getPrayog();
	     ModelAndView mav = new ModelAndView("prayog");
	     mav.addObject("prayogList",list);
	     mav.addObject("prayog", new Prayog());
	     mav.addObject("message", "Successfully Delete");
		 return mav;
	}
	
	@GetMapping("/{id}")
	public ModelAndView getPrayog(@PathVariable(name= "id") int id) {
		 Prayog prayog = service.getPrayog(id); 
	     List<Prayog> list = service.getPrayog();
	     ModelAndView mav = new ModelAndView("prayog");
	     mav.addObject("prayogList",list);
	     mav.addObject("prayog", prayog);
		 return mav;
	}
	
}
