package MainBase;

import io.appium.java_client.android.AndroidDriver;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import caseDB.DBHelper;
import Bean.CaseEntity;
import Bean.Coordinate;
import Bean.ExpectEntity;

public class FindObject {

	private WebElement element = null;
	private List<WebElement> elementlist = null;
	private Logger logger = Logger.getLogger("record");  
	private SearchIcon searchexcutor ;
	private WebDriverWait wdw = new WebDriverWait(MobileDriver.getInstance(),30);
	//隐式等待driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 

	public boolean isExistObject(CaseEntity caseentity){
		boolean isExist = true;
		By locator = getLocatorByType(caseentity.getLocaltype(),caseentity.getValuestr());
		
		try {
			if(locator == null){
				isExist = false;
				logger.warning("locator为null");
				return isExist;
			}
//	MobileDriver.getInstance().findElementById(caseentity.getValuestr()).click();
	//	wdw.until(ExpectedConditions.presenceOfElementLocated(locator));
		//	System.out.println("定位元素成功："+caseentity.getValuestr());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			isExist = false;
		//	logger.warning("定位元素失败："+caseentity.getValuestr());
			return isExist;
		}
		
		return isExist;
	}
	
	public boolean isExistObjectOfList(CaseEntity caseentity){
		boolean isExist = true;
		List<WebElement> elementlist;
		String objectvalue = caseentity.getExtendvalue();
		By locator = getLocatorByType(caseentity.getLocaltype(),caseentity.getValuestr());
		
		if(isExistObject(caseentity)){
			elementlist = getElements(caseentity);
			
			for(int i = 1;i <= elementlist.size();i++){
				
			}
		}
		
		try {
			if(locator == null){
				isExist = false;
				logger.warning("locator为null");
				return isExist;
			}
			wdw.until(ExpectedConditions.presenceOfElementLocated(locator));
			System.out.println("定位列表元素成功："+locator);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			isExist = false;
			logger.warning("定位元素失败："+locator);
			return isExist;
		}
		
		return isExist;
	}
	
	public void ClickElement(CaseEntity caseentity){

		By locator = getLocatorByType(caseentity.getLocaltype(),caseentity.getValuestr());
		
	//	String description = caseentity.getDescription();
		try{
			if(isExistObject(caseentity)){
				MobileDriver.getInstance().findElement(locator).click();
//				Thread.sleep(5000);
//                Snapshot.takeScreenShot(MobileDriver.getInstance());
				//		driver.findElementById("com.tencent.mobileqq:id/btn_login").click();
				//  	System.out.println(description);
			}
		}catch(Exception e){
			logger.warning("定位元素失败："+locator);
			Snapshot.takeScreenShot(MobileDriver.getInstance());
		}

		
	}
	public void ClickElement_userName(CaseEntity caseentity){

		By locator = getLocatorByType(caseentity.getLocaltype(),caseentity.getValuestr());
		String account =  caseentity.getExtendvalue();
	//	String description = caseentity.getDescription();
		try{
			if(isExistObject(caseentity)){
				MobileDriver.getInstance().findElement(locator).sendKeys(account);
				//		driver.findElementById("com.tencent.mobileqq:id/btn_login").click();


				//  	System.out.println(description);
			}
		}catch(Exception e){
			logger.warning("定位元素失败："+locator);
			Snapshot.takeScreenShot(MobileDriver.getInstance());
		}

		
	}
	public void ClickElement2(CaseEntity caseentity){

		By locator = getLocatorByType(caseentity.getLocaltype(),caseentity.getValuestr());
		String password =  caseentity.getExtendvalue();
	//	String description = caseentity.getDescription();
		try {
			if(isExistObject(caseentity)){
				MobileDriver.getInstance().findElement(locator).sendKeys(password);
				//		driver.findElementById("com.tencent.mobileqq:id/btn_login").click();


				//    	System.out.println(description);
			}
		}catch(Exception e){
			logger.warning("定位元素失败："+locator);
			Snapshot.takeScreenShot(MobileDriver.getInstance());
		}

		
	}
	public void ClickElement3(CaseEntity caseentity){

		By locator = getLocatorByType(caseentity.getLocaltype(),caseentity.getValuestr());
		
	//	String description = caseentity.getDescription();

		if(isExistObject(caseentity)){
			MobileDriver.getInstance().findElement(locator).click();
	//		driver.findElementById("com.tencent.mobileqq:id/btn_login").click();
			
			
	//    	System.out.println(description);
		}
		
	}
	
