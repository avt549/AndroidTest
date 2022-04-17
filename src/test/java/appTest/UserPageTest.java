package appTest;

import org.testng.annotations.Test;

public class UserPageTest extends BaseTest{


    @Test(testName="проверка отображения заголовка",
            description = "проверка отображения заголовка")
    public void checkHeaderTest() {

        mainPage.clickOnCard()
        .checkThatElementContainsTest("User screen")
        .clickButtonBack();

    }
    @Test(testName="проверка отображения информации о пользователе",
            description = "проверка отображения информации о пользователе")
    public void checkUserInformationTest() {
        mainPage.clickOnCard().
        checkThatElementContainsTest("Иванов Иван Иванович").
        checkThatElementContainsTest("Тестировщик ПО").
        checkThatElementContainsTest("СПБГУ").
        checkThatElementContainsTest("Санкт-Петербург").
        clickButtonBack();
    }
    @Test(testName="проверка наличия всех полей",
            description = "проверка наличия всех полей")
    public void checkFieldsTest() {
        mainPage.clickOnCard()
        .checkThatElementContainsTest("USER NAME")
        .checkThatElementContainsTest("USER GRADE")
        .checkThatElementContainsTest("USER SCHOOL NAME")
        .checkThatElementContainsTest("USER CITY")
        .clickButtonBack();
    }
}
