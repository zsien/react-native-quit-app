import { TurboModule, TurboModuleRegistry } from "react-native";

export interface Spec extends TurboModule {
  quitApp(): void;
}

export default TurboModuleRegistry.get<Spec>("RNQuitApp");
