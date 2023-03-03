var emarsys = {
    
    setup: function (args, successCallback, errorCallback) {
        cordova.exec(successCallback,errorCallback,'Main','setup',args);
    }
}
module.exports = emarsys;