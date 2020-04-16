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
		//��װ����Ӧ��app
		AppBehavior.install_NativeApp();
		Thread.sleep(10000);
		//�򿪱��صĲ��ԵͰ汾Ӧ��app
		AppBehavior.open_NativeApp();
		Thread.sleep(10000);
		//����Ƿ񵯳�������
		AppBehavior.check_UpdateAlert();
		//����������ݵ������Ƿ���Ԥ�ڽ��һ��
		AppBehavior.check_UpdateContent();
		//��������ϸ��¡���ť
	    AppBehavior.click_mine_buttom();
		//���ϵͳ��װ���Ӧ�������Ƿ�Ϊ����Ӧ��һ��
		AppBehavior.check_installdata();
		//���ϵͳ��װ��ġ���װ����ť
		AppBehavior.click_sys_install();

	}

	public void openApp() throws Exception{
		System.out.println("appreplacebussiness end");
		System.err.println("MPM3.0�ƶ��˲��Կ�ʼ");
		AppBehavior.install_NativeApp();
		Thread.sleep(3000);
		AppBehavior.open_NativeApp();
		Thread.sleep(1000);
		//�����������
		AppBehavior.click_loinbuttom();
	}

	//appƽ̨��¼����
	public void click_appPlatform_login() throws Exception{
		AppBehavior.appPlatform_click_login();
		//�����˺�
		AppBehavior.appPlatform_insert_user();
		//��������
		AppBehavior.appPlatform_insert_password();
		//�����¼
		AppBehavior.appPlatform_click_loinedbuttom();
		//��ʱ6��
		Thread.sleep(6000);
	}

	//appƽ̨ѡ����֯����
	public void Mine_choiceOrg() throws  Exception{
		AppBehavior.click_Mine_choiceOrg();
		//��ʱ8��
		Thread.sleep(8000);
	}


//	public void click_login() throws  Exception{
//		AppBehavior.appPlatform_click_login();
//	}


	//app���»���-��¼����
	public void click_meritPoint_login() throws Exception{
		AppBehavior.meritPoint_insert_user();
		//��������
		AppBehavior.meritPoint_insert_password();
		//�����¼
		AppBehavior.meritPoint_click_loinedbuttom();
		//��ʱ6��
		Thread.sleep(6000);
		AppBehavior.click_meritPoint_choiceOrg();
		//��ʱ8��
		Thread.sleep(8000);
	}


	//app���ֹ���
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
		System.err.println("MPM3.0�ƶ��˲��Խ���");
	}

	public void meritPoint_month_click() throws Exception{
		AppBehavior.meritPoint_month_click();
		System.err.println("MPM3.0�ƶ��˲��Խ���");
	}




}
