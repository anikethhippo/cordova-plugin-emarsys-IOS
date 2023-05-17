#import "Main.h"

@implementation Main

- (void)setup:(CDVInvokedUrlCommand *)command {

  NSDictionary *options = [NSJSONSerialization
      JSONObjectWithData:[[[command arguments] objectAtIndex:0]
                             dataUsingEncoding:NSUTF8StringEncoding]
                 options:0
                   error:nil];

  emarsys = [Emarsys initWithKey:(NSString *)[options objectForKey:@"key"]
               andDelegateWithData:self];
  [emarsys setExternalWalletSelectionDelegate:self];

  self.callbackId = [command callbackId];
  NSMutableDictionary * tempOptions = [[NSMutableDictionary alloc] initWithDictionary:options];
  tempOptions[@"integration_version"] = CDV_VERSION;
  tempOptions[@"integration"] = @"cordova";
  tempOptions[@"FRAMEWORK"] = @"cordova";
  [emarsys setup:tempOptions];
}

@end