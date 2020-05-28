package com.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class Task extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		/*
		Open chrome browser
		Go to “https://www.aa.com/homePage.do”
		Enter From and To
		Select departure as May 14 of 2020
		Select arrival as November 8 of 2020
		Click on search
		Close browser
		*/
		
		setUp();
		
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("NYC");
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys("MIA");
		
		driver.findElement(By.id("aa-leavingOn")).click();
		
		String dMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!dMonth.equals("May")) {
			driver.findElement(By.className("ui-datepicker-next ui-corner-all")).click();
			Thread.sleep(2000);
		dMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		List<WebElement> departCells = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for(WebElement departCell: departCells) {
			String fromText=departCell.getText();
			if(fromText.equals("16")) {
				departCell.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
        driver.findElement(By.id("aa-returningFrom")).click();
        
        Thread.sleep(2000);
		
		String rMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!rMonth.equals("November")) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		rMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		List<WebElement> returnCells = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for(WebElement returnCell: returnCells) {
			String fromText=returnCell.getText();
			if(fromText.equals("8")) {
				returnCell.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
		Thread.sleep(5000);
		tearDown();
	}

}
