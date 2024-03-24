package starting_Point_Of_FrameWork;

import org.testng.annotations.Test;

public class TC001_CreatLead extends GenericWrapper{

	@Test
	public void creatLead() {
		//launchBrowser("http://leaftaps.com/opentaps");
		  launchBrowser("http://leaftaps.com/opentaps");
		
		 enterById("username", "DemoSalesManager");
		 enterById("password", "crmsfa");
		 clickByClassName("decorativeSubmit");
		 clickByLinkText("CRM/SFA");
		 clickByLinkText("Leads");
		 clickByPartialLinkText("//a[contains(text(),'Create')]");
		/*public void enterByXpath(String locatorValue, String data);
		public void enterByCssSelector(String locatorValue, String data);
		public void clickByName(String locatorValue);
		public void clickByClassName(String locatorValue);
		public void clickByLinkText(String locatorValue);
		public void clickByXpath(String locatorValue);
		public void selectVesibleTextById(String id, String value);
		public void selectIndexByName(String Name, int value);
		public void getTextById(String id);
	    public void closeBrowser();*/
	}
}
