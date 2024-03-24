package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Css_SelectorEditLead {

	@Test
	public void testCssSelector() throws InterruptedException {
		//public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			
			//ChromeDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			
			driver.get("http://leaftaps.com/opentaps");
			
			driver.manage().window().maximize(); 
			//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
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
			//enter first name 
			driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("Hari");
			//click Find Leads button
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			//click first resulting lead
			Thread.sleep(4000);
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
			//navigate vewLead page
			String title1 = driver.getTitle();
			   System.out.println(title1);
			   //verify view lead page
			   String title2 = driver.getTitle();
			   if (title2.equals("View Lead | opentaps CRM")) {
				System.out.println("view lead page match with title");
			} else {
				System.out.println("view lead page is not match with title");
			}
			   //click on Edit
			   driver.findElementByXPath("//a[text()='Edit']").click();
			   //navigate to Edit Lead page
			   System.out.println(driver.getTitle());
			   //change the company name
			   driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
			   driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("CTS");
			   //click update
			  driver.findElementByXPath("//input[@value='Update']").click();
			   //Confirm changed name appears
			   System.out.println("name");
			   //close browser
				
			   
			   
		}

	

}
