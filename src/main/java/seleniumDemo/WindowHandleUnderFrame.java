package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleUnderFrame {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//Try it Yourself
		driver.findElementByLinkText("Try it Yourself »").click();
		
		Thread.sleep(3000);
		
		//i_frame of window=right click(view frame source)Then,Inspect click then,we will take= value of (ID or name)
		//driver.switchTo().frame("iframeResult");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		
		//Try it design under a frame
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		/*String FirstWin = driver.getWindowHandle(); 
		
		System.out.println("1st window reference="  +FirstWin );
		
		//Switch back to primary window/First window (see above code of getWindowHandle() for First window)
		driver.switchTo().window(FirstWin);//button[text()='Try it']*/
	}

}
