app.controller("QuestionsController", [ '$scope', '$http',
		function($scope, $http) {
			var responseArray;
			
			$scope.model = {};
			
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
			
			$scope.getAllQuestionsAndAnswers = function() {
				$http({
					method : 'GET',
					url : 'getAllQuestionsAndAnswers'
				}).then(function successCallback(response) {
					console.log("response: " + response);
					responseArray = response.data;
					console.log("success callback");
					console.log(responseArray);
					$scope.questionsDTOList = responseArray;
				}, function errorCallback(response) {
		    		  console.log("error");
		    	   	  console.log(response.data);
		    	  });
			}
			
			$scope.submitForm = function() {
				console.log("in submit");
				console.log($scope.model);
			}
			$scope.getAllQuestionsAndAnswers();
		} ]);
