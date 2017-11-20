package com.ashok.springpractice.repository;

import com.ashok.springpractice.domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ashok_Peravali on 11/20/2017.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
