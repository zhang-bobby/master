package testNg;


import MainBase.Recorder;
import MainBase.Snapshot;
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



public class AppiumtoutiaoTest {
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
    //    capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.jifen.comm");
        capabilities.setCapability("appActivity", "com.jifen.comm.activity.StartActivity");
//        capabilities.setCapability("appWaitActivity","com.jifen.comm.activity.StartActivity");
        capabilities.setCapability("sessionOverride",true);
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
    }
 
    @Test
    public void MPMrun() throws Exception{
//        录制视频
        Recorder.startRecord();
        //  	By locator = getLocatorByType(caseentity.getLocaltype(),caseentity.getValuestr());
    	System.out.println("延时2S");
        Thread.sleep(2000);
//        System.out.println("点击登录按钮");
//        driver.findElement(By.id: com.tencent.mobileqq:id/btn_login)driver.
//        driver.findElementById("com.jifen.comm:id/btn_login").click();
        System.out.println("点击跳过");
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.jifen.comm:id/stb_skip1']")).click();
        Thread.sleep(3000);
        System.out.println("输入账号");
        driver.findElementById("com.jifen.comm:id/et_username").sendKeys("15507656526");
        System.out.println("延时3S");
        Thread.sleep(3000);
//        driver.findElementByClassName("android.widget.EditText").sendKeys("627375398");
        System.out.println("输入密码");
//        driver.findElementById("com.tencent.mobileqq:id/password").sendKeys("ming13168668");
        driver.findElementById("com.jifen.comm:id/et_password").sendKeys("zmh123456");
        System.out.println("延时3S");
        Thread.sleep(3000);
        System.out.println("点击登录");
        driver.findElementById("com.jifen.comm:id/stb_login").click();
        System.out.println("延时5S");
        Thread.sleep(5000);
        System.out.println("选择组织");
        driver.findElement(By.xpath("//android.widget.ListView/android.view.View[1]/android.view.View[3]")).click();
//        System.out.println("点击功能菜单");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("延时5S");
        Thread.sleep(5000);
//        System.out.println("点击所在组织");
//        driver.findElement(By.xpath("//android.view.View[@text='暂无消息']")).click();
//        System.out.println("延时5S");
//        Thread.sleep(5000);
//        System.out.println("点击返回");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("延时6S");
//        Thread.sleep(6000);
        System.out.println("点击功能菜单");
        driver.findElement(By.xpath("//android.widget.Button")).click();
        System.out.println("延时3S");
        Thread.sleep(3000);
        System.out.println("点击消息中心");
        driver.findElement(By.xpath("//android.view.View[@text='我的积分']")).click();
//        System.out.println("延时5S");
//        Thread.sleep(5000);
//        System.out.println("点击返回");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("延时10S");
//        Thread.sleep(10000);
//        System.out.println("点击我的积分");
//        driver.findElement(By.xpath("//android.view.View[@text='我的积分']")).click();
//        System.out.println("延时5S");
//        Thread.sleep(5000);
//        System.out.println("点击返回");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("延时5S");
//        Thread.sleep(5000);
//        System.out.println("点击功能菜单");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("延时5S");
//        Thread.sleep(5000);
//        System.out.println("点击系统设置");
//        driver.findElement(By.xpath("//android.view.View[@text='当前总分']")).click();
//        System.out.println("延时5S");
//        Thread.sleep(5000);
//        System.out.println("点击系统设置--消息通知设置");
//        driver.findElement(By.xpath("//android.view.View[@text='消息通知设置']")).click();
//        System.out.println("延时5S");
//        Thread.sleep(5000);
//        System.out.println("点击系统设置--返回");
//        driver.findElement(By.xpath("//android.view.View/android.view.View[1]/android.widget.Button[1]")).click();
//        System.out.println("延时5S");
//        Thread.sleep(5000);
//        System.out.println("点击系统设置--账号与安全");
//        driver.findElement(By.xpath("//android.view.View[@text='账号与安全']")).click();
//        System.out.println("延时5S");
//        Thread.sleep(5000);
//        System.out.println("点击系统设置--返回");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("延时5S");
//        Thread.sleep(5000);
//        System.out.println("点击系统设置--清理缓存");
//        driver.findElement(By.xpath("//android.widget.ListView/android.view.View[2]")).click();
//        System.out.println("延时5S");
//        Thread.sleep(5000);
//        System.out.println("点击系统设置--关于我们");
//        driver.findElement(By.xpath("//android.view.View[@text='关于我们']")).click();
//        System.out.println("延时5S");
//        Thread.sleep(5000);
//        System.out.println("点击系统设置--返回");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("延时5S");
//        Thread.sleep(5000);
//        System.out.println("点击系统设置--退出登录");
//        driver.findElement(By.xpath("//android.widget.Button[@text='退出登录']")).click();
//        保存视频
        Recorder.saveTopath();
    }
    
    public void tearDown() throws Exception {
    	System.out.println("测试完毕");
        driver.quit();
       
    }
}