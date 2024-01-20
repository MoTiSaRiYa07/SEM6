<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USER DETILE </title>
<style>
    body
              { 
                background-color: black;
              
              }
              
              h1
              {
              
                  color: red;
                  text-align: center;
              }
              
              h2
              {
              
                  color: red;
              }
              
              .button {
  background-color: #04AA6D; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}
</style>
</head>
<body>
          <h1> CREATE BY ANKUSH MOTISARIYA </h1>
         <h2>WALCOME TO MY DATABASE USER ::: <%= session.getAttribute("username") %></h2>
    <a  class="button" href="logout.jsp">Logout</a>
         
</body>
</html>