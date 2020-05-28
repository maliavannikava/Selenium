package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/window-popup-modal-demo.html");
		
		String singUpTitle=driver.getTitle();
		System.out.println("Main Page is: "+singUpTitle);
		
		String title=driver.getTitle();
		System.out.println("Main Page title: "+title);
		
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("Window title is "+parentWindowHandle);
		
		
		driver.findElement(By.linkText(" Follow on instagram")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Like us On Facebook")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		
		Set<String> allWindowHandles=driver.getWindowHandles();
		
		Iterator<String> it=allWindowHandles.iterator();
		
		while(it.hasNext()) {
			String handle=it.next();
			if(!handle.equals(parentWindowHandle)){
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
				Thread.sleep(1000);	
			}
		}	
		driver.quit();
	}
}
