package com.amzon.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethod {
	
	public  WebElement WaitForElemt(WebElement locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println("wait for maximum minute for"+timeout +"second for element to be availaible");
			WebDriverWait wait = new WebDriverWait(BaseClass.driver, 3);
			element=wait.until(ExpectedConditions.visibilityOf(locator));
		} catch (Exception e) {
			System.out.println("Element is not apperaed on the web page");
		}
		return  element;
	}
	public void ClickWhenReady(WebElement element, int timeout) {
		try {
			System.out.println("wait for clickable for:" + timeout +"second for element");
			WebDriverWait wait = new WebDriverWait(BaseClass.driver, 3);
			 wait.until(ExpectedConditions.elementToBeClickable(element));
		     element.click();
		} catch (Exception e) {
			System.out.println("Element is not clicable in web page");
		}
	}
	public void WaitForElementClick(WebElement webelement) {
		WebDriverWait wb= new WebDriverWait(BaseClass.driver, 10);
		wb.until(ExpectedConditions.visibilityOf(webelement));
	}

}
