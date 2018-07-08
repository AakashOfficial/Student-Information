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

@WebServlet("/updateuser")
public class UpdateUserServlet extends HttpServlet{
	
	Connection con = null;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		String system_id_input = req.getParameter("system_id");
		String address_input = req.getParameter("address");
		String email_input = req.getParameter("email_id");		
		String name_input = req.getParameter("name_of_user");
		String section_input = req.getParameter("section");
		String date_of_birth_input = req.getParameter("date_of_birth");
		
		String address_output, email_output, name_output, section_output, date_of_birth_output;
		try {

			con = MyConnection.getCon();
			System.out.println("Connection Created");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student where system_id = '" + system_id_input + "' ");

			while (rs.next()) {
				name_output = rs.getString(4);
				section_output = rs.getString(7);
				address_output = rs.getString(8);
				email_output = rs.getString(9);
				date_of_birth_output = rs.getString(10);

				if (name_input.length() > 0) {
					System.out.println("Name Is Entered by User");
				} else {
					name_input = name_output;
				}

				if (section_input.length() > 0) {
					System.out.println("Section Is Entered By User");
				} else {
					section_input = section_output;
				}

				if (address_input.length() > 0) {
					System.out.println("Address Is Entered By User");
				} else {
					address_input = address_output;
				}

				if (email_input.length() > 0) {
					System.out.println("Email Is Entered By User");
				} else {
					email_input = email_output;
				}

				if (date_of_birth_input.length() > 0) {
					System.out.println("Date Of Birth Is Entered By User");
				} else {
					date_of_birth_input = date_of_birth_output;
				}

			}
			
			stmt.close();
			
			String updateQuery = "update student set email_id = ('"+ email_input +"'), address = ('"+ address_input +"'),section = ('"+ section_input+"'),email_id = ('" +email_input+ "'),date_of_birth = ('"+date_of_birth_input+"') where system_id=('"+ system_id_input +"')";
			Statement stmt2=con.createStatement();
			int i=stmt2.executeUpdate(updateQuery);
			if (i > 0) {
				System.out.println("User is Updated with Email ID : " + email_input + " and Address " + address_input);
				RequestDispatcher rd = req.getRequestDispatcher("UpdateUser.jsp");
				rd.include(req, res);
				out.print("Address And Email Updated");
			}
			
			stmt2.close();			
			con.close();
			rs.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
