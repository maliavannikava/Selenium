package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class Task extends CommonMethods{
	//http://166.62.36.207/humanresources/symfony/web/index.php/dashboard

	public static void main(String[] args) {
		setUp();
		
		WebElement im=driver.findElement(By.xpath("//img"));
		System.out.println(im.isDisplayed());
		
		tearDown();
	}
}
