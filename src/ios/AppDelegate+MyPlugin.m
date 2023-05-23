#import "AppDelegate.h"

@implementation AppDelegate (MyPlugin)

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
    EMSConfig *config = [EMSConfig makeWithBuilder:^(EMSConfigBuilder *builder) {
        [builder setMobileEngageApplicationCode:<applicationCode: NSString>];
        [builder setMerchantId:<merchantId: NSString>];
        [builder enableConsoleLogLevels:@[<EMSLogLevel.trace, EMSLogLevel.debug, EMSLogLevel.info, EMSLogLevel.warn, EMSLogLevel.error, EMSLogLevel.basic>]];
    }];
    [Emarsys setupWithConfig:config];
	 // Handle push 
	 UNUserNotificationCenter.currentNotificationCenter.delegate = [Emarsys push];
 
    return YES;
}