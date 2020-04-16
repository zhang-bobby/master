package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.URL;
import org.junit.*;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;



public class AppiumHelloTest {
    private AppiumDriver driver;
    @BeforeMethod
    public void setup() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability(CapabilityType.BROWSER_NAME, "");
        cap.setCapability("platformName", "Android"); //指定测试平台
        cap.setCapability("deviceName", "127.0.0.1:21503"); //指定测试机的ID,通过adb命令`adb devices`获取
        cap.setCapability("platformVersion", "4.4.4");
        //将上面获取到的包名和Activity名设置为值
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        //A new session could not be created的解决方法
        cap.setCapability("appWaitActivity","com.android.calculator2.Calculator");
        //每次启动时覆盖session，否则第二次后运行会报错不能新建session
        cap.setCapability("sessionOverride", true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }
    
    @Test
    public void plus(){
        //获取1
        driver.findElementById("com.android.calculator2:id/digit5").click();
        //获取+
        driver.findElementById("com.android.calculator2:id/plus").click();
        //获取2
        driver.findElementById("com.android.calculator2:id/digit7").click();
        //获取=
        driver.findElementById("com.android.calculator2:id/equal").click();
    }
    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}