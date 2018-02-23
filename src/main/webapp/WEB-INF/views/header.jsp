<nav class="navbar navbar-default" ng-controller="LoginController">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="/conneqtor">Conneqtor</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="/conneqtor/findAnAdvisor" ng-click="findAnAdvisor()">Find an Advisor<span class="sr-only"></span></a></li>
        <!-- <li><a href="/conneqtor/admin/adminPage" ng-click="adminPage()">Admin Private page</a></li> -->
        <li><a href="/conneqtor/whatIsConneqtor">What is Conneqtor?</a></li>
        <li><a href="/conneqtor/searchForClients">Search for Clients</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">placeholder<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="registration" ng-cloak ng-hide="username">Sign Up</a></li>
        <li class="dropdown">
          <a ng-cloak ng-show="username" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">{{username}}<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">view account</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">edit account</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="j_spring_security_logout">logout</a></li>
          </ul>
        </li>
        <li><a href="login" ng-cloak ng-show="!username" ng-cloak>Log In</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>