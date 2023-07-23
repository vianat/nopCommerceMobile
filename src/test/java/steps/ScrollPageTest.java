package steps;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class ScrollPageTest extends Base {
    @Test
    public void scrollDownPage() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        Thread.sleep(2000);

//        boolean canScrollMore;
//        do{
//            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//                "left", 100, "top", 100, "width", 200, "height", 200,
//                "direction", "down",
//                "percent", 3.0
//
//        ));
//        }while(canScrollMore);
//
//        Thread.sleep(2000);
    }
}
