package steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Hooks extends Base {
	AppiumDriverLocalService appiumServer;
	AppiumServiceBuilder appiumBuilder;
	final String projectDir = System.getProperty("user.dir");
	final String userHome = System.getProperty("user.home");
	final String systemName = System.getProperty("os.name");
	final String windowsNpmPath = "/AppData/Roaming/npm/node_modules/";
	final String macOsNpmPath = "/node_modules/";
	final String appiumMainPath = "/appium/build/lib/main.js";
	File logFile = new File(projectDir + "/appiumServer.log");
	@Before
	public void setUp() throws MalformedURLException {

		if(systemName.contains("Windows")){
			appiumBuilder = new AppiumServiceBuilder().withAppiumJS(new File(userHome + windowsNpmPath + appiumMainPath));
		} else {
			appiumBuilder = new AppiumServiceBuilder().withAppiumJS(new File(macOsNpmPath + appiumMainPath));
		}
		appiumServer= appiumBuilder.withIPAddress("127.0.0.1").usingPort(4723).withLogFile(logFile).build();

		appiumServer.start();

		UiAutomator2Options options = new UiAutomator2Options();
    	driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

	}
	@After
	public void tearDown(){
		driver.quit();
		appiumServer.stop();
	}

	public class DesiredCapabilitiesUtil {
		public DesiredCapabilities getDesiredCapabilities(String udid) {

//			DesiredCapabilities caps = desiredCapabilitiesUtil.getDesiredCapabilities("MyEmu");
//			driver = new AndroidDriver(new URL("http://127.0.0.1:4444/wd/hub"), caps);

			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability("platformName", "Android");
			desiredCapabilities.setCapability("platformVersion", "13");
			desiredCapabilities.setCapability("skipUnlock", "true");
			desiredCapabilities.setCapability("noReset", "false");
			desiredCapabilities.setCapability("systemPort", "8201");
			return desiredCapabilities;
		}
	}
}