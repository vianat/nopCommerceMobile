package steps;

import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipeLeftTest extends Base {
    @Test
    public void swipeLeft(){

        swipeLeft();

        Assert.assertEquals(driver.findElement(AppiumBy.accessibilityId("Animation")).getText(),"Animation");
    }
}
