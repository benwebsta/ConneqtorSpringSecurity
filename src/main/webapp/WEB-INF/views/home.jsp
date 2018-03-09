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
	<script src="resources/js/questionaire.js"></script>
	<script src="resources/js/LoginController.js"></script>
	<script src="resources/js/AnswersController.js"></script>
	
	<!-- css include -->
	<link rel="stylesheet" href="resources/css/base.css">
	<link rel="stylesheet" href="resources/css/questionaire.css">
</head>
<body ng-app="Conneqtor" ng-controller="homeController">
	<div class="background">
		<%@ include file="header.jsp" %> 
		Hello from public page mother fucking home page bitch! teststetst wewseseweweewsesesewewewes
		<button><a href="publicPage">public page</a></button>
		<button><a href="admin/adminPage">Admin Page</a></button><br>
		<button><a href="questionForm">Question Form</a></button><br>
		<button><a href="registration">Registration</a></button><br>
		<button><a href="login">Login</a></button><br>
<!-- 		<button ng-controller="LoginController" ng-click="getLoginInfo()">get login info</button> -->
		{{firstName}} + {{lastName}}
		<%@ include file="footer.jsp" %> 
		<button style="color: #99CC33">test</button>
		

	<div ng-controller="AnswersController">
		<button type="button" class="btn btn-primary btn-lg" ng-click="compareAnswers(2,4)">Compare users 2 and 4 answers</button>
	</div>
	<h1 ng-cloak>{{percent}}</h1>
	





		<main ng-controller="formCtrl" ng-cloak>
		  <div class="container">
		    <div class="row">
		      <div class="col-md-12">&nbsp;</div>
		    </div>
		    <div class="row">
		      <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
		        <h2>AngularJS 1.5.x Multi-Step Form</h1>
		      </div>
		    </div>
		    <form name="multiStepForm" class="form-validation" role="form" novalidate>
		      <div class="animate-switch-container" ng-switch on="stage" ng-class="{forward: direction, backward:!direction}">
		        <div class="animate-switch" ng-switch-default>
		          <div class="row">
		            <div class="col-md-12">
		              <p>Welcome to the form.</p>
		              <button type="button" class="btn btn-primary" ng-click="next('stage1')">Start</button>
		            </div>
		          </div>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage1">
		          <div class="row">
		            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
		              <div class="form-group">
		                <label for="tb-fname">First Name:</label>
		                <input type="text" class="form-control" id="tb-fname" name="firstName" ng-maxlength="250" ng-model="formParams.firstName" required ng-class="{'input-error': formValidation && multiStepForm.firstName.$error.required}" >
		                <span ng-show="multiStepForm.firstName.$error.maxlength">
		                  Max character length reached.
		                </span>
		              </div>
		            </div>
		          </div>
		          <div class="row">
		            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
		              <div class="form-group">
		                <label for="tb-lname">Last Name:</label>
		                <input type="text" class="form-control" id="tb-lname" name="lastName" ng-maxlength="250" ng-model="formParams.lastName" ng-class="{'input-error': formValidation && multiStepForm.lastName.$error.required}" required>
		                <span ng-show="multiStepForm.lastName.$error.maxlength">
		                  Max character length reached.
		                </span>
		              </div>
		            </div>
		          </div>
		          <div class="row">
		            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
		              <div class="form-group">
		                <label for="tb-email">Email:</label>
		                <input type="email" class="form-control" id="tb-email" name="email" ng-maxlength="100" ng-model="formParams.email" ng-class="{'input-error': formValidation && multiStepForm.email.$error.required}" ng-model-options="{ updateOn: 'blur' }" required>
		                <span ng-show="multiStepForm.email.$error.email">
		                  Incorrect email format.
		                </span>
		                <span ng-show="multiStepForm.email.$error.maxlength">
		                  Max character length reached.
		                </span>
		              </div>
		            </div>
		          </div>
		          <div class="row">
		            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
		              <div class="form-group">
		                <label for="tb-cc-email">CC:</label>
		                <input type="email" class="form-control" id="tb-cc-email" name="ccEmail" ng-maxlength="100" ng-model="formParams.ccEmail" ng-class="{'input-error': formValidation && multiStepForm.ccEmail.$error.email}" ng-model-options="{ updateOn: 'blur' }">
		                <span ng-show="multiStepForm.ccEmail.$error.email">
		                  Incorrect email format.
		                </span>
		                <span ng-show="multiStepForm.ccEmail.$error.maxlength">
		                  Max character length reached.
		                </span>
		              </div>
		            </div>
		            <div class="col-xs-1 col-sm-1 col-md-1 col-lg-1">
		              <button type="button" class="btn btn-xs btn-warning" ng-click="addCCEmail()">Add</button>
		            </div>
		          </div>
		          <div class="row">
		            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
		              <div ng-repeat="cc in formParams.ccEmailList">
		              </div>
		            </div>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage2')">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage2">
		          <div class="form-group">
		            <label for="ta-body">question 2:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage1')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage3')">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage3">
		           <div class="form-group">
		            <label for="ta-body">question 3:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage2')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage4')">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage4">
		          <div class="form-group">
		            <label for="ta-body">question 4:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage3')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage5')">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage5">
		          <div class="form-group">
		            <label for="ta-body">question 5:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage4')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage6')">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage6">
		          <div class="form-group">
		            <label for="ta-body">question 6:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage5')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage7')">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage7">
		          <div class="form-group">
		            <label for="ta-body">question 7:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage6')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage8')">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage8">
		          <div class="form-group">
		            <label for="ta-body">question 8:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage7')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage9')">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage9">
		          <div class="form-group">
		            <label for="ta-body">question 9:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage8')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage10')">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage10">`
		          <div class="form-group">
		            <label for="ta-body">question 10:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage9')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage11')">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage11">
		          <div class="form-group">
		            <label for="ta-body">question 11:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage10')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage12')">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage12">
		          <div class="form-group">
		            <label for="ta-body">question 12:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage11')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage13')">Next</button>
		        </div>
		        
		        <div class="animate-switch" ng-switch-when="stage13">
		          <div class="form-group">
		            <label for="ta-body">question 13:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage12')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage14')">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage14">
		          <div class="form-group">
		            <label for="ta-body">question 14:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage13')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="next('stage15')">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="stage15">
		          <div class="form-group">
		            <label for="ta-body">question 15:</label>
		            <textarea class="form-control" rows="5" id="ta-body" ng-model="formParams.messageBody"></textarea>
		          </div>
		          <button type="button" class="btn btn-info" ng-click="back('stage14')">Back</button>
		          <button type="button" class="btn btn-primary" ng-click="submitForm()">Next</button>
		        </div>
		        <div class="animate-switch" ng-switch-when="success">
		          <div class="success-wrap">
		            <h2 class="confirmation-text">Thank you</h2>
		            <p>Your message has been sent.<br>You should receive a confirmation email.</p>
		            <div><button type="button" class="btn btn-success" ng-click="reset()" >Send Another</button></div>
		          </div>
		        </div>
		        <div class="animate-switch" ng-switch-when="error" >
		          <div class="error-wrap">
		            <h2 class="confirmation-text">Error</h2>
		            <p>There was an error when attempting to submit your request.<br>Please try again later.</p>
		            <p><strong>*This will always error until a web service URL is set.*</strong></p>
		            <div><button type="button" class="btn btn-danger" ng-click="reset()" >Try again</button></div>
		          </div>
		        </div>
		      </div>
		    </form>
		    <div class="row">
		      <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">&nbsp;</div>
		    </div>
		    <div class="row">
		      <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
		        <button type="button" class="btn btn-sm btn-info" ng-click="toggleJSONView = !toggleJSONView" >Toggle Object</button>
		        <div>&nbsp;</div>
		        <pre ng-show="toggleJSONView"> {{ formParams | json }}</pre>
		      </div>
		    </div>
		    <div class="row">
		      <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">&nbsp;</div>
		    </div>
		    <div class="row">
		      <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
		        <button type="button" class="btn btn-sm btn-info" ng-click="toggleFormErrorsView = !toggleFormErrorsView" >Toggle Form Errors</button>
		        <div>&nbsp;</div>
		        <ul ng-show="toggleFormErrorsView">
		          <li ng-show="multiStepForm.$invalid">Form Invalid</li>
		          <li ng-show="multiStepForm.$valid">Form Valid</li>
		          <li ng-repeat="(key, errors) in multiStepForm.$error track by $index"> <strong>{{ key }}</strong> errors
		            <ul>
		              <li ng-repeat="e in errors">{{ e.$name }} has an error: <strong>{{ key }}</strong>.</li>
		            </ul>
		          </li>
		        </ul>
		      </div>
		    </div>
		  </div>
		</main>







	</div>
</body>
</html>
