package steps;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class openByActivityTest extends Base {

    // You can open any page off app by using activity and avoid many steps of navigation
    // https://support.testsigma.com/support/solutions/articles/32000019977-how-to-find-app-package-and-app-activity-of-your-android-app
    // adb shell dumpsys window | grep -E 'mCurrentFocus'
    @Test
    public void openAppFromActivity(){

        Activity activity = new Activity("io.appium.android.apis","io.appium.android.apis.view.Animation2");
        driver.startActivity(activity);

        Assert.assertEquals(driver.findElement(AppiumBy.accessibilityId("Select an animation:")).getText(), "Select an animation:");
    }


    @Given("open settings")
    public void open_settings() {

        Activity activity = new Activity("com.android.settings","com.android.settings.Settings");
        driver.startActivity(activity);

        String actual = driver.findElement(By.id("com.android.settings:id/homepage_title")).getText();

        Assert.assertEquals(actual, "Settings");
    }

    @Given("open wifi settings")
    public void open_wifi_settings() throws InterruptedException {

        Activity activity = new Activity("com.android.settings","com.android.settings.Settings");
        driver.startActivity(activity);

        Thread.sleep(100);
        driver.findElement(AppiumBy.xpath("//*[@text='Network & internet']")).click();
        Thread.sleep(100);
        driver.findElement(AppiumBy.xpath("//*[@text='Internet']")).click();
        Thread.sleep(100);

        WebElement el = driver.findElement(AppiumBy.xpath("//*[@class='android.widget.Switch']"));

        if (el.getAttribute("checked").equals("true")) {
        } else el.click();

        Assert.assertEquals(el.getAttribute("checked"), "true");
    }
}