	public void Inputdata(CaseEntity caseentity){
		By locator = getLocatorByType(caseentity.getLocaltype(),caseentity.getValuestr());
		
		String description = caseentity.getDescription();

		if(isExistObject(caseentity)){
			MobileDriver.getInstance().findElement(locator).sendKeys(caseentity.getExtendvalue());
			System.out.println(description + "输入值：" + caseentity.getExtendvalue());
		}
	}
	
	public By getLocatorByType(int localtype, String Valuestr){
		
		By by = null;
		//localtype-------- 1：xpath；2：id；3：class；
		
		if (localtype == 1) {
			by = By.xpath(Valuestr);
		} 
		else if (localtype == 2) {
			by = By.id(Valuestr);
		} 
		else if (localtype == 3) {
			by = By.className(Valuestr);
		}
		else{
			logger.warning("localtype is undefined");
		}
		return by;
	}
	
	public WebElement getElement(CaseEntity caseentity){
		By locator = getLocatorByType(caseentity.getLocaltype(),caseentity.getValuestr());
		
		
		try{
			wdw.until(ExpectedConditions.presenceOfElementLocated(locator));
			System.out.println("定位元素成功："+locator);
			return MobileDriver.getInstance().findElement(locator);
		}catch(Exception e){
			//System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$定位元素失败："+locator);
			logger.warning("定位元素失败："+locator);
			Snapshot.takeScreenShot(MobileDriver.getInstance());
		}		
		
		
		return element;		
	}
	
	public List<WebElement> getElements(CaseEntity caseentity){
		By locator = getLocatorByType(caseentity.getLocaltype(),caseentity.getValuestr());
		try{
			wdw.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
			System.out.println("定位列表成功："+locator);
			return MobileDriver.getInstance().findElements(locator);
		}catch(Exception e){
			//System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$定位列表失败："+locator);
			logger.warning("定位元素失败："+locator);
			Snapshot.takeScreenShot(MobileDriver.getInstance());
		}		
		return elementlist;		
	}
	
	public WebElement getElementOfExpect(CaseEntity caseentity){
		
		System.out.println(caseentity.getId());
		
		ExpectEntity expectEntity = DBHelper.getInstance().getExpectData(caseentity.getExpectresid());
		
		System.out.println(expectEntity.getLocaltype()+" "+expectEntity.getValuestr());
		
		By locator = getLocatorByType(expectEntity.getLocaltype(),expectEntity.getValuestr());
		
		try{
			wdw.until(ExpectedConditions.presenceOfElementLocated(locator));
			System.out.println("定位元素成功："+locator);
			return MobileDriver.getInstance().findElement(locator);
		}catch(Exception e){
			//System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$定位元素失败："+locator);
			logger.warning("定位元素失败："+locator);
			Snapshot.takeScreenShot(MobileDriver.getInstance());
		}		
		return element;	
	}

	public void CoorClick(Coordinate coview){
		
		try {
			MobileDriver.getInstance().tap(1, coview.getCoX(), coview.getCoY(), 500);
			System.out.println("点击【" + coview.getName() + "】坐标-x:" + coview.getCoX() + "  y:" + coview.getCoY());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$点击坐标异常："+coview.getName() + "【坐标-x:" + coview.getCoX() + "  y:" + coview.getCoY()+"】");
			logger.warning("点击坐标异常："+coview.getName() + "【坐标-x:" + coview.getCoX() + "  y:" + coview.getCoY()+"】");
			Snapshot.takeScreenShot(MobileDriver.getInstance());
			
		}
	}
}
