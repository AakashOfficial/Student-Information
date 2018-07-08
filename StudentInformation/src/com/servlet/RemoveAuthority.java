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

@WebServlet("/removeAuthority")
public class RemoveAuthority extends HttpServlet{
	
	Connection con = null;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		String id = req.getParameter("id");
		try {
			con = MyConnection.getCon();
			System.out.println("Connection Created");
			
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("delete  from authentication where id = ('" + id + "')");
			if (i == 1) {
				System.out.println("Higher Authority is Deleted with User ID : " + id );
				RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
			    rd.forward(req, res);
			    out.print("Higher Authority Is Removed");
			    out.print("Please Login Again");
			}
			stmt.close();		
			con.close();			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}