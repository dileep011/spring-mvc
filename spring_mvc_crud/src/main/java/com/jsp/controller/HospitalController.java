package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;
@Controller
public class HospitalController {

	@Autowired
	HospitalService hospitalService;

	@RequestMapping("/loadhospital")
	public ModelAndView Load() {
		ModelAndView andView=new ModelAndView("savehospital.jsp");
		andView.addObject("hospital",new Hospital());
		return andView;

	}
	@RequestMapping("/saveHospital")
	public ModelAndView saveHospital(@ModelAttribute Hospital hospital) {
		Hospital  hospital2=hospitalService.saveHospital(hospital);
		if(hospital2!=null) {
			ModelAndView modelAndView=new ModelAndView("hospital.jsp");
			modelAndView.addObject("msg","data saved");
			return modelAndView;
		}
		else {
			ModelAndView modelAndView=new ModelAndView("/loadhospital");
			return modelAndView;
		}
	}
	@RequestMapping("/displayhosital")
	public ModelAndView dispayHospital() {
		List<Hospital> list=hospitalService.getAll();
		if(list.size()>0) {
			ModelAndView modelAndView=new ModelAndView("display.jsp");
			modelAndView.addObject("list",list);
			return modelAndView;
		}else {
			ModelAndView modelAndView=new ModelAndView("hospital.jsp");
			return modelAndView;

		}
	}
	@RequestMapping("/getbyid")
	public ModelAndView getById(@RequestParam int id) {
		Hospital hospital=hospitalService.getById(id);
		ModelAndView modelAndView=new ModelAndView("update.jsp");
		modelAndView.addObject("hospital", hospital);
		return modelAndView;
	}
	@RequestMapping("/updatehospital")
	public ModelAndView updateHospital(@ModelAttribute Hospital hospital) {
		hospitalService.updateHospital(hospital);
		ModelAndView andView=new ModelAndView("/displayhosital");
		return andView;
	}
	@RequestMapping("/deletehospital")
	public ModelAndView deleteHospital(@RequestParam int id) {
		hospitalService.deleteHospital(id);
		ModelAndView andView=new ModelAndView("/displayhosital");
		return andView;
		
	}
	

}


