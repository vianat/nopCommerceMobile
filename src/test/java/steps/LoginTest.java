package steps;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends Base {

    WebElement logIn;
    WebElement logOut;
    WebElement CONTINUE_WITHOUT_LOGIN;
    WebElement USER;
    List<org.openqa.selenium.WebElement> LOGIN_PASSWORD;

    @Given("open app")
    public void open_app() {
        Activity activity = new Activity("com.nopadvance.team","com.nopadvance.team.MainActivity");
        driver.startActivity(activity);
    }

    @And("wait {int}")
    public void wait(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }

    @And("Click [login] btn")
    public void clickLoginBtn() {
        logIn = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"LOG IN\"]"));
        logIn.click();
    }

    @And("Enter email {string} and password {string}")
    public void enterEmailAndPassword(String login, String password) throws InterruptedException {
        var el = driver.findElements(AppiumBy.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"));

        el.get(0).click();
        Thread.sleep(100);
        el.get(0).sendKeys(login);
        Thread.sleep(100);

        Thread.sleep(100);
        var field = el.get(1);
        field.click();
        Thread.sleep(100);
        field.sendKeys(password);
        driver.hideKeyboard();
    }

    @Given("Click [user] btn")
    public void clickUserBtn() {
        USER = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Tab 4 of 4\"]"));
        USER.click();
    }

    @And("Click [log out] btn")
    public void clickLogOutBtn() {
        logOut = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Log out\"]"));
        logOut.click();
    }

    @And("Click [CONTINUE WITHOUT LOGIN] btn")
    public void clickCONTINUEWITHOUTLOGINBtn() {
        CONTINUE_WITHOUT_LOGIN = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"CONTINUE WITHOUT LOGIN\"]"));
        CONTINUE_WITHOUT_LOGIN.click();
    }

    @Then("Make sure you see text: {string} on main page")
    public void makeSureYouSeeTextOnMainPage(String expected) {
        String actual = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"FEATURED PRODUCTS\"]"))
                .getAttribute("content-desc");
        System.out.println(actual);
        assertEquals(actual, expected);
    }
}