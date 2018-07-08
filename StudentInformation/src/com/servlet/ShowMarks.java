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

@WebServlet("/viewMarks")
public class ShowMarks extends HttpServlet{

Connection con = null;
Statement stmt, stmt2;	
ResultSet rs,rs2;
String s1,s2,s3,s4,s5;
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		String id = req.getParameter("id");
		String course_output="" ;
		try {
			con = MyConnection.getCon();
			System.out.println("Connection Created");			
		    stmt = con.createStatement();
		    stmt2 = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student where system_id = ('" + id + "')");
			while(rs.next()) {
				course_output = rs.getString(5) ;
				
				if (course_output.equals("b.tech") || course_output.equals("B.tech") || course_output.equals("b.Tech") || course_output.equals("B.Tech")) {								 
					rs2 = stmt.executeQuery("select * from b_tech_marks where system_id = ('" + id + "')");	
					while(rs.next()) {
						s1=rs2.getString(3);
						s2=rs2.getString(4);
						s3=rs2.getString(5);
						s4=rs2.getString(6);
						s5=rs2.getString(7);
						out.print("<table><tr><td> Algorithm |</td> <td>Data Structure |</td> <td>Java |</td> <td>Operating System |</td> <td>Graph Theory |</td></tr> <tr><td>"+s1+"</td>   <td>"+s2+"</td> <td>"+s3+"</td> <td>"+s4+"</td> <td>"+s5+"</td> </tr>");
						RequestDispatcher rd = req.getRequestDispatcher("ShowMarks.jsp");
					    rd.include(req, res);
					}			
				}else {
					rs2 = stmt.executeQuery("select * from bba_marks where system_id = ('" + id + "')");
					
					while(rs2.next()) {
						s1=rs2.getString(3);
						s2=rs2.getString(4);
						s3=rs2.getString(5);
						s4=rs2.getString(6);
						s5=rs2.getString(7);
						RequestDispatcher rd = req.getRequestDispatcher("ShowMarks.jsp");
					    rd.include(req, res);
						out.print("<table><tr><td> Economics |</td> <td>Business Management |</td> <td>Accounting |</td> <td>Marketing |</td> <td>Project Work |</td></tr> <tr><td>"+s1+"</td>   <td>"+s2+"</td> <td>"+s3+"</td> <td>"+s4+"</td> <td>"+s5+"</td> </tr>");
					}					
						
				}
			}
						
			if (course_output.length() > 1) {
				
			}else {
				RequestDispatcher rd = req.getRequestDispatcher("ShowMarks.jsp");
			    rd.include(req, res);
				out.print("No Result Found Either System Id is Wrong or No Result Uploaded");
			}
			
			stmt.close();	
			stmt2.close();
			con.close();	
			rs.close();
			rs2.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}