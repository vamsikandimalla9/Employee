package com.employee.dao;

import java.util.Set;

import com.employee.bean.Employee;

import junit.framework.TestCase;

public class EmployeeDaoImpTest extends TestCase {

	EmployeeDao employeeDAO;
	protected void setUp() throws Exception {
		super.setUp();
		employeeDAO  = new EmployeeDaoImpl();
	}
	
	
	public void testAddEmployee() {
		employeeDAO.addEmployee(createEmployee());
	}
	
	public void testGetAllEmployees() {
		
		Set<Employee> employees =employeeDAO.getAllEmployees();
		Employee employee =employees.iterator().next();
		
		assertEquals(101, employee.getId());
	
	
	}
	
	
	public void testGetEmployee() {
	
		Employee emp=employeeDAO.getEmployee(101);
		assertEquals("jayazepeda@teleworm.us", emp.getEmail());
	}
	
	public void testDeleteEmployee() {
		
		
		employeeDAO.deleteEmployee(103);
		
	}
	
	public void testUpdateEmployee() {

		Employee emp =employeeDAO.updateEmployee(employeeDAO.getEmployee(101));
		assertEquals(101, emp.getId());
		assertEquals("jayazepeda@teleworm.us", emp.getEmail());
	}
	
	
	
	private Employee createEmployee() {
		
		Employee e1 = new Employee(101, "Jay A. Zepada", "(618)233-6381", "jayazepeda@teleworm.us", " 1414 Ross Street",
				"$5000");
		
		return e1;
		
	}

	

}
