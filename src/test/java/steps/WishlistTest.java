package steps;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

public class WishlistTest extends Base {

    WebElement digitalDownloads;
    WebElement product;
    WebElement wishlist;
    WebElement HOME;

    @And("Tap on [DIGITAL DOWNLOADS]")
    public void tapOnDIGITALDOWNLOADS() {
        digitalDownloads = driver.findElement(AppiumBy.accessibilityId("DIGITAL DOWNLOADS"));
        digitalDownloads.click();
    }

    @And("Tap any product")
    public void tapAnyProduct() {
        product = driver.findElement(AppiumBy.accessibilityId("If You Wait (donation)"));
        product.click();
    }

    @And("Tap add product to wishlist")
    public void tapAddProductToWishlist() {
        driver.findElement(AppiumBy.xpath("(//android.widget.ScrollView//android.view.View)[13]")).click();
    }

    @And("Tap [WISHLIST] button")
    public void tapWISHLISTButton() {
        wishlist = driver.findElement(AppiumBy.xpath("(//android.view.View)[13]"));
    }

    @And("Tap [trash] icon on product")
    public void tapTrashIconOnProduct() {
        driver.findElement(AppiumBy.xpath("(//android.view.View)[13]")).click();
    }

    @Then("Verify massage {string} is displayed")
    public void verifyMassageIsDisplayed(String expected) {
        String actual = driver.findElement(AppiumBy.accessibilityId("The wishlist is empty!")).getAttribute("content-desc");
        System.out.println(actual);
        System.out.println(expected);
    }

    @And("Tap HOME button")
    public void tapHOMEButton() throws InterruptedException {
        Thread.sleep(300);
        HOME = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[1]"));
        HOME.click();
    }
}