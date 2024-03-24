package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testng.Assert;



public class Assertion {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\skelt\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
	
	//WebDriver driver=new ChromeDriver();
	WebDriver driver=WebDriverManager.chromedriver().create();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
//get title()
String title = driver.getTitle();
System.out.println(title);

//Assertion Syntax:Assert.assertEquals(Actual result, Expected result, "Assert Message");
 Assert.assertEquals(title, "Bank of America | Online Banking | Log In | User ID","Assert Message");

//isDisplayed()=logo is displayed(true/false)
boolean logo = driver.findElement(By.xpath("//img[@alt='Bank of America']")).isDisplayed();
//Assertion
Assert.assertTrue(logo, "logo is displayed");
Thread.sleep(2000);
//isEnable()-(get the App)link- is Enable(true/false)
boolean getApp = driver.findElement(By.xpath("//a[@id='choose-device-get-the-app']/span[1]")).isEnabled();
//Assert.assertTrue(getApp, "get the App is Enable");//Or Same as below
//OR
//Validation
if (getApp==true) {
	System.out.println("Get the App Link is Enable");
} else {
	System.out.println("Get the App Link is not Enable");
}
Thread.sleep(4000);
//is Selected()=to do this validation we can use only-RadioButton,acheckBox &DropDrown(true/false)
//1st click on the "Save this online Id CheckBox"(Select) then verify is Selected()otherwise else part will be work
driver.findElement(By.xpath("//div[@class='remember-info']/input")).click();


boolean SaveThisUserId = driver.findElement(By.xpath("//div[@class='remember-info']/input)")).isSelected();

System.out.println(SaveThisUserId);

//Assertion
/*Assert.assertTrue(SaveThisUserId, "SaveThisUserId Check Box is Selected");
//Validation
if (SaveThisUserId==true) {
	System.out.println("Check Box is Selected");
} else {
System.out.println("Check Box is not Selected");
}*/
	}

}
