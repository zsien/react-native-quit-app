#ifdef RCT_NEW_ARCH_ENABLED

#import <RNQuitAppSpec/RNQuitAppSpec.h>

NS_ASSUME_NONNULL_BEGIN

@interface RNQuitApp : NSObject <NativeQuitAppSpec>

@end

NS_ASSUME_NONNULL_END

#else

#import <React/RCTBridgeModule.h>

@interface RNQuitApp : NSObject <RCTBridgeModule>

@end

#endif
