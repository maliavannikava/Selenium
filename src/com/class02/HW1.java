package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static void main(String[] args) {
		/*Facebook sign up: 
		Open chrome browser
		Go to “https://www.facebook.com/”
		Enter first name
		Enter last name
		Enter mobile number
		Click on sign up button*/
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.findElement(By.name("firstname")).sendKeys("Margo");
		driver.findElement(By.name("lastname")).sendKeys("Marga");
		driver.findElement(By.name("reg_email__")).sendKeys("123456");
		driver.findElement(By.name("websubmit")).click();
		
		driver.quit();

	}
}
