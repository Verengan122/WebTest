import com.codeborne.selenide.Condition;
import config.TestBase;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WebDriverTest extends TestBase {
    @Test
    @DisplayName("Loading page github.com")
    void googleTest() {
        step("open page GitHub.com", () ->
                open(baseUrl));
        $x("//*[div]//*[contains(text(),'Where the world builds software')]").shouldBe(visible);
    }
}


