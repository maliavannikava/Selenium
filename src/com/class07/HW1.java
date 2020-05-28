package com.class07;

import org.openqa.selenium.By;

import com.syntax.utils.CommonMethods;

public class HW1 extends CommonMethods{
	
	/*
	 *  Verify element is clickable
		Open chrome browser
		Go to “https://the-internet.herokuapp.com/”
		Click on “Click on the “Dynamic Controls” link
		Select checkbox and click Remove
		Click on Add button and verify “It's back!” text is displayed   
		Close the browser 
	 */

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		
		click(driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")));
		
		String expectedOutput="It's back!";
		String output=driver.findElement(By.id("message")).getText();
		
		if(output.contentEquals(expectedOutput)) {
			System.out.println(output);
		}

		Thread.sleep(2000);
		tearDown();	
	}
}
