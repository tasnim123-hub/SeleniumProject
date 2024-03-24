package com.testLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Page object model
public class HomePage {
WebDriver driver;

By LogoutButton =By.className("decorativeSubmit");
By CRMSFA = By.linkText("CRM/SFA");

//create a constructor as HomePage and pass the driver
public HomePage (WebDriver driver) {
	this.driver = driver;
}

public void clickLogoutButton() {
	driver.findElement(LogoutButton).click();
}
public void clickCRMSFA() {
	driver.findElement(CRMSFA).click();
}
}
