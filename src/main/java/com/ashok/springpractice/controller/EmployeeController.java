package com.ashok.springpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ashok_Peravali on 11/20/2017.
 */
@Controller
public class EmployeeController {
    @RequestMapping("/employees")
    public String getEmployees(){
        return "employees";
    }
}
