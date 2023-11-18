package steps;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class WishlistTest extends Base {

    WebElement digitalDownloads;
    WebElement product;
    WebElement wishlist;
    WebElement HOME;
    WebElement trash;

    @And("Tap on [DIGITAL DOWNLOADS]")
    public void tapOnDIGITALDOWNLOADS() throws InterruptedException {
        Thread.sleep(2500);
        digitalDownloads = driver.findElement(AppiumBy.accessibilityId("DIGITAL DOWNLOADS"));
        digitalDownloads.click();
    }

    @And("Tap any product")
    public void tapAnyProduct() throws InterruptedException {
        Thread.sleep(2500);
        product = driver.findElement(AppiumBy.accessibilityId("If You Wait (donation)"));
        product.click();
    }

    @And("Tap add product to wishlist")
    public void tapAddProductToWishlist() throws InterruptedException {
        Thread.sleep(2500);
        driver.findElement(AppiumBy.xpath("(//android.widget.ScrollView//android.view.View)[13]")).click();
    }

    @And("Tap [WISHLIST] button")
    public void tapWISHLISTButton() throws InterruptedException {
        Thread.sleep(2500);
        wishlist = driver.findElement(AppiumBy.xpath("(//android.view.View)[14]"));
        wishlist.click();
    }

    @And("Tap trash icon on product")
    public void tapTrashIconOnProduct() throws InterruptedException {
        Thread.sleep(2500);
        trash = driver.findElement(AppiumBy.xpath("(//android.view.View)[14]"));
        trash.click();
    }

    @And("Verify massage {string} is displayed")
    public void verifyMassageIsDisplayed(String expected) throws InterruptedException {
        Thread.sleep(2500);
        String actual = driver.findElement(AppiumBy.accessibilityId("The wishlist is empty!")).getAttribute("content-desc");
        assertEquals(expected, actual);
    }

    @Then("Tap HOME button")
    public void tapHOMEButton() throws InterruptedException {
        Thread.sleep(2500);
        HOME = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[1]"));
        HOME.click();
    }
}