<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user registration</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="css/style.css">
<style>
body {
	background-image:
		url('https://images.pexels.com/photos/261169/pexels-photo-261169.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1');
	/* Optionally, you can specify background properties like size and repeat */
	cellpadding ="4";
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
				<h5>User registration form /</h5>
				<a href="UserLog.jsp">UserLog in</a>
			</div>
			<%
			String regMsg = (String) session.getAttribute("reg-msg");

			if (regMsg != null) {
			%>
			<div class="alert alert-success" role="alert"><%=regMsg%>Login..<a
					href="UserLog.jsp">click here</a>
			</div>
			<%
			session.removeAttribute("regMsg-msg");
			}
			%>



			<form action="UserRegServlet" method="post">
				<div class="user-details">
					<div class="input-box">
						<span class="details"> Enter Full Name</span> <input type=" text"
							placeholder="Enter your name" required name="userName">
					</div>

					<div class="input-box">
						<span class="details">Enter email</span> <input type=" text"
							placeholder="Enter your email" required name="email">
					</div>
					<div class="input-box">
						<span class="details">Enter phone number</span> <input
							type=" text" placeholder="Enter your number" required
							name="PhoneNumber">
					</div>
					<div class="input-box">
						<span class="details">Enter password</span> <input type=" text"
							placeholder="Enter your password" required name="UPassword">
					</div>
				<div  class="button">
						<input type="submit" align="center" class="btn btn-primary  btn-block badge-pill"
							value="Register"><br>
					</div>
			</form>
			<a class="btn btn-small btn-block badge-pill" href="HomePage.html">back</a>
		</div>
</body>
</html>