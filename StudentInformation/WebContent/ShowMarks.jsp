<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Marks</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
    
</head>
<body>



<%@ page import="java.util.*" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import=" java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%
try {
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/internship";
String username="root";
String password="@aakash";
String query="select * from userdata";
Connection conn=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
%>
<TABLE BORDER="1">
<TR>
    <TH>BRAND</TH>
    <TH>MODEL</TH>
    <TH>Quantity</TH>
</TR>
<% while(rs.next()){ %>
<TR>
    <TD> <%= rs.getString(1) %></td>
    <TD> <%= rs.getString(2) %></TD>
    <TD> <%= rs.getInt(3) %></TD>
</TR>
<% } %>
</TABLE>
<% rs.close();
  stmt.close();
  conn.close();
}catch(Exception e)
{ e.printStackTrace(); }
%>
</form>
</body> --%>


<html>
<head>
<title>View Marks</title>
</head>
<body>
<%@include file="HeaderUser.jsp" %>
 
 <form action="viewMarks" method="POST">
 Enter Your System Id for Showing Marks : <input type="text" name="id" placeholder="Enter System Id">
 <br>
 <input type="submit" value="show Marks">
 
 </form>
 
 
<%@include file="FooterUser.jsp" %>
</body>
</html>