package starting_Point_Of_FrameWork;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods{
	 //1st interface 2nd GenericWrapper 3rd @Test class
	
	public ChromeDriver driver;
	@Override
	public void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skelt\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("Chrome Browser Launch Successfully");
	}

	@Override
	public void enterById(String locatorValue, String data) {
		driver.findElementById(locatorValue).sendKeys(data);
		
	}

	@Override
	public void enterByName(String locatorValue, String data) {
		driver.findElementByName(locatorValue).sendKeys(data);
		
	}

	@Override
	public void enterByPartialLinkText(String locatorValue, String data) {
	driver.findElementByPartialLinkText(locatorValue).sendKeys(data);
		
	}

	@Override
	public void enterByXpath(String locatorValue, String data) {
		driver.findElementByXPath(locatorValue).sendKeys(data);
		
	}

	@Override
	public void enterByCssSelector(String locatorValue, String data) {
		driver.findElementByCssSelector(locatorValue).sendKeys(data);
		
	}
	public void clickByPartialLinkText(String locatorValue) {
		driver.findElementByPartialLinkText(locatorValue).click();;
	}
	@Override
	public void clickByName(String locatorValue) {
		driver.findElementByName(locatorValue).click();
		
	}

	@Override
	public void clickByClassName(String locatorValue) {
		driver.findElementByClassName(locatorValue).click();
		
	}

	@Override
	public void clickByLinkText(String locatorValue) {
		driver.findElementByLinkText(locatorValue).click();
		
	}

	@Override
	public void clickByXpath(String locatorValue) {
		driver.findElementByXPath(locatorValue).click();
		
	}

	@Override
	public void selectVesibleTextById(String id, String value) {
		WebElement ele = driver.findElementById(id);
		Select dd=new Select(ele);
		dd.selectByVisibleText(value);
	}

	@Override
	public void selectIndexByName(String Name, int value) {
		WebElement ele = driver.findElementByName(Name);
		Select dd=new Select(ele);
		dd.selectByIndex(value);
	}
	public void selectValueById(String Id,String value) {
		WebElement ele = driver.findElementById(Id);
		Select dd=new Select(ele);
		dd.selectByValue(value);
		}

	public void verifyTextId(String Id ,String text) {
		String txt = driver.findElementById(Id).getText();
		if (txt.equals(text)) {
			System.out.println("Text is match");
		} else {
System.out.println("Text is not match");
		}
	}
	@Override
	public void getTextById(String id) {
		WebElement Text = driver.findElementById(id);
		System.out.println(Text);
	}
	//public void 

	@Override
	public void closeBrowser() {
		//driver.close();
		
	}

}
