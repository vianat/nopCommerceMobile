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

    @Given("open app")
    public void open_app() throws InterruptedException {
        Activity activity = new Activity("com.nopadvance.team","com.nopadvance.team.MainActivity");
        driver.startActivity(activity);
        Thread.sleep(7000);
    }

    @And("wait {int}")
    public void wait(int ms) throws InterruptedException {
        Thread.sleep(ms + 1000);
    }

    @And("Click [login] btn")
    public void clickLoginBtn() throws InterruptedException {
        Thread.sleep(1500);
        logIn = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='LOG IN']"));
        logIn.click();
    }

    @And("Enter email {string} and password {string}")
    public void enterEmailAndPassword(String login, String password) throws InterruptedException {
        Thread.sleep(1500);
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
    public void clickUserBtn() throws InterruptedException {
        Thread.sleep(1500);
        USER = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc='Tab 4 of 4']"));
        USER.click();
    }

    @And("Click [log out] btn")
    public void clickLogOutBtn() throws InterruptedException {
        Thread.sleep(1500);
        logOut = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='Log out']"));
        logOut.click();
    }

    @And("Click [CONTINUE WITHOUT LOGIN] btn")
    public void clickCONTINUEWITHOUTLOGINBtn() throws InterruptedException {
        Thread.sleep(1500);
        CONTINUE_WITHOUT_LOGIN = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='CONTINUE WITHOUT LOGIN']"));
        CONTINUE_WITHOUT_LOGIN.click();
    }

    @Then("Make sure you see text: {string} on main page")
    public void makeSureYouSeeTextOnMainPage(String expected) throws InterruptedException {
        Thread.sleep(1500);
        String actual = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='FEATURED PRODUCTS']"))
                .getAttribute("content-desc");
        System.out.println(actual);
        assertEquals(actual, expected);
    }
}