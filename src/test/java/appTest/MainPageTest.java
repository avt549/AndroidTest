package appTest;


import com.codeborne.selenide.Condition;

import org.testng.annotations.Test;

import java.time.Duration;


public class MainPageTest extends BaseTest {


  @Test(testName="проверка отображения поля name",
          description = "проверка отображения поля name")
  public void chickFieldNameTest() {
    mainPage
            .usersAllName
            .get(1)
            .shouldBe(Condition.visible, Duration.ofSeconds(15));
  }


  @Test(testName="проверка отображения поля Grade",
          description = "проверка отображения поля Grade")
  public void chickFieldGradeTest() {
    mainPage
            .usersAllGrade
            .get(1)
            .shouldBe(Condition.visible, Duration.ofSeconds(15));
  }

  @Test(testName="проверка отображения поля id",
          description = "проверка отображения поля id")
  public void chickFieldTest() {
    mainPage
            .usersAllId
            .get(0)
            .shouldBe(Condition.visible, Duration.ofSeconds(15));
  }

}
