package appTest;


import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;


public class MainPageTest extends BaseTest {


  @Test
  public void chickFieldIdName() {
    waitElement(mainPage.usersAllCards);
    mainPage.usersAllName.get(1).shouldBe(Condition.visible);
  }


  @Test
  public void chickFieldIdGrade() {
    waitElement(mainPage.usersAllCards);
    mainPage.usersAllGrade.get(1).shouldBe(Condition.visible);
  }
  @Test
  public void chickFieldIdTest() {
    waitElement(mainPage.usersAllCards);
    mainPage.usersAllId.get(0).shouldBe(Condition.visible);
  }

}
