package org.employee.Employee_Management_System.dao;

import java.util.List;
import java.util.Optional;

import org.employee.Employee_Management_System.dto.Employee;
import org.employee.Employee_Management_System.repositoery.EmployeeRepositoery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	@Autowired
	private EmployeeRepositoery repositoery;
	
	public  List<Employee> getAllEmployee(){
		return repositoery.findAll();
	}
	
	public void saveEmployee(Employee employee) {
		repositoery.save(employee);
	}
	
	public Optional<Employee> getEmployeeById(int id) {
		return repositoery.findById(id);
	}
	
	public void deleteEmployeeById(int id) {
		repositoery.deleteById(id);
	}
}