package seleniumDemo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	//public static void main(String[] args) {
@Test 
public void contract() {

		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		
	
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver =new ChromeDriver();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize(); 
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		
		//Enter user Name 
		//driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager"); //Attribute base x path
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[contains(@id,'u')]").sendKeys("DemoSalesManager");// Partial Attribute base x path
		
		//Enter password
		//driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");
		//driver.findElementByXPath ("//input[contains(@type,'p')]").sendKeys("crmsfa");
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Login click()
		//driver.findElementByXPath("//input[@value='Login']").click();  
		//driver.findElementByXPath("//input[contains(@type,'sub')]").click();
		driver.findElementByClassName("decorativeSubmit").click();
		
		//CRM/SFA Click()
		driver.findElementByLinkText("CRM/SFA").click();
		
		 //Leads Click()
		//driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		//driver.findElementByXPath("//a[@id='ext-gen591']").click(); 1 of 1 But not working
		
		               
		//Create Lead 
		//driver.findElementByLinkText("Create Lead").click(); //Link Text
		driver.findElementByXPath("//a[text()='Create Lead']").click();  //( Text base X path )
		//driver.findElementByXPath("//a[contains(text(),'Create')]").click();
		
		//company Name
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");
		
		//First Name
		//driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
		try {
			driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		} catch (Exception e) {
			System.out.println("Element not found");
		}
		
		//Thread.sleep(2000);
		//throw new Exception;
		
		//Last Name
		//CssSelector - We can write ( TagName OR Not)
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Mali");
		//driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("J");
		
		//First Name(Local)
		driver.findElementByXPath("//input[contains(@id,'firstNameLocal')]").sendKeys("Tasnim");
		
		//LastName(local)
		driver.findElementByXPath("//input[@name='lastNameLocal']").sendKeys("Chowdhury");
		
		//Solution
		driver.findElementByName("personalTitle").sendKeys("Disaster Recovery");
		
		//Title
		driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Dr");
		
		//AnnualRevenue
		driver.findElementByXPath("//input[contains(@id,'annualRevenue')]").sendKeys("260000"); 
		 
		//department
		driver.findElementById("createLeadForm_departmentName").sendKeys("Physician");
		
		driver.findElementByName("sicCode").sendKeys("0082");
		
		driver.findElementByName("numberEmployees").sendKeys("12345");
		
		////select[@id='createLeadForm_dataSourceId']
		
		//Choose source
		WebElement src=driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		
		Select dd=new Select(src);
		//dd.selectByVisibleText("Website");
		//dd.selectByIndex(9);
	dd.selectByValue("LEAD_WEBSITE");
		
		//industry
		WebElement In=driver.findElementByXPath("//select[contains(@id,'createLeadForm_i')]");
		Select dd3 = new Select(In);
		//dd3.selectByVisibleText("Computer Hardware");
		dd3.selectByIndex(1);
		
		//Marketing 
		WebElement Mrk = driver.findElementByXPath("//select[@name='marketingCampaignId']");
		Select dd4 = new Select(Mrk);
		//dd4.selectByVisibleText("Automobile");
		dd4.selectByValue("CATRQ_AUTOMOBILE");
		
		//chose Ownership
		WebElement ele=driver.findElementByXPath("//select[@name='ownershipEnumId']"); 
		Select dd2=new Select(ele);
		dd2.selectByVisibleText("Sole Proprietorship");
		
		//System.out.println("The title of the page is :" +driver.getTitle());
		//System.out.println("The current URL is :" +driver.getCurrentUrl());
		//verification of the page
		//Verify title of the page
				String title=driver.getTitle();
				System.out.println(title);
				
				if (title.contains("Create Lead | opentaps CRM")) {
					System.out.println(" Title matched");
				} else {
					System.out.println("Title  is not matched");
				}
		
		//State /Providence
	/*	WebElement Country=  driver.findElementByXPath("//select[contains(@name,'StateProvince')]");
		Select dd5=new Select(Country);
		dd4.selectByVisibleText("United Kingdom");
		
		//state /providence
		WebElement state = driver.findElementByXPath("//select[contains(@id,'createLeadForm_generalSt')]");
		Select dd6= new Select(state);
		dd4.selectByVisibleText("Florida");
		
		*/
		
	}

}
