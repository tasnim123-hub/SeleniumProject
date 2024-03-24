package parameterization1;




import org.testng.annotations.Test;

public class DataProvider_CreateLead extends ProjectSpecificWrapper{

	
		//public static void main(String[] args) {
		@Test (dataProvider = "getData")
		public void CreateLead(String cName,String fname,String lname) {

				   
				
				
				
				 //Leads Click()
				//driver.findElementByLinkText("Leads").click();
				driver.findElementByXPath("//a[text()='Leads']").click();
				//driver.findElementByXPath("//a[@id='ext-gen591']").click(); 1 of 1 But not working
				
				               
				//Create Lead 
				//driver.findElementByLinkText("Create Lead").click(); //Link Text
				driver.findElementByXPath("//a[text()='Create Lead']").click();  //( Text base X path )
				//driver.findElementByXPath("//a[contains(text(),'Create')]").click();
				
				//company Name
				driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys(cName);
				
				//First Name
				//driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
				try {
					driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys(fname);
				} catch (Exception e) {
					System.out.println("Element not found");

	}
				//driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Mali");
				driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys(lname);
		}
}
