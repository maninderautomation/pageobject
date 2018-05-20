package com.amazon.pageobjectrepositry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.amzon.generic.BaseClass;

public class ContactsPage extends BaseClass{
	
	@FindBy(xpath="//td[contains(text(), 'Contacts')]")
	WebElement contactsLabel;
	
	//@FindBy(xpath="//a[text()='test 2 test 2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")
	//WebElement click;
	
	@FindBy(xpath="//a[@title='New Contact']")
	WebElement newContact;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='surname']")
	WebElement LastName;
	
	@FindBy(xpath="//select[@name='title']")
	WebElement titlle;
	
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement company;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	
	public boolean verifyContactsLabel() {
		return contactsLabel.isDisplayed();
	}
	public void selectContactsByname(String name) {
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();;
	}
	public void createNewContactsTest(String tit, String fname, String ltName, String comp) {
		Select select = new Select(titlle);
		select.selectByVisibleText(tit);
		firstName.sendKeys(fname);
		LastName.sendKeys(ltName);
		company.sendKeys(comp);
		saveBtn.click();
	}
	public void validateNewContact() {
		
	}

}
