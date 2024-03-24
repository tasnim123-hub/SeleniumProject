package starting_Point_Of_FrameWork;

public interface WrapperMethods {
// 100% abstract methods //1st interface 2nd GenericWrapper 3rd @Test class
	public void launchBrowser(String url);
	
	public void enterById(String locatorValue, String data);
	public void enterByName(String locatorValue, String data);
	public void enterByPartialLinkText(String locatorValue, String data);
	public void enterByXpath(String locatorValue, String data);
	public void enterByCssSelector(String locatorValue, String data);
	public void clickByName(String locatorValue);
	public void clickByClassName(String locatorValue);
	public void clickByLinkText(String locatorValue);
	public void clickByXpath(String locatorValue);
	public void selectVesibleTextById(String id, String value);
	public void selectIndexByName(String Name, int value);
	public void getTextById(String id);
    public void closeBrowser();
}
