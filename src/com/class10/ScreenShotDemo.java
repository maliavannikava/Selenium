package com.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class ScreenShotDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		setUp();
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		
		//take screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		
		//save screenshot
		FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/dashboard.png"));
		
		tearDown();

	}
}
