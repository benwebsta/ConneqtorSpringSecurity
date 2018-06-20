<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%-- <%@ page session="false" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Home</title>
	<!-- jQuery -->
	<script
	  src="https://code.jquery.com/jquery-3.2.1.min.js"
	  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
	  crossorigin="anonymous"></script>
	  
	<!--  Bootstrap -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
	
	<!-- Angular JS -->
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.5/angular.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.5/angular-animate.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.5/angular-cookies.min.js"></script>
	<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-router/1.0.3/angular-ui-router.js"></script> -->
	
	<!-- Javascript includes -->
	<script src="resources/js/app.js"></script>	
	<script src="resources/js/header.js"></script>
	<script src="resources/js/LoginController.js"></script>
	<script src="resources/js/RegistrationController.js"></script>
	
	<!-- css include -->
	<link rel="stylesheet" href="resources/css/base.css">
	<!-- <link rel="stylesheet" href="resources/css/questionaire.css"> -->
	<link rel="stylesheet" href="resources/css/login.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
	
	
</head>
<body ng-app="Conneqtor">
	<div class="background">
		<%@ include file="header.jsp" %> 
		

		<div class="container" id="login">
			<section id="content">
				<form name="f" action="/conneqtor/j_spring_security_check" method="POST">
					<h1>Login</h1>
					<div>
						<input type="text" placeholder="email" name="j_username" value="">
					</div>
					<div>
						<input type="password" placeholder="password" name="j_password">
					</div>
					<div>
						<input name="submit" type="submit" value="Login">
						<a ui-sref="forgotPassword">Lost your password?</a>
						<a ui-sref="registration">Register</a>
					</div>
				</form><!-- form -->
				
			</section><!-- content -->
			<!-- <div class="alert alert-danger" ng-show="loginInfoIncorrect == true">
			  <strong>Email or Password Incorrect</strong>
			</div> -->
		</div><!-- container -->
		
	<!-- <div class="container" id="login" ng-controller="LoginController">
 		<section id="content">
 			<form>
 				<h1>Login</h1>
 				<div>
 					<input type="text" placeholder="Username" required="" id="username" ng-model="username"/>
 				</div>
 				<div>
 					<input type="password" placeholder="Password" required="" id="password" ng-model="password"/>
 				</div>
 				<div>
 					<input type="submit" value="Log in" ng-click="login()"/>
					<a ui-sref="forgotPassword">Lost your password?</a>
 					<a ui-sref="registration">Register</a>
 				</div>
 			</form>form
 			
 			</section>content
 		</div>container
 	<div class="alert alert-danger" ng-show="loginInfoIncorrect == true">
 		  <strong>Username or Password Incorrect</strong>
 		</div> -->
		
		


		<a href="<c:url value='/j_spring_security_logout'/>">Logout</a>
	</div>
</body>
</html>