package Behavior;

import java.util.List;
import java.util.concurrent.Callable;

import MainBase.*;

import caseDB.DBHelper;
import Bean.CaseEntity;

public class AppBehavior {

	private FindObject findtool ;
	private List<CaseEntity> caseList;
	private final long timeout = 1000*60*15;

	public AppBehavior(List<CaseEntity> caseList) {
		// TODO Auto-generated constructor stub
		findtool = new FindObject();
		this.caseList = caseList;
	}
	public void setCasePass(CaseEntity caseEntity){
		DBHelper.getInstance().setCasePass(8, caseEntity);
	}
	
	public void install_NativeApp(){
		String apkname = caseList.get(0).getExtendvalue();
		if(Recorder.appinstall(apkname)){
			//�������Ӧ�ö���
			DBHelper.getInstance().setExpectVertifyValue(caseList.get(0), apkname);
			setCasePass(caseList.get(0));
		}
		
	}
	
	public void open_NativeApp(){
		CaseEntity caseEntity = caseList.get(1);
		List<String> exList = DataHandler.getStrByTypevalue(caseEntity);
		String packageName = exList.get(1).trim();
		String Activity = exList.get(1).trim();
		if(Recorder.Open_appActivity(packageName, Activity)){
			setCasePass(caseEntity);
		}
	}
	
	public void check_UpdateAlert(){
		CaseEntity caseEntity = caseList.get(2);
		if(findtool.isExistObject(caseEntity)){
			setCasePass(caseEntity);	
		}
	}

