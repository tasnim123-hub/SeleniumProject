package com.testLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadPage {
WebDriver driver ;
By comName = By.id("createLeadForm_companyName");
By fName = By.id("createLeadForm_firstName");
By lName = By.id("createLeadForm_lastName");
By source = By.id("createLeadForm_dataSourceId");
By industry = By.id("createLeadForm_industryEnumId");
By ownerShip = By.id("createLeadForm_ownershipEnumId");
By creatLeadButton = By.className("smallSubmit");

public CreateLeadPage(WebDriver driver) {
	this.driver = driver;
}
public void typaComName(String cName) {
	driver.findElement(comName).sendKeys(cName);
}
public void typeFastName(String fastName) {
	driver.findElement(fName).sendKeys(fastName);
}
public void typeLastName(String lastName) {
	driver.findElement(lName).sendKeys(lastName);
}
public void chooseSource(String SOURCE) {
	WebElement src = driver.findElement(source);
	Select dd1 =new Select(src);
	//dd1.selectByVisibleText("Website");
	dd1.selectByVisibleText(SOURCE);
}
public void chooseIndustry() {
	WebElement ind = driver.findElement(industry);
	Select dd2= new Select(ind);
	//dd2.selectByIndex(2);
	dd2.selectByVisibleText("Computer Hardware");
}
public void chooseOwnerShip() {
	WebElement ownerS = driver.findElement(ownerShip);
	Select dd3 = new Select(ownerS);
	//dd3.selectByValue("CATRQ_AUTOMOBILE");
	dd3.selectByVisibleText("Partnership");
}
public void clickCreateLead() {
	driver.findElement(creatLeadButton).click();
}
}
