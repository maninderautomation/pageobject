package com.amazon.test1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amazon.pageobjectrepositry.ContactsPage;
import com.amazon.pageobjectrepositry.CrmHomePage;
import com.amazon.pageobjectrepositry.CrmPage;
import com.amazon.pageobjectrepositry.TestUtils;
import com.amzon.generic.BaseClass;

public class ContactsTest extends BaseClass{
	
	@Test
	public void verifyContactPage() throws Throwable {
		CrmPage log = PageFactory.initElements(driver, CrmPage.class);
		ContactsPage con = PageFactory.initElements(driver, ContactsPage.class);
		CrmHomePage hom = PageFactory.initElements(driver, CrmHomePage.class);
		TestUtils frm = PageFactory.initElements(driver, TestUtils.class);
		log.LoginToApp(username, password);
		//frm.switchtoFrame();
		con.verifyContactsLabel();
		//Thread.sleep(5000);
		hom.ClickOnContactsLinks();
		//con.selectContactsByname("test 2 test 2");
		Thread.sleep(3000);
		//con.selectContactsByname("monty sharma");
		hom.ClickOnNewContactsLinks();
		Thread.sleep(3000);
		con.createNewContactsTest("Mr.", "Tom", "Petter", "Google");
	}
	

}
