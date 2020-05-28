package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;

public class DragAndDrop extends CommonMethods{
	
	//https://jqueryui.com/droppable/

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.switchTo().frame(0);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		//long way
		//action.clickAndHold(drag).moveToElement(drop).perform();
		//Thread.sleep(3000);
		//short way
		action.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		tearDown();

	}
}
