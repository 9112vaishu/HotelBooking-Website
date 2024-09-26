<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="css/F.css">
<style>
body {
	background-image:
		url('https://c4.wallpaperflare.com/wallpaper/234/425/298/daytime-lesser-antilles-antilles-summer-wallpaper-preview.jpg');
	/* Optionally, you can specify background properties like size and repeat */
	cellpadding ="4";
	background-size: 40cm;
	background-repeat: no-repeat;
	/* You can also add more styles as needed */
}
</style>
</head>
<body>
	<div class="wrap" class="col">
        <table >
        <form action="FeedbackServlet " method="post">
        
         <h1>Feedback Form</h1>
 	<%
			String regMsg = (String) session.getAttribute("reg-msg");

			if (regMsg != null) {
			%>
			<div class="alert alert-success" role="alert"><%=regMsg%>Logout<a
					href="HomePage.jsp">click here</a>
			</div>
			<%
			session.removeAttribute("regMsg-msg"); 
			}
			%>
          <tr>
             <td colspan="2" >
             <lable >
                How do you rate your overall exparience
             </lable>
             <br> 
             <input type="radio" name="rate" value="b" name="experience">Bad
             <input type="radio" name="rate" value="a" name="experience">Average
             <input type="radio" name="rate" value="g" name="experience">Good
             </td>
          </tr>
          
           <br>
          <tr>
          <td>
         
          <lable><b>FullName*</b></lable>
          <br>
          <input type="text" placeholder="  Enter your name" name="Fullname" class="txt">
          </td>
          <td>
          <lable><b>Email*</b></lable>
          <br>
          <input type="text" placeholder="  Enter your email" name="email" class="txt">
          </td>
          </tr>
           <tr>
          <td>
          <lable><b>Age*</b></lable>
          <br>
          <input type="text" placeholder="  Enter your age" name="age" class="txt">
          </td>
          <td>
          <lable><b>PhoneNumber*</b></lable>
          <br>
          <input type="text" placeholder="  Enter your PhoneName" name="PhoneNumber" class="txt">
          </td>
          </tr>
          <tr>
          <td colspan="2">
          <lable>
          
          Message
          </lable><br>
          <textarea class="txtarea" placeholder="  Enter your exparience" name="Message" ></textarea>
          </td>
          </tr>
          <tr>
          <td colspan="2" >
          <button type="submit" class="btn">Submit</button>
          </td>
           
          </tr>
        </form>
       
        </table>
		
		
		</div>
				
</body>
</html>