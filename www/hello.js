var hello = {
    
    greet: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback,errorCallback,'Hello','greet',[name]);
    }
}
module.exports = hello;