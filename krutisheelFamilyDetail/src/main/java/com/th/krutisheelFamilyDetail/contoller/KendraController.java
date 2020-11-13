package com.th.krutisheelFamilyDetail.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.th.krutisheelFamilyDetail.model.Kendra;
import com.th.krutisheelFamilyDetail.service.KendraService;

@RestController
@RequestMapping("/kendra")
public class KendraController {
	
	@Autowired
	private KendraService service;
	
	@GetMapping("/")
	public ModelAndView kendra(){
		ModelAndView mv = new ModelAndView("kendra");
		List<Kendra>list = service.getAllKendrName();
		mv.addObject("kendraList", list);
		mv.addObject("kendra", new Kendra());
		return mv;
	}
	
	@PostMapping("/")
	public ModelAndView saveKendra(@ModelAttribute Kendra e) {
		 service.save(e);;
	     List<Kendra> list = service.getAllKendrName();
	     ModelAndView mav = new ModelAndView("kendra");
	     mav.addObject("kendraList",list);
	     mav.addObject("kendra", new Kendra());
	     mav.addObject("message", "Successfully ");
		 return mav;
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteKendra(@PathVariable(name= "id") int id) {
		 service.delete(id); 
	     List<Kendra> list = service.getAllKendrName();
	     ModelAndView mav = new ModelAndView("kendra");
	     mav.addObject("kendraList",list);
	     mav.addObject("kendra", new Kendra());
	     mav.addObject("message", "Successfully Delete");
		 return mav;
	}
	
	@GetMapping("/{id}")
	public ModelAndView getkendraById(@PathVariable(name= "id") int id) {
		 Kendra kendra = service.getById(id); 
	     List<Kendra> list = service.getAllKendrName();
	     ModelAndView mav = new ModelAndView("kendra");
	     mav.addObject("kendraList",list);
	     mav.addObject("kendra", kendra);
		 return mav;
	}
	
	@GetMapping("/serch")
	public ModelAndView serch(@RequestParam String serch){
		ModelAndView mv = new ModelAndView("kendra");
		List<Kendra>list = service.serch(serch);
		mv.addObject("kendraList", list);
		mv.addObject("kendra", new Kendra());
		return mv;
	}
	
}
