package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;
public class MainPage {

    public ElementsCollection usersAllCards = $$x("//*[@content-desc='users']");
    public ElementsCollection usersAllName = $$x("//*[@content-desc='user-nae']");
    public ElementsCollection usersAllGrade = $$x("//*[@content-desc='user-nae']");
    public ElementsCollection usersAllId = $$x("//*[@content-desc='user-id']");
    public ElementsCollection contentDeskUSer = $$x("//*[contains(@content-desc,'USER ID')]");


    @Step("Перейти в карточку пользователя")
    @Attachment
    public UserPage clickOnCard(){
       usersAllCards.get(0).shouldBe(Condition.visible,Duration.ofSeconds(15)).click();
        contentDeskUSer.get(0).shouldBe(Condition.visible,Duration.ofSeconds(15));

        return new UserPage();
    }
}
