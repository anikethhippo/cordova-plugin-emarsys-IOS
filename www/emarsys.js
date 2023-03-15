var emarsys = {
    
    setup: function (args, successCallback, errorCallback) {
        cordova.exec(successCallback,errorCallback,'EmarsysPlugin','track',args);
    }
}
module.exports = emarsys;