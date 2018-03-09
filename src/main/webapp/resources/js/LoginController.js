app.controller("LoginController", 
	['$scope', '$http', '$rootScope', '$cookies', '$timeout',
		function($scope, $http, $rootScope, $cookies, $timeout) {
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
			      $rootScope.username = responseArray.auth.principal.username;
			      if($rootScope.username != null){
			    	  execute();
			      }
			  }, function errorCallback(response) {
				  console.log("error happened");
			      console.log(response.data);
			  });
		}
		
		$scope.storeUserId = function(){
			console.log("in login button");
			$timeout(execute(), 4000);
		}
		function execute(){
			console.log("in execute");
			var user = {
		    		  userId : 0,
		    		  firstName : 'a',
		    		  lastName : 'a',
		    		  username : $rootScope.username,
		    		  password : 'a',
		    		  active : 1
		      }
		      
		      $http({
		    	  method: 'POST',
		    	  url: 'getUsersByUsername',
		    	  data: user
		      }).then(function successCallback(response) {
		    	  $rootScope.userId = response.data.userId;
		      }, function errorCallback(response) {
		    	  console.log("error");
		      })
		}
		
		loggedIn();
		  
	}]);
