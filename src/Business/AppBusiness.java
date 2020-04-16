package Business;

import java.util.List;

import Bean.CaseEntity;
import Bean.CaseListEntity;
import Behavior.AppBehavior;
import MainBase.NetWorkController;
import MainBase.Recorder;
import MainBase.SwipeObject;

public class AppBusiness {
	private AppBehavior AppBehavior;

	public AppBusiness(List<CaseEntity> caseliList) {
		// TODO Auto-generated constructor stub
		AppBehavior =  new AppBehavior(caseliList);
	}
	
	public void appreplacebussiness1() throws InterruptedException{
		System.out.println("appreplacebussiness starts");

		Thread.sleep(5000);
		//安装测试应用app
		AppBehavior.install_NativeApp();
		Thread.sleep(10000);
		//打开本地的测试低版本应用app
		AppBehavior.open_NativeApp();
		Thread.sleep(10000);
		//检查是否弹出升级框
		AppBehavior.check_UpdateAlert();
		//检查升级内容的数据是否与预期结果一致
		AppBehavior.check_UpdateContent();
		//点击【马上更新】按钮
	    AppBehavior.click_mine_buttom();
		//检查系统安装框的应用名称是否为测试应用一致
		AppBehavior.check_installdata();
		//点击系统安装框的【安装】按钮
		AppBehavior.click_sys_install();

	}

	public void openApp() throws Exception{
		System.out.println("appreplacebussiness end");
		System.err.println("MPM3.0移动端测试开始");
		AppBehavior.install_NativeApp();
		Thread.sleep(3000);
		AppBehavior.open_NativeApp();
		Thread.sleep(1000);
		//点击跳过界面
		AppBehavior.click_loinbuttom();
	}

	//app平台登录操作
	public void click_appPlatform_login() throws Exception{
		AppBehavior.appPlatform_click_login();
		//输入账号
		AppBehavior.appPlatform_insert_user();
		//输入密码
		AppBehavior.appPlatform_insert_password();
		//点击登录
		AppBehavior.appPlatform_click_loinedbuttom();
		//延时6秒
		Thread.sleep(6000);
	}

	//app平台选择组织方法
	public void Mine_choiceOrg() throws  Exception{
		AppBehavior.click_Mine_choiceOrg();
		//延时8秒
		Thread.sleep(8000);
	}


//	public void click_login() throws  Exception{
//		AppBehavior.appPlatform_click_login();
//	}


	//app本月积分-登录操作
	public void click_meritPoint_login() throws Exception{
		AppBehavior.meritPoint_insert_user();
		//输入密码
		AppBehavior.meritPoint_insert_password();
		//点击登录
		AppBehavior.meritPoint_click_loinedbuttom();
		//延时6秒
		Thread.sleep(6000);
		AppBehavior.click_meritPoint_choiceOrg();
		//延时8秒
		Thread.sleep(8000);
	}


	//app积分管理
	public void click_meritpointManagement_login() throws Exception{
		AppBehavior.meritPoint_insert_user();
		AppBehavior.meritPoint_insert_password();
		AppBehavior.meritpointManagement_login_button();
		Thread.sleep(5000);
		AppBehavior.click_meritPoint_choiceOrg();
		Thread.sleep(6000);
		AppBehavior.meritpointManagement_click1();
		AppBehavior.meritpointManagement_insert_withdrawRemark();
		Thread.sleep(6000);
	}


	public void Mine_click() throws Exception{
		AppBehavior.click_mine_buttom();
		System.err.println("MPM3.0移动端测试结束");
	}

	public void meritPoint_month_click() throws Exception{
		AppBehavior.meritPoint_month_click();
		System.err.println("MPM3.0移动端测试结束");
	}




}
