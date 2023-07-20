package org.example;

import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipeLeft extends Base {
    @Test
    public void swipeLeft(){

        swipeLeft();

        Assert.assertEquals(driver.findElement(AppiumBy.accessibilityId("Animation")).getText(),"Animation");
    }
}
