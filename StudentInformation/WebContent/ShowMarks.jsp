<html>
<head>
<title>View Marks</title>
</head>
<body>
<%@include file="HeaderUser.jsp" %>
 <br>
 <form action="viewMarks" method="POST">
 Enter Your System Id for Showing Marks : <input type="text" name="id" placeholder="Enter System Id">
 <br>
 <input type="submit" value="show Marks">
 
 </form>
 <br>

<%@include file="FooterUser.jsp" %>
</body>
</html>