package org.employee.Employee_Management_System.cotntroller;


import org.employee.Employee_Management_System.dto.Employee;
import org.employee.Employee_Management_System.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/")
	public String homePageView(Model model) {
		 model.addAttribute("listOfEmployees",service.getAllEmployee());
		 return "EmployeeList.html";
	}
	
	@GetMapping("/showAddEmployeeForm")
	public String showAddEmployeeForm(Model model) {
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "index";
	}
		
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee")Employee employee) {
		service.saveEmployee(employee);
		return"redirect:/";
	}
	
	@GetMapping("showUpdateForm/{id}")
	public String showUpdateForm(@PathVariable int id,Model model) {
		Employee employee=service.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "Update";
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		service.deleteEmployeeById(id);
		return "redirect:/";
	}
	
	@GetMapping("/backToList")
	public String backToList() {
		return "redirect:/";
	}
}
