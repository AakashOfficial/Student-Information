<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remove Students</title>
</head>
<body>

<%@include file="HeaderAdmin.jsp" %>
<br><br>
<h1>Are You Sure To Remove. This Cat Not Be UnDone</h1>
<br><br>

<form action="removeStudent" method="POST">
Enter Student  System Id : <br><input type="text" name="id" placeholder="Enter System Id Of Student" />
<br>
<input type="submit" name="removeStudent_btn" value="Remove Student" />
</form>

<form action="removeAuthority" method="POST">
Enter Student  Employee Id : <br><input type="text" name="id" placeholder="Enter System Id Of Authorities" />
<br>
<input type="submit" name="removeAuthority_btn" value="Remove Authority" />
</form>

<br><br>

<%@include file="FooterAdmin.jsp" %>
<script type="text/javascript">
alert("Are You Confirm to Remove Authority or Student. This action can not be undone");
</script>
</body>
</html>
