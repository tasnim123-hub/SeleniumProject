package AUI_AdvanceUserInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skelt\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//URl
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Switch to frame
		driver.switchTo().frame(0);
		
		//Select Draggable and Droppable elements and store in a Variable
		
		//WebElement src = driver.findElementById("draggable");
		WebElement src = driver.findElementByXPath("//div[@id='draggable']");
		WebElement dest = driver.findElementById("droppable");
		
		//Create obj of Actions Class and pass the driver
		Actions action =new Actions(driver);
		
		action.dragAndDrop(src, dest).perform();
		
		Thread.sleep(4000);
		//switch back from frame 
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		//click Selectable 
		driver.findElementByXPath("//a[text()='Selectable']").click();
	}

}
