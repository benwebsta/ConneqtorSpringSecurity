app.controller("AnswersController", [ '$scope', '$http',
		function($scope, $http) {
			var responseArray;

			$scope.test = "FUCK";
			$scope.getAllAnswers = function() {
				$http({
					method : 'GET',
					url : 'getAllAnswers'
				}).then(function successCallback(response) {
					console.log("response: " + response);
					responseArray = response.data;
					console.log("success callback");
					console.log(responseArray);
					$scope.answersList = responseArray;
				}, function errorCallback(response) {
		    		  console.log("error");
		    	   	  console.log(response.data);
		    	  });
			}
			
			$scope.compareAnswers = function(usersId1, usersId2) {
				console.log(usersId1);
				console.log(usersId2);
				var answersCompareDTO = {
						usersId1 : usersId1,
						usersId2 : usersId2
				}
				console.log(answersCompareDTO);
				$http({
					method : 'POST',
					url : 'compareAnswers',
					data : answersCompareDTO
				}).then(function successCallback(response) {
					console.log("response: " + response);
					responseArray = response.data;
					$scope.percent = response.data;
					console.log("success callback");
					console.log(responseArray);
				}, function errorCallback(response) {
		    		  console.log("error");
		    	   	  console.log(response.data);
		    	  });
			}
			
	
			$scope.getAllAnswers();
			
			
		} ]);
