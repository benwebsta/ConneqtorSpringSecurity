var app = angular.module("Conneqtor", ['ngAnimate', 'ngCookies']);

/*app.config(['$stateProvider', '$urlRouterProvider', '$locationProvider', 
	function ($stateProvider, $urlRouterProvider, $locationProvider) {
	
    $urlRouterProvider.otherwise('/home');
    
    $stateProvider	
    .state('home', {
    	url: '/',
    	views: {
    	    login: {
    	      templateUrl: 'resources/views/home.jsp',
    	      controller: "HomeController"
    	    }
    	  }
    })
    .state('publicPage', {
    	url: 'publicPage',
    	views: {
    	    registration: {
    	      templateUrl: 'resources/views/publicPage.jsp',
    	      controller: "publicPageController"
    	    }
    	  }
    })
    .state('adminPage', {
    	url: 'admin/adminPage',
    	views: {
    	    registration: {
    	      templateUrl: 'resources/views/adminPage.jsp',
    	      controller: "adminPageController"
    	    }
    	  }
    })
    
}]);*/

app.controller("homeController", ['$scope',
	function($scope) {
	    $scope.firstName = "John";
	    $scope.lastName = "Doe";
}]);

