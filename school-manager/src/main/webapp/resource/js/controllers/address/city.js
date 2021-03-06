/**
 * Created by lenovo on 2017/1/10.
 */
/**
 * Created by lenovo on 2017/1/10.
 */
app.controller('cityCtrl',['$scope','cityService', function ($scope,cityService) {
    $scope.showAdd=false;
    cityService.getAllProvince().then(function(data){
        $scope.provinceList=data
    })
    $scope.getCitiesByProvinceId=function(){
        if($scope.provinceId){
            cityService.getCitiesByProvinceId({id:$scope.provinceId}).then(function(data){
                $scope.cityList=data
                console.log(data)
            })
        }else{
            alert("请选择省份")
        }
    }
    $scope.deleteCity=function(id){
        if(confirm("确认删除")){
            cityService.delete({id:id}).then(function(){
                cityService.getCitiesByProvinceId({id:$scope.provinceId}).then(function(data){
                    $scope.cityList=data
                })
            })
        }
    }
    $scope.showInsertCity=function(){
        $scope.showAdd=true;

        if(!$scope.provinceId){
            $scope.showAdd=false;
            alert("请选择省份")
        }
        $scope.insertCity=function(){
            cityService.insert({cityName:$scope.cityName,cityId:$scope.cityId,fatherId:$scope.provinceId}).then(function(){
                cityService.getCitiesByProvinceId({id:$scope.provinceId}).then(function(data){
                    $scope.cityList=data
                    $scope.showAdd=false;
                    console.log(data)
                });
            })
        }
    }
}])