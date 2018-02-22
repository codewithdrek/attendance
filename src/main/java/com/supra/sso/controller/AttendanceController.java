package com.supra.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AttendanceController {
	
    @RequestMapping(value="/welcomeattendance")
    public String openPageForModule() {
    	return "welcomeattendance";
    }
    
}