/**
 * Created by lenovo on 2017/1/10.
 */
app.controller('provinceCtrl',['$scope','provinceService', function ($scope,provinceService) {
    provinceService.getAll().then(function(data){
        $scope.provinceList=data
        console.log(data)
    })
}])