package com.employee.dao;

import java.util.Set;

import com.employee.bean.Employee;

public interface EmployeeDao {
	
	public void addEmployee(Employee employee);
	 
    public Set<Employee> getAllEmployees();
 
    public void deleteEmployee(int employeeId);
 
    public Employee getEmployee(int employeeid);
 
    public Employee updateEmployee(Employee employee);
	
}
