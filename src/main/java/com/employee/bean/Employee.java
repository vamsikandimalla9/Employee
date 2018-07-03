package com.employee.bean;

public class Employee {

	private int id;
	private String name;
	private String number;
	private String email;
	private String address;
	private String salary;

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String number, String email, String address, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", number=" + number + ", email=" + email + ", address="
				+ address + ", salary=" + salary + "]";
	}
	
	

}
