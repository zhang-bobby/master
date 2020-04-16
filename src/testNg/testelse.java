package testNg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import MainBase.Recorder;


public class testelse {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

//		for(int i = 0; i < 100; i++){
//			System.out.println((int)(Math.random()*5));
//		public class Main {
//            BufferedReader br = null;
//            Runtime rt = Runtime.getRuntime();
//            Thread.sleep(3000);
//            Process p = rt.exec("cmd.exe /C adb shell $ cd /sdcard/android/data $ ls");
//            try {
//                Runtime rt = Runtime.getRuntime();
//                Thread.sleep(3000);
//                 p = rt.exec("cmd.exe /C adb shell $ cd /sdcard/android/data $ ls");
//                Thread.sleep(3000);
//                rt.exec("cmd.exe /C cd /sdcard/android/data");
//                Thread.sleep(3000);
//                Process p = rt.exec("cmd.exe /C ls");
//                Process p = Runtime.getRuntime().exec("dasdsads");
//                StringBuffer sbOut = new StringBuffer(1000); 
//                br = new BufferedReader(new InputStreamReader(p.getInputStream()));
//                String line = null;
//                while ((line = br.readLine()) != null) {
//                    System.out.println(line);               
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
// 
//                if (br != null) {
//                    try {
//                        br.close();
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//            p.destroy();	
		Recorder.appinstall("qukan.2.7.1.001.apk");
		//	Recorder.appuninstall("testapk03_L.apk");
		
    }
}
