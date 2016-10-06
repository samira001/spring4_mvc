package com.programcreek.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	String message = "Welcome to Spring MVC!";

	@RequestMapping(value= "/hello" , method= RequestMethod.GET )
	public ModelAndView showMessage(){
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
    @RequestMapping(value = "/addUser", method=RequestMethod.POST)
    public ModelAndView submitUser(@RequestParam("userName")String name,@RequestParam("password")String password){
        ModelAndView model=new ModelAndView("helloworld");
        model.addObject("message",name + password);
        return model;
    }

}
