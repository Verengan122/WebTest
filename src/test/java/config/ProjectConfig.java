package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/${properties}.properties")
public interface ProjectConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://google.com")
    String baseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browser.size")
    @DefaultValue("1600x1900")
    String browserSize();

    @Key("browser.version")
    @DefaultValue("100.0")
    String browserVersion();

    @Key("remoteDriverUrl")
    @DefaultValue("")
    String remoteDriverUrl();
}
