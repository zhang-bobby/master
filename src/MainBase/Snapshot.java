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

	      System.out.println("��ͼ�ɹ�����������ǰ���̣�\\ExceptionSnapshot\\" + getCurrentDateTime()+ ".jpg");

	      } 

	   catch (IOException e) {
		   System.out.println("��ͼʧ�ܣ�");
		   e.printStackTrace();
		   }  

	} 

	public static String getCurrentDateTime(){

	   SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");//�������ڸ�ʽ

	   return df.format(new Date());

	}



}
