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
					<h4 class="form-head">Login</h4>
					<form action="login" method="post">
						<div class="form-group">
							<label for="name">Username *</label> <input type="text" required class="form-control" placeholder="User name here"	name="username">
						</div>
						<div class="form-group">
							<label for="name">Password *</label> <input type="password"	required class="form-control" placeholder="Password here" name="password">
						</div>
						<div class="form-group text-center">
							<input type="submit" class="btn btn-success" name="submit"	value="login">
						</div>
					</form>
				</div>
			</div>
		</div>
		<br>
		<br>
		<div class="text-center">
			<h1><a href="RegisterUser.jsp">Register User Here</a></h1>
		</div>
	</div>
<script type="text/javascript">
alert("For Using This Application You Have To Login First");
</script>
</body>
</html>