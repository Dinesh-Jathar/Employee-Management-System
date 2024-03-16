package org.employee.Employee_Management_System.repositoery;

import org.employee.Employee_Management_System.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoery extends JpaRepository<Employee, Integer> {

}
