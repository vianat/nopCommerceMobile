package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class DragAndDrop extends Base{
    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        WebElement dragElement = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));

        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) dragElement).getId(),
                "endX", 650,
                "endY", 570
        ));
        Thread.sleep(3000);

//        variant 2:
//        WebElement dropElement = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_3"));

//        int middleXCoordinate_dragElement =dragElement.getLocation().x + (dragElement.getSize().width/2);
//        int middleYCoordinate_dragElement =dragElement.getLocation().y + (dragElement.getSize().height/2);
//        int middleXCoordinate_dropElement =dropElement.getLocation().x + (dropElement.getSize().width/2);
//        int middleYCoordinate_dropElement =dropElement.getLocation().y + (dropElement.getSize().height/2);

//        TouchAction  action =new TouchAction(driver);
//        action.longPress(PointOption.point(middleXCoordinate_dragElement, middleYCoordinate_dragElement))
//                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//                .moveTo(PointOption.point(middleXCoordinate_dropElement, middleYCoordinate_dropElement))
//                .release()
//                .perform();

        String result = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
        Assert.assertEquals(result, "Dropped!");
    }

}