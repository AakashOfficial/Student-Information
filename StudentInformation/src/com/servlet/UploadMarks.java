package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.MyConnection;

@WebServlet("/uploadMarks")
public class UploadMarks extends HttpServlet {

Connection con = null;
int i;
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		String id = req.getParameter("system_id");
		String course = req.getParameter("course");
		String subject1 = req.getParameter("subject1");
		String subject2 = req.getParameter("subject2");
		String subject3 = req.getParameter("subject3");
		String subject4 = req.getParameter("subject4");
		String subject5 = req.getParameter("subject5");
		
		try {
			con = MyConnection.getCon();
			System.out.println("Connection Created");
			String marksQuery1 = "insert into b_tech_marks values('" + id + "','" + course + "','" + subject1 + "','" + subject2 + "','" + subject3 + "','" + subject4 + "','" + subject5 + "')";
			String marksQuery2 = "insert into bba_marks values('" + id + "','" + course + "','" + subject1 + "','" + subject2 + "','" + subject3 + "','" + subject4 + "','" + subject5 + "')";
			Statement stmt = con.createStatement();
			Statement stmt2 = con.createStatement();
			ResultSet rs = stmt2.executeQuery("Select * from student where system_id='"+id+"'");
			System.out.println("Data Retrived");
			String id_output = "";
			while(rs.next()) {
				id_output = rs.getString(1);
			}
			if(id_output.equals(id)) {
				
			if (course.equals("b.tech") || course.equals("B.tech") || course.equals("b.Tech") || course.equals("B.Tech")) {			
				i = stmt.executeUpdate(marksQuery1);
			}else {				
				i = stmt.executeUpdate(marksQuery2);
			}
			if(i==1){				
				System.out.println("Marks Is Entered with User ID : " +id+ " and course is : " +course);	  
				RequestDispatcher rd = req.getRequestDispatcher("Marks.jsp");
			    rd.include(req, res);
			}
			}else {
				out.print("System Id not Found");
				RequestDispatcher rd = req.getRequestDispatcher("Marks.jsp");
			    rd.include(req, res);
				
			}			
			stmt.close();		
			con.close();			
		}catch(Exception e) {
			e.printStackTrace();
		}
}}