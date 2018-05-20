package com.amazon.test1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amazon.pageobjectrepositry.CrmHomePage;
import com.amazon.pageobjectrepositry.CrmPage;
import com.amzon.generic.BaseClass;

public class CrmTest extends BaseClass{
	@Test
	public void CrmLoginToApp() throws InterruptedException {
		CrmPage pag = PageFactory.initElements(driver, CrmPage.class);
		CrmHomePage hom = PageFactory.initElements(driver, CrmHomePage.class);
		TimeBeforeMethod();
		pag.verifyFreeCRMLogo();
		pag.LoginToApp(username, password);
		hom.verifyCorrectUserName();
		hom.verifyHomePageTitle();
		
		//tearDown();
	}
	 
	
	

}
