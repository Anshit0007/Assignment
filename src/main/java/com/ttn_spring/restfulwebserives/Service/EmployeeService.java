package com.ttn_spring.restfulwebserives.Service;

import com.ttn_spring.restfulwebserives.Entity.employee.Employee;
import com.ttn_spring.restfulwebserives.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Object[]> findAboveAverageOrdered() {
        return repo.findAboveAverageOrdered();
    }

    public int updateSalary(Double newSalary) {
        return repo.updateSalaryBelowAvg(newSalary);
    }

    public int deleteMinSalaryEmployees() {
        return repo.deleteEmployeesWithMinSalary();
    }

    public List<Object[]> findLastNameSingh() {
        return repo.findByLastNameEndsWith("singh");
    }

    public int deleteByAge(int age) {
        return repo.deleteByAgeGreaterThan(age);
    }

    public Employee save(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> findAll() {
        return repo.findAll();
    }
}
