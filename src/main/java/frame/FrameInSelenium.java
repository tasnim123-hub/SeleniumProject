package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skelt\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
//URL
driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//At first we have to go in Frame,Right click,Search(view frame source).
//Right click,Inspect click.
//Enter into the frame using ID or Name value
driver.switchTo().frame("iframeResult");//frame("value")
//Check we successfully enter into the iFrame
System.out.println("successfully enter into the iframe");
//remove/clear John from first name field
driver.findElementByXPath("//input[@value='John']").clear();
Thread.sleep(3000);
driver.findElementByXPath("//input[@value='John']").sendKeys("Tasnim");
//remove/clear Don from Last name field
driver.findElementByXPath("//input[@value='Doe']").clear();
Thread.sleep(3000);
driver.findElementByXPath("//input[@value='Doe']").sendKeys("Chowdhury");

driver.findElementByXPath("//input[@value='Submit']").click();

//Back to main/parent page
driver.switchTo().parentFrame();
Thread.sleep(3000);
//driver.close();


	}

}
