app.controller("LoginController", 
	['$scope', '$http', '$rootScope', '$cookies',
		function($scope, $http, $rootScope, $cookies) {
		console.log("in Login Controller");
		var responseArray;
		
		function loggedIn(){
			console.log("in loggedin js function");
			$http({
		    	  method: 'GET',
				  url: 'loggedIn'
			}).then(function successCallback(response) {
				  console.log("response: " + response);
				  responseArray = response.data;
			      console.log(responseArray);
			      $rootScope.auth = responseArray.auth;
			      $scope.username = responseArray.auth.principal.username;
			  }, function errorCallback(response) {
				  console.log("error happened");
			      console.log(response.data);
			  });
		}
		
		loggedIn();
		  
	}]);
