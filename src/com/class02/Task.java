package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		/*	Open chrome browser
		 	Go to “http://newtours.demoaut.com”
			Click on Register Link
			Fill out all required info
			Click Submit
			User successfully registered
			(Create 2 scripts using different locators)*/
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Margarita");
		driver.findElement(By.name("lastName")).sendKeys("Malevan");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.id("userName")).sendKeys("margasha95@mail.ru");
		driver.findElement(By.name("address1")).sendKeys("1 1st Ave");
		driver.findElement(By.name("city")).sendKeys("New York");
		driver.findElement(By.name("state")).sendKeys("NY");
		driver.findElement(By.name("postalCode")).sendKeys("10000");
		driver.findElement(By.id("email")).sendKeys("MargaritaMalevan");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		driver.findElement(By.name("register")).click();
		
		
		
	
	}
}
