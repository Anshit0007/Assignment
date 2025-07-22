package com.ttn_spring.restfulwebserives.emloyee;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<Employee> employee=new ArrayList<>();
    private static int empcount=0;
    static{
        employee.add(new Employee(++empcount,"Anshit", 23));
        employee.add(new Employee(++empcount,"Nikhil", 24));
        employee.add(new Employee(++empcount,"Akash", 21));
    }
    public List<Employee> findAll(){
        return employee;
    }

    public Employee findOne(int id){
       return employee.stream().filter(emp-> emp.getId().equals(id)).findFirst().orElse(null);

    }

    public Employee save(Employee emp){
     emp.setId(++empcount);

     employee.add(emp);
     return emp;

    }
    public void deleteById(int id){
         employee.removeIf(emp->emp.getId().equals(id));
    }

    public Employee updateEmployee(int id, Employee updatedEmp) {
        for (Employee emp : employee) {
            if (emp.getId().equals(id)) {
                emp.setName(updatedEmp.getName());
                emp.setAge(updatedEmp.getAge());
                return emp;
            }
        }
        return null;
    }


}
