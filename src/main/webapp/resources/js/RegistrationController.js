app.controller("RegistrationController", 
	['$scope', '$http', '$rootScope',  '$timeout', '$cookies',
		 function($scope, $http, $rootScope, $timeout, $cookies) {
		$scope.emailTaken = false;
		$scope.registrationSuccess = false;
			    
		console.log("in registration controller");
		$scope.register = function(){
			console.log($scope.firstName);
			console.log($scope.lastName);
			console.log($scope.username);
			console.log($scope.password);
			console.log($scope.matchingPassword);
			
			var userRegister = {
		    		firstName : $scope.firstName, 
		    		lastName : $scope.lastName,
		    		username : $scope.username,
		    		password : $scope.password,
		    		active: 1
		    }
			
			console.log(userRegister);
			$http({
		    	  method: 'POST',
				  url: 'checkEmail',
				  data: userRegister
			}).then(function successCallback(response) {
				console.log("REGINSTSTSTLKJSTLKSJLKTLKJSTLJKTSLLJKST");
				  console.log("response: " + response.data);
				  if(response.data == null){
					  console.log("success");
					  
					  $http({
				    	  method: 'POST',
				    	  url: 'createNewUser',
				    	  data: userRegister
				    	}).then(function successCallback(response) {
				    		console.log("create user response: " + response.data);
							$scope.registrationSuccess = true;
							$timeout(removeRegistrationSuccess, 2000);
							
				    	  }, function errorCallback(response) {
				    		  console.log("error");
				    		  console.log(response.data);
				    	  });
				  }
				  else{
					  $scope.emailTaken = true;
					  $timeout(removeEmailTaken, 2000);
				  }
			  }, function errorCallback(response) {
				  console.log("error happened");
			      console.log(response.data);
			  });
			
		}
		
		var removeEmailTaken = function(){
	    	$scope.emailTaken = false;
	    }
		var removeRegistrationSuccess = function(){
			$scope.registrationSuccess = false;
			login();
		}
		var login = function(user){
			window.location.href = "/conneqtor/login";
		}
		
		
			
	}]);
