'use strict';

/* Controllers */
  // signin controller
app.controller('SigninFormController', ['$scope','$http','$q','$state','httpUrl','$rootScope','$location',function($scope,$http,$q, $state,httpUrl,$rootScope,$location) {
    $scope.user = {};
    $scope.authError = null;
    var authenticate = function(credentials, callback) {

        var headers = credentials ? {authorization : "Basic "
        + btoa(credentials.username + ":" + credentials.password)
        } : {};

        $http.get('/access/signin.do', {headers : headers,params:{username:credentials.username,password:credentials.password}})
            .success(function(data) {
            if (data.name) {
                $rootScope.authenticated = true;
            } else {
                $rootScope.authenticated = false;
            }
            callback && callback();
        }).error(function() {
            $rootScope.authenticated = false;
            callback && callback();
        });

    }

    //authenticate();
    $scope.credentials = {};
    $scope.login = function() {
        authenticate($scope.credentials, function() {
            if ($rootScope.authenticated) {
                $state.go('app.dashboard-v1');
                $scope.authError = false;
            } else {
                $state.go('access.signin');
                $scope.authError = "账号密码出错";
            }
        });
    };
    $scope.login1 = function() {
      $scope.authError = null;
      // Try to login
      var deferred = $q.defer();
      $http({
              method: "post",
              url: httpUrl + "/access/signin.do",
              headers: {
                  'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'
              },
              params: {email: $scope.user.email, password: $scope.user.password}
          })
      .success(function(response) {
          deferred.resolve(response);
          if (!response) {
          $scope.authError = 'Email or Password not right';
        }else{
          $state.go('app.dashboard-v1');
        }
      })
      .error(function(response) {
          deferred.reject(null);
          console.log(response)
        $scope.authError = '服务器出错';
      });
        return deferred.promise;
    };
  }])
;