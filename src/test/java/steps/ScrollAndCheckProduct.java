package steps;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ScrollAndCheckProduct extends Base {

    @Given("find product and choose")
    public void find_product_and_choose() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Fuffel");
        driver.hideKeyboard();
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        Thread.sleep(2000);

        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));

        int prodCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
        for (int i = 0; i < prodCount; i++){
            String prodName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
            if(prodName.equalsIgnoreCase("Jordan 6 Rings")){
                driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
            }
        }
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        String actual = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();

        Assert.assertEquals(actual, "Jordan 6 Rings");
    }
}
