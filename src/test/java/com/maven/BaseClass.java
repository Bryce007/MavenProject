package com.maven;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	
	
	@Test()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/Bryce/eclipse-workspace/SeleniumBasics/src/Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver=new ChromeDriver();
		driver.get("https://Opensource-Demo.Orangehrmlive.com/");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		//changes made by Gigi
		
	}

	
	}

