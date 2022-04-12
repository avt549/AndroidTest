package appTest;

import org.junit.jupiter.api.Test;

public class UserPageTest extends BaseTest{

    @Test
    public void openUserCardTest() {
        waitElement(mainPage.usersAllCards);
        mainPage.usersAllCards.get(0).click();
        waitElement(userPage.contentDeskUSer);
        userPage.clickButtonBack();
    }

    @Test
    public void checkHeader() {
        waitElement(mainPage.usersAllCards);
        mainPage.usersAllCards.get(0).click();
        waitElement(userPage.contentDeskUSer);
        userPage.checkThatElementContainsTest("User screen");
        userPage.clickButtonBack();

    }
    @Test
    public void checkUserInformation() {
        waitElement(mainPage.usersAllCards);
        mainPage.usersAllCards.get(0).click();
        waitElement(userPage.contentDeskUSer);
        userPage.checkThatElementContainsTest("Иванов Иван Иванович");
        userPage.checkThatElementContainsTest("Тестировщик ПО");
        userPage.checkThatElementContainsTest("СПБГУ");
        userPage.checkThatElementContainsTest("Санкт-Петербург");
        userPage.clickButtonBack();
    }
    @Test
    public void checkFields() {
        waitElement(mainPage.usersAllCards);
        mainPage.usersAllCards.get(1).click();
        waitElement(userPage.contentDeskUSer);
        userPage.checkThatElementContainsTest("USER NAME");
        userPage.checkThatElementContainsTest("USER GRADE");
        userPage.checkThatElementContainsTest("USER SCHOOL NAME");
        userPage.checkThatElementContainsTest("USER CITY");
        userPage.clickButtonBack();
    }
}
