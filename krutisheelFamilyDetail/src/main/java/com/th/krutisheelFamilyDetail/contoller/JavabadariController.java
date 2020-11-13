package com.th.krutisheelFamilyDetail.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.th.krutisheelFamilyDetail.model.Javabadari;
import com.th.krutisheelFamilyDetail.service.JavabadariServiceImpl;
import com.th.krutisheelFamilyDetail.utility.AjexQueryName;

@RestController
@RequestMapping("/javabadari")
public class JavabadariController {
	
	@Autowired
	private JavabadariServiceImpl js;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("javabadari");
		mav.addObject("javabadari", new Javabadari());
		mav.addObject("javabadariList", js.findAll());
		System.out.println("dfsa");
		return mav;
	}

	@PostMapping("/")
	public ModelAndView save(@ModelAttribute Javabadari j) {
		js.saveJavabadari(j);
		ModelAndView mav = new ModelAndView("javabadari");
		mav.addObject("javabadariList", js.findAll());
		mav.addObject("javabadari", new Javabadari());
		mav.addObject("message", "successfully");
		return mav;
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable (name = "id") int id) {
		js.deleteJavabadari(id);
		ModelAndView mav = new ModelAndView("javabadari");
		mav.addObject("javabadariList", js.findAll());
		mav.addObject("javabadari", new Javabadari());
		mav.addObject("message", "successfully Delete");
		return mav;
	}
	
	@GetMapping("/{id}")
	public ModelAndView getJavabadari(@PathVariable (name = "id") int id) {
		ModelAndView mav = new ModelAndView("javabadari");
		mav.addObject("javabadariList", js.findAll());
		mav.addObject("javabadari", js.getJavabadari(id));
		return mav;
	}

	@GetMapping("/serch")
	public ModelAndView serchJavabadari(@RequestParam (name= "serch") String name ) {
		System.out.println("1");
		ModelAndView mav = new ModelAndView("javabadari");
		System.out.println("2");
		mav.addObject("javabadariList", js.serch(name));
		System.out.println("1");
		mav.addObject("javabadari", new Javabadari());
		//mav.addObject("message", "successfully Delete");
		return mav;
	}
	
	
	
	
	/*
	 * @PostMapping("/serch/")
	 * 
	 * @ResponseBody public List<Javabadari> processAJAXRequest(@RequestBody
	 * AjexQueryName name) { // @RequestParam("name") String firstname ) {
	 * System.out.println(name.getName()); return js.serch(); }
	 */
	
}
