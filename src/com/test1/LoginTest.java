package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginTest extends CommonMethods{

	public static void main(String[] args) {
		
		//http://166.62.36.207/humanresources/symfony/web/index.php/dashboard
		
		/*
		 * User should be able to login to the app with valid credentials
		 */
		
		setUp();
		
		//send username
		WebElement username=driver.findElement(By.id("txtUsername"));
		//info from properties file
		sendText(username, ConfigsReader.getProperty("username"));
		
		
		//send password
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password,ConfigsReader.getProperty("password"));
		
		
		tearDown();
		

	}
}
