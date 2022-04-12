package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.impl.CollectionElement;

import static com.codeborne.selenide.Selenide.$$x;

public class MainPage {

    public ElementsCollection usersAllCards = $$x("//*[@content-desc='users']");
    public ElementsCollection usersAllName = $$x("//*[@content-desc='user-nae']");
    public ElementsCollection usersAllGrade = $$x("//*[@content-desc='user-nae']");
    public ElementsCollection usersAllId = $$x("//*[@content-desc='user-id']");

}
