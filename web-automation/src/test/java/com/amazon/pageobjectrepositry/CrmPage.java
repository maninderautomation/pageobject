package com.amazon.pageobjectrepositry;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amzon.generic.BaseClass;
import com.amzon.generic.GenericMethod;

public class CrmPage extends GenericMethod{
	@FindBy(xpath="//input[@type='text']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath="//a[contains(text(), 'Contacts')]")
	private WebElement companies;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement cname;
	
	@FindBy(xpath="//img[@alt='free crm logo']")
	private WebElement logo;
	
	public CrmHomePage LoginToApp(String user, String pass) throws InterruptedException {
		String title = BaseClass.driver.getTitle();
		assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
		
		userName.sendKeys(user);
		passWord.sendKeys(pass);
		//WaitForElemt(login, 10);
		Thread.sleep(6000);
		login.click();
		BaseClass.driver.switchTo().frame("mainpanel");
		try {
			Thread.sleep(5000);
			companies.click();
			cname.click();
		} catch (Exception e) {
			System.out.println("Unable to find conatcts");
		}
		return new CrmHomePage();
	}
	public void verifyFreeCRMLogo() {
		boolean flag=logo.isDisplayed();
		assertTrue(flag);
	}

}
