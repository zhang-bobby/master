package MainBase;

import io.appium.java_client.android.AndroidDriver;

import java.util.List;

import org.openqa.selenium.WebElement;

import Bean.CaseEntity;

public class SearchIcon {
	
	private  FindObject findtool;
	private  SwipeObject swipeobject;
	
	public SearchIcon(){
		findtool = new FindObject();
		swipeobject = new SwipeObject();
	}

	public WebElement searchIcon(CaseEntity caseentity){
		
		
		List<WebElement> IconList = null;
		List<WebElement> IcontempList = null;
		WebElement icon = null;
		boolean isExist = false;
		int swipeState = 1;//1 stand for swiping to left;2 stand for swiping to right
		
		while(!isExist){
			
			IcontempList = findtool.getElements(caseentity);

			if(swipeState == 1){
				swipeobject.swipeToLeft(500);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("等待异常");
				}
				IconList = findtool.getElements(caseentity);
				if(listCompare(IconList,IcontempList)){
					swipeState = 2;
					System.out.println("到达边界主屏，更改滑动方向");
					continue;
				}
			}
			else{
				swipeobject.swipeToRight(500);
				IconList = findtool.getElements(caseentity);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("等待异常");
				}
				if(listCompare(IconList,IcontempList)){
					swipeState = 1;
					System.out.println("到达边界主屏，更改滑动方向");
					continue;
				}
				
			}
			
			
			for(int i = 0; i < IconList.size(); i++){
				icon = IconList.get(i);
				if(icon.getText().equals(caseentity.getExtendvalue())){
					//icon.click();
					//isExist = true;
					return icon;
				}	
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("等待异常");
			}
		}
		return icon;
	}
	
	public boolean listCompare(List<WebElement> listA,List<WebElement> listB){
		boolean isSame = false;
		if(listA.size() != listB.size()){
			return isSame;
		}
		for(int i = 0; i < listA.size(); i++){
			if(!listA.get(i).getText().equals(listB.get(i).getText())){
				return isSame;
			}
		}
		isSame = true;
		return isSame;
		
		
		
	}
}
