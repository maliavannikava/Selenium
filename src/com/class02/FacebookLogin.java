package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("blablabla");
		driver.findElement(By.id("pass")).sendKeys("blablabla");
		driver.findElement(By.id("u_0_b")).click();
		//driver.findElement(By.className("button")).click();
	}
}
