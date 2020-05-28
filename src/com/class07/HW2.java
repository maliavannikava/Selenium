package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class HW2 extends CommonMethods{
	
	/*Verify element is enabled
	Open chrome browser
	Go to “https://the-internet.herokuapp.com/”
	Click on “Click on the “Dynamic Controls” link
	Click on enable button
	Enter “Hello” and verify text is entered successfully
	Close the browser
	*/

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
		waitForClickability(element);
		element.sendKeys("Hello");
		Thread.sleep(2000);
		tearDown();
	}
}
