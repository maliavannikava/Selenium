package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo2 extends BaseClass{
	
	//https://demoqa.com/automation-practice-form/

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement continents=driver.findElement(By.id("continents"));
		
		Select select=new Select(continents);
		
		List <WebElement> options=select.getOptions();
		
		for(WebElement option:options) {
			
			String text=option.getText();
			System.out.println(text);
			
			if(text.contentEquals("Africa")) {
				option.click();
				String ddText=option.getText();
				
				if(ddText.contentEquals("Africa")) {
					System.out.println("Africa is selected: "+option.isSelected());
				}else {
					System.err.println("Africa is NOT selected");
				}
				
				Thread.sleep(2000);
				//select.selectByVisibleText("Antarctica");
			}
		}
		boolean isMultiple=select.isMultiple();
		System.out.println("The continent DD is Multiple: "+isMultiple);
		tearDown();
	}
}
