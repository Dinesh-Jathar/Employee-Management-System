package org.employee.Employee_Management_System.service;

import java.util.List;
import java.util.Optional;

import org.employee.Employee_Management_System.dao.EmployeeDao;
import org.employee.Employee_Management_System.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public List<Employee> getAllEmployee(){
		return dao.getAllEmployee();
	}
	
	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}
	
	public Employee getEmployeeById(int id) {
		Optional<Employee> optional= dao.getEmployeeById(id);
		Employee employee=null;
		if(optional.isPresent()) {
			employee=optional.get();
		}else {
			throw new RuntimeException("Employee Not Found ::"+id);
		}
		return employee;
	}
	
	public void deleteEmployeeById(int id) {
		dao.deleteEmployeeById(id);
	}
}
