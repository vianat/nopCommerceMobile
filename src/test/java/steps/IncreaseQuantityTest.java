package steps;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncreaseQuantityTest extends Base {

    WebElement plus;
    WebElement minus;

    @And("Tap [+] button to increase quantity up to {int}")
    public void tapButtonToIncreaseQuantityUpTo(int max) throws InterruptedException {
        plus = driver.findElement(AppiumBy.xpath("(//android.widget.ScrollView//android.view.View)[7]"));
        for (int i = 0; i < max; i++) {
            plus.click();
            Thread.sleep(200);
        }
    }

    @Then("Make sure the quantity is {int}")
    public void makeSureTheQuantityIs(int expected) {
        String actual = driver.findElement(AppiumBy.xpath("(//android.widget.ScrollView//android.view.View)[6]"))
                .getAttribute("content-desc");
    }

    @And("Tap [-] button to decrease quantity to {int}")
    public void tapButtonToDecreaseQuantityTo(int how) throws InterruptedException {
        minus = driver.findElement(AppiumBy.xpath("(//android.widget.ScrollView//android.view.View)[5]"));
        for (int i = 5; i >= how; i--) {
            System.out.println(i+"-"+how);
            minus.click();
            Thread.sleep(200);
        }
    }

}