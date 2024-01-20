<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Enter Your Details</h1>
<br>
<form action="Ankush" method="post">
Name :<input type="text" name="fname"><br>
Contact no : <input type="tel" name="contact"><br>
Gender :  <input type="radio" name="gender" value="Male">Male<input type="radio" value="Female" name="gender">Female  <input type="radio" value="Other" name="gender">Other<br>
<label>Address :</label><br>
<textarea rows="5" cols="50" name="address"></textarea><br>

Course : <input type="text" name="course"><br>
<label>Select Course duration:</label>
<select name="duration"> 
        <option value="3months">3 Months</option> 
            <option value="6months">6 Months</option> 
                    <option value="9months">9 Months</option></select><br>
                    <label>Hobbies :</label>
<input type="checkbox" name="hobbies" value="Reading"> Reading
<input type="checkbox" name="hobbies" value="Writing">Writing
<input type="checkbox" name="hobbies" value="Singing">Singing
<input type="checkbox" name="hobbies" value="Playing">Playing
<input type="checkbox" name="hobbies" value="Dancing">Dancing
<br>
 <input type="submit" value="Submit">
</form>

      
      
</body>
</html>