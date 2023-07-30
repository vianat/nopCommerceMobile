package steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class Hooks extends Base {

	AppiumDriverLocalService appiumServer;
	String projectDir = System.getProperty("user.dir");
	String userHome = System.getProperty("user.home");
	@Before
	public void setUp() throws MalformedURLException {
		appiumServer = new AppiumServiceBuilder()
				.withAppiumJS(new File(userHome + "//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();

		appiumServer.start();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("MyEmu");
		//options.setApp(projectDir + "//src//test//java//resources//ApiDemos-debug.apk");
		//options.setApp(projectDir + "//src//test//java//resources//General-Store.apk");

//      driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	}
	@After
	public void tearDown(){
		driver.quit();
		appiumServer.stop();
	}
}