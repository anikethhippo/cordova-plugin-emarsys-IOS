module.exports = function(context) {
    var fs = require('fs')
    var path = require('path')
    var Q = require('q')
    var xml = require('cordova-common').xmlHelpers
  
    var deferred = Q.defer()
  
    var platformRoot = path.join(context.opts.projectRoot, './platforms/ios/')
  
    var filepaths = [
        platformRoot
        //path.join(platformRoot, './Podfile.lock'),
    ]
  
    var filepath = filepaths.find(function(filepath) {
        try {
            fs.accessSync(filepath, fs.constants.F_OK)
            return true
        } catch (err) {
            return false
        }
    })
    var podcontent = `target "techcart" do
        pod 'EmarsysSDK'
    end
    `
  
    if (filepath != null) {
        require('fs-extra'). writeFile(platformRoot + "Podfile", podcontent, 'utf-8');
        if(fs.existsSync(platformRoot + "Podfile.lock")) fs.unlink(platformRoot + "Podfile.lock");
        deferred.resolve()
    } else {
        deferred.reject(new Error("Can't find Podfile"))
    }
  
    return deferred.promise
  }
  
