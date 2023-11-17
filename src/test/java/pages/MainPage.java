package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @AndroidFindBy(xpath="//a[contains(text(),'Register')]")
    public WebElement addtocart;

}
