package com.hw1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginHW {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"/configs/HW.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "/drivers/chromedriver");
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "/drivers/geckodriver");
			driver=new FirefoxDriver();
			break;
		}
		
		driver.get(prop.getProperty("url"));

	}
}
