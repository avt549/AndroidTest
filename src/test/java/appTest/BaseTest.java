package appTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testng.annotations.BeforeMethod;
import pages.MainPage;
import pages.UserPage;
import providers.SelenideWebDriver;
import utils.FailureWatcher;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.closeWebDriver;
@ExtendWith(FailureWatcher.class)
public class BaseTest {

public MainPage mainPage = new MainPage();
public UserPage userPage = new UserPage();
    @Step("Открытие приложения")
    @BeforeMethod
    public void config() {
        closeWebDriver();
        Configuration.browserSize = null;
        Configuration.browser = SelenideWebDriver.class.getName();
        Configuration.pageLoadTimeout = 20000;



        Selenide.open();
    }




}
