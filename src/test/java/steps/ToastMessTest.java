package steps;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToastMessTest extends Base {
    @Test
    public void verifyToastMess() throws InterruptedException {

        Thread.sleep(3000);
        driver.hideKeyboard();
        driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Angola\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Angola']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        String toastMess = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
        Assert.assertEquals(toastMess, "Please enter your name");
    }
}
