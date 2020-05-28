package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
	
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword")).sendKeys("Hum@nhrm123");
		

	}
}
