package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

	public static void main(String[] args) throws InterruptedException {
		/*Syntax Page URL Verification: 
		Open chrome browser
		Navigate to “https://www.zillow.com/”
		Navigate to “https://www.google.com/”
		Navigate back to Zillow Page
		Refresh current page
		Verify url contains “Zillow”*/
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.zillow.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="Zillow";
		boolean url=true;
		if(actualUrl.contains(expectedUrl)) {
			System.out.println(url);
		}else {
			url=false;
			System.out.println(url);
		}
		Thread.sleep(2000);
		
		driver.quit();
	}
}
