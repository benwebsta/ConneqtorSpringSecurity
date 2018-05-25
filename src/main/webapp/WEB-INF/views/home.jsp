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
	<script src="resources/js/questionaire.js"></script>
	<script src="resources/js/LoginController.js"></script>
	<script src="resources/js/AnswersController.js"></script>
	<script src="resources/js/ngFader.js"></script>
	
	<!-- css include -->
	<link rel="stylesheet" href="resources/css/base.css">
	<link rel="stylesheet" href="resources/css/questionaire.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
	
	
</head>
<body ng-app="Conneqtor" ng-controller="homeController">
	<div class="background">
		<%@ include file="header.jsp" %>
		<div>
			<h1>Welcome to Conneqtor</h1>
			<h4>Conneqt, Advise, Grow</h4><br>
			<!-- <ng-fader></ng-fader> -->
			<img style="height: 300px; width: 50%; margin: auto; display: block;" src="resources/img/placeholder.png">
			
			<h4>At Conneqtor, we strive to match you with an advisor who you will conneqt with and help you succeed in every aspect of your life.</h4>
			
		</div> 
		<div class="container-fluid">
		  <div class="row">
		    <div class="col-md">
		      <button type="button" class="btn btn-primary btn-lg">User Signup</button>
		    </div>
		    <div class="col-md">
				<button type="button" class="btn btn-primary btn-lg">Advisor Signup</button>
		    </div>	  
		  </div>
		  <div class="row">
		    <div class="col-md">
		      <button type="button" class="btn btn-primary btn-lg">User Signup</button>
		    </div>
		    <div class="col-md">
				<button type="button" class="btn btn-primary btn-lg">Advisor Signup</button>
		    </div>	  
		</div>
		<%@ include file="footer.jsp" %>		
		<a href="/conneqtor/oldPage">OLD PAGE</a>
	</div>
</body>
</html>
