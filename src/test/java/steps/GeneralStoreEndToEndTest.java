package steps;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;

public class GeneralStoreEndToEndTest extends Base {

    @Given("End to End app test")
    public void end_to_end_app_test() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Aziz QA");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Angola\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Angola']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        Thread.sleep(1000);
        String products = "Products";
        String check = driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")).getText();
        Assert.assertEquals(check,products);
        Thread.sleep(3000);
    }
}
