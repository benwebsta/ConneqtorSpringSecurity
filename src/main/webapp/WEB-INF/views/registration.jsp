<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%-- <%@ page session="false" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>public page</title>
	<!-- jQuery -->
	<script
	  src="https://code.jquery.com/jquery-3.2.1.min.js"
	  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
	  crossorigin="anonymous"></script>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	<!-- Angular JS -->
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.5/angular.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.5/angular-animate.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.5/angular-cookies.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.5/angular-messages.min.js"></script>
	<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-router/1.0.3/angular-ui-router.js"></script> -->
	
	<!-- Javascript includes -->
	<script src="resources/js/app.js"></script>	
	<script src="resources/js/header.js"></script>
	<script src="resources/js/LoginController.js"></script>
	<script src="resources/js/RegistrationController.js"></script>
	
	<!-- css include -->
	<link rel="stylesheet" href="resources/css/base.css">
	<link rel="stylesheet" href="resources/css/login.css">
	
</head>
<body ng-app="Conneqtor">
	<div class="background">
		<%@ include file="header.jsp" %> 
		

		<div class="container" id="registration" ng-controller="RegistrationController">
			<section id="content">
				<form name="userForm">
					<h1>Registration</h1>
					<div>
						<input type="text" required name="firstName"	placeholder="First Name" id="firstName" ng-model="firstName"/>
					</div>
					<div>
						<input type="text" required name="last" placeholder="Last Name" id="lastName" ng-model="lastName"/>
					</div>
					<div>
						<input type="email" required name="user" placeholder="Email" id="username" ng-model="username"/>
					</div>
					<div>
						<input type="password" required name="pass" placeholder="Password" id="password" ng-model="password"/>
					</div>
					<div>
						<input type="password" required pw-check='password' name="matchingPass" placeholder="Retype Password" id="matchPassword" ng-model="matchingPassword"/>
					</div>
					<div id="registerButton">
						<input type="submit" value="Register" ng-click="register()"/>
					</div>
				</form><!-- form -->
			</section><!-- content -->
			<!-- <div class="alert alert-danger" ng-show="usernameTaken == true" ng-cloak>
				{{userTaken.username}} is already registered
			</div> -->
		</div><!-- container -->
		
		

		<a href="<c:url value='/j_spring_security_logout'/>">Logout</a>
	</div>
</body>
</html>