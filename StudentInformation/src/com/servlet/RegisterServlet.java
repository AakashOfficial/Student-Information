package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.Scanner;
//import java.util.Iterator;
//import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MyDataDAO;
import com.dao.MyDataDAOImpl;
import com.model.MyData;

@WebServlet("/register")
public class RegisterServlet  extends HttpServlet {
	
 MyData m = new MyData();
 
  public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
	  res.setContentType("text/html");
	  PrintWriter out=res.getWriter();
	  m.setSystem_id(req.getParameter("system_id"));
	  m.setRoll_no(req.getParameter("roll_no"));
	  m.setRole(req.getParameter("role_of_user"));
	  m.setName(req.getParameter("name_of_user"));
	  m.setCourse(req.getParameter("course"));
	  m.setBranch(req.getParameter("branch"));
	  m.setSection(req.getParameter("section"));
	  m.setAddress(req.getParameter("address"));
	  m.setEmail(req.getParameter("email_id"));
	  m.setDate_of_birth(req.getParameter("date_of_birth"));
	  
	  MyDataDAO myDAO=new MyDataDAOImpl();
	  boolean result=myDAO.addUser(m);
		
	  if(result == true) {
		  RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
		    rd.forward(req, res);
		    System.out.print("User Sucessfully Registered ");
		    System.out.println("User Name is : " + m.getName() );
		    System.out.println("User ID is : " + m.getSystem_id() );
		  out.println("User is Successfully Registered....");
	  }else {
		  out.print("User Not Registered. Please Check All Values You Inserted....");
	  }
	  
	  
	  out.close();
  }
}
