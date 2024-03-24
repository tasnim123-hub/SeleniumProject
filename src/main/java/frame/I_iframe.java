package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class I_iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skelt\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
	//ChromeDriver driver= new ChromeDriver();
	ChromeDriver driver = new ChromeDriver();
	//URl
	//driver.get(null);
	driver.get("https://jqueryui.com/selectable/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//way-1
	//Using index Number( in Java index starts from zero [0])
	// we have to write (iFrame) in DOM and if it will come (1 of 1),it means index Number[0].
	//driver.switchTo().frame(0);
	
	//way-2 
	//Enter into the frame using ID or Name Value
	//driver.switchTo().frame("iframeResult");
	
	//way-3
	//driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
	//driver.findElementByClassName("demo-frame");|cursor will be here,then press( ctrl +2)=Assign to Local variable(click).
	//Or
	 WebElement iframe = driver.findElementByClassName("demo-frame");//Select webElement by ClassName
	driver.switchTo().frame(iframe);
	
	//clicking Item 1,3 element
	//driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();
	//driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
	//or
	WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
	WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
	Actions action =new Actions(driver);
	
	action.keyDown(Keys.CONTROL).click(item1).click(item3).perform();
	
	//switch back to main HTML path
	//driver.switchTo().defaultContent();
	driver.switchTo().parentFrame();
	
	//click Demos ( outside frame)
	Thread.sleep(3000);
	driver.findElementByLinkText("Demos").click();
	
	
	}

}
