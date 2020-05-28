package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.BaseClass;

//http://166.62.36.207/syntaxpractice/bootstrap-iframe.html

public class SyntaxPracticeSiteFrameDemo {

	public static void main(String[] args) {
		
		WebDriver driver=BaseClass.setUp();
		
		driver.switchTo().frame("FrameOne");
		
		boolean dis=driver.findElement(By.id("hide")).isDisplayed();
		System.out.println("Logo inside frame is displayed: "+dis);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		boolean enrolBtnIsEnabled=driver.findElement(By.className("enroll-btn")).isEnabled();
		System.out.println("Enrol button inside frame Two is enabled: "+enrolBtnIsEnabled);
		
		BaseClass.tearDown();

	}
}
