package MainBase;

import io.appium.java_client.NetworkConnectionSetting;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;

public class NetWorkController {
	
	private NetworkConnectionSetting connectionSetting;
	private static NetWorkController controller = null;

	private NetWorkController(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		connectionSetting = new NetworkConnectionSetting(false,true,false);
		driver.setNetworkConnection(connectionSetting);
		System.out.println("初始化手机网络状态（飞行模式：false  wifi模式：true  移动数据：false）");
	}
	
	public static synchronized NetWorkController getInstance(){
		if(controller == null){
			synchronized (NetWorkController.class) {
				if(controller == null){
					controller = new NetWorkController(MobileDriver.getInstance());
				}
			}
		}
		
		return controller;
	}
	
	public void setWifiOff(){
		connectionSetting.setWifi(false);
		System.out.println("尝试关闭wifi...");
		MobileDriver.getInstance().setNetworkConnection(connectionSetting);
	}
	
	public void setWifiOn(){
		connectionSetting.setWifi(true);
		System.out.println("尝试打开wifi...");
		MobileDriver.getInstance().setNetworkConnection(connectionSetting);
	}
	
	public void setDataOff(){
		connectionSetting.setData(false);
		System.out.println("尝试关闭移动数据...");
		MobileDriver.getInstance().setNetworkConnection(connectionSetting);
	}
	
	public void setDataOn(){
		connectionSetting.setData(true);
		System.out.println("尝试打开移动数据...");
		MobileDriver.getInstance().setNetworkConnection(connectionSetting);
	}

	public void setAirPlaneOff(){
		connectionSetting.setAirplaneMode(false);
		System.out.println("尝试关闭飞行模式...");
		MobileDriver.getInstance().setNetworkConnection(connectionSetting);
	}
	
	public void setAirPlaneOn(){
		connectionSetting.setAirplaneMode(true);
		System.out.println("尝试打开飞行模式...");
		MobileDriver.getInstance().setNetworkConnection(connectionSetting);
	}
}
