package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class LoginPage extends CommonMethods{
	//http://166.62.36.207/humanresources/symfony/web/index.php/dashboard		
		public WebElement username=driver.findElement(By.id("txtUsername"));
		public WebElement password=driver.findElement(By.id("txtPassword"));
		public WebElement loginBtn=driver.findElement(By.id("btnlogin"));
		
		
}
