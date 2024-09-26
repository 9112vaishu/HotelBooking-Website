<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
<meta charset="ISO-8859-1">
<title>user Login Page</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
crossorigin="anonymous">

<link rel="stylesheet"
 href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="css/style.css" >
<style>
body {
	background-image:
		url('https://images.pexels.com/photos/53577/hotel-architectural-tourism-travel-53577.jpeg?auto=compress&cs=tinysrgb&w=600');
	/* Optionally, you can specify background properties like size and repeat */
	cellpadding:"4";
	background-size: 40cm;
	background-repeat: no-repeat;
	/* You can also add more styles as needed */
}
</style>
</head>
<body>


<div class="container">
		
				<div class="card">
					<div class="card-header  text-center c-head text-black">
						<i class="fa fa-user-circle-o  fa-2x"></i>
						<h5> User Login Page</h5>
					</div>
					
				
			
				<div class="card-body">
                     
						<form action="UserLogServlet" method ="post">
						
							<div class="form-group">
								<label for="exampleInputEmail1">Enter Email of User</label> <input
									type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="email">
								
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Enter Password of User</label> <input
									type="password" class="form-control" id="exampleInputPassword1"
									name="UPassword">
							</div>
							
							<button type="submit" class="btn btn-primary btn-block badge-pill">Login</button>
						    
						</form>
						</div>
						<a class="btn btn-small btn-block badge-pill"  href="UserReg.jsp">Back
				     </a> 
				</div>
			</div>
		</div>
	</div>

   </body>
</html>  

   
   