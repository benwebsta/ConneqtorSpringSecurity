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
	<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.5/angular-cookies.min.js"></script>
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
	<script src="resources/js/LoginController.js"></script>
	
	<!-- css include -->
	<link rel="stylesheet" href="resources/css/base.css">
</head>
<body ng-app="Conneqtor" ng-controller="QuestionsController">
	<div class="background">
		<%@ include file="header.jsp" %> 
		<h1>Question Form</h1> 
		{{test}}
		test<br><br>
		<form ng-submit="submitForm()">
			<div ng-controller="AnswerPoolController">
				<!-- <ol class="unstyled">
					QUESTION LIST:<br>
					<li ng-repeat="questionDTO in questionsDTOList">
						{{questionDTO.question}}<br>
						<input required type="radio" ng-hide="!questionDTO.a" ng-model="model[$index]" name="{{questionDTO.questionId}}" value="a/{{questionDTO.a}}">{{questionDTO.a}}<br></input>
						<input required type="radio" ng-hide="!questionDTO.b" ng-model="model[$index]" name="{{questionDTO.questionId}}" value="b/{{questionDTO.b}}">{{questionDTO.b}}<br></input>
						<input required type="radio" ng-hide="!questionDTO.c" ng-model="model[$index]" name="{{questionDTO.questionId}}" value="c/{{questionDTO.c}}">{{questionDTO.c}}<br></input>
						<input required type="radio" ng-hide="!questionDTO.d" ng-model="model[$index]" name="{{questionDTO.questionId}}" value="d/{{questionDTO.d}}">{{questionDTO.d}}<br></input>
						<input required type="radio" ng-hide="!questionDTO.e" ng-model="model[$index]" name="{{questionDTO.questionId}}" value="e/{{questionDTO.e}}">{{questionDTO.e}}<br></input>
						<input required type="radio" ng-hide="!questionDTO.f" ng-model="model[$index]" name="{{questionDTO.questionId}}" value="f/{{questionDTO.f}}">{{questionDTO.f}}<br><br></input>
						{{model[$index]}}				
					</li><br>
				</ol> -->
				<ol class="unstyled">
					QUESTION LIST:<br>
					<li>
						{{questionsDTOList[0].question}}<br>
						<input required type="radio" ng-hide="!questionsDTOList[0].a" ng-model="model[0]" name="{{questionsDTOList[0].questionId}}" value="a">{{questionsDTOList[0].a}}<br></input>
						<input required type="radio" ng-hide="!questionsDTOList[0].b" ng-model="model[0]" name="{{questionsDTOList[0].questionId}}" value="b">{{questionsDTOList[0].b}}<br></input>
						<input required type="radio" ng-hide="!questionsDTOList[0].c" ng-model="model[0]" name="{{questionsDTOList[0].questionId}}" value="c">{{questionsDTOList[0].c}}<br></input>
						<input required type="radio" ng-hide="!questionsDTOList[0].d" ng-model="model[0]" name="{{questionsDTOList[0].questionId}}" value="d">{{questionsDTOList[0].d}}<br></input>
						<input required type="radio" ng-hide="!questionsDTOList[0].e" ng-model="model[0]" name="{{questionsDTOList[0].questionId}}" value="e">{{questionsDTOList[0].e}}<br></input>
						<input required type="radio" ng-hide="!questionsDTOList[0].f}" ng-model="model[0]" name="{{questionsDTOList[0].questionId}}" value="f">{{questionsDTOList[0].f}}<br><br></input>
						{{model[$index]}}				
					</li><br>
					<li>
						{{questionsDTOList[1].question}}<br>
						<input required type="radio" ng-hide="!questionsDTOList[1].a}" ng-model="model[1]" name="{{questionsDTOList[1].questionId}}" value="a">{{questionsDTOList[1].a}}<br></input>
						<input required type="radio" ng-hide="!questionsDTOList[1].b}" ng-model="model[1]" name="{{questionsDTOList[1].questionId}}" value="b">{{questionsDTOList[1].b}}<br></input>
						{{model[$index]}}				
					</li><br>
				</ol>
				<input type="submit" value="Submit" />
			</div>
		</form>
	<!-- 	<div ng-controller="AnswerPoolController">
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
		</div><br><br> -->
		
		
		<br><br>
		<a href="<c:url value='/j_spring_security_logout'/>">Logout</a>
	</div>
</body>
</html>