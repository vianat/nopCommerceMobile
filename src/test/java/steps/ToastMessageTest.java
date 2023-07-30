package steps;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ToastMessageTest extends Base {

    @Given("check toast message")
    public void check_toast_message() throws InterruptedException {

        Thread.sleep(3000);
//        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Fuffel");
        driver.hideKeyboard();
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        Thread.sleep(2000);

        String actual = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");

        Assert.assertEquals(actual, "Please enter your name");
    }
}