package MainBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import caseDB.DBHelper;
import BaseData.DriverData;
import Bean.BusinessModule;
import Bean.CaseEntity;
import Bean.ExpectEntity;
@Test
public class MobileDriver {

	private static  AndroidDriver driver;
	private static MobileDriver mDriver = null;
	private MobileDriver(){
	//	File classpathRoot = new File(System.getProperty("user.dir"));
   //     File appDir = new File(classpathRoot, "app");
  //      File app = new File(appDir, DriverData.app);
        
        DesiredCapabilities capabilities = new DesiredCapabilities();
 //       capabilities.setCapability(CapabilityType.BROWSER_NAME, DriverData.BROWSER_NAME);
        capabilities.setCapability("platformName", DriverData.platformName);
        capabilities.setCapability("deviceName",DriverData.deviceName);
        capabilities.setCapability("platformVersion", DriverData.platformVersion);
  //      capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", DriverData.appPackage);
        capabilities.setCapability("appActivity", DriverData.appActivity);
        //支持中文输入,使用appium自带输入法
      	capabilities.setCapability("unicodeKeyboard", DriverData.unicodeKeyboard);
      	//重置输入法为系统默认
        capabilities.setCapability("resetKeyboard", "True");
        try {
			this.driver = new AndroidDriver(new URL(DriverData.url), capabilities);

		        
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("create a driver error!");
		} 
	}

	
	
	public static synchronized AndroidDriver getInstance(){
		if(mDriver == null){
			synchronized (MobileDriver.class) {
				if(mDriver == null){
					mDriver = new MobileDriver();
					driver = mDriver.driver;
				}
			}
		}
		return driver;
	}
	

	public List<CaseEntity> LoadCaseData(int moduleid,DBHelper dbhelper){	
		return DBHelper.getInstance().getCaselistData(moduleid);
	}
}
