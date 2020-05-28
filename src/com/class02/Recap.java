package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

	public static void main(String[] args) {
		
		
		String fbUrl="https://www.facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(fbUrl);
		
		String url=driver.getCurrentUrl();
		
		System.out.println("Current url is "+url);
		
		String title=driver.getTitle();
		System.out.println("Title of the page is "+title);
		driver.close();

	}
}
