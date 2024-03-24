package AUI_AdvanceUserInteraction;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverOn {  //Move To Element

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\skelt\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	//URl
	driver.get("http://mrbool.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
WebElement contain = driver.findElementByClassName("menulink");

Actions action = new Actions(driver);
action.moveToElement(contain).perform();
Thread.sleep(3000);

driver.findElementByXPath("(//a[text()='Courses'])[2]").click();
	  //Select Content element and store it in a variable
Thread.sleep(4000);
	WebElement Content = driver.findElementByClassName("menulink");
	//Create Obj of Action Class and import it , Then pass the driver
	// [org.openqa.selenium.interactions.Actions]
	
	Actions action2 = new Actions(driver);
	 //action,pass the element and use perform()method
	 action2.moveToElement(Content).perform();
	 
	 //click the Article element
	 driver.findElementByXPath("//a[text()='Articles']").click();
	 
	 //wait 3 seconds
	 //Thread.sleep(3000);
	 
	// driver.close();
		
			}

}
