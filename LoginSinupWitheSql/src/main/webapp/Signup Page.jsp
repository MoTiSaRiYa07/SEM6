<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Sinuup</title>
<style>
body {
  margin: 0;
  padding: 0;
  background-color: #17a2b8;
  height: 100vh;
}

#sinup .container #login-row #login-column #login-box {
  margin-top: 120px;
  max-width: 600px;
  height: 500px;
  border: 1px solid #9C9C9C;
  background-color: #EAEAEA;
}
#sinup .container #login-row #login-column #login-box #login-form {
  padding: 20px;
}
#sinup .container #login-row #login-column #login-box #login-form #register-link {
  margin-top: -85px;
}
</style>

</head>
<body>

            <!--  <h2>Signup</h2>
    <form action="SignupServlet" method="post">
        Username: <input type="text" name="username" required><br>
        Password: <input type="password" name="password" required><br>
        Email: <input type="email" name="email" required><br>
        Full Name: <input type="text" name="full_name" required><br>
        <input type="submit" value="Signup">
    </form> -->
    
     <div id="sinup">
        <h3 class="text-center text-white pt-5">CREATE BY ANKUSH MOTISARIYA</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="SignupServlet" method="post">
                            <h3 class="text-center text-info">SINUP FROM </h3>
                            <div class="form-group">
                                <label for="username" class="text-info">USERNAME:</label><br>
                                <input type="text" name="username" id="username" class="form-control" required>
                            </div>
                            
                            <div class="form-group">
                                <label for="password" class="text-info">PASSWORD:</label><br>
                                <input type="text" name="password" id="password" class="form-control" required>
                            </div>
                            
                            <div class="form-group">
                                <label for="password" class="text-info">EMAIL:</label><br>
                                <input type="text" name="email" id="Email" class="form-control" required>
                            </div>
                            
                             <div class="form-group">
                                <label for="password" class="text-info">FULLNAME:</label><br>
                                <input type="text" name="full_name" id="name" class="form-control" required>
                            </div>
                             <div class="form-group">
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="SINGUP">
                            </div>
                            </form>
                    </div>
                    </div>
                    </div>
                    </div>
               </div>
               </div>
               </div>
    </div>
</body>
    
</html>

















