app.controller("headerController", 
		['$scope', 
		function($scope) {
	
	$scope.adminPage = function(){
		console.log("admin page");
	}
	
	$scope.findAnAdvisor = function(){
		console.log("find an advisor page");
	}
	
}]);
app.controller("adminPageController", 
		['$scope', 
		function($scope) {

	
}]);
app.controller("publicPageController", 
		['$scope', 
		function($scope) {

	
}]);