/**
 * Created by lenovo on 2017/1/10.
 */
app.service('provinceService',['$q','$http','httpUrl',function($q,$http,httpUrl){
    return{
        insert: function (params) {
            var deferred = $q.defer();
            $http({
                method: "post",
                url: httpUrl + "/province/insert.do",
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
                url: httpUrl + "/province/delete.do",
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
                url: httpUrl + "/province/update.do",
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
        getAll: function () {
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
        }
    }
}])