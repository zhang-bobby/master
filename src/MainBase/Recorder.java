package MainBase;

import java.io.File;
import java.io.IOException;

import BaseData.DriverData;

public class Recorder {
	public static void startRecord() throws IOException {

		Runtime rt = Runtime.getRuntime();
		rt.exec("cmd.exe /C adb shell screenrecord /sdcard/runCase.mp4");
		System.out.println("¼����Ƶ��ʼ����");
	}

	static File classpathRoot = new File(System.getProperty("user.dir"));
	static File appDir = new File(classpathRoot, "testApkData");

    static File app;


	public static void saveTopath() throws IOException{
		String filename = System.currentTimeMillis()+".mp4";
		File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "runcaseMP4");
        File app = new File(appDir,filename );
        String filepath = app.getAbsolutePath();

		Runtime rt = Runtime.getRuntime();
	    rt.exec("cmd.exe /C adb pull /sdcard/runCase.mp4 "+ filepath);
	    System.out.println("��Ƶ��������"+filepath);
	}

	public static boolean appinstall(String apkName) {
		app = new File(appDir, apkName);
        Runtime rt = Runtime.getRuntime();
        // this code for record the screen of your device
        try {
        	if(new File(app.getAbsolutePath()).exists()){
        		rt.exec("cmd.exe /c adb install "+app.getAbsolutePath());
        		System.out.println("��װ "+app.getAbsolutePath()+" �ɹ�����");
        	}
        	else{
        		System.out.println("��װʧ�ܣ��Ҳ���Դ�ļ� ��"+ app.getAbsolutePath());
        	}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("��װʧ�ܣ�path��"+ app.getAbsolutePath());
			return false;
		}

        return true;
    }

	public static void appuninstall(String apkName) {
		app = new File(appDir, apkName);
        Runtime rt = Runtime.getRuntime();
        try {
			rt.exec("cmd.exe /c adb uninstall "+app.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("��װʧ�ܣ�path��"+ app.getAbsolutePath());
		}
        System.out.println("ж�� "+app.getAbsolutePath()+" �ɹ�����");
    }
	
	
	public static boolean Open_appActivity(String packageName,String Activity){
		Runtime rt = Runtime.getRuntime();
	    try {
			rt.exec("cmd.exe /C adb shell am start -n " + packageName.trim() + "/" + Activity.trim());
			System.out.println("����Ӧ�ý���ɹ���" + packageName.trim() + "/" + Activity.trim());
			rt.freeMemory();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("����Ӧ�ý���ʧ�ܣ�" + packageName.trim() + "/" + Activity.trim());
			rt.freeMemory();
			return false;
		}
	    
	}
	
}
