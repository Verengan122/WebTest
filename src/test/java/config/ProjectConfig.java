package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/${properties}.properties")
public interface ProjectConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String webUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browser.size")
    @DefaultValue("1600x1900")
    String browserSize();

    @Key("remoteDriverUrl")
    @DefaultValue("")
    String remoteDriverUrl();

    @Key("browser.version")
    @DefaultValue("100.0")
    String browserVersion();


}
