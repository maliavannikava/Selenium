package com.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWithLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		
		String singUpTitle=driver.getTitle();
		System.out.println("Main Page is: "+singUpTitle);
		
		String title=driver.getTitle();
		System.out.println("Main Page title: "+title);
		
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("Window title is "+parentWindowHandle);
		
		for(int i=1; i<=3; i++) {
			driver.findElement(By.id("button1")).click();
			Thread.sleep(2000);
		}
		
		Set<String> allWindowHandle=driver.getWindowHandles();
		for(String handle: allWindowHandle) {
			System.out.println("id Of the Window: "+handle);
			driver.switchTo().window(handle);
			String windowTitle=driver.getTitle();
		}
		
		

	}
}
