package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class DynamicTableAnotherWay extends CommonMethods{

	public static void main(String[] args) {
		
		//http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
		
		setUp();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String expectedValue="Bob Feather";
	
		WebElement table=driver.findElement(By.id("ctl00_MainContent_orderGrid"));
		List<WebElement> rows=table.findElements(By.tagName("//tr"));
		
		for(int i=0; i<rows.size(); i++) {
			
			String rowText=rows.get(i+1).getText();
			if(rowText.contains(expectedValue)) {
				
			}
		}
		tearDown();
	}
}
