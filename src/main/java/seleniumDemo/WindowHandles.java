package seleniumDemo;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\skelt\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//Try it Yourself
		driver.findElementByLinkText("Try it Yourself »").click();
		
		//FirstWindow handle
		String FirstWin = driver.getWindowHandle();
		System.out.println("1st window reference="  +FirstWin );
		
		//AllWindow Reference
		Set<String> AllWindow = driver.getWindowHandles();
		 System.err.println("AllwindowHandles" +AllWindow);
		 
		 //switching 1stwindow to 2nd window
		 for (String eachWin : AllWindow) {
			System.out.println("eachWin");
		 
			driver.switchTo().window(eachWin);
	}
		//System.out.println(driver.getTitle());	*/
		
	}

}
