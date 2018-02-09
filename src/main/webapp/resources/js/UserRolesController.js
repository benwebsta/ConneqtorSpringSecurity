app.controller("UserRolesController", [ '$scope', '$http',
		function($scope, $http) {
			var responseArray;

			$scope.test = "FUCK";
			$scope.getAllUserRoles = function() {
				$http({
					method : 'GET',
					url : 'getAllUserRoles'
				}).then(function successCallback(response) {
					console.log("response: " + response);
					responseArray = response.data;
					console.log("success callback");
					console.log(responseArray);
					$scope.userRolesList = responseArray;
				}, function errorCallback(response) {
		    		  console.log("error");
		    	   	  console.log(response.data);
		    	  });
			}
			$scope.getAllUserRoles();
		} ]);
