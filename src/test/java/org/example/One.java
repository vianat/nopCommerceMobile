package org.example;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class One extends Base{
    @Test
    public void firstTest(){
        driver.findElement(AppiumBy.accessibilityId("1")).click();
        driver.findElement(AppiumBy.accessibilityId("plus")).click();
        driver.findElement(AppiumBy.accessibilityId("1")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
    }
}