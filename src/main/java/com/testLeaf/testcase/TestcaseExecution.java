package com.testLeaf.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testLeaf.Pages.CreateLeadPage;
import com.testLeaf.Pages.HomePage;
import com.testLeaf.Pages.LoginPage;
import com.testLeaf.Pages.MyHomePage;

public class TestcaseExecution {

	@Test
	public void Execution() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		
		//object create of loginPage
		//initialize of loginPage
		LoginPage login = new LoginPage(driver);
		/*login.typeUserName();
		login.typePassword();*/
		login.typeUserName("DemoSalesManager");
		login.typePassword("crmsfa");
		login.clickLoginButton();
		
		HomePage homePage = new HomePage(driver);
		//homePage.clickLogoutButton();  //If we don't close it, it will go LogoutBotton
		homePage.clickCRMSFA();
		
		MyHomePage myhomePage = new MyHomePage(driver);
		myhomePage.clickCreateLeadLink();
		
		CreateLeadPage createLeadPage = new CreateLeadPage(driver);
		createLeadPage.typaComName("XYZ");
		createLeadPage.typeFastName("Hema");
		createLeadPage.typeLastName("Mali");
		createLeadPage.chooseSource("Website");
		createLeadPage.chooseOwnerShip();
		createLeadPage.chooseIndustry();
		createLeadPage.clickCreateLead();
	}
}
