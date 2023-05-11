var emarsys = {
    
    track: function (args, successCallback, errorCallback) {
        cordova.exec(successCallback,errorCallback,'EmarsysPlugin','track',args);
    },
    setContact: function(contactValue,successCallback,errorCallback){
        cordova.exec(successCallback,errorCallback,'EmarsysPlugin','setContact',[{"contactValue":contactValue}]);  

    }
}
module.exports = emarsys;