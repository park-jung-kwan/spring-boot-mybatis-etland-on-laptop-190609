package com.newjersey.web.controller;

import com.newjersey.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MemberController
 */
@Controller
public class CustomerController {
    @Autowired CustomerService service;
    @RequestMapping("/")
    public String displayStartPage(Model model){
		System.out.println("====  1  ====");
		String num = service.countAll();
        model.addAttribute("msg", "총회원수는 "+num+" 이다");
        return "index";
    }
}