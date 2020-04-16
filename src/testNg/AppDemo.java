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




public class  AppDemo {
	 private String flag;
	private AppiumDriver<AndroidElement> driver;

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
 	 public void testTest() throws InterruptedException {
   	Thread.sleep(15000);
  // 	driver.find_element_by_link_text('��¼').click();
   	driver.findElementById("com.android.calculator2:id/digit5").click();
    System.out.println(driver.findElement(By.id("com.android.packageinstaller:id/app_name")).getText());
	  System.out.println("public void testTest()");
	  System.out.println(flag);
	  flag = null;
	 }

	 @AfterMethod

	public void testAfter() { 
	  System.out.println("-------------------------------------");
	  System.out.println("public void testAfter()");
	  System.out.println(flag);
	  System.out.println("-------------------------------------");
	 }
	 
	 /**
	  * �ڱ�����غ�ִ�У�ע������йؼ��֣�static
	  */

	}

