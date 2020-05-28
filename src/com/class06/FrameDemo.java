package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FrameDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		String text=driver.findElement(By.xpath("//h3[text()='click on the below lonk: ']")).getText();
		driver.switchTo().frame(0);
		
		// by index
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Marga");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		// by name Id
		driver.switchTo().frame("iframe_a");
		name.sendKeys("Marga");
		driver.switchTo().defaultContent();//to come back to the website from frame
		Thread.sleep(2000);
		
		// by WebElement
		WebElement firstFrame=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		driver.switchTo().frame(firstFrame);
		name.clear();
		name.sendKeys("Luna");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		
		
		tearDown();
	}
}
