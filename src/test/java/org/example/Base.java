package org.example;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
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
        options.setApp(projectDir + "//src//test//java//resources//calk.apk");

//      driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
        appiumServer.stop();
    }
}