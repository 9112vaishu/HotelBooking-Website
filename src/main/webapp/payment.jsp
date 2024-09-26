<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pament</title>
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
		url('https://cf.bstatic.com/xdata/images/hotel/max1024x768/366678688.jpg?k=e0611c00f2c6a4c9e4f51911ae9f4211c4d245247e591aa3dd1fa7eef3746c50&o=&hp=1');
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
				<h5> Payment Method</h5>
			</div>
		<%
			String regMsg = (String) session.getAttribute("reg-msg");

			if (regMsg != null) {
			%>
			<div class="alert alert-success" role="alert"><%=regMsg%><a
					href="webhome.html">click here</a>
			</div>
			<%
			}
			%>



			<form action="paymentServlet" method="post">
				<div class="user-details">
					<div class="input-box">
						<span class="details"> Card No.</span> <input
							type=" text" placeholder="Enter your card number" required
							name="cardNo">
					</div>

					<div class="input-box">
						<span class="details">Payment</span> <input type=" text"
							placeholder="Enter your email" required name="payment">
					</div>
					<div class="input-box">
						<span class="details">Name on Bank</span> <input
							type=" text" placeholder="Enter your number" required
							name="NameOfBank">
					</div>
					<div class="input-box">
						<span class="details">Date of payment</span> <input type=" text"
							placeholder="Enter your password" required name="DateOfPayment">
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