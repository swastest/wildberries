package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:properties/config.properties")
public interface RemoteConfigInterface extends Config{
    String remoteUrl();
    String selenoidLogin();
    String selenoidPassword();
}