	public void check_UpdateContent(){
		CaseEntity caseEntity = caseList.get(3);
		if(findtool.getElement(caseEntity).getText().equals(caseEntity.getExtendvalue())){
			setCasePass(caseEntity);
		}
	}
	//MPMƽ̨����
	public void click_mine_buttom(){
		for (int i = 17; i <= 110; i++) {
			try {

				CaseEntity caseEntity = caseList.get(i);
				if (findtool.isExistObject(caseEntity)) {
					findtool.getElement(caseEntity);
					findtool.ClickElement(caseEntity);
					setCasePass(caseEntity);
//					SwipeObject.swipeToUp(500);
					Thread.sleep(3000);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	//MPM���»��ַ���
	public void meritPoint_month_click(){
		for(int i=7;i<=62;i++){
			try{
				CaseEntity caseEntity = caseList.get(i);
				if(findtool.isExistObject(caseEntity)){
					findtool.getElement(caseEntity);
					findtool.ClickElement(caseEntity);
					setCasePass(caseEntity);
					Thread.sleep(3000);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	
	public void click_loinbuttom(){
		CaseEntity caseEntity = caseList.get(2);
		if(findtool.isExistObject(caseEntity)){
			findtool.ClickElement(caseEntity);
			setCasePass(caseEntity);
		}
	}

//appƽ̨ѡ����֯����
	public void click_Mine_choiceOrg(){
		CaseEntity caseEntity = caseList.get(16);
		if(findtool.isExistObject(caseEntity)){
			findtool.ClickElement(caseEntity);
			setCasePass(caseEntity);
		}
	}

	//app���»���ѡ����֯����
	public void click_meritPoint_choiceOrg(){
		CaseEntity caseEntity = caseList.get(6);
		if(findtool.isExistObject(caseEntity)){
			findtool.ClickElement(caseEntity);
			setCasePass(caseEntity);
		}
	}

	public void click_mine(){
		CaseEntity caseEntity = caseList.get(17);
		if(findtool.isExistObject(caseEntity)){
			findtool.ClickElement(caseEntity);
			setCasePass(caseEntity);
		}
	}

	//appƽ̨-��¼ҳ�����
	public void appPlatform_click_login() throws InterruptedException {
		for (int i = 3; i <= 12; i++) {
			try {
				CaseEntity caseEntity = caseList.get(i);
				if (findtool.isExistObject(caseEntity)) {
					findtool.getElement(caseEntity);
					findtool.ClickElement(caseEntity);
					setCasePass(caseEntity);
					Thread.sleep(3000);

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void click_skip(){
	    CaseEntity caseEntity = caseList.get(7);
	    if(findtool.isExistObject(caseEntity)){
	        findtool.ClickElement(caseEntity);
	        setCasePass(caseEntity);
        }
    }

    //appƽ̨�����˺�
	public void appPlatform_insert_user(){
		CaseEntity caseEntity = caseList.get(13);
		if(findtool.isExistObject(caseEntity)){
			findtool.getElement(caseEntity);
			findtool.ClickElement_userName(caseEntity);
			setCasePass(caseEntity);
		}
	}

	//appƽ̨��������
	public void appPlatform_insert_password(){
		CaseEntity caseEntity = caseList.get(14);
		if(findtool.isExistObject(caseEntity)){
			findtool.getElement(caseEntity);
			findtool.ClickElement2(caseEntity);
			setCasePass(caseEntity);
		}
	}

	//appƽ̨�����¼��ť
	public void appPlatform_click_loinedbuttom(){
		CaseEntity caseEntity = caseList.get(15);
		if(findtool.isExistObject(caseEntity)){
			findtool.getElement(caseEntity);
			findtool.ClickElement3(caseEntity);
			setCasePass(caseEntity);
		}
	}

	//app���»���-�����˺ŷ���
	public void meritPoint_insert_user(){
		CaseEntity caseEntity = caseList.get(3);
		if(findtool.isExistObject(caseEntity)){
			findtool.getElement(caseEntity);
			findtool.ClickElement_userName(caseEntity);
			setCasePass(caseEntity);
		}
	}

	//app���»���-��������
	public void meritPoint_insert_password(){
		CaseEntity caseEntity = caseList.get(4);
		if(findtool.isExistObject(caseEntity)){
			findtool.getElement(caseEntity);
			findtool.ClickElement2(caseEntity);
			setCasePass(caseEntity);
		}
	}

	//app���»���-�����¼��ť
	public void meritPoint_click_loinedbuttom(){
		CaseEntity caseEntity = caseList.get(5);
		if(findtool.isExistObject(caseEntity)){
			findtool.getElement(caseEntity);
			findtool.ClickElement3(caseEntity);
			setCasePass(caseEntity);
		}
	}


	//app���ֹ���-�����˺�
	public void meritpointManagement_login_userName(){
		CaseEntity caseEntity = caseList.get(3);
		if(findtool.isExistObject(caseEntity)){
			findtool.getElement(caseEntity);
			findtool.ClickElement_userName(caseEntity);
			setCasePass(caseEntity);
		}
	}

	//app���ֹ���-��������
	public void meritpointManagement_login_password(){
		CaseEntity caseEntity = caseList.get(4);
		if(findtool.isExistObject(caseEntity)){
			findtool.getElement(caseEntity);
			findtool.ClickElement2(caseEntity);
			setCasePass(caseEntity);
		}
	}

	//app���ֹ���-�����¼��ť
	public void meritpointManagement_login_button(){
		CaseEntity caseEntity = caseList.get(5);
		if(findtool.isExistObject(caseEntity)){
			findtool.getElement(caseEntity);
			findtool.ClickElement3(caseEntity);
			setCasePass(caseEntity);
		}
	}

	//app���ֹ���-�������1
	public void meritpointManagement_click1() throws InterruptedException {
		for (int i = 7; i <= 10; i++) {
			try {
				CaseEntity caseEntity = caseList.get(i);
				if (findtool.isExistObject(caseEntity)) {
					findtool.getElement(caseEntity);
					findtool.ClickElement(caseEntity);
					setCasePass(caseEntity);
					Thread.sleep(3000);

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	//app���ֹ���-�����¼����ر�ע
	public void meritpointManagement_insert_withdrawRemark(){
		CaseEntity caseEntity = caseList.get(11);
		if(findtool.isExistObject(caseEntity)){
			findtool.getElement(caseEntity);
			findtool.ClickElement2(caseEntity);
			setCasePass(caseEntity);
		}
	}



	public void check_installdata(){
		
		CaseEntity caseEntity = caseList.get(5);
		String expectname = DBHelper.getInstance().getExpectData(caseEntity.getExpectresid()).getVertifyvalue();
		String actualname = get_sys_installappname(caseEntity);
		//����չʾ��Ӧ��������ʵ�ʰ�װ�����ƴ��ڲ���ȫһ�µ����������contains
		if(expectname.contains(actualname)){
			setCasePass(caseEntity);
		}
		
		String caseextendvalue = "(Ԥ�ڽ����"+ expectname +" --- ʵ�ʽ����" + actualname +")";
		caseEntity.setExtendvalue(caseextendvalue);
		DBHelper.getInstance().setCaseExtendvalue(4,caseEntity);
	}
	
	protected String get_sys_installappname(CaseEntity caseentity){
		long timecounter = 1000;
		while(!findtool.isExistObject(caseentity)){
			try {
				System.out.println("���ߵȴ��´ζ�λ������");
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			timecounter = timecounter + 15000;
			
			if(timecounter > timeout){
				break;
			}
		}
		
		if(timecounter > timeout){
			System.out.println("�����趨����ʱ��");
			return "";
		}
		else{
			return findtool.getElement(caseentity).getText();
		}
	}

	public void click_sys_install(){
		CaseEntity caseEntity = caseList.get(6);
		if(findtool.isExistObject(caseEntity)){
			while(findtool.isExistObject(caseEntity)){
				findtool.ClickElement(caseEntity);
			}
			setCasePass(caseEntity);
		}
	}

	public void searchIcon(){
		CaseEntity caseEntity = caseList.get(0);
		if(findtool.isExistObject(caseEntity)){
			new SearchIcon().searchIcon(caseEntity);
		}
		setCasePass(caseEntity);
	}
}
