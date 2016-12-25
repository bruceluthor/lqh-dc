'use strict';

/* Controllers */
  // signin controller
app.controller('SigninFormController', ['$scope', '$http', '$state', 'httpUrl',function($scope, $http, $state,httpUrl) {
    $scope.user = {};
    $scope.authError = null;
    $scope.login = function() {
      $scope.authError = null;
      // Try to login
      $http.post('access/signin.do', {email: $scope.user.email, password: $scope.user.password})
      .then(function(response) {
          if ( response.data.user ) {
          $scope.authError = 'Email or Password not right';
        }else{
          $state.go('app.dashboard-v1');
        }
      }, function(x) {
          console.log(x)
        $scope.authError = 'Server Error';
      });
    };
  }])
;