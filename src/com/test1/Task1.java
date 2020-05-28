package com.test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class Task1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement firstname=driver.findElement(By.id("u_0_m"));
		sendText(firstname, ConfigsReader.getProperty("firstname"));
		
		WebElement lastname=driver.findElement(By.id("u_0_o"));
		sendText(lastname, ConfigsReader.getProperty("lastname"));
		
		WebElement email=driver.findElement(By.id("u_0_r"));
		sendText(email, ConfigsReader.getProperty("email"));
		
		WebElement password=driver.findElement(By.id("u_0_w"));
		sendText(password, ConfigsReader.getProperty("password1"));
		
		
		WebElement month=driver.findElement(By.id("month"));
		selectDdValue(month, 11);
		
		WebElement day=driver.findElement(By.id("day"));
		selectDdValue(day, "2");
		
		WebElement year=driver.findElement(By.id("year"));
		selectDdValue(year, "1995");
		
		
		List<WebElement> list=driver.findElements(By.name("sex"));
		clickRadioOrCheckbox(list, "1"); 
		
		Thread.sleep(3000);
		
		tearDown();
	}
}
