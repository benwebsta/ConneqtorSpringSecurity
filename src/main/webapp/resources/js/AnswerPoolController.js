app.controller("AnswerPoolController", [ '$scope', '$http',
		function($scope, $http) {
			var responseArray;

			$scope.test = "FUCK";
			$scope.getAllAnswerPools = function() {
				$http({
					method : 'GET',
					url : 'getAllAnswerPools'/*,
					headers: { 
				        'Accept': 'application/json',
				        'Content-Type': 'application/json' 
				    },*/
				}).then(function successCallback(response) {
					console.log("response: " + response);
					responseArray = response.data;
					console.log("success callback");
					console.log(responseArray);
					$scope.answerPoolList = responseArray;
				}, function errorCallback(response) {
		    		  console.log("error");
		    	   	  console.log(response.data);
		    	  });
			}
			$scope.getAllAnswerPools();
		} ]);
