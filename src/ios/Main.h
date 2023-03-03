#import <Cordova/CDV.h>
#import <EmarsysSDK/Emarsys.h>

@interface Main : CDVPlugin

@property NSString *callbackId;

- (void)setup:(CDVInvokedUrlCommand *)command;

@end
