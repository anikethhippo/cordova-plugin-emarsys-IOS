#import "HWPHello.h"

@implementation HWPHello

- (void)greet:(CDVInvokedUrlCommand*)command
{
    [[Emarsys setContactWithContactFieldId:@37
                    contactFieldValue:@"00966543674818"
                         completionBlock:^(NSError *error) {
                         }];
}

@end