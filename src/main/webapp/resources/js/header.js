app.controller("headerController", 
		['$scope', 
		function($scope) {

	$scope.publicPage = function(){
		console.log("public page");
	}
	
	$scope.adminPage = function(){
		console.log("admin page");
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