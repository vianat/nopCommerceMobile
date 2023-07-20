package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    //setup system variables :
        // install nodejs + appium (npm install appium@next)
        //JAVA_HOME = C:\Program Files\Java\jdk20
        //MAVEN_HOME = C:\Program Files\apache-maven-3.9.2
        //ANDROID_HOME = C:\Users\viana\AppData\Local\Android\Sdk
        //ANDROID_SDK_ROOT = C:\Users\viana\AppData\Local\Android\Sdk
        //path -> C:\Users\viana\AppData\Local\Android\Sdk\emulator
        //path -> C:\Users\viana\AppData\Local\Android\Sdk\platform-tools
        //path -> C:\Program Files\apache-maven-3.9.2\bin
        //path -> C:\Program Files\Java\jdk-20\bin
        //path -> C:\Program Files\Java\jdk-20\bin
        //path -> C:\Program Files\nodejs\

    AndroidDriver driver;
    AppiumDriverLocalService appiumServer;
    String projectDir = System.getProperty("user.dir");
    String userHome = System.getProperty("user.home");
    @BeforeClass
    public void SetUpAppium() throws MalformedURLException {

        appiumServer = new AppiumServiceBuilder()
                .withAppiumJS(new File(userHome + "//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();

        appiumServer.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("MyEmu");
        options.setApp(projectDir + "//src//test//java//resources//ApiDemos-debug.apk");

//      driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }

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

    @AfterClass
    public void tearDown(){
        driver.quit();
        appiumServer.stop();
    }
}