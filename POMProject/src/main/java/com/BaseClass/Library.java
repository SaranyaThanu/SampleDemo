package com.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import java.util.logging.*;

	public class Library {

	public static WebDriver driver;
	public static Properties prop;

	
	//static java.util.logging.Logger logger1 = java.util.logging.Logger.getLogger(Library.class.getName());
	//public static Logger logger = LogManager.getLogger(Library.class.getName());
	
	//public static Logger logger  = LogManager.getLogManager()
	
	public void launchApplication() throws IOException {
		
	FileInputStream file=new FileInputStream("src/test/resources/Properties/Config.Property");
	prop=new Properties();
	prop.load(file);
	//logger.info("Property file is loaded");
	String browser=prop.getProperty("browser");
	try {
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Selenium Install\\geckodriver.exe");
			driver=new FirefoxDriver();
			//logger.info("Firefox Browser is launched ");
			
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
			 driver=new ChromeDriver();
		//	 logger.info("Chrome Browser is launched ");
			  
		}else if(browser.equalsIgnoreCase(("IE"))){
			System.setProperty("webdriver.ie.driver","D:\\Selenium Install\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		}
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
	//logger.info("url is entered in the browser");
	
}	catch(WebDriverException e) {
	System.out.println("browser could not be launched");
}
	
}
	
	
	public void quit() {
		driver.close();
		//logger.info("Window is closed");
		
	}
}

