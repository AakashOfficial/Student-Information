<!DOCTYPE html>
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
<div class="container">
	<div class="row">
	<div class="col-md-9 form-space">
          <div class="col-md-offset-4 shadow  form-bg">
              <h4 class="form-head">Register Only For Students</h4>
			     <form action="registerAuthorities" method="post" >
				 
                  <div class="form-group">
                    <label for="employee_id">Employee Id *</label>
                    <input type="text" required class="form-control" placeholder="Enter Employee Id Here" name="employee_id">
                  </div>
				  
				  <div class="form-group">
                    <label for="password">Password *</label>
                    <input type="password" required class="form-control" placeholder="Enter Roll No Here" name="password">
                  </div>
				  
				  <div class="form-group">
                    <label for="name">Role Of User *</label>
                    <input type="text" required class="form-control" placeholder="Enter Role Of User(Not For Students)" name="role_of_user">
                  </div>
                  
                  <div class="form-group">
                    <label for="name">Name Of User *</label>
                    <input type="text" required class="form-control" placeholder="Enter Your Name" name="name_of_user">
                  </div>
                  
                  <div class="form-group">
                    <label for="name">Address *</label>
                    <input type="text" required class="form-control" placeholder="Enter Address Here" name="address">
                  </div>
                  
				 <div class="form-group text-center">
					<input type="submit" class="btn btn-success" name="register_btn" value="Register">
                  </div>
				 </form>
				 
              </div>
        </div>
	</div>
</div>
<script type="text/javascript">
alert("Only Admin and Faculty can be Registered. Dont Register Student Here");
</script>
	
</body>
</html>
