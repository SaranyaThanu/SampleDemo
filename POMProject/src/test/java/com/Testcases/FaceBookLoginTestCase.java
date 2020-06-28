package com.Testcases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.BaseClass.Library;
import com.Pages.FaceBookLoginPage;
import com.SeleniumUtility.SeleniumUtil;


	public class FaceBookLoginTestCase extends Library {
		FaceBookLoginPage lpage;
		SeleniumUtil util;

		
	@BeforeClass
	public void stratUp() throws IOException {
		launchApplication();

	
}	@Test
	public void login() {
	lpage= new FaceBookLoginPage(driver);
	lpage.login("sravanthi","abc1");
	
	
	}
//
//	private void launchApplication(String string, String string2) {
//	// TODO Auto-generated method stub
//		
//	}
	@AfterClass
	public void close() throws IOException {
	util = new SeleniumUtil(driver);
	util.screenshot("src/test/resources/Screenshots/PageElementScnSht.png");
	quit();
	}

}


