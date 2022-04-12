package appTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import pages.MainPage;
import pages.UserPage;
import providers.SelenideWebDriver;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {

public MainPage mainPage = new MainPage();
public UserPage userPage = new UserPage();

    @BeforeAll
    public static void config() {
        closeWebDriver();
        Configuration.browserSize = null;
        Configuration.browser = SelenideWebDriver.class.getName();
        Configuration.pageLoadTimeout = 5000;
        Selenide.open();
    }

    public static void waitElement (ElementsCollection elements){
        for (int i = 0; i < 2000; i++) {
            if (elements.size()>0){
                break;
            }
        }

    }


}
