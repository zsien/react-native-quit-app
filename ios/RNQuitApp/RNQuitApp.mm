#import "RNQuitApp.h"

#ifdef RCT_NEW_ARCH_ENABLED
#import "RNQuitAppSpec.h"
#endif

@implementation RNQuitApp

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(quitApp)
{
    dispatch_async(dispatch_get_main_queue(), ^{
        UIApplication *app = [UIApplication sharedApplication];
        [app performSelector:@selector(suspend)];
    });
}

#ifdef RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeQuitAppSpecJSI>(params);
}
#endif

@end
