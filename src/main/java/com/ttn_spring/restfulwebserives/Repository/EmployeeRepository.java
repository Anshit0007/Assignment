package com.ttn_spring.restfulwebserives.Repository;



import com.ttn_spring.restfulwebserives.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);

    List<Employee> findByNameStartingWith(String prefix);

    List<Employee> findByAgeBetween(int startAge, int endAge);
}