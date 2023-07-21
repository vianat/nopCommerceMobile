package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class openByActivity extends Base {

    // You can open any page off app by using activity and avoid many steps of navigation
    // https://support.testsigma.com/support/solutions/articles/32000019977-how-to-find-app-package-and-app-activity-of-your-android-app
    // adb shell dumpsys window | grep -E 'mCurrentFocus'
    @Test
    public void openAppFromActivity(){

        Activity activity = new Activity("io.appium.android.apis","io.appium.android.apis.view.Animation2");
        driver.startActivity(activity);

        Assert.assertEquals(driver.findElement(AppiumBy.accessibilityId("Select an animation:")).getText(), "Select an animation:");
    }
}
