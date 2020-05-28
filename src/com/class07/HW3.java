package com.class07;

import org.openqa.selenium.By;

import com.syntax.utils.CommonMethods;

public class HW3 extends CommonMethods{

	public static void main(String[] args) {
		/*Windows Handling
		Open chrome browser
		Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
		Click on “Alerts & Modals” link
		Click on “Window Popup Modal” link
		Click on the “ Follow On Instagram” button
		Verify title of the page is “Syntax Technologies (@syntaxtechs) • Instagram photos and videos” 
		Click on the “Like us On Facebook ” button
		Verify title of the page is “Go to Facebook Home” 
		Quit the browser
		*/
		
		setUp();
		driver.findElement(By.linkText("Alert & Modals")).click();
		driver.findElement(By.linkText("Window Popup Modal")).click();
		driver.findElement(By.linkText("Follow On Instagram")).click();
		driver.findElement(By.linkText("btn btn-primary followeasy")).click();
		
		
		


	}
}
