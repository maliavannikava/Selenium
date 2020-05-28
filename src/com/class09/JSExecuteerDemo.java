package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class JSExecuteerDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		//http://166.62.36.207/humanresources/symfony/web/index.php/dashboard
		
		setUp();
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		WebElement loginBtn=driver.findElement(By.id("btnLogin"));
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginBtn);
	
	}
}
