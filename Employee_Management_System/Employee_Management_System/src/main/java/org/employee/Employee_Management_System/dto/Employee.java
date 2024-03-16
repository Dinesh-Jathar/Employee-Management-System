package org.employee.Employee_Management_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_Id;
	private String employee_Name;
	private String employee_Email;
	private long employee_Mobno;
	private String employee_Designation;
	private String employee_Departement;
	
	public int getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public String getEmployee_Email() {
		return employee_Email;
	}
	public void setEmployee_Email(String employee_Email) {
		this.employee_Email = employee_Email;
	}
	public long getEmployee_Mobno() {
		return employee_Mobno;
	}
	public void setEmployee_Mobno(long employee_Mobno) {
		this.employee_Mobno = employee_Mobno;
	}
	public String getEmployee_Designation() {
		return employee_Designation;
	}
	public void setEmployee_Designation(String employee_Designation) {
		this.employee_Designation = employee_Designation;
	}
	public String getEmployee_Departement() {
		return employee_Departement;
	}
	public void setEmployee_Departement(String employee_Departement) {
		this.employee_Departement = employee_Departement;
	}
}
