package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class AlertDemo {
	//http://uitestpractice.com/Students/Switchto

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=BaseClass.setUp();
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		Alert simpleAlert=driver.switchTo().alert();
		
		String simpleAText=simpleAlert.getText();
		
		System.out.println(simpleAText);
		
		simpleAlert.accept();
		
		driver.findElement(By.id("confirm")).click();
		
		Alert confirmAlert=driver.switchTo().alert();
		String confirmAText=confirmAlert.getText();
		System.out.println("This is Confirm alert text: "+confirmAText);
		Thread.sleep(2000);
		confirmAlert.dismiss();
		
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert=driver.switchTo().alert();
		System.out.println("This is Prompt alert text: "+promptAlert.getText());
		promptAlert.sendKeys("Alex");
		promptAlert.accept();
		
		String text=driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		
		if(text.contains("Alex")) {
			System.out.println("Text was entered");
		}else {
			System.out.println("Text was not entered");
		}
		
		
		
		
		
		
		
		
		BaseClass.tearDown();
	}
}
