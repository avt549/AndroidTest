package providers;

import static org.apache.commons.io.FileUtils.copyInputStreamToFile;
import static org.openqa.selenium.remote.CapabilityType.APPLICATION_NAME;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class SelenideWebDriver implements WebDriverProvider {

  @Nonnull
  @Override
  public WebDriver createDriver(@Nonnull Capabilities capabilities) {

    UiAutomator2Options options = new UiAutomator2Options();
    options.merge(capabilities);
    options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
    options.setPlatformName("Android");
    options.setDeviceName("test2_API_28");
    options.setPlatformVersion("9.0");
    options.setApp("/home/andrey/java/appiumTestProject-2/appiumTestProject/build/app-debug.apk");

    try {
      return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
