package steps;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class BuyProductTest extends Base {

    WebElement searchField;
    WebElement searchIcon;
    WebElement addToCArt;
    WebElement CART;
    WebElement logOut;
    WebElement CONTINUE_WITHOUT_LOGIN;
    WebElement USER;

    @Given("Click in search field")
    public void clickInSearchField() {
        searchField = driver.findElement(AppiumBy.className("android.widget.EditText"));
        searchField.click();
    }

    @And("Enter {string} in search field")
    public void enterInSearchField(String prod) {
        searchField.sendKeys(prod);
    }

    @Given("Click [search icon]")
    public void clickSearchIcon() {
        searchIcon = driver.findElement(AppiumBy.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View"));
        searchIcon.click();
    }

    @And("Click on first product")
    public void clickOnFirstProduct() {
        driver.findElement(AppiumBy.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[5]/android.view.View/android.view.View/android.widget.ImageView")).click();
    }

    @And("Click [ADD TO CART]")
    public void clickADDTOCART() {
        addToCArt = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='ADD TO CART']"));
        addToCArt.click();
    }

    @And("Scroll down")
    public void scrollDown() throws InterruptedException {
//        boolean canScrollMore = true;
//        do{
//            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//                "left",  100,   "top", 100,
//                "width", 1000, "height", 2000,
//                "direction", "down",
//                "percent", 50.0
//        ));
//        }while(canScrollMore);
//
//        Thread.sleep(2000);
        swipe_left();
    }

    @And("Click [CART] button")
    public void clickCARTButton() {
        CART = driver.findElement(AppiumBy.accessibilityId("1 Tab 3 of 4"));
        CART.click();
    }

    public void swipeAction(WebElement ele, String direction){
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of
                ("elementId", ((RemoteWebElement)ele).getId(),
                 "direction", direction,
                 "percent", 50.75
        ));
    }

    public void swipe_left(){
        WebElement firstImage = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='HTC - One (M8) 4G LTE Cell Phone with 32GB Memory - Gunmetal (Sprint)']"));
        swipeAction(firstImage, "DOWN");

    }
}