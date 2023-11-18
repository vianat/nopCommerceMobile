package steps;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class SearchProductTest extends Base {

    WebElement searchField;
    WebElement searchIcon;
    WebElement AddToCart;
    WebElement deleteProduct;
    WebElement CART;
    WebElement HOME;
    WebElement MENU;
    WebElement USER;
    WebElement continueShopping;

    @And("Tap in search field")
    public void tapInSearchField() throws InterruptedException {
        Thread.sleep(1500);
        searchField = driver.findElement(AppiumBy.className("android.widget.EditText"));
        searchField.click();
    }

    @And("Enter {string} in search field")
    public void enterInSearchField(String prod) throws InterruptedException {
        Thread.sleep(1500);
        searchField.sendKeys(prod);
    }

    @And("Tap [search icon]")
    public void tapSearchIcon() throws InterruptedException {
        Thread.sleep(1500);
        searchIcon = driver.findElement(AppiumBy.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View"));
        searchIcon.click();
    }

    @And("Tap on first product")
    public void tapOnFirstProduct() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(AppiumBy.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[5]/android.view.View/android.view.View/android.widget.ImageView")).click();
    }

    @And("Tap [continue shopping]")
    public void tapContinueShopping() throws InterruptedException {
        Thread.sleep(1500);
        continueShopping = driver.findElement(AppiumBy.accessibilityId("CONTINUE SHOPPING"));
        continueShopping.click();
    }
}