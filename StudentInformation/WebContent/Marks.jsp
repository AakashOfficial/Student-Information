<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Upload Students Marks</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
        .form-bg{padding:40px;background:#f1f1f1;}
.shadow { box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);}
.form-control:focus {
	border-color: #ff80ff !important;
	background: #ffffff !important;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19) !important;
	
}
    </style>
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
</head>
<body>

<%@include file="HeaderAdmin.jsp" %>
<div class="container">
	<div class="row">
	<div class="col-md-9 form-space">
          <div class="col-md-offset-4 shadow  form-bg">
              <h4 class="form-head">Upload Marks Of Students</h4>
			     <form action="uploadMarks" method="post" >
				 
                  <div class="form-group">
                    <label for="name">System Id *</label>
                    <input type="text" required class="form-control" placeholder="Enter System Id Here" name="system_id">
                  </div>
                  
                  <div class="form-group">
                    <label for="name">Course *</label>
                    <input type="text" required class="form-control" placeholder="Enter Course Here" name="course">
                  </div>
                  
                  <div class="form-group">
                    <label for="subject1">Subject 1 *</label>
                    <input type="text" required class="form-control" placeholder="Enter Marks of Subject 1" name="subject1">
                  </div>
                  
                  <div class="form-group">
                    <label for="subject2">Subject 2 *</label>
                    <input type="text" required class="form-control" placeholder="Enter Marks of Subject 2" name="subject2">
                  </div>
                  
                  <div class="form-group">
                    <label for="subject3">Subject 3 *</label>
                    <input type="text" required class="form-control" placeholder="Enter Marks of Subject 3" name="subject3">
                  </div>
                  
                  <div class="form-group">
                    <label for="subject4">Subject 4 *</label>
                    <input type="text" required class="form-control" placeholder="Enter Marks of Subject 4" name="subject4">
                  </div>
                  
                  <div class="form-group">
                    <label for="subject5">Subject 5 *</label>
                    <input type="text" required class="form-control" placeholder="Enter Marks of Subject 5" name="subject5">
                  </div>
                  
				 <div class="form-group text-center">
					<input type="submit" class="btn btn-success" name="marks_upload_btn" value="Upload Marks">
                  </div>
				 </form>
				 
              </div>
        </div>
	</div>
</div>
<script type="text/javascript">

</script>
<br>
<%@include file="FooterAdmin.jsp" %>
</body>
</html>