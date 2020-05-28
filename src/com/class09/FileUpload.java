package com.class09;

import org.openqa.selenium.By;

import com.syntax.utils.CommonMethods;

public class FileUpload extends CommonMethods{

	public static void main(String[] args) {
		
		//https://the-internet.herokuapp.com/
		
		setUp();
		driver.findElement(By.linkText("File Upload")).click();
		driver.findElement(By.id("file-upload")).sendKeys("/Users/marharytamaliavannikava/Documents/photos/IMG_7502.JPG");
		

	}
}
