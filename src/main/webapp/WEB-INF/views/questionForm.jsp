<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%-- <%@ page session="false" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Question Form</title>
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
	<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-router/1.0.3/angular-ui-router.js"></script> -->
	
	<!-- Javascript includes -->
	<script src="resources/js/app.js"></script>	
	<script src="resources/js/header.js"></script>
	<script src="resources/js/AnswerPoolController.js"></script>
	<script src="resources/js/AnswersController.js"></script>
	<script src="resources/js/QuestionsController.js"></script>
	<script src="resources/js/RolesController.js"></script>
	<script src="resources/js/UserRolesController.js"></script>
	<script src="resources/js/UsersController.js"></script>
	
	<!-- css include -->
	<link rel="stylesheet" href="resources/css/base.css">
</head>
<body ng-app="Conneqtor">
	<div class="background">
		<%@ include file="header.jsp" %> 
		<h1>Question Form</h1> 
		{{test}}
		test<br><br>
		<!--<button ng-click="getAllAnswerPools()">get all answer pools</button>
		<button ng-click="getAllAnswers()">get all answer pools</button>
		<button ng-click="getAllQuestions()">get all answer pools</button>
		<button ng-click="getAllRoles()">get all answer pools</button>
		<button ng-click="getAllRoles()">get all answer pools</button>
		<button ng-click="getAllUsers()">get all answer pools</button><br><br>-->
		<div ng-controller="AnswerPoolController">
			ANSWER POOL:<br>
			=================================================================<br>
			{{answerPoolList}}<br>
			=================================================================<br>
		</div><br><br>
		<div ng-controller="AnswersController">
			ANSWERS:<br>
			=================================================================<br>
			{{answersList}}<br>
			=================================================================<br>
		</div><br><br>
		<div ng-controller="QuestionsController">
			QUESTIONS:<br>
			=================================================================<br>
			{{questionsList}}<br>
			=================================================================<br>
		</div><br><br>
		<div ng-controller="RolesController">
			ROLES:<br>
			=================================================================<br>
			{{rolesList}}<br>
			=================================================================<br>
		</div><br><br>
		<div ng-controller="UserRolesController">
			USER ROLES:<br>
			=================================================================<br>
			{{userRolesList}}<br>
			=================================================================<br>
		</div><br><br>
		<div ng-controller="UsersController">
			USERS:<br>
			=================================================================<br>
			{{usersList}}<br>
			=================================================================<br>
		</div><br><br>
		
		
		<br><br>
		<a href="<c:url value='/j_spring_security_logout'/>">Logout</a>
	</div>
</body>
</html>