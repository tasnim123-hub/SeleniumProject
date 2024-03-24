package com.testLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//page object model
public class MyHomePage {

	WebDriver driver;
	
	By createleadLink = By.linkText("Create Lead");
	//in the constructor,will not void, because no return
	public MyHomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickCreateLeadLink() {
		driver.findElement(createleadLink).click();
		}
	
}
