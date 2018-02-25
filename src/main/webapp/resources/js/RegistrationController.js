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
				  console.log("response: " + response.data);
				  if(response.data == null){
					  console.log("success");
					  $scope.registrationSuccess = true;
					  $timeout(removeRegistrationSuccess, 2000);
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
		}
		
		
			
	}]);
