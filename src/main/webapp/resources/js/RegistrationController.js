app.controller("RegistrationController", 
	['$scope', '$http', '$rootScope',  '$timeout', '$cookies',
		 function($scope, $http, $rootScope, $timeout, $cookies) {
			    
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
					  //username/email is not taken
				  }
				  else{
					  //username/email is taken
				  }
			  }, function errorCallback(response) {
				  console.log("error happened");
			      console.log(response.data);
			  });
			
		}
		
		
			
	}]);
