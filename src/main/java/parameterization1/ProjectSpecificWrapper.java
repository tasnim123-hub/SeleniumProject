package parameterization1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper {


	public ChromeDriver driver;
	@Parameters({"url","uname","pwd"})//Static value pass into the double quotation
	
	//public static void main(String[] args) {
	
	@BeforeMethod
	public void Wrapper(String url,String uname,String pwd ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skelt\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		
		//driver.get("http://leaftaps.com/opentaps");
	driver.get(url);
		
		driver.manage().window().maximize(); 
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		 driver.findElementByXPath("//input[contains(@id,'u')]").sendKeys("DemoSalesManager");
		//driver.findElementByXPath("//input[contains(@id,'u')]").sendKeys(uname);
		//Enter password
		
		//driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementById("password").sendKeys(pwd);
		//Login click()
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		//CRM/SFA Click()
		driver.findElementByLinkText("CRM/SFA").click();
		
		
	}
@AfterMethod
public void CloseBrowser() {
	driver.quit();
}
@DataProvider  //Dynamic value pass into the DataProvider
//public void getData() {
public String[][] getData(){           //Method of DataProvider(){  }
	String data[][]=new String [3][3]; //ClassName obj=new ClassName();
	 data[0][0]="ABC";
	data[0][1]="Tasnim";
	data[0][2]="Chowdhury";
	
	data[1][0]="FAR";
	data[1][1]="Dawsi";
	data[1][2]="Qurashy";
	
	data[2][0]="TCS";
	data[2][1]="Marnia";
	data[2][2]="Qurashy";
	return data;
}
}
