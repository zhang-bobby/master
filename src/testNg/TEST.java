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
//		System.out.println("����NetworkConnectionSetting����");
//		
//		Thread.sleep(3000);
//		
//		System.out.println("��ʼ��������");
//		
//		MobileDriver.getInstance().setNetworkConnection(networkcontroller);
//		
//		System.out.println("��������ʼ��");
//		
//		Thread.sleep(10000);
//		
//		System.out.println("��ʼ��������");
//		
//		networkcontroller.setWifi(false);
//		
//		MobileDriver.getInstance().setNetworkConnection(networkcontroller);
//		
//		System.out.println("����ر����");
		
        
		AndroidDriver driver = MobileDriver.getInstance();

		Thread.sleep(15000);
		
//		System.out.println(driver.findElement(By.id("com.android.packageinstaller:id/app_name")).getText());
		
		
	}

}
