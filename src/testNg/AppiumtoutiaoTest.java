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
//        ¼����Ƶ
        Recorder.startRecord();
        //  	By locator = getLocatorByType(caseentity.getLocaltype(),caseentity.getValuestr());
    	System.out.println("��ʱ2S");
        Thread.sleep(2000);
//        System.out.println("�����¼��ť");
//        driver.findElement(By.id: com.tencent.mobileqq:id/btn_login)driver.
//        driver.findElementById("com.jifen.comm:id/btn_login").click();
        System.out.println("�������");
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.jifen.comm:id/stb_skip1']")).click();
        Thread.sleep(3000);
        System.out.println("�����˺�");
        driver.findElementById("com.jifen.comm:id/et_username").sendKeys("15507656526");
        System.out.println("��ʱ3S");
        Thread.sleep(3000);
//        driver.findElementByClassName("android.widget.EditText").sendKeys("627375398");
        System.out.println("��������");
//        driver.findElementById("com.tencent.mobileqq:id/password").sendKeys("ming13168668");
        driver.findElementById("com.jifen.comm:id/et_password").sendKeys("zmh123456");
        System.out.println("��ʱ3S");
        Thread.sleep(3000);
        System.out.println("�����¼");
        driver.findElementById("com.jifen.comm:id/stb_login").click();
        System.out.println("��ʱ5S");
        Thread.sleep(5000);
        System.out.println("ѡ����֯");
        driver.findElement(By.xpath("//android.widget.ListView/android.view.View[1]/android.view.View[3]")).click();
//        System.out.println("������ܲ˵�");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("��ʱ5S");
        Thread.sleep(5000);
//        System.out.println("���������֯");
//        driver.findElement(By.xpath("//android.view.View[@text='������Ϣ']")).click();
//        System.out.println("��ʱ5S");
//        Thread.sleep(5000);
//        System.out.println("�������");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("��ʱ6S");
//        Thread.sleep(6000);
        System.out.println("������ܲ˵�");
        driver.findElement(By.xpath("//android.widget.Button")).click();
        System.out.println("��ʱ3S");
        Thread.sleep(3000);
        System.out.println("�����Ϣ����");
        driver.findElement(By.xpath("//android.view.View[@text='�ҵĻ���']")).click();
//        System.out.println("��ʱ5S");
//        Thread.sleep(5000);
//        System.out.println("�������");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("��ʱ10S");
//        Thread.sleep(10000);
//        System.out.println("����ҵĻ���");
//        driver.findElement(By.xpath("//android.view.View[@text='�ҵĻ���']")).click();
//        System.out.println("��ʱ5S");
//        Thread.sleep(5000);
//        System.out.println("�������");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("��ʱ5S");
//        Thread.sleep(5000);
//        System.out.println("������ܲ˵�");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("��ʱ5S");
//        Thread.sleep(5000);
//        System.out.println("���ϵͳ����");
//        driver.findElement(By.xpath("//android.view.View[@text='��ǰ�ܷ�']")).click();
//        System.out.println("��ʱ5S");
//        Thread.sleep(5000);
//        System.out.println("���ϵͳ����--��Ϣ֪ͨ����");
//        driver.findElement(By.xpath("//android.view.View[@text='��Ϣ֪ͨ����']")).click();
//        System.out.println("��ʱ5S");
//        Thread.sleep(5000);
//        System.out.println("���ϵͳ����--����");
//        driver.findElement(By.xpath("//android.view.View/android.view.View[1]/android.widget.Button[1]")).click();
//        System.out.println("��ʱ5S");
//        Thread.sleep(5000);
//        System.out.println("���ϵͳ����--�˺��밲ȫ");
//        driver.findElement(By.xpath("//android.view.View[@text='�˺��밲ȫ']")).click();
//        System.out.println("��ʱ5S");
//        Thread.sleep(5000);
//        System.out.println("���ϵͳ����--����");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("��ʱ5S");
//        Thread.sleep(5000);
//        System.out.println("���ϵͳ����--������");
//        driver.findElement(By.xpath("//android.widget.ListView/android.view.View[2]")).click();
//        System.out.println("��ʱ5S");
//        Thread.sleep(5000);
//        System.out.println("���ϵͳ����--��������");
//        driver.findElement(By.xpath("//android.view.View[@text='��������']")).click();
//        System.out.println("��ʱ5S");
//        Thread.sleep(5000);
//        System.out.println("���ϵͳ����--����");
//        driver.findElement(By.xpath("//android.widget.Button")).click();
//        System.out.println("��ʱ5S");
//        Thread.sleep(5000);
//        System.out.println("���ϵͳ����--�˳���¼");
//        driver.findElement(By.xpath("//android.widget.Button[@text='�˳���¼']")).click();
//        ������Ƶ
        Recorder.saveTopath();
    }
    
    public void tearDown() throws Exception {
    	System.out.println("�������");
        driver.quit();
       
    }
}