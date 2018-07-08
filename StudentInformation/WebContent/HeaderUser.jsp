<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>User Header</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="HomeUser.jsp">Student Information Center</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="HomeUser.jsp">Home <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Show Result</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Account Setting <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="ShowMarks.jsp">Show Result</a></li>
            <li><a href="#">Show Information</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="UpdateUser.jsp">Update Information</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="/logout">Logout</a></li>
          </ul>
        </li>
      </ul>


      <ul class="nav navbar-nav navbar-right">
        <li><a href="/logout">Logout</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Quick Actions <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="ShowMarks.jsp">View Marks</a></li>
            <li><a href="AboutUs.jsp">About Us</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="ContactUs.jsp">Contact Us</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<script type="text/javascript">
$('ul.nav li.dropdown').hover(function() {
  $(this).find('.dropdown-menu').stop(true, true).delay(200).fadeIn(500);
}, function() {
  $(this).find('.dropdown-menu').stop(true, true).delay(200).fadeOut(500);
});
</script>
</body>
</html>
