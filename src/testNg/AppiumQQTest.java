package testNg;


import org.testng.annotations.AfterMethod;
import Bean.CaseEntity;
import org.testng.annotations.Test;
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



public class AppiumQQTest {
    private AppiumDriver driver;
    @BeforeMethod
	public void setUp() throws Exception {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "App");
        File app = new File(appDir, "mpm.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability("deviceName", "127.0.0.1:62001"); // "Android Emulator"
        capabilities.setCapability("platformVersion", "4.4.4");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.jifen.comm");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
    }
 
    @Test
    public void QQrun() throws InterruptedException{
//        System.out.println("����������밴ť");
//        driver.findElementById("com.jifen.comm:id/tv_forget_password").click();
        System.out.println("���������ֻ���");
    	driver.findElementById("com.jifen.comm:id/et_phone").sendKeys("15507656526");
    	System.out.println("������������");
    	driver.findElementById("com.jifen.comm:id/et_set_new_password").sendKeys("zmh123456");
        System.out.println("��ʱ20S");
        Thread.sleep(20000);
    	System.out.println("ȷ����������");
    	driver.findElementById("com.jifen.comm:id/stb_login").click();
  //  	By locator = getLocatorByType(caseentity.getLocaltype(),caseentity.getValuestr());
    	System.out.println("��ʱ20S");
        Thread.sleep(20000);
        System.out.println("�������");
        driver.findElementById("com.jifen.comm:id/stb_skip1").click();
        System.out.println("�����¼��ť");
//        driver.findElement(By.id: com.tencent.mobileqq:id/btn_login)driver.
        driver.findElementById("com.jifen.comm:id/btn_login").click();
        
        System.out.println("�����˺�");
        driver.findElementById("com.jifen.comm:id/et_username").sendKeys("15507656526");
//        driver.findElementByClassName("android.widget.EditText").sendKeys("15507656526");
        System.out.println("��������");
        driver.findElementById("com.jifen.comm:id/et_password").sendKeys("zmh123456");
        System.out.println("�����¼");
        driver.findElementById("com.jifen.comm:id/stb_login").click();
    }
    
    public void tearDown() throws Exception {
    	System.out.println("�������");
        driver.quit();
       
    }
}