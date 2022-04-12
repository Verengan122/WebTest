package helper;

import com.codeborne.selenide.Configuration;
import config.Project;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSettings {

    public static void configure() {

        System.getProperty("properties", "local");
        Configuration.browser = Project.projectConfig.browser();
        Configuration.browserVersion = Project.projectConfig.browserVersion();
        Configuration.browserSize = Project.projectConfig.browserSize();
        Configuration.baseUrl = Project.projectConfig.baseUrl();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();

//        if (Project.isRemoteWebDriver()) {
//            capabilities.setCapability("enableVNC", true);
//            capabilities.setCapability("enableVideo", true);
            Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
////            Configuration.remote = System.getProperty("remoteDriverUrl");
//        }

        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        Configuration.browserCapabilities = capabilities;
    }
}

