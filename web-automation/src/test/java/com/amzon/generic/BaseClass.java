package com.amzon.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass implements ConstantData {
	public static WebDriver driver;
	  
		@BeforeClass
		public void loginBeforeTest() {	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maninder\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Run something");
	 }
		@BeforeMethod
		public void TimeBeforeMethod() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
		}
		public boolean waitForPageToBeLoad(WebElement webElement) {
               if (webElement!=null) {
            	   try {
           			WebDriverWait wait = new WebDriverWait(driver, 10);
        			wait.until(ExpectedConditions.visibilityOf(webElement));
				//highlightElement(webElement);
				return true;
            	   } catch (Exception e) {
					return false;
				}    	   
	
}else {
	return false;
}
		}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
		
	}



