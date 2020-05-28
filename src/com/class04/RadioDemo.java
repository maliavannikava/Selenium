package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
	
	public static String url="https://demoqa.com/automation-practice-form/";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='sex-0']"));
		
		System.out.println(maleRadioButton.isDisplayed());//true
		System.out.println(maleRadioButton.isEnabled());//true
		
		System.out.println("Radio button is selected: "+maleRadioButton.isSelected());//false
		
		
		// 1st way to click on Radio Button
		maleRadioButton.click();
		System.out.println("Radio button is selected: "+maleRadioButton.isSelected());//true
		
		// 2nd way to click on Radio Button
		List<WebElement> proList=driver.findElements(By.xpath("//input[@name='profession']"));
		
		int listSize=proList.size();
		System.out.println("Size of checkBox is: "+listSize);
		
		String valueTobeSelected="Manual Tester";
		for( WebElement profession:proList) {
			if(profession.isEnabled()) {
				String value=profession.getAttribute("value");
				System.out.println(value);
				if(value.equals(valueTobeSelected)) {
					profession.click();
					break;
				}
			}
		}
	}
}
