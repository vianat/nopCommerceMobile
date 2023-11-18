package steps;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;

import static org.testng.AssertJUnit.assertEquals;

public class OrderAsRegUserTest extends Base {

    WebElement electronics;
    WebElement AddToCart;
    WebElement cameraAndPhoto;
    WebElement product;
    WebElement deleteProduct;
    WebElement CART;
    WebElement HOME;
    WebElement MENU;
    WebElement USER;

    @Given("MAIN buttons initializing")
    public void mainButtonsInitializing() throws InterruptedException {
        Thread.sleep(300);
        HOME = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[1]"));
        Thread.sleep(300);
        MENU = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[2]"));
        Thread.sleep(300);
        CART = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[3]"));
        Thread.sleep(300);
        USER = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[4]"));
        Thread.sleep(500);
    }

    @And("Tap Add To Cart button")
    public void tapAddToCartButton() throws InterruptedException {
        Thread.sleep(1500);
        AddToCart = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='ADD TO CART']"));
        AddToCart.click();
    }

    @And("Tap Shopping Cart button")
    public void tapShoppingCartButton() throws InterruptedException {
        Thread.sleep(1500);
        CART = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[3]"));
        CART.click();
    }

    @And("Tap on Electronics")
    public void tapOnElectronics() throws InterruptedException {
        Thread.sleep(1500);
        electronics = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='ELECTRONICS']"));
        electronics.click();
    }

    @And("Tap on Camera&Photo")
    public void tapOnCameraPhoto() throws InterruptedException {
        Thread.sleep(1500);
        cameraAndPhoto = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='CAMERA & PHOTO']"));
        cameraAndPhoto.click();
    }

    @And("Tap on any product")
    public void tapOnAnyProduct() throws InterruptedException {
        Thread.sleep(1500);
        product = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='Leica T Mirrorless Digital Camera']"));
        product.click();
    }

    @And("Tap delete button")
    public void tapDeleteButton() throws InterruptedException {
        Thread.sleep(1500);
        deleteProduct = driver.findElement(AppiumBy.xpath("(//android.widget.ScrollView//android.view.View)[8]"));
        deleteProduct.click();
    }

    @And("Tap USER button")
    public void tapUSERButton() throws InterruptedException {
        Thread.sleep(1500);
        USER = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[4]"));
        USER.click();
    }
}