package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class Task extends CommonMethods{

	public static void main(String[] args) {
	   /*Open chrome browser
		Go to “http://166.62.36.207/syntaxpractice/”
		Click on “Table” link
		Click on “Table Data Search” link
		Verify second table consist of 5 rows and 4 columns
		Print name of all column headers 
		Print data of all rows
		Quit Browser
	    */
		
		setUp();
		
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		List<WebElement> cols=driver.findElements(By.xpath("//table[@class='table']/thead[@class='thead-inverse']/tr/th"));
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		System.out.println(cols.size());
		System.out.println(rows.size());
		
		for(WebElement h:cols) {
			System.out.print(h.getText()+" ");
		}
		System.out.println();
		for(WebElement v:rows) {
			System.out.println(v.getText());
		}
		
		tearDown();
	}
}
