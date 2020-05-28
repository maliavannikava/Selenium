package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;

public class ActionClassAmazonDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		WebElement account=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(account).perform();
		WebElement element=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));
		
		if(element.getText().contains("Start")) {
			System.out.println("Menu is displayed");
		}else {
			System.out.println("Menu is not displayed");
		}
		
		//right click
		action.contextClick(element).perform();
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		//action.moveToElement(searchBox).click().sendKeys("Movies").doubleClick().perform();
		action.moveToElement(searchBox).click().keyUp(Keys.SHIFT).sendKeys("Movie").perform();
		
		Thread.sleep(2000);
		
		tearDown();
	}
}
