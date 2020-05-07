package apiDemos;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;
import pageFactoryApiDemos.ApiDemosHome;
import utils.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApiDemosAccessibilityTest extends Base {

    static AndroidDriver<AndroidElement> driver;
     ApiDemosHome apiDemosHome;


    @Test
    public void init() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("./src/main/resources/global.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);

        //Get the device type from the properties file.
        String device = properties.getProperty("device");

        driver = Base.capabilities(device);

        String appPackage = properties.getProperty("apiDemos.package");
        String appActivity = properties.getProperty("apiDemos.activity");

        driver.startActivity(new Activity(appPackage, appActivity));
    }

    @Test
    public void launchAccessibility() {
        apiDemosHome = new ApiDemosHome(driver);
        apiDemosHome.accessibility.click();

    }
}
