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
		System.out.println("��ʼ���ֻ�����״̬������ģʽ��false  wifiģʽ��true  �ƶ����ݣ�false��");
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
		System.out.println("���Թر�wifi...");
		MobileDriver.getInstance().setNetworkConnection(connectionSetting);
	}
	
	public void setWifiOn(){
		connectionSetting.setWifi(true);
		System.out.println("���Դ�wifi...");
		MobileDriver.getInstance().setNetworkConnection(connectionSetting);
	}
	
	public void setDataOff(){
		connectionSetting.setData(false);
		System.out.println("���Թر��ƶ�����...");
		MobileDriver.getInstance().setNetworkConnection(connectionSetting);
	}
	
	public void setDataOn(){
		connectionSetting.setData(true);
		System.out.println("���Դ��ƶ�����...");
		MobileDriver.getInstance().setNetworkConnection(connectionSetting);
	}

	public void setAirPlaneOff(){
		connectionSetting.setAirplaneMode(false);
		System.out.println("���Թرշ���ģʽ...");
		MobileDriver.getInstance().setNetworkConnection(connectionSetting);
	}
	
	public void setAirPlaneOn(){
		connectionSetting.setAirplaneMode(true);
		System.out.println("���Դ򿪷���ģʽ...");
		MobileDriver.getInstance().setNetworkConnection(connectionSetting);
	}
}
