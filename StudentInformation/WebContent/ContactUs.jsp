<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Contact Form</title>
    <link href="CSS.css" rel="stylesheet" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<%@include file="HeaderUser.jsp" %>

<section class="contact-sec">
	<div class="container-fluid ">
<div class="row">
  <div class="col-md-12 col-sm-12 col-xs-12">
  		<div class="row">
    <div class="col-md-2"></div>
    <div class="col-md-8 col-sm-8 col-x-12">
    <div class="contact-heading">
    	<p>Contact us</p>
    </div>
    <div class="contact-form">
    	<form>
        <span>Full Name</span>
        	<input class="contact-input" type="text" role="textbox" placeholder="Enter Your Name Here..">
            <span>Email</span>
            <input class="contact-input" type="email" role="textbox" placeholder="Enter Email Here..">
            <span>Your Message</span>
            <textarea class="txt-area" rows="20" cols="100" placeholder="Write your message here.."></textarea>           
        </form>	
        </div>          
    </div>
    <div class="col-md-2"></div>
</div>			
      <div style="padding:50px;">
         <center><a href="ContactUsAfter.jsp" class="btn-send">Send</a></center>
      </div>
  </div>
</div>
</div>
</section>

<%@include file="FooterUser.jsp" %>
</body>
</html>