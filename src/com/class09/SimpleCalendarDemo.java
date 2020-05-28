package com.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class SimpleCalendarDemo extends CommonMethods{
	
	//http://166.62.36.207/humanresources/symfony/web/index.php/dashboard

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Leave List")).click();
		
		driver.findElement(By.id("calFromDate")).click();
		
		//select month
		WebElement mDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		selectDdValue(mDD, "Apr");
		
		//select year
		WebElement yDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		selectDdValue(yDD, "2021");
		
		//select day from the calendar
		List<WebElement> fromDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
				
		for(WebElement fromDay: fromDate) {
			fromDay.getText();
			if(fromDay.getText().equals("15")) {
				fromDay.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		tearDown();	
	}
}
