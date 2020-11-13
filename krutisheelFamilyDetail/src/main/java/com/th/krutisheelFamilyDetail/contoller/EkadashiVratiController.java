package com.th.krutisheelFamilyDetail.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.th.krutisheelFamilyDetail.model.EkadashiVrati;
import com.th.krutisheelFamilyDetail.service.EkadashiVratiRepoIMPL;
import com.th.krutisheelFamilyDetail.service.EkadashiVratiService;

@RestController
@RequestMapping("/ekadashiVrati")
public class EkadashiVratiController {
	
	@Autowired
	private  EkadashiVratiService service;
	
	@GetMapping("/")
	public ModelAndView home(){
		
		ModelAndView mav = new ModelAndView("ekadashiVrati");
		mav.addObject("ev", new EkadashiVrati());
		mav.addObject("evlist", service.get());
		return mav;
	}
	
	@PostMapping("/")
	public ModelAndView save(@ModelAttribute EkadashiVrati s){
		service.saveEkadashiVratiRepo(s);
		ModelAndView mav = new ModelAndView("ekadashiVrati");
		mav.addObject("ev", new EkadashiVrati());
		mav.addObject("evlist", service.get());
		mav.addObject("message", "Successfully ");
		return mav;
	}

	@RequestMapping("/{id}")
	public ModelAndView save(@PathVariable("id") int id ){
		ModelAndView mav = new ModelAndView("ekadashiVrati");
		mav.addObject("ev", service.get(id));
		mav.addObject("evlist", service.get());
		return mav;
	}
	@RequestMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id){
		service.delete(id);;
		ModelAndView mav = new ModelAndView("ekadashiVrati");
		mav.addObject("ev", new EkadashiVrati());
		mav.addObject("evlist", service.get());
		mav.addObject("message", "Successfully Delete");
		return mav;
	}
	@GetMapping("/serch")
	public ModelAndView serch(@RequestParam String serch){
		//service.saveEkadashiVratiRepo(name);
		ModelAndView mav = new ModelAndView("ekadashiVrati");
		mav.addObject("ev", new EkadashiVrati());
		mav.addObject("evlist", service.serch(serch));
		//mav.addObject("message", "Successfully ");
		return mav;
	}


}
