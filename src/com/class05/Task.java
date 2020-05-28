package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		/*Open chrome browser
		Go to “https://www.facebook.com”
		Verify:
		month dd has 12 month options
		day dd has 31 day options
		year dd has 115 year options
		Select your date of birth	
		Quit browser
		 * 
		 */
		
		setUp();
		WebElement month=driver.findElement(By.id("month"));
		Select select=new Select(month);
		List<WebElement> m=select.getOptions();
		System.out.println(m.size());
		select.selectByVisibleText("Nov");
				
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.id("day"));
		Select select1=new Select(day);
		List<WebElement> d=select1.getOptions();
		System.out.println(d.size());
		select1.selectByVisibleText("2");
		
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.id("year"));
		Select select2=new Select(year);
		List<WebElement> y=select2.getOptions();
		System.out.println(y.size());
		select2.selectByVisibleText("1995");
	}
}
