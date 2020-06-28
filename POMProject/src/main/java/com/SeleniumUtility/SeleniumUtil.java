package com.SeleniumUtility;

import java.io.IOException;
import java.io.File;
import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
//import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class SeleniumUtil {

		WebDriver driver;
		public SeleniumUtil(WebDriver driver2) {
			this.driver=driver2;
			}

public void screenshot(String path) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File(path));
}
public void getTitle() {
	
	System.out.println(driver.getTitle());
	
}
public void dropdown(String locator2,String value) {
	
	Select dropdown=new Select(driver.findElement(By.xpath(locator2)));
			dropdown.selectByVisibleText(value);

	}
}

