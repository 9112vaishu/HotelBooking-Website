<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>resortbook</title>
    <link rel="stylesheet" href="css/Hotel.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<style>
body {
	background-image:
		url('https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8bHV4dXJ5JTIwcmVzb3J0fGVufDB8fDB8fHww');
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
        <form class="form-group" action="HotelServlet" method="post">
            <div id="form">
                <h1 class="text-white text-center">Booking Now</h1>

                <div id="first-group">

                    <div id="content">
                        <i class="fa fa-user" aria-hidden="true"></i>
                        <input type="text" id="input-group" placeholder="First name" name="Firstname">
                    </div>

                    <div id="content">
                        <i class="fa fa-phone" aria-hidden="true"></i>
                        <input type="number" id="input-group" placeholder="Phone number" name="PhoneNo">
                    </div>

                    <div id="content">
                        <i class="fa fa-calendar" aria-hidden="true"></i>
                        <input type="text" id="input-group" placeholder="Departure Date" name="DepartureDate">
                    </div>

                    <div id="content">
                    <input type="text" id="input-group" placeholder="No of guest" name="Noofguest">
                        <i class="fa fa-users" aria-hidden="true"></i>
                       
                    </div>

                </div>

                <div id="second-group">

                    <div id="content">
                        <i class="fa fa-user" aria-hidden="true"></i>
                        <input type="text" id="input-group" placeholder="Last name" name="Lastname">
                    </div>

                    <div id="content">
                        <i class="fa fa-envelope-o" aria-hidden="true"></i>
                        <input type="email" id="input-group" placeholder="Email" name="email">
                    </div>

                    <div id="content">
                        <i class="fa fa-calendar" aria-hidden="true"></i>
                        <input type="text" id="input-group" placeholder="Arrival Date" name="ArrivalDate">
                    </div>

                    <div id="content">
                        <i class="fa fa-users" aria-hidden="true"></i>
                        <input type="text" id="input-group" placeholder="Room Type" name="RoomType">
                     </div>
            
                </div>

                <button type="submit" value="Submit" id="submit-btn">Book Now</button>

            </div>
        </form>
    </div> 
</body>
</html>