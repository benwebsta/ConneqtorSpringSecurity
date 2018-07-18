<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/conneqtor">Conneqtor</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/conneqtor">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/conneqtor/findAnAdvisor">Find an Advisor</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/conneqtor/admin/adminPage">Admin Private page</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/conneqtor/whatIsConneqtor">What is Conneqtor?</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/conneqtor/searchForClients">Search for Clients</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          All Options
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a href="/conneqtor/findAnAdvisor" ng-click="findAnAdvisor()">Find an Advisor<span class="sr-only"></span></a>
          <a href="/conneqtor/admin/adminPage" ng-click="adminPage()">Admin Private page</a>
          <a href="/conneqtor/whatIsConneqtor">What is Conneqtor?</a>
          <a href="/conneqtor/searchForClients">Search for Clients</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>
    </ul>
     <!-- <ul class="nav navbar-nav navbar-right">
         <li><a href="registration" ng-cloak ng-hide="username">Sign Up</a></li>
-        <li><a href="login" ng-cloak ng-show="username">{{username}}</a></li>
	 </ul> -->
	 <ul class="nav navbar-nav navbar-right">
      <li><a href="/conneqtor/signUp">Sign Up</a></li>
      <li><a href="/conneqtor/login">Login</a></li>
    </ul>
  </div>
</nav>

