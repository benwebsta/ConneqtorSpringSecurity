app.controller("QuestionsController", [ '$scope', '$http', '$rootScope',
		function($scope, $http, $rootScope) {
			var responseArray;
			
			$scope.model = {};
			$scope.userLoggedIn = true;
			
			$scope.test = "FUCK";
			$scope.getAllQuestions = function() {
				console.log("user Id: " + $scope.userId);
				if($scope.userId >= 2){
					$http({
						method : 'GET',
						url : 'getAllQuestions'
					}).then(function successCallback(response) {
						$scope.userId = $rootScope.userId;
						console.log("response: " + response);
						responseArray = response.data;
						console.log("success callback");
						console.log(responseArray);
						$scope.questionsList = responseArray;
						$scope.userLoggedIn = true;
					}, function errorCallback(response) {
			    		  console.log("error");
			    	   	  console.log(response.data);
			    	  });
				}
				else{
					$scope.userLoggedIn = false;
				}
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
//							answer1 : $scope.model[0],
//							answer2 : $scope.model[1],
//							answer3 : $scope.model[2],
//							answer4 : $scope.model[3],
//							answer5 : $scope.model[4],
//							answer6 : $scope.model[5],
//							answer7 : $scope.model[6],
//							answer8 : $scope.model[7],
//							answer9 : $scope.model[8],
//							answer10 : $scope.model[9],
//							answer11 : $scope.model[10],
//							answer12 : $scope.model[11],
//							answer13 : $scope.model[12],
//							answer14 : $scope.model[13],
//							answer15 : $scope.model[14],
//							answer16 : $scope.model[15],
//							answer17 : $scope.model[16],
//							answer18 : $scope.model[17],
//							answer19 : $scope.model[18],
//							answer20 : $scope.model[19],
//							answer21 : $scope.model[20],
//							answer22 : $scope.model[21],
//							answer23 : $scope.model[22],
//							answer24 : $scope.model[23],
//							answer25 : $scope.model[24],
//							answer26 : $scope.model[25],
//							answer27 : $scope.model[26],
//							answer28 : $scope.model[27],
//							answer29 : $scope.model[28],
//							answer30 : $scope.model[29],
//							answer31 : $scope.model[30]
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
					window.location.href = '/conneqtor/searchForClients';
				}, function errorCallback(response) {
		    		  console.log("error");
		    	   	  console.log(response.data);
		    	  });
			}
			$scope.getAllQuestionsAndAnswers();
		} ]);
