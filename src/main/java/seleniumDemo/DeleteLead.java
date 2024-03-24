package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DeleteLead {
@Test
public void testURL() throws InterruptedException {
	//public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://leaftaps.com/opentaps");
		
		
		//userId
		  driver.findElementByCssSelector("#username").sendKeys("DemoSalesManager");
		//driver.findElementByCssSelector("input[name='USERNAME']").sendKeys("DemoSalesManager");
		 // driver.findElementByCssSelector("input#username").sendKeys("DemoSalesManager");
		
		//password
		//driver.findElementByCssSelector("input[name='PASSWORD']").sendKeys("crmsfa");
		//driver.findElementByCssSelector("#password").sendKeys("crmsfa");
		driver.findElementByCssSelector("input#password").sendKeys("crmsfa");
		//driver.findElementByCssSelector("label[for='password']+input").sendKeys("crmsfa");//parents to child
		
		//login Button
		driver.findElementByCssSelector(".decorativeSubmit").click();
		//driver.findElementByCssSelector("input[value='Login']").click();
		//driver.findElementByCssSelector("input[type='submit']").click();
	//driver.findElementByCssSelector("input[class^='deco']").click(); // ^ =start with
		//driver.findElementByCssSelector("input[class$='Submit']").click();// $ =end With
		//driver.findElementByCssSelector("input[class*='mit']").click();   //* =contains 
		
		//click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		//click Leads link
		driver.findElementByXPath("//a[text()='Leads']").click();
		//click find Leads
		driver.findElementByLinkText("Find Leads").click();
		
	    Thread.sleep(2000);
		//click on phone number
		driver.findElementByXPath("//span[text()='Phone']").click();
	
		
		Thread.sleep(3000);
		//enter phone number
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1234567890");
		
		//click find Lead Button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		
		//capture lead ID of first resulting lead 
		String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(leadId);
		
		Thread.sleep(3000);
		//click first resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
		Thread.sleep(3000);
		//click Delete
		driver.findElementByXPath("//a[text()='Delete']").click();
		
		//navigated MyLeadsPage
		System.out.println(driver.getTitle());
		//click find Leads
		driver.findElementByLinkText("Find Leads").click();
		
		// Again enter lead ID which one we captured
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[13]").sendKeys("11062");
		
		//click find Lead Button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		 
		Thread.sleep(3000);
		// verify error message (right side in the page 'No records to display')
		String errMassage = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if (errMassage.equals("No records to display")) {
			System.out.println("error massage is match ");
		} else {
System.out.println("error massage is not match");
		}
		//same as 85 number
		/*String errMassage01 = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if (errMassage01.contains("No records")) {
			System.out.println("err massage is match");
		} else {
System.out.println("err massage is not match");
		}*/
	}

}
