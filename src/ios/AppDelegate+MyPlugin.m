#import "AppDelegate.h"
#import "AppDelegate+MyPlugin.h"
#import "EMSAppDelegate.h"
#import "EMSConfig.h"
#import "Emarsys.h"

@implementation AppDelegate (MyPlugin)

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
    EMSConfig *config = [EMSConfig makeWithBuilder:^(EMSConfigBuilder *builder) {
        [builder setMobileEngageApplicationCode:@"EMS68-B0B32"];
        [builder setMerchantId:@"1CEA5AF1FE153881"];
        //[builder enableConsoleLogLevels:@[<EMSLogLevel.trace, EMSLogLevel.debug, EMSLogLevel.info, EMSLogLevel.warn, EMSLogLevel.error, EMSLogLevel.basic>]];
    }];
    [Emarsys setupWithConfig:config];
	 // Handle push 
	 UNUserNotificationCenter.currentNotificationCenter.delegate = [Emarsys push];
 
    return YES;
}
@end