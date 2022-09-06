package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigurationCenter {
   public static EnvironmentConfigInterface configEnv = ConfigFactory.create(EnvironmentConfigInterface.class, System.getProperties());
    public static RemoteConfigInterface configRemote = ConfigFactory.create(RemoteConfigInterface.class, System.getProperties());
}
