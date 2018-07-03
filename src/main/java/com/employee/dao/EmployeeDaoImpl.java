package com.employee.dao;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.employee.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	static Set<Employee> employees = new TreeSet<Employee>(new Comparator<Employee>() {

		public int compare(Employee o1, Employee o2) {
			return o1.getId()-o2.getId();
		}
		
	});
	static {
		Employee e1 = new Employee(101, "Jay A. Zepada", "(618)233-6381", "jayazepeda@teleworm.us", " 1414 Ross Street",
				"$5000");
		Employee e2 = new Employee(102, "Darnell P. Stokely", "(775)250-4437", "DarnellPStokely@teleworm.us",
				"4475 Rockford Road Reno, NV 89502", "$5200");
		Employee e3 = new Employee(103,"Terry J. Setzer","(718)989-2361","TerryJSetzer@teleworm.us",
				"3536 Lady Bug Drive New York, NY 10013","$4800");
		Employee e4 = new Employee(104,"Natasha T. Gilbert","(408)837-1576","NatashaTGilbert@teleworm.us",
				"3346 Black Oak Hollow Road San Francisco, CA 94107","$5700");
		Employee e5 = new Employee(105,"George C. Herman","(801)396-4507","GeorgeCHerman@teleworm.us",
				"96 Walton Street Salt Lake City, UT 84116","$5600");
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public Set<Employee> getAllEmployees() {
		return employees;
	}

	public void deleteEmployee(int employeeId) {
		Employee e = new Employee();
		for (Employee employee : employees) {
			if (employee.getId() == employeeId)
				e = employee;
		}
		employees.remove(e);

	}

	public Employee getEmployee(int employeeid) {
		Employee e = new Employee();
		for (Employee employee : employees) {
			if (employee.getId() == employeeid)
				e = employee;
		}
		return e;
	}

	public Employee updateEmployee(Employee employee) {
		int id = employee.getId();
		Employee emp = new Employee();
		for (Employee e : employees) {
			System.out.println(e.getId() );
			if (e.getId() == id)
				emp = e;
			break;
		}
		emp.setAddress(employee.getAddress());
		emp.setEmail(employee.getEmail());
		emp.setName(employee.getName());
		emp.setNumber(employee.getNumber());
		emp.setSalary(employee.getSalary());
		emp.setId(employee.getId());
		return emp;
	}
	
}
