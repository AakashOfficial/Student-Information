package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MyDataDAO;
import com.dao.MyDataDAOImpl;
import com.model.HigherAuthorities;
import com.model.MyData;

@WebServlet("/registerAuthorities")
public class RegisterHigherAuthoritiesByAdmin extends HttpServlet {
	
	HigherAuthorities ha = new HigherAuthorities();
 
  public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
	  res.setContentType("text/html");
	  PrintWriter out=res.getWriter();
	  ha.setId(req.getParameter("employee_id"));
	  ha.setPassword(req.getParameter("password"));
	  ha.setRole(req.getParameter("role_of_user"));
	  ha.setName(req.getParameter("name_of_user"));
	  ha.setAddress(req.getParameter("address"));
	  
	  MyDataDAO myDAO=new MyDataDAOImpl();
	  boolean result=myDAO.addAuthorities(ha);
		
	  if(result == true) {
		  RequestDispatcher rd = req.getRequestDispatcher("HomeAdmin.jsp");
		    rd.forward(req, res);
		    System.out.print("Higher Authorities Sucessfully Registered ");
		    System.out.println("Higher Authorities Name is : " + ha.getName() );
		    System.out.println("Higher Authorities ID is : " + ha.getId() );
		  out.println("Higher Authorities is Successfully Registered....");
	  }else {
		  out.print("Higher Authorities Not Registered. Please Check All Values You Inserted....");
	  }
	  
	  
	  out.close();
  }
}
