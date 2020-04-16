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
        cap.setCapability("platformName", "Android"); //ָ������ƽ̨
        cap.setCapability("deviceName", "127.0.0.1:21503"); //ָ�����Ի���ID,ͨ��adb����`adb devices`��ȡ
        cap.setCapability("platformVersion", "4.4.4");
        //�������ȡ���İ�����Activity������Ϊֵ
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        //A new session could not be created�Ľ������
        cap.setCapability("appWaitActivity","com.android.calculator2.Calculator");
        //ÿ������ʱ����session������ڶ��κ����лᱨ�����½�session
        cap.setCapability("sessionOverride", true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }
    
    @Test
    public void plus(){
        //��ȡ1
        driver.findElementById("com.android.calculator2:id/digit5").click();
        //��ȡ+
        driver.findElementById("com.android.calculator2:id/plus").click();
        //��ȡ2
        driver.findElementById("com.android.calculator2:id/digit7").click();
        //��ȡ=
        driver.findElementById("com.android.calculator2:id/equal").click();
    }
    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}