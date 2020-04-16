package MainBase;

import io.appium.java_client.android.AndroidDriver;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import Bean.CaseEntity;
import Bean.Coordinate;

public class TouchObject {
	
	private static TouchActions touchaction;
	private static FindObject findtool;
	public static void press_control_forwait(CaseEntity caseEntity,int waittime){
		
		touchaction = new TouchActions(MobileDriver.getInstance());
		findtool = new FindObject();
		
		WebElement webelement = findtool.getElement(caseEntity);
		touchaction.longPress(webelement).perform();
		try {
			System.out.print("长按开始等待("+ waittime +")");
			Thread.sleep(waittime);
			System.out.print("长按等待结束("+ waittime +")");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		touchaction.release(webelement);
	}
	
	public static void tap_element(CaseEntity caseEntity,int seconds){
		findtool = new FindObject();
		MobileDriver.getInstance().tap(1, findtool.getElement(caseEntity), seconds*1000);
		System.out.println(caseEntity.getDescription()+"-----持续"+seconds+"s");
	}
	
	public void press_coordinate_forwait(Coordinate coordinate,int waittime){
		touchaction.down(coordinate.getCoX(), coordinate.getCoY());
		try {
			Thread.sleep(waittime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		touchaction.up(coordinate.getCoX(), coordinate.getCoY());
	}
}
