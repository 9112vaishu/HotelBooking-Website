<%@page import="java.sql.Connection"%>
<%@page import="com.DB.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee info</title>
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
		url('https://images.pexels.com/photos/594077/pexels-photo-594077.jpeg?auto=compress&cs=tinysrgb&w=600');
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
				<h5>Employee registration page</h5>
			</div>
			<%
			String regMsg = (String) session.getAttribute("reg-msg");

			if (regMsg != null) {
			%>
			<div class="alert alert-success" role="alert"><%=regMsg%>Login..<a
					href="employeeLogin.jsp">click here</a>
			</div>
			<%
			session.removeAttribute("regMsg-msg"); 
			}
			%>



			<form action="registerServlet" method="post">
				<div class="user-details">
					<div class="input-box">
						<span class="details"> employee Full Name</span> <input
							type=" text" placeholder="Enter your name" required
							name="EmployeeName">
					</div>

					<div class="input-box">
						<span class="details">employee email</span> <input type=" text"
							placeholder="Enter your email" required name="email">
					</div>
					<div class="input-box">
						<span class="details">employee phone number</span> <input
							type=" text" placeholder="Enter your number" required
							name="PhoneNumber">
					</div>
					<div class="input-box">
						<span class="details">employee password</span> <input type=" text"
							placeholder="Enter your password" required name="Password">
					</div>

				</div>
				<div class="gender-details">
					<input type="radio" name="gender" id="dot-1"> <input
						type="radio" name="gender" id="dot-2"> <input type="radio"
						name="gender" id="dot-3"> <span class="gender-title">
						<b>Gender</b>
					</span>
					<div class="category" name="Gender">
						<label for="dot-1"> <span class="dot one"></span> <span
							class="gender">male</span>
						</label> <label for="dot-2"> <span class="dot two"></span> <span
							class="gender">female</span>
						</label> <label for="dot-3"> <span class="dot three"></span> <span
							class="gender">prefer not to say</span>
						</label>
					</div>
				</div>
				<div class="button">

					<input type="submit" class="btn btn-primary btn-block badge-pill"
						value="Register"> <br>
				</div>
			</form>
			<a class="btn btn-small btn-block badge-pill" href="HomePage.html">back</a>
		</div>
</body>
</html>