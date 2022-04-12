package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class UserPage {
    public ElementsCollection buttonBack = $$x("//*[@content-desc='Back']");
    public ElementsCollection contentDeskUSer = $$x("//*[contains(@content-desc,'USER ID')]");

    public void checkThatElementContainsTest(String text){
            $$x("//*[contains(@content-desc,'"+text+"')]").get(0).shouldBe(Condition.visible);
    }


    public void clickButtonBack(){
        buttonBack.get(0).shouldBe(Condition.visible).click();
    }


}
