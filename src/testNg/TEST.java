package testNg;
import java.io.IOException;

import io.appium.java_client.NetworkConnectionSetting;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import MainBase.MobileDriver;


public class TEST {
	

	public TEST() {
		
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws InterruptedException, IOException{
		
//		NetworkConnectionSetting networkcontroller = new NetworkConnectionSetting (false, true, false);
//		
//		System.out.println("创建NetworkConnectionSetting对象");
//		
//		Thread.sleep(3000);
//		
//		System.out.println("开始设置网络");
//		
//		MobileDriver.getInstance().setNetworkConnection(networkcontroller);
//		
//		System.out.println("完成网络初始化");
//		
//		Thread.sleep(10000);
//		
//		System.out.println("开始设置网络");
//		
//		networkcontroller.setWifi(false);
//		
//		MobileDriver.getInstance().setNetworkConnection(networkcontroller);
//		
//		System.out.println("网络关闭完成");
		
        
		AndroidDriver driver = MobileDriver.getInstance();

		Thread.sleep(15000);
		
//		System.out.println(driver.findElement(By.id("com.android.packageinstaller:id/app_name")).getText());
		
		
	}

}
