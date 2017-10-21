app.controller("headerController", 
		['$scope', 
		function($scope) {

	$scope.publicPage = function(){
		$scope.publicPageActive = "active";
		$scope.adminPageActive = "inactive";
		console.log("public page");
	}
	
	$scope.adminPage = function(){
		$scope.adminPageActive = "active";
		$scope.publicPageActive = "inactive";
		console.log("admin page");
	}
	
}]);