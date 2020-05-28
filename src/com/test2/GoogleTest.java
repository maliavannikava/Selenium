package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.syntax.utils.CommonMethods;

public class GoogleTest extends CommonMethods{
	//https://www.google.com/

	public static void main(String[] args) {
		
		setUp();
		driver.findElement(By.name("q")).sendKeys("iPhone");
		
		wait(5);
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		wait(3);
		
		tearDown();

	}
}