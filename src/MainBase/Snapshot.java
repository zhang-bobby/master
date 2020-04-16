package MainBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Snapshot {

	public Snapshot() {
		
	}
	public static void takeScreenShot(WebDriver driver)

	{  
		String currentPath = System.getProperty("user.dir");

	   File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  

	   try {   

	      FileUtils.copyFile(screenShotFile, new File(currentPath + "\\ExceptionSnapshot\\" + getCurrentDateTime()+ ".jpg"));  

	      System.out.println("截图成功，保存至当前工程：\\ExceptionSnapshot\\" + getCurrentDateTime()+ ".jpg");

	      } 

	   catch (IOException e) {
		   System.out.println("截图失败！");
		   e.printStackTrace();
		   }  

	} 

	public static String getCurrentDateTime(){

	   SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");//设置日期格式

	   return df.format(new Date());

	}



}
