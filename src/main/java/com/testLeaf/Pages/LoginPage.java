package com.testLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//Page object model
public class LoginPage {
	WebDriver driver;
By username = By.id("username"); //By is a Class of Java
By password = By.id("password");
By loginButton = By.className("decorativeSubmit");

//create a constructor as LoginPage and pass the webDriver
public LoginPage (WebDriver driver) { //this is a Class of Java
	this.driver = driver;            //this meaning current
}
/*public void typeUserName() {
	driver.findElement(username).sendKeys("DemoSalesManager");
}*/
public void typeUserName(String uName) {
	driver.findElement(username).sendKeys(uName);
}
/*public void typePassword() {
	driver.findElement(password).sendKeys("crmsfa");
}*/
public void typePassword(String pwd) {
	driver.findElement(password).sendKeys(pwd);
}
public void clickLoginButton() {
	driver.findElement(loginButton).click();
}
}
