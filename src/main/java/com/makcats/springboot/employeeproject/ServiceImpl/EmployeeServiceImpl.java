package com.makcats.springboot.employeeproject.ServiceImpl;

import com.makcats.springboot.employeeproject.entity.Employee;
import com.makcats.springboot.employeeproject.repo.EmployeeRepo;
import com.makcats.springboot.employeeproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  EmployeeRepo employeeRepo;

    @Override
    public String saveEmployee(Employee employee) {
        Employee res = employeeRepo.save(employee);
        if (res == null){
            return "Employee data not saved";

        }
        return "Employee data saved successfully";
    }

}
