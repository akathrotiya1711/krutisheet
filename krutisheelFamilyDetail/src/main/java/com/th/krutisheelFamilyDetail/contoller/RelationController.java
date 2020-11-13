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
import com.th.krutisheelFamilyDetail.model.Relation;
import com.th.krutisheelFamilyDetail.service.RelationService;

@RestController
@RequestMapping("/relation")
public class RelationController {
	
	@Autowired
	private RelationService service;
	
	@GetMapping("/")
	public ModelAndView relation(){
		ModelAndView mv = new ModelAndView("relation");
		List<Relation>list = service.findAllRelations();
		mv.addObject("relationList", list);
		mv.addObject("relation", new Relation());
		return mv;
	}
	
	@PostMapping("/")
	public ModelAndView saveRelation(@ModelAttribute Relation e) {
		 service.saveRelation(e);
	     List<Relation> list = service.findAllRelations();
	     ModelAndView mav = new ModelAndView("relation");
	     mav.addObject("relationList",list);
	     mav.addObject("relation", new Relation());
	     mav.addObject("message", "Successfully ");
		 return mav;
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteRelation(@PathVariable(name= "id") int id) {
		 service.deleteRelation(id); 
	     List<Relation> list = service.findAllRelations();
	     ModelAndView mav = new ModelAndView("relation");
	     mav.addObject("relationList",list);
	     mav.addObject("relation", new Relation());
	     mav.addObject("message", "Successfully Delete");
		 return mav;
	}
	
	@GetMapping("/{id}")
	public ModelAndView getRelation(@PathVariable(name= "id") int id) {
		 Relation relation = service.getRelation(id); 
	     List<Relation> list = service.findAllRelations();
	     ModelAndView mav = new ModelAndView("relation");
	     mav.addObject("relationList",list);
	     mav.addObject("relation", relation);
		 return mav;
	}
	
	@GetMapping("/serch")
	public ModelAndView serch(@RequestParam String serch) {
	     List<Relation> list = service.serch(serch);
	     ModelAndView mav = new ModelAndView("relation");
	     mav.addObject("relationList",list);
	     mav.addObject("relation", new Relation());
		 return mav;
	}
	
}
