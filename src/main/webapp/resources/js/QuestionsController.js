app.controller("QuestionsController", [ '$scope', '$http', '$rootScope',
		function($scope, $http, $rootScope) {
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
				console.log($scope.model);
				console.log("userID: " + $rootScope.userId);
				var answers = {
						answerId : 0,
						userId : $rootScope.userId,
						answer1 : $scope.model[0],
						answer2 : $scope.model[1],
						answer3 : 'a',
						answer4 : 'a',
						answer5 : 'a',
						answer6 : 'a',
						answer7 : 'a',
						answer8 : 'a',
						answer9 : 'a',
						answer10 : 'a',
						answer11 : 'a',
						answer12 : 'a',
						answer13 : 'a',
						answer14 : 'a',
						answer15 : 'a',
						answer16 : 'a',
						answer17 : 'a',
						answer18 : 'a',
						answer19 : 'a',
						answer20 : 'a',
						answer21 : 'a',
						answer22 : 'a',
						answer23 : 'a',
						answer24 : 'a',
						answer25 : 'a',
						answer26 : 'a',
						answer27 : 'a',
						answer28 : 'a',
						answer29 : 'a',
						answer30 : 'a',
						answer31 : 'a'
				}
				console.log("in submit");
				console.log(answers);
				$http({
					method : 'POST',
					url : 'createAnswers',
					data : answers
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
			$scope.getAllQuestionsAndAnswers();
		} ]);
