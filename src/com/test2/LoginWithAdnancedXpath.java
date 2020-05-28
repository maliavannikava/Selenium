package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginWithAdnancedXpath extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		//http://166.62.36.207/humanresources/symfony/web/index.php/dashboard
		
		setUp();
		
		WebElement username=driver.findElement(By.xpath("//div[@id='divUsername']/input"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		WebElement password=driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		Thread.sleep(2000);
		tearDown();

	}
}
