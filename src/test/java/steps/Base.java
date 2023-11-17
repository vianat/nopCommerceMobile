package steps;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;


public class Base {

    public static AndroidDriver driver;

    public void longPressOnElement(WebElement el){
        ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement)el).getId(),
                        "duration", 2000));
    }
    public void swipeLeft(){
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", 100, "top", 100,
                "width", 200, "height", 200,
                "direction", "left",
                "percent", 0.75
        ));
    }

    public void swipeAction(WebElement ele, String direction){
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of
                ("elementId", ((RemoteWebElement)ele).getId(),
                        "direction", direction,
                        "percent", 0.75
                ));
    }

}