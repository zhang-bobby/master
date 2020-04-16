package MainBase;

import java.io.File;
import java.io.IOException;

import BaseData.DriverData;

public class Recorder {
	public static void startRecord() throws IOException {

		Runtime rt = Runtime.getRuntime();
		rt.exec("cmd.exe /C adb shell screenrecord /sdcard/runCase.mp4");
		System.out.println("录制视频开始！！");
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
	    System.out.println("视频保存至："+filepath);
	}

	public static boolean appinstall(String apkName) {
		app = new File(appDir, apkName);
        Runtime rt = Runtime.getRuntime();
        // this code for record the screen of your device
        try {
        	if(new File(app.getAbsolutePath()).exists()){
        		rt.exec("cmd.exe /c adb install "+app.getAbsolutePath());
        		System.out.println("安装 "+app.getAbsolutePath()+" 成功！！");
        	}
        	else{
        		System.out.println("安装失败，找不到源文件 ："+ app.getAbsolutePath());
        	}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("安装失败：path："+ app.getAbsolutePath());
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
			System.out.println("安装失败：path："+ app.getAbsolutePath());
		}
        System.out.println("卸载 "+app.getAbsolutePath()+" 成功！！");
    }
	
	
	public static boolean Open_appActivity(String packageName,String Activity){
		Runtime rt = Runtime.getRuntime();
	    try {
			rt.exec("cmd.exe /C adb shell am start -n " + packageName.trim() + "/" + Activity.trim());
			System.out.println("启动应用界面成功：" + packageName.trim() + "/" + Activity.trim());
			rt.freeMemory();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("启动应用界面失败：" + packageName.trim() + "/" + Activity.trim());
			rt.freeMemory();
			return false;
		}
	    
	}
	
}
