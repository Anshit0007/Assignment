package com.ttn_spring.restfulwebserives.Repository;

import com.ttn_spring.restfulwebserives.Entity.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // JPQL - 1
    @Query("SELECT e.firstName, e.lastName FROM Employee e WHERE e.salary > (SELECT AVG(e2.salary) FROM Employee e2) ORDER BY e.age ASC, e.salary DESC")
    List<Object[]> findAboveAverageOrdered();

    // JPQL - 2
    @Modifying
    @Query("UPDATE Employee e SET e.salary = :newSalary WHERE e.salary < (SELECT AVG(e2.salary) FROM Employee e2)")
    int updateSalaryBelowAvg(@Param("newSalary") Double newSalary);

    // JPQL - 3
    @Modifying
    @Query("DELETE FROM Employee e WHERE e.salary = (SELECT MIN(e2.salary) FROM Employee e2)")
    int deleteEmployeesWithMinSalary();

    // Native - 1
    @Query(value = "SELECT empId, empFirstName, empAge FROM employeeTable WHERE empLastName LIKE %:suffix", nativeQuery = true)
    List<Object[]> findByLastNameEndsWith(@Param("suffix") String suffix);

    // Native - 2
    @Modifying
    @Query(value = "DELETE FROM employeeTable WHERE empAge > :ageLimit", nativeQuery = true)
    int deleteByAgeGreaterThan(@Param("ageLimit") int ageLimit);
}