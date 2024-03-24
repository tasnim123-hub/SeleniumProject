package AUI_AdvanceUserInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TAB_ENTER {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skelt\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//URl
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//facebook.com-enter email as (abc@yahoo.com)
		driver.findElementByName("email").sendKeys("abc@yahoo.com");
		
		Actions action =new Actions(driver);
		
		//By using Actions Class-enter password as Tasnim using  Teys.TAB on facebook.com
		Thread.sleep(4000);
		//Hit Tab Key from keyboard- for perform Tab action
		action.sendKeys(Keys.TAB).sendKeys("Tasnim").build().perform();
		
		//We can Enter Key after Tab -Hit Enter in facebook.com
		action.sendKeys(Keys.ENTER).perform();
		
		//it will select 1st Forget password?
		action.sendKeys(Keys.TAB).perform();
		
		//it will select Log in button
		action.sendKeys(Keys.TAB).perform();
		
		//it will select last Forget password?
		action.sendKeys(Keys.TAB).perform();
		
		
		
		
		
		
		
	}

}
