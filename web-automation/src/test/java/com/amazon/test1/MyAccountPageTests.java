package com.amazon.test1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amazon.pageobjectrepositry.HomePage;
import com.amzon.generic.BaseClass;

class MyAccountPageTest extends BaseClass{
	
	@Test
	public void LoginApp() throws InterruptedException
	{
		HomePage hom = PageFactory.initElements(driver, HomePage.class);
		
		hom.ClickOnGrocery();
		hom.switchToNextPage();
	}
}

