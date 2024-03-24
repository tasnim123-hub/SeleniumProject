package AUI_AdvanceUserInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skelt\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//URl
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Switch to frame
		driver.switchTo().frame(0);
		//driver.switchTo().frame(0);
		 //Select Item1234 and store in a Variable
		WebElement  Item1 = driver.findElementByXPath("//li[text()='Item 1']");
		
		WebElement Item3 = driver.findElementByXPath("//li[text()='Item 3']");
		
		WebElement Item5 = driver.findElementByXPath("//li[text()='Item 5']");
		
		WebElement Item7 = driver.findElementByXPath("//li[text()='Item 7']");  
		
		//Create obj of Actions Class and import it
		Actions action = new Actions(driver);
		
		//This 4 Item will Click()
		action.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).click(Item7).perform();
		
		Thread.sleep(3000);
		
		//This 4Item will Release()
		action.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).click(Item7).release().perform();

	}

}
