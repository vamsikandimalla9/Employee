package com.employee.servlets;



import java.io.IOException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDao edao=new EmployeeDaoImpl();
    public EmployeeServlet() {
        super();
    }
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		System.out.println(action);
		if(action.equals("register")) {
			
			response.sendRedirect("registration.jsp");
		}else if(action.equals("list")) {
			
			Set<Employee> employee = edao.getAllEmployees();
			
			ServletContext context = getServletContext();
			context.setAttribute("data",employee);
			response.sendRedirect("list.jsp");
		}else if(action.equals("registry")) {
			
			int id = Integer.parseInt(request.getParameter("eid"));
			String name = request.getParameter("name");
			String number = request.getParameter("number");
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			String salary = request.getParameter("salary");
			
			Employee emp=new Employee(id, name, number, email, address, salary);
			edao.addEmployee(emp);
			response.sendRedirect("home.jsp");
			
		}else if(action.equals("edit")) {
			int id=Integer.parseInt(request.getParameter("id"));
			Employee employee=edao.getEmployee(id);
			
			request.setAttribute("employee", employee);
			RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
			rd.forward(request, response);
		}else if(action.equals("delete")) {
			int id=Integer.parseInt(request.getParameter("id"));
			System.out.println(id);
			edao.deleteEmployee(id);
			Set<Employee> employee = edao.getAllEmployees();
			ServletContext context = getServletContext();
			context.setAttribute("data",employee);
			response.sendRedirect("list.jsp");
		}else if(action.equals("cancel")) {
			response.sendRedirect("list.jsp");
		}else if(action.equals("update")) {
			int id = Integer.parseInt(request.getParameter("eid"));
			String name = request.getParameter("name");
			String number = request.getParameter("number");
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			String salary = request.getParameter("salary");
			Employee emp=new Employee(id, name, number, email, address, salary);
			edao.updateEmployee(emp);
			response.sendRedirect("list.jsp");
		}

	}
	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
