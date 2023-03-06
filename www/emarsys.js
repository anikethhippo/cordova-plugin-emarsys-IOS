var emarsys = {
    
    setup: function (args, successCallback, errorCallback) {
        cordova.exec(successCallback,errorCallback,'EmarsysPlugin','setup',args);
    }
}
module.exports = emarsys;