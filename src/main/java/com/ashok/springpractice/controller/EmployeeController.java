package com.ashok.springpractice.controller;

import com.ashok.springpractice.repository.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ashok_Peravali on 11/20/2017.
 */
@Controller
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @RequestMapping("/employees")
    public String getEmployees(Model model){
        System.out.print("Testing....test..iii");
        model.addAttribute("employees", employeeRepository.findAll());
        return "employees";//look for employees.html in template folder
    }
}
