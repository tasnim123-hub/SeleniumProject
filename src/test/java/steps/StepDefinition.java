package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
ChromeDriver driver;

@Given("launch chromebrowser and load url") //cucumber.api.java.en.Given;
public void launch_chromebrowser_and_load_url() {
	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	
	driver.get("http://leaftaps.com/opentaps");
	
	driver.manage().window().maximize(); 
	//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}

@Given("enter username as demosalesmanager")
public void enter_username_as_demosalesmanager() {
	driver.findElementByXPath("//input[contains(@id,'u')]").sendKeys("DemoSalesManager"); 
}

@Given("enter password as crmsfa")
public void enter_password_as_crmsfa() {
	driver.findElementById("password").sendKeys("crmsfa");
}

@When("click the login button")
public void click_the_login_button() {
	driver.findElementByClassName("decorativeSubmit").click(); 
}

@Then("its navigated Homepage")//cucumber.api.java.en.Then;
public void its_navigated_Homepage() {
   System.out.println(driver.getTitle()); 
}

@Then("click the logout button")
public void click_the_logout_button() {
  driver.findElementByClassName("decorativeSubmit").click();
}

@Then("close browser")
public void close_browser() {
    //driver.quit();
}
@Given("enter username as demo")
public void enter_username_as_demo() {
	driver.findElementByXPath("//input[contains(@id,'u')]").sendKeys("Demo");  
}

@Then("its navigated same page")
public void its_navigated_same_page() {
 System.out.println(driver.getTitle());
}

@Then("verify error msg")
public void verify_error_msg() {
	String errMassage = driver.findElementById("errorDiv").getText();
	   if (errMassage.contains("The Following Errors Occurred:")) {
		System.out.println("text is match");
	} else {
	System.out.println("text is not match");
	}
	   }
@Given("click CRMSFA")
public void click_CRMSFA() {
	driver.findElementByLinkText("CRM/SFA").click();
}

@Given("click leads link")
public void click_leads_link() {
	driver.findElementByXPath("//a[text()='Leads']").click();  
}

@When("click createLead")
public void click_createLead() {
	driver.findElementByXPath("//a[text()='Create Lead']").click(); 
}

@When("enter the companyName as ABC")
public void enter_the_companyName_as_ABC() {
	driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("ABC");  
}

@When("enter the firstName as Heam")
public void enter_the_firstName_as_Heam() {
	driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
}

@When("enter the lastName as Mali")
public void enter_the_lastName_as_Mali() {
	driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Mali");  
}

@When("choose source as website")
public void choose_source_as_website() {
	WebElement src=driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
	
	Select dd=new Select(src);
	dd.selectByVisibleText("Website");
	//dd.selectByIndex(9);
//dd.selectByValue("LEAD_WEBSITE"); 
}

@When("click the create lead button")
public void click_the_create_lead_button() {
    driver.findElementByXPath("//input[@name='submitButton']").click();
}

@Then("its navigated ViewLeadPage")
public void its_navigated_ViewLeadPage() {
    System.out.println(driver.getTitle());
}

@Then("verify the firstName")
public void verify_the_firstName() {
	String fName = driver.findElementById("viewLead_firstName_sp").getText();
	if (fName.equals("Hema")) {
		System.out.println("fName is match");
	} else {
System.out.println("fName is not match");
	}
}
@When("click find Leads")
public void click_find_Leads() {

	driver.findElementByLinkText("Find Leads").click();
}

@When("enter firstName")
public void enter_firstName() {
	driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("Hari");
}

@When("click Find Leads button")
public void click_Find_Leads_button() {
	driver.findElementByXPath("//button[text()='Find Leads']").click();
}

@When("click first resulting lead")
public void click_first_resulting_lead() {
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
}

@Then("navigated ViewLeadPage")
public void navigated_ViewLeadPage() {
   String title1 = driver.getTitle();
   System.out.println(title1);
}

@Then("verify title of the page")
public void verify_title_of_the_page() {
	 String title2 = driver.getTitle();
   if (title2.equals("View Lead | opentaps CRM")) {
	System.out.println("view lead page match with title");
} else {
	System.out.println("view lead page is not match with title");
}
}

@Then("click on Edit")
public void click_on_Edit() {
	driver.findElementByClassName("subMenuButton").click();
}

@Then("navigated Edit Lead page")
public void navigated_Edit_Lead_page() {
	System.out.println(driver.getTitle());
}

@Then("change the company name")
public void change_the_company_name() {
	driver.findElementById("createLeadForm_companyName").clear();
	   driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
}

@Then("click update")
public void click_update() {
    
	
}

@Then("conferm changed name appears")
public void conferm_changed_name_appears() {


}
@When("click on phone")
public void click_on_phone() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("enter phone number")
public void enter_phone_number() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("capture lead ID of first resulting lead")
public void capture_lead_ID_of_first_resulting_lead() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("click Delete")
public void click_Delete() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("navigated MyLeadsPage")
public void navigated_MyLeadsPage() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("enter captured lead ID")
public void enter_captured_lead_ID() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("verify error message")
public void verify_error_message() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}


}
