package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {

	WebDriver driver;

//Faceboook
	@FindBy(id="email")
	WebElement usernameElement;
	@FindBy(id="pass")
	WebElement pwdElement;
	@FindBy(xpath="//*[@id='u_0_b']")
	WebElement Loginbutton;
	

public FaceBookLoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
//Facebook	
//	usernameElement = driver.findElement(By.id("email"));
//	pwdElement =driver.findElement(By.id("pass"));
//	Loginbutton =driver.findElement(By.xpath("//*[@id='u_0_b']"));
//	
////OrangeHRM
//	usernameElement = driver.findElement(By.id("txtUsername"));
//	pwdElement = driver.findElement(By.id("txtPassword"));
//	Loginbutton = driver.findElement(By.id("btnLogin"));
	
	}

public void login(String username,String password) {
	System.out.println("inside login func");
	usernameElement.sendKeys(username);
	pwdElement.sendKeys(password);
	Loginbutton.click();
	System.out.println("after click");
	}
}


