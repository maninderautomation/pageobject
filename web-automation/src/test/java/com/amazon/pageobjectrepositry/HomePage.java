package com.amazon.pageobjectrepositry;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amzon.generic.BaseClass;
import com.amzon.generic.GenericMethod;

public class HomePage extends GenericMethod {
	
	@FindBy(xpath="//a[@id='nav-link-shopall']")
	private WebElement ShpByCatagry;
	
	@FindBy(xpath="//span[contains(text(),'Beauty, Health, Grocery')]")
	private WebElement Grocery;
	
	@FindBy(xpath="(//span[text()='Luxury Beauty'])[1]")
	private WebElement luxbeauty;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchLuxBeauty;
	
	@FindBy(xpath="//select[@aria-describedby='searchDropdownDescription']")
	private WebElement allDropdown;
	
	@FindBy(xpath="//select[@aria-describedby='searchDropdownDescription']/option[text()='Amazon Devices']")
	private WebElement amzonDevice;
	
	@FindBy(xpath="//span[text()='Car, Motorbike, Industrial']")
	private WebElement carBikeAcces;
	
	@FindBy(xpath="//span[text()='Car Parts']")
	private WebElement carParts;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement space;
	
	@FindBy(xpath="//h2[@class='a-size-medium s-inline  s-access-title  a-text-normal']")
	private WebElement nuCables;
	
	@FindBy(xpath="(//div[@class='twisterSlotDiv addTwisterPadding'])[1]")
	private WebElement blackPoch;
	
	@FindBy(xpath="//span[@id='priceblock_ourprice']")
	private WebElement price;
	
	
	public void ClickOnGrocery() throws InterruptedException
	{
		ShpByCatagry.click();
		Actions act1 = new Actions(BaseClass.driver);
		act1.moveToElement(Grocery);
		Thread.sleep(3000);
		//luxbeauty.click();
		//new GenericMethod(BaseClass.driver).WaitForElemt(luxbeauty, 10);
		//WaitForElementClick(luxbeauty);
		Select sel = new Select(allDropdown);
		sel.selectByVisibleText("Amazon Devices");
		//Thread.sleep(3000);
		//carBikeAcces.click();
		//Thread.sleep(2000);
		//carParts.click();
		space.sendKeys("cables");
		space.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		nuCables.click();
		
	}
	public void switchToNextPage() throws InterruptedException
	{
		Set<String> set = BaseClass.driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		String pwin = it.next();	
		String cwin = it.next();
		Thread.sleep(8000);
		BaseClass.driver.switchTo().window(cwin);
		Thread.sleep(2000);
		System.out.println("Black Pouch");
		
		//blackPoch.click();
		//WaitForElementClick(blackPoch);
		//blackPoch.click();
		WaitForElementClick(price);
		price.click();
		BaseClass.driver.switchTo().window(pwin);
	}
	

}
