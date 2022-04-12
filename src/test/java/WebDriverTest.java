import com.codeborne.selenide.Condition;
import config.TestBase;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WebDriverTest extends TestBase {
   @Test
    @DisplayName("Loading page Google")
    public void googleTest(){
       step("open page Google.com",() ->
               open(baseUrl));
       step("Text search check", () ->
               $x("//*[contains(text(),'Сервисы Google доступны на этих языках:')]").shouldBe(Condition.visible));
//       step("find text", ()-> $("[value = Сервисы Google доступны на этих языках:  ]").shouldBe(Condition.visible));
   }
}
