package com.amazon.pageobjectrepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amzon.generic.BaseClass;

public class CrmHomePage extends BaseClass{
	@FindBy(xpath="//td[contains(text(), ' Maninder singh')]")
	private WebElement user;
	
	@FindBy(xpath="//a[contains(text(), 'Contacts')]")
	private WebElement contactLinks;
	
	@FindBy(xpath="//a[contains(text(), 'New Contact')]")
	private WebElement newContactLinks;
	
	@FindBy(xpath="//a[contains(text(), 'Deals')]")
	private WebElement dealslinks;
	
	@FindBy(xpath="//a[contains(text(), 'Tasks')]")
	private WebElement taskLinks;
	
	public CrmHomePage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	public boolean verifyCorrectUserName() {
		return user.isDisplayed();
	}
	public ContactsPage ClickOnContactsLinks() {
		contactLinks.click();
		return new ContactsPage();
	}
	public DealsPage ClickOndealslinks() {
		dealslinks.click();
		return new DealsPage();
	}
	public TaskPage ClickOntaskLinks() {
		taskLinks.click();
		return new TaskPage();
	}
	public void ClickOnNewContactsLinks() {
		Actions act = new Actions(driver);
		act.moveToElement(contactLinks).build().perform();
		newContactLinks.click();
	}
}
