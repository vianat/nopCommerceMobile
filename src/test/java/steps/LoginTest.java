package steps;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;

public class LoginTest extends Base {
//    Elements e = new Elements(driver);

    @Given("open app")
    public void open_app() {
        Activity activity = new Activity("com.nopadvance.team","com.nopadvance.team.MainActivity");
        driver.startActivity(activity);
    }

    @And("wait {int}")
    public void wait(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }

    @And("Click [Log in] button")
    public void clickLogInButton() {
        WebElement logIn = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"LOG IN\"]"));
        logIn.click();
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {

    }

    @And("Enter email {string}")
    public void enterEmail(String login) throws InterruptedException {
        var el = driver.findElements(AppiumBy.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"));

        el.get(0).click();
        Thread.sleep(1000);
        el.get(0).sendKeys(login);
        Thread.sleep(1000);

        Thread.sleep(1000);
        var field = el.get(1);
        field.click();
        Thread.sleep(1000);
        field.sendKeys("ow!<lSy~2H87");
    }

    @Given("Click [user] btn")
    public void clickUserBtn() {
//        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Tab 4 of 4\"]")).click();
//        Elements.USER.click();
    }

    @Given("Click [login] btn")
    public void clickLoginBtn() {
//        driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"LOG IN\"]")).click();
//        Elements.logInBtn.click();
    }
}