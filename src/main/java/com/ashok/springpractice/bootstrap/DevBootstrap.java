package com.ashok.springpractice.bootstrap;

import com.ashok.springpractice.domain.Employee;
import com.ashok.springpractice.repository.EmployeeRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ashok_Peravali on 11/20/2017.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private EmployeeRepository employeeRepository;

    public DevBootstrap(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.setName("Ashok");
        employee.setCode("Code1");
        employees.add(employee);

        employee = new Employee();
        employee.setName("Surya");
        employee.setCode("Code2");
        employees.add(employee);

        employeeRepository.save(employees);
    }
}