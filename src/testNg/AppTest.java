package testNg;

import java.util.List;

import MainBase.Recorder;
import MainBase.Snapshot;
import MainBase.SwipeObject;
import com.mysql.cj.MysqlxSession;
import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Bean.CaseEntity;
import Behavior.AppBehavior;
import Business.AppBusiness;
import MainBase.MobileDriver;
import caseDB.DBHelper;

public class AppTest {
	private AppBusiness appBusiness;
	private List<CaseEntity> caselist;

	@BeforeSuite
  public void beforeSuite() {
	  /*init
	   *1:GameCollectDB
		2:AppCollectDB
		3:AppInstallDB
		4:AppReplaceDB
		5:BoomBoxDB
		6:BrowserHomeDB
		7:AppRecommondDB 
	   */
  //  DBHelper.getInstance().initModuleCaseResults(1);
	  //	    DBHelper.getInstance().initModuleCaseResults(2);
	  	//  DBHelper.getInstance().initModuleCaseResults(4);
	       	DBHelper.getInstance().initModuleCaseResults(8);
	  //load caselist
	  //	  caselist = DBHelper.getInstance().getCaselistData(1);
	  //	  caselist = DBHelper.getInstance().getCaselistData(2);
	    //	  caselist = DBHelper.getInstance().getCaselistData(4);
	    	  caselist = DBHelper.getInstance().getCaselistData(8);
	  //	  gamepanelfbusiness = new GameCollectBusiness(caselist); 
	          appBusiness = new AppBusiness(caselist);
	    // 	appCollectBusiness = new AppCollectBusiness(caselist);
  }

  @AfterSuite 
  public void afterSuite() {
	  DBHelper.getInstance().close();
	  MobileDriver.getInstance().quit();
	  
  }
   @Test
   //app平台
  public void testAppReplace() throws Exception{
//	  MobileDriver.getInstance().closeApp();
	   Recorder.startRecord();
	   Thread.sleep(2000);
	   appBusiness.openApp();
//	   appBusiness.click_login();
	   appBusiness.click_appPlatform_login();
	   Thread.sleep(3000);
	   appBusiness.Mine_choiceOrg();
	   appBusiness.Mine_click();
	   Recorder.saveTopath();
  }

  //本月积分
	@Test
  public void test() throws Exception{
		Recorder.startRecord();
		Thread.sleep(2000);
		appBusiness.openApp();
		Thread.sleep(2000);
		appBusiness.click_meritPoint_login();
		appBusiness.meritPoint_month_click();
		Recorder.saveTopath();
  }


	@Test
	//app积分管理
	public void testMeritPoint() throws Exception{
		Recorder.startRecord();
		appBusiness.openApp();
		Thread.sleep(2000);
		appBusiness.click_meritpointManagement_login();

	}

}
