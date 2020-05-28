package com.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class DeltaCalendarDemo extends CommonMethods{
	
	//https://www.delta.com/

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.xpath("//span[@id='calDepartLabelCont']")).click();
		
		//when we are getting text for the 1st time, it's May
		String dMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		while(!dMonth.equals("August")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(2000);
			//after loop it's June, July, etc
			dMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();	
		}
		
		List<WebElement> departCells = driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
		
		for(WebElement departCell: departCells) {
			String fromText=departCell.getText();
			if(fromText.equals("15")) {
				departCell.click();
				break;
			}	
		}
		
		String returnMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();
		while(!returnMonth.contentEquals("October")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(2000);
			returnMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();		
		}
		
		List<WebElement> returnCells=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));
		
		for(WebElement returnCell: returnCells) {
			String returnText=returnCell.getText();
			if(returnText.equals("9")) {
				returnCell.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='done']")).click();
		Thread.sleep(5000);
		tearDown();
	}
}
