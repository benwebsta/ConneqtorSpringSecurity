app.controller("QuestionsController", [ '$scope', '$http',
		function($scope, $http) {
			var responseArray;

			$scope.test = "FUCK";
			$scope.getAllQuestions = function() {
				$http({
					method : 'GET',
					url : 'getAllQuestions'
				}).then(function successCallback(response) {
					console.log("response: " + response);
					responseArray = response.data;
					console.log("success callback");
					console.log(responseArray);
					$scope.questionsList = responseArray;
				}, function errorCallback(response) {
		    		  console.log("error");
		    	   	  console.log(response.data);
		    	  });
			}
			$scope.getAllQuestions();
		} ]);
