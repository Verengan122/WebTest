package config;

import helper.DriverSettings;
import io.qameta.allure.junit5.AllureJunit5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.closeWebDriver;

@ExtendWith({AllureJunit5.class})
public class TestBase {

    @BeforeAll
    public static void setUp() {
        DriverSettings.configure();
    }

    @AfterEach
    public void addAttachments() {
        closeWebDriver();
    }
}