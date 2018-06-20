<div class="slider">
  <div class="slide" ng-repeat="image in images" ng-show="image.visible">
    <img ng-src="resources/img/{{image.src}}" />
  </div>
  <div class="arrows">
    <a href="#" ng-click="prev()">
      <img src="resources/img/left-arrow.png" />
    </a>
    <a href="#" ng-click="next()">
      <img src="resources/img/right-arrow.png" />
    </a>
  </div>
</div>