package com.amazon.test1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.pageobjectrepositry.CrmHomePage;
import com.amazon.pageobjectrepositry.CrmPage;
import com.amzon.generic.BaseClass;

public class HomePageTest extends BaseClass{
	
	CrmPage crmPage;
	CrmHomePage crmHomePage;
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		crmPage.LoginToApp(username, password);
		loginBeforeTest();
		//crmPage = new CrmPage();
		//crmHomePage = crmPage.LoginToApp(username, password);
		
	}
	@Test
	public void verifyPageTitle() {
		String homePageTitle = crmHomePage.verifyHomePageTitle();
		assertEquals(homePageTitle, "CRMPRO", "home page CRM is not match");
	}
	
	//@AfterMethod
	//public void tearDown() {
		//driver.quit();
	//}

}
