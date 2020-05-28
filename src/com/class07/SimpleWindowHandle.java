package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup");
		
		String signUpTitle=driver.getTitle();
		System.out.println("Main Page Title is : "+signUpTitle);
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> allWindowHandles=driver.getWindowHandles(); //returns set of String IDs of all windows currently opened
		
		System.out.println("Number of windows opened are: "+allWindowHandles.size());
		
		Iterator<String> it=allWindowHandles.iterator();
		
		String mainWindowHandle=it.next();
		System.out.println("Id of Main window: "+mainWindowHandle);
		
		String childWindowHandle=it.next();
		System.out.println("Id of Child window: "+mainWindowHandle);
		
		driver.switchTo().window(childWindowHandle);
		
		String childWindowTitle=driver.getTitle();
		System.out.println("Child Page Title is: "+childWindowHandle);
	}
}
