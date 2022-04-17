package pages;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class UserPage {
    public ElementsCollection buttonBack = $$x("//*[@content-desc='Back']");


    @Step("Нажать проверка ниличия в тексте элемента {string}")
    @Attachment
    public UserPage checkThatElementContainsTest(String text){
            $$x("//*[contains(@content-desc,'"+text+"')]").get(0).shouldBe(Condition.visible);
        return this;
    }

    @Step("Нажать кнопку back")
    @Attachment
    public UserPage clickButtonBack(){
        buttonBack.get(0).shouldBe(Condition.visible).click();
        return this;
    }


}
