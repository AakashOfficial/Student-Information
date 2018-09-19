<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Login Form</title>
    <link href="CSS.css" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="HeaderUser.jsp" %>
<div class="container">
	<div class="row">
	<div class="col-md-9 form-space">
          <div class="col-md-offset-4 shadow  form-bg">
              <h4 class="form-head">Update Information For Students Only</h4>
			     <form action="updateuser" method="post" >
                  
                  <div class="form-group">
                    <label for="system_id">Enter System Id *</label>
                    <input type="text" required class="form-control" placeholder="Enter Your System Id" name="system_id">
                  </div>
                  
                  <div class="form-group">
                    <label for="name">Name Of User *</label>
                    <input type="text" class="form-control" placeholder="Enter Your Name" name="name_of_user">
                  </div>                  
                  
                  <div class="form-group">
                    <label for="section">Section *</label>
                    <input type="text" class="form-control" placeholder="Enter Section Here" name="section">
                  </div>
                  
                  <div class="form-group">
                    <label for="address">Address *</label>
                    <input type="text" class="form-control" placeholder="Enter Address Here" name="address">
                  </div>
                  
                  <div class="form-group">
                    <label for="email_id">Email Id *</label>
                    <input type="email" class="form-control" placeholder="Enter Email Id Here" name="email_id">
                  </div>
                  
                  <div class="form-group">
                    <label for="date_of_birth">Date Of Birth *</label>
                    <input type="date" class="form-control" placeholder="Enter Date Of Birth Here" name="date_of_birth">
                  </div>
                  
				 <div class="form-group text-center">
					<input type="submit" class="btn btn-success" name="update_btn" value="Update User">
                  </div>
				 </form>				 
              </div>
        </div>
	</div>
</div>
<%@include file="FooterUser.jsp" %>
</body>
</html>

