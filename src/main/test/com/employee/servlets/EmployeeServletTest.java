package com.employee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.easymock.EasyMock;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;

import junit.framework.TestCase;

public class EmployeeServletTest extends TestCase {

	HttpServletRequest request =EasyMock.createMock(HttpServletRequest.class)  ;
	HttpServletResponse response  = EasyMock.createMock(HttpServletResponse.class) ;
	EmployeeServlet employeeServlet = EasyMock.createMock(EmployeeServlet.class);
	EmployeeDao employeeDAO= EasyMock.createMock(EmployeeDaoImpl.class);
	Employee employee =EasyMock.createMock(Employee.class);
	
	
	protected void setUp() throws Exception {
		 //employeeServlet = new EmployeeServlet();
		super.setUp();
	}

	

	public void testDoGetHttpServletRequestHttpServletResponse() throws ServletException, IOException {
		
		
		EasyMock.expect(request.getParameter("action")).andReturn("registry");
		EasyMock.expect(request.getParameter("id")).andReturn(String.valueOf(101));
		EasyMock.expect(request.getParameter("name")).andReturn("Jay A. Zepada");
		EasyMock.expect(request.getParameter("number")).andReturn("(618)233-6381");
		EasyMock.expect(request.getParameter("email")).andReturn("jayazepeda@teleworm.us");
		EasyMock.expect(request.getParameter("address")).andReturn("1414 Ross Street");
		employeeServlet.doGet(request, response); 
		EasyMock.expect(request.getParameter("action")).andReturn("register");
		employeeServlet.doGet(request, response); 
		EasyMock.expect(request.getParameter("action")).andReturn("list");
		employeeServlet.doGet(request, response); 
		EasyMock.expect(request.getParameter("action")).andReturn("edit");
		EasyMock.expect(request.getParameter("id")).andReturn(String.valueOf(101));
		employeeServlet.doGet(request, response); 

		EasyMock.expect(request.getParameter("action")).andReturn("delete");
		EasyMock.expect(request.getParameter("id")).andReturn(String.valueOf(101));
		employeeServlet.doGet(request, response); 
		EasyMock.expect(request.getParameter("action")).andReturn("cancel");
		employeeServlet.doGet(request, response);
		EasyMock.expect(request.getParameter("action")).andReturn("update");
		EasyMock.expect(request.getParameter("id")).andReturn(String.valueOf(101));
		EasyMock.expect(request.getParameter("name")).andReturn("Jay A. Zepada");
		EasyMock.expect(request.getParameter("number")).andReturn("(618)233-6381");
		EasyMock.expect(request.getParameter("email")).andReturn("jayazepeda@teleworm.us");
		EasyMock.expect(request.getParameter("address")).andReturn("1414 Ross Street");
		employeeServlet.doGet(request, response); 
	}
	
	
	public void testDoPostHttpServletRequestHttpServletResponse() throws ServletException, IOException {
	
		employeeServlet.doPost(request, response);
	}
	
	
	
}
