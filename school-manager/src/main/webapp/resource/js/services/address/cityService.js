/**
 * Created by lenovo on 2017/1/10.
 */
app.service('cityService',['$q','$http','httpUrl',function($q,$http,httpUrl){
    return{
        insert: function (params) {
            var deferred = $q.defer();
            $http({
                method: "post",
                url: httpUrl + "/city/insert.do",
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'
                },
                params: params
            }).success(function (data, status) {
                deferred.resolve(data);
                deferred.resolve(status);
            }).error(function (data, status) {
                deferred.reject(null);
            });
            return deferred.promise;
        },
        delete: function (params) {
            var deferred = $q.defer();
            $http({
                method: "post",
                url: httpUrl + "/city/delete.do",
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'
                },
                params: params
            }).success(function (data, status) {
                deferred.resolve(data);
                deferred.resolve(status);
            }).error(function (data, status) {
                deferred.reject(null);
            });
            return deferred.promise;
        },
        update: function (params) {
            var deferred = $q.defer();
            $http({
                method: "post",
                url: httpUrl + "/city/update.do",
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'
                },
                params: params
            }).success(function (data, status) {
                deferred.resolve(data);
                deferred.resolve(status);
            }).error(function (data, status) {
                deferred.reject(null);
            });
            return deferred.promise;
        },
        getCitiesByProvinceId: function (params) {
            var deferred = $q.defer();
            $http({
                method: "post",
                url: httpUrl + "/city/getCitiesByProvinceId.do",
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'
                },
                params:params
            }).success(function (data, status) {
                deferred.resolve(data);
                deferred.resolve(status);
            }).error(function (data, status) {
                deferred.reject(null);
            });
            return deferred.promise;
        },
        getAllProvince: function () {
            var deferred = $q.defer();
            $http({
                method: "post",
                url: httpUrl + "/province/getAll.do",
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'
                },
            }).success(function (data, status) {
                deferred.resolve(data);
                deferred.resolve(status);
            }).error(function (data, status) {
                deferred.reject(null);
            });
            return deferred.promise;
        },
    }
}])