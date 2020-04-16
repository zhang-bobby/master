package MainBase;
public class SwipeObject {
	
	public SwipeObject(){

	}
	
	public static void swipeToUp(int during) {
        int width = MobileDriver.getInstance().manage().window().getSize().width;
        int height = MobileDriver.getInstance().manage().window().getSize().height;
        MobileDriver.getInstance().swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
		System.out.println("向上滑动屏幕！");
    }
	
    public static void swipeToDown(int during) {
        int width = MobileDriver.getInstance().manage().window().getSize().width;
        int height = MobileDriver.getInstance().manage().window().getSize().height;
        MobileDriver.getInstance().swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
        System.out.println("向下滑动屏幕！");
    }
    
    public static void swipeToLeft(int during) {
        int width = MobileDriver.getInstance().manage().window().getSize().width;
        int height = MobileDriver.getInstance().manage().window().getSize().height;
        MobileDriver.getInstance().swipe(width * 7 / 8, height / 2, width / 8, height / 2, during);
        System.out.println("向左滑动屏幕！");
    }

    public static void swipeToRight(int during) {
        int width = MobileDriver.getInstance().manage().window().getSize().width;
        int height = MobileDriver.getInstance().manage().window().getSize().height;
        MobileDriver.getInstance().swipe(width / 8, height / 2, width * 7 / 8, height / 2, during);
        System.out.println("向右滑动屏幕！");
    }
    
    public void swipeToItem(){
    	
//    	for (int i = 0; i < maxScrolls; i++) {
//			UiObject child = new UiObject(new UiSelector().text(text));
//			if (child.exists()) {
//				return child;
//			}
//			dragDirection("left", 35);
//		}

    }

}
